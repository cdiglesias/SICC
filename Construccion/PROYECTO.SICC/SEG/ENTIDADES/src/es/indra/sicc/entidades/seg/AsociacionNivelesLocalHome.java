package es.indra.sicc.entidades.seg;

import javax.persistence.PersistenceContext;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.NoResultException;
import java.util.Collection;

import es.indra.sicc.entidades.seg.AsociacionNivelesLocal;
import es.indra.sicc.util.SecuenciadorOID;
import es.indra.mare.common.exception.MareException;

public class AsociacionNivelesLocalHome {

	//@PersistenceContext private EntityManager em; 
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("entidades-seg");
	private EntityManager em = emf.createEntityManager();

	public AsociacionNivelesLocal create(Long oidNivelSociBelcorp, Long oidTipoNivelSociPersonal) throws MareException {
		Long oid = SecuenciadorOID.obtenerSiguienteValor("SEG_NSET_SEQ");
		final EntityTransaction et = em.getTransaction();
		et.begin();
		AsociacionNivelesLocal local = new AsociacionNivelesLocal(oid, oidNivelSociBelcorp, oidTipoNivelSociPersonal);
		em.persist(local);
		et.commit();
		return local;
	}
	
	public void remove(AsociacionNivelesLocal local) {
		final EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(local);
		et.commit();
	}
	
	public void merge(AsociacionNivelesLocal local) {
		final EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(local);
		et.commit();
	}
	
	public AsociacionNivelesLocal findByPrimaryKey(Long  oid) {
		AsociacionNivelesLocal local = (AsociacionNivelesLocal)em.find(AsociacionNivelesLocal.class, oid);
		if (local==null) throw new NoResultException();
		return local;
	}
	
	public Collection findAll() {
		Query query = em.createNamedQuery("AsociacionNivelesLocal.FindAll");
		return query.getResultList();
	}

	
}
