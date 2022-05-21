package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installtment;

public class ContractServices {
	//DECLARAÇÃO DA VARIAVEL DA INTERFACE (INVERSÃO DE CONTROLE)
	private OnlinePaymentService onlinePaymentService;
	
	//INJEÇÃO DE DEPENCIA
	public ContractServices(OnlinePaymentService onlinePaymentService) {
		//ATRIBUTO DA CLASSE RECEBENDO O OBJETO QUE ESTA COMO PARAMETRO(onlinePaymentService)
		this.onlinePaymentService = onlinePaymentService;
	}
	public void processContract(Contract contract, int months) {
		//VARIAVEL PARCELA BASICA(mês)
		double basicQuota = contract.getTotalValue() / months;
		for(int i=1; i<=months; i++) {
			//VARIAVEL updateQuota É VALOR DA PARCELA DO MES(basicQuota) + OS JUROS DO VALOR MENSAL
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			//PEGAR A DATA DO CONTRATO(contract.getDate()) e ADICIONAR NESTA DATA, (i) MESES
			//PRIMEIRA VEZ DO FOR VAI SER 1 MES, QUANDO VOLTAR NO FOR MAIS SER 2 NESES E ASSIM POR DIANTE
			Date dueDate = addMonths(contract.getDate(), i);
			//ACESSAR A LISTA DE PARCELAS DO CONTRATO PARA ADICIONAR UM OBJETO
			contract.getInstalltments().add(new Installtment(dueDate, fullQuota));
		}
	}
	//FUNÇÃO AUXILIAR PARA CRIAR MESES A UMA DATA
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}

}
