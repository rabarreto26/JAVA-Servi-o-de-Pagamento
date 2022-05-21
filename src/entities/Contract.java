package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//CONTRATO
public class Contract {
	
	private Integer number;
	private Date date;
	private Double totalValue;
	//LISTA DE PRESTA�OES
	List<Installtment> installtments = new ArrayList<>();
	
	public Contract() {		
	}

	public Contract(Integer number, Date date, Double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installtment> getInstalltments() {
		return installtments;
	}
}
