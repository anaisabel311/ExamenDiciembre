package parte_IV;

import java.util.List;

import jakarta.persistence.EntityManager;
import parte_IV.JpaUtil;
import parte_IV.ContratoEnum;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class ContratoDAO {
	
//	private static final Logger logger = LogManager.getLogger(ContratoDAO.class);
	private static EntityManager em;

	public ContratoDAO() {
		em = JpaUtil.getEM("hibernateMySQL");
	}
	
	public static void datosInicial() {
//		logger.debug("Empezando introducción inicial de datos");

		ContratoEnum[] contratosEnum = ContratoEnum.values();
		try {
			em.getTransaction().begin();
			for (ContratoEnum contratoEnum : contratosEnum) {
				Contrato contrato = new Contrato(0, contratoEnum.getNomCliente(), contratoEnum.getFecha_Inicio(), contratoEnum.getFecha_Final(), contratoEnum.getImporte());
				em.persist(contrato);
			}
			em.getTransaction().commit();

		} catch (Exception e) {
//			logger.error("Error al insertar el contrato " + e.getMessage());
			em.getTransaction().rollback();
		}

//		logger.debug("Termina");
	}
	
	
	public static List<Contrato> listarContratos() {
//		logger.debug("Listando contratos");
		
		List<Contrato> contratos = em.createQuery("from Contrato", Contrato.class).getResultList();
		contratos.forEach(contrato->System.out.println(contrato));
		return contratos;
	}

	public static Contrato buscarPorNomCliente (String nom) {
		Contrato contrato = em.find(Contrato.class, nom);

//		logger.debug("Contrato encontrado " + contrato);
		return contrato;
	}

}
