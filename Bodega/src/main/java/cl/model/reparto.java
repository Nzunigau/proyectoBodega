package cl.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reparto")
public class reparto {

	@Id
	@Column(name = "reorCorrelativo")
	public Integer reorCorrelativo;
	
	@Column(name = "moccCorrelativo")
	public Integer moccCorrelativo;
	
	@Column(name = "persCodigo")
	public String persCodigo;
	
	@Column(name = "nombreCompleto")
	public String nombreCompleto;
	
	@Column(name = "estadoCae")
	public String estadoCae;
	
	@Column(name = "numeroCae")
	public Integer numeroCae;
	
	@Column(name = "caeCodigo")
	public String caeCodigo;
	
	@Column(name = "codSociedad")
	public String codSociedad;
	
	@Column(name = "nombreSociedad")
	public String nombreSociedad;
	
	@Column(name = "porcentaje")
	public Integer porcentaje;
	
	@Column(name = "monto")
	public Integer monto;
	
	@Column(name = "montoLiquido")
	public Integer montoLiquido;
	
	@Column(name = "numeroProceso")
	public Integer numeroProceso;
	
	@Column(name = "tipoPlanilla")
	public String tipoPlanilla;
	
	@Column(name = "numeroLiquidacion")
	public Integer numeroLiquidacion;
	
	@Column(name = "fechaMovimiento")
	public LocalDateTime fechaMovimiento;
	
	@Column(name = "rediCorrelativo")
	public Integer rediCorrelativo;

	public Integer getReorCorrelativo() {
		return reorCorrelativo;
	}

	public void setReorCorrelativo(Integer reorCorrelativo) {
		this.reorCorrelativo = reorCorrelativo;
	}

	public Integer getMoccCorrelativo() {
		return moccCorrelativo;
	}

	public void setMoccCorrelativo(Integer moccCorrelativo) {
		this.moccCorrelativo = moccCorrelativo;
	}

	public String getPersCodigo() {
		return persCodigo;
	}

	public void setPersCodigo(String persCodigo) {
		this.persCodigo = persCodigo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEstadoCae() {
		return estadoCae;
	}

	public void setEstadoCae(String estadoCae) {
		this.estadoCae = estadoCae;
	}

	public Integer getNumeroCae() {
		return numeroCae;
	}

	public void setNumeroCae(Integer numeroCae) {
		this.numeroCae = numeroCae;
	}

	public String getCaeCodigo() {
		return caeCodigo;
	}

	public void setCaeCodigo(String caeCodigo) {
		this.caeCodigo = caeCodigo;
	}

	public String getCodSociedad() {
		return codSociedad;
	}

	public void setCodSociedad(String codSociedad) {
		this.codSociedad = codSociedad;
	}

	public String getNombreSociedad() {
		return nombreSociedad;
	}

	public void setNombreSociedad(String nombreSociedad) {
		this.nombreSociedad = nombreSociedad;
	}

	public Integer getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Integer getMonto() {
		return monto;
	}

	public void setMonto(Integer monto) {
		this.monto = monto;
	}

	public Integer getMontoLiquido() {
		return montoLiquido;
	}

	public void setMontoLiquido(Integer montoLiquido) {
		this.montoLiquido = montoLiquido;
	}

	public Integer getNumeroProceso() {
		return numeroProceso;
	}

	public void setNumeroProceso(Integer numeroProceso) {
		this.numeroProceso = numeroProceso;
	}

	public String getTipoPlanilla() {
		return tipoPlanilla;
	}

	public void setTipoPlanilla(String tipoPlanilla) {
		this.tipoPlanilla = tipoPlanilla;
	}

	public Integer getNumeroLiquidacion() {
		return numeroLiquidacion;
	}

	public void setNumeroLiquidacion(Integer numeroLiquidacion) {
		this.numeroLiquidacion = numeroLiquidacion;
	}

	public LocalDateTime getFechaMovimiento() {
		return fechaMovimiento;
	}

	public void setFechaMovimiento(LocalDateTime fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}

	public Integer getRediCorrelativo() {
		return rediCorrelativo;
	}

	public void setRediCorrelativo(Integer rediCorrelativo) {
		this.rediCorrelativo = rediCorrelativo;
	}
}
