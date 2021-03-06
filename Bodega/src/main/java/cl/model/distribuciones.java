package cl.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "distribucion")
public class distribuciones {

	@Id
	@Column(name = "objeCorrelativo")
	private Integer objeCorrelativo;
	
	@Column(name = "numeroDistribucion")
	private Integer numeroDistribucion;
	
	@Column(name = "fechaInicio")
	private LocalDateTime fechaInicio;
	
	@Column(name = "fechaFin")
	private LocalDateTime fechaFin;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "periodo")
	private String periodo;

	public Integer getObjeCorrelativo() {
		return objeCorrelativo;
	}

	public void setObjeCorrelativo(Integer objeCorrelativo) {
		this.objeCorrelativo = objeCorrelativo;
	}

	public Integer getNumeroDistribucion() {
		return numeroDistribucion;
	}

	public void setNumeroDistribucion(Integer numeroDistribucion) {
		this.numeroDistribucion = numeroDistribucion;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
}
