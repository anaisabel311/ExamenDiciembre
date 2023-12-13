package parte_IV;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



	@Entity
	@Table(name = "TB_CONTRATO")

public class Contrato {
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private long idContrato;
		
		@Column (name="nombre_cliente", length = 30, nullable = false)
		private String nomCliente;
		
		@Column (name="Fecha_Alta", length = 10 , nullable = false)
		private String fechaAlta;
		
		@Column (name="Fecha_Baja", length = 10 , nullable = false)
		private String fechaBaja;
		
		@Column (name="Importe_Contrato", length = 10 , nullable = false)
		private double importe;

		public Contrato() {
			super();
		}

		public Contrato(long idContrato, String nomCliente, String fechaAlta, String fechaBaja, double importe) {
			super();
			this.idContrato = idContrato;
			this.nomCliente = nomCliente;
			this.fechaAlta = fechaAlta;
			this.fechaBaja = fechaBaja;
			this.importe = importe;
		}

		public long getIdContrato() {
			return idContrato;
		}

		public void setIdContrato(long idContrato) {
			this.idContrato = idContrato;
		}

		public String getNomCliente() {
			return nomCliente;
		}

		public void setNomCliente(String nomCliente) {
			this.nomCliente = nomCliente;
		}

		public String getFechaAlta() {
			return fechaAlta;
		}

		public void setFechaAlta(String fechaAlta) {
			this.fechaAlta = fechaAlta;
		}

		public String getFechaBaja() {
			return fechaBaja;
		}

		public void setFechaBaja(String fechaBaja) {
			this.fechaBaja = fechaBaja;
		}

		public double getImporte() {
			return importe;
		}

		public void setImporte(double importe) {
			this.importe = importe;
		}

		@Override
		public String toString() {
			return "Contrato [idContrato=" + idContrato + ", nomCliente=" + nomCliente + ", fechaAlta=" + fechaAlta
					+ ", fechaBaja=" + fechaBaja + ", importe=" + importe + "]";
		}
	
		
		
}
