package parte_I;

public class Master extends Cursolmpl {
	
	
	private boolean oficial;

	
	

	public Master(int idCurso, String nomCurso, int cupoCurso, boolean oficial) {
		super(idCurso, nomCurso, cupoCurso);
		this.oficial = oficial;
	}



	public Master(Cursolmpl master, boolean oficial) {
		super(master.getIdCurso(), master.getNomCurso(), master.getCupoCurso());
		this.oficial = oficial;
	}

	

	public boolean isOficial() {
		return oficial;
	}

	public void setOficial(boolean oficial) {
		this.oficial = oficial;
	}



	@Override
	public String toString() {
		return "Master [oficial=" + oficial + "]";
	}



	@Override
	public void ObtenerDatosCurso() {
		// TODO Auto-generated method stub
		
	}




	
	
	
	
	
}
