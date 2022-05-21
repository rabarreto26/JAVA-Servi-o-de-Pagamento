package services;

public class PaypalServices implements OnlinePaymentService {
	//VARIAVEL TAXA PAGAMENTO
	private static final double PAYMENT_FEE = 0.02;
	//VARIAVEL TAXA DE JUROS DAS MENSALIDADES
	private static final double MONTHLY_INTEREST = 0.01;
    //IMPLEMENTO DOS METODOS DA INTERFACE(OBRIGATORIO IMPLEMENTAR)
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * months * MONTHLY_INTEREST;
	}
	
	

}
