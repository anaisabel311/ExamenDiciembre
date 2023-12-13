package parte_I;

import java.util.Map;
import java.util.Set;

import es.curso.java.Utilidades;

public abstract  class Cursolmpl implements Curso{
	
	public static final String Cursolmpl = null;
	private int idCurso;
	private String nomCurso;
		private int cupoCurso;
	
	
public Cursolmpl(int idCurso, String nomCurso, int cupoCurso) {
			super();
			this.idCurso = idCurso;
			this.nomCurso = nomCurso;
			this.cupoCurso = cupoCurso;
		}


public String getNomCurso() {
	return nomCurso;
}

public void setNomCurso(String nomCurso) {
	this.nomCurso = nomCurso;
}

public int getIdCurso() {
	return idCurso;
}

public void setIdCurso(int idCurso) {
	this.idCurso = idCurso;
}

public int getCupoCurso() {
	return cupoCurso;
}

public void setCupoCurso(int cupoCurso) {
	this.cupoCurso = cupoCurso;
}



static void ObtenerDatosCurso(Map<Integer, Master> mapCurso) {
	
// 	Pedir un IdCurso y mirar si existe.
	
	String dato = Utilidades.pideDatoTexto("POR FAVOR, INTRODUCE EL ID DE CURSO A ELIMINAR, ENTRE 1 Y 3");
	
}


@Override
public String toString() {
	return "Cursolmpl [idCurso=" + idCurso + ", nomCurso=" + nomCurso + ", cupoCurso=" + cupoCurso + "]";
}



}