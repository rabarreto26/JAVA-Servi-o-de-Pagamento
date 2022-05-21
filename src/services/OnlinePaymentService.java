package services;
//DECLARAÇÃO DA INTERFACE, QUE QUALQUER SERVIÇO DE PAGAMENTO TEM QUE IMPLEMENTAR
public interface OnlinePaymentService {
	//CONSTRUTOR DA TAXA
	double paymentFee(double amount);
	//CONSTRUTOR DO JUROS(VALOR, QUANTIDADE DE MESES)
	double interest(double amount, int months);
	

}
