package parte_I;

import java.util.HashMap;
import java.util.Map;


public class MainCurso {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// CREAR 3 MASTERS		
		
		Master master1 = new Master(1, "FINANZAS", 20, false);
		Master master2 = new Master(2, "JAVA", 20, true);
		Master master3 = new Master(3, "ADE", 20, true);
		
// INTRODUCIR EN UN MAPA		
		
		Map<Integer, Master> mapCurso = new HashMap<Integer, Master>();
			
		mapCurso.put(master1.getIdCurso(), master1);
		mapCurso.put(master2.getIdCurso(), master2);
		mapCurso.put(master3.getIdCurso(), master3);
		
// ELIMINAR UN MASTER POR SU CÓDIGO		
		
		Cursolmpl.ObtenerDatosCurso(mapCurso);
		
	}

	
	
	
	
	
	

	
}
