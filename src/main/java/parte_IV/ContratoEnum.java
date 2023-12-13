package parte_IV;

public enum ContratoEnum {
	
	Contrato1 ("Ana","13/12/2023","31/12/2023", 5623),
	Contrato2 ("Paqui","13/12/2023","31/12/2024", 10564),
	Contrato3 ("Mario","13/12/2023","31/12/2025", 897.5);
	
//	private int id;
	private String nomCliente;
	private String fecha_Inicio;
	private String fecha_Final;
	private double importe;
	
	
	
	private ContratoEnum(String nomCliente, String fecha_Inicio, String fecha_Final, double importe) {
		this.nomCliente = nomCliente;
		this.fecha_Inicio = fecha_Inicio;
		this.fecha_Final = fecha_Final;
		this.importe = importe;
	}



	public String getNomCliente() {
		return nomCliente;
	}



	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}



	public String getFecha_Inicio() {
		return fecha_Inicio;
	}



	public void setFecha_Inicio(String fecha_Inicio) {
		this.fecha_Inicio = fecha_Inicio;
	}



	public String getFecha_Final() {
		return fecha_Final;
	}



	public void setFecha_Final(String fecha_Final) {
		this.fecha_Final = fecha_Final;
	}



	public double getImporte() {
		return importe;
	}



	public void setImporte(double importe) {
		this.importe = importe;
	}

	
	
}
