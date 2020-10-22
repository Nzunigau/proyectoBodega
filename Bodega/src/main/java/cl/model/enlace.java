package cl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enlace")
public class enlace {

	@Id
	@Column(name = "dereCorrelativo")
	private Integer dereCorrelativo;
	
	@Column(name = "dobjCorrelativo")
	private Integer dobjCorrelativo;
	
	@Column(name = "observaciones")
	private String observaciones;

	public Integer getDereCorrelativo() {
		return dereCorrelativo;
	}

	public void setDereCorrelativo(Integer dereCorrelativo) {
		this.dereCorrelativo = dereCorrelativo;
	}

	public Integer getDobjCorrelativo() {
		return dobjCorrelativo;
	}

	public void setDobjCorrelativo(Integer dobjCorrelativo) {
		this.dobjCorrelativo = dobjCorrelativo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}
