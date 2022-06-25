package jdbc.modelo;

import java.sql.Date;

public class Reserva {
	private Integer id;
	private Date fechaE;
	private Date fechaS;
	private Integer valor;
	private String formaPago;
	public Reserva(Date fechaE, Date fechaS, Integer valor, String formaPago) {
		super();
		this.fechaE = fechaE;
		this.fechaS = fechaS;
		this.valor = valor;
		this.formaPago = formaPago;
		
	}
	public Integer getId() {
		return id;
	}
	public Date getFechaE() {
		return fechaE;
	}
	public Date getFechaS() {
		return fechaS;
	}
	public Integer getValor() {
		return valor;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setId(int id) {
		this.id=id;		
	}
	

}
