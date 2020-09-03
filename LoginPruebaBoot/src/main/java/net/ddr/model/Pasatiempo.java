package net.ddr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="pasatiempo")
public class Pasatiempo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pasatiempo")
	private Integer idPasatiempo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	
	
	public Integer getIdPasatiempo() {
		return idPasatiempo;
	}
	public void setIdPasatiempo(Integer idPasatiempo) {
		this.idPasatiempo = idPasatiempo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	@Override
	public String toString() {
		return "Pasatiempo [idPasatiempo=" + idPasatiempo + ", descripcion=" + descripcion + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idPasatiempo == null) ? 0 : idPasatiempo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasatiempo other = (Pasatiempo) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idPasatiempo == null) {
			if (other.idPasatiempo != null)
				return false;
		} else if (!idPasatiempo.equals(other.idPasatiempo))
			return false;
		return true;
	}
	
	
	

	
	
	

}
