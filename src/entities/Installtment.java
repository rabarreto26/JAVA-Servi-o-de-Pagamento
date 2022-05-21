package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

//CLASSE PRESTA��O
public class Installtment {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dueDate;
	private Double amount;
	
	public Installtment() {		
	}

	public Installtment(Date dueDate, Double amount) {
		super();
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
	}
	
	

}

