package es.indra.sicc.entidades.rec;

import javax.persistence.PersistenceContext;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.NoResultException;
import java.util.Collection;

import es.indra.sicc.entidades.rec.LineaOperacionReclamoDigitadoLocal;
import es.indra.sicc.util.SecuenciadorOID;
import es.indra.mare.common.exception.MareException;

public class LineaOperacionReclamoDigitadoLocalHome {

	//@PersistenceContext private EntityManager em; 
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("entidades-rec");
	private EntityManager em = emf.createEntityManager();

	public LineaOperacionReclamoDigitadoLocal create(Integer numeroLinea, String codigoVenta, Integer unidadesReclamadas, Long operacion, Long tipoMovimiento) throws MareException {
                Long oid = SecuenciadorOID.obtenerSiguienteValor("REC_RLDG_SEQ");
                final EntityTransaction et = em.getTransaction();
		et.begin();
                LineaOperacionReclamoDigitadoLocal local = new LineaOperacionReclamoDigitadoLocal(oid, numeroLinea, codigoVenta, unidadesReclamadas, operacion, tipoMovimiento);
		em.persist(local);
		et.commit();
		return local;
	}
	
	public void remove(LineaOperacionReclamoDigitadoLocal local) {
		final EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(local);
		et.commit();
	}
	
	public void merge(LineaOperacionReclamoDigitadoLocal local) {
		final EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(local);
		et.commit();
	}
	
	public LineaOperacionReclamoDigitadoLocal findByPrimaryKey(Long  oid) {
		LineaOperacionReclamoDigitadoLocal local = (LineaOperacionReclamoDigitadoLocal)em.find(LineaOperacionReclamoDigitadoLocal.class, oid);
		if (local==null) throw new NoResultException();
		return local;
	}

	
	public Collection findAll() {
		Query query=em.createNamedQuery("LineaOperacionReclamoDigitadoLocal.FindAll");
		
		return query.getResultList();
	}

	public Collection findByOperacionTipoMovimiento(Long param1,Long param2) {
		Query query=em.createNamedQuery("LineaOperacionReclamoDigitadoLocal.FindByOperacionTipoMovimiento");
		
		query.setParameter(1, param1);

		query.setParameter(2, param2);

		return query.getResultList();
	}

	public Collection findByOidOperacionReclamoDigitado(Long param1) {
		Query query=em.createNamedQuery("LineaOperacionReclamoDigitadoLocal.FindByOidOperacionReclamoDigitado");
		
		query.setParameter(1, param1);

		return query.getResultList();
	}

}
