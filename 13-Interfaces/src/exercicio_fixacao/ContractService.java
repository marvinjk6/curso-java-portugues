package exercicio_fixacao;

import java.time.LocalDate;

public class ContractService {
	
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	/*
	 *  método responsável por instanciar e adicionar Installment
	 *  na lista do contrato 
	*/
	public void processContract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + fee + interest;
			
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
		
	}

}
