package cl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detallePlanillas")
public class detallePlanillas {

	@Id
	@Column(name = "dobjCorrelativo")
	private Integer dobjCorrelativo;
	
	@Column(name = "objeCorrelativo")
	private Integer objeCorrelativo;
	
	@Column(name = "obraCodigo")
	private Integer obraCodigo;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "autor")
	private String autor;
	
	@Column(name = "interprete")
	private String interprete;
	
	@Column(name = "ejecuciones")
	private Integer ejecuciones;
	
	@Column(name = "segundos")
	private Integer segundos;
	
	@Column(name = "fase")
	private Integer fase;
	
	@Column(name = "gid")
	private String gid;
	
	@Column(name = "valor")
	private Integer valor;

	public Integer getDobjCorrelativo() {
		return dobjCorrelativo;
	}

	public void setDobjCorrelativo(Integer dobjCorrelativo) {
		this.dobjCorrelativo = dobjCorrelativo;
	}

	public Integer getObjeCorrelativo() {
		return objeCorrelativo;
	}

	public void setObjeCorrelativo(Integer objeCorrelativo) {
		this.objeCorrelativo = objeCorrelativo;
	}

	public Integer getObraCodigo() {
		return obraCodigo;
	}

	public void setObraCodigo(Integer obraCodigo) {
		this.obraCodigo = obraCodigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public Integer getEjecuciones() {
		return ejecuciones;
	}

	public void setEjecuciones(Integer ejecuciones) {
		this.ejecuciones = ejecuciones;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}

	public Integer getFase() {
		return fase;
	}

	public void setFase(Integer fase) {
		this.fase = fase;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
}
