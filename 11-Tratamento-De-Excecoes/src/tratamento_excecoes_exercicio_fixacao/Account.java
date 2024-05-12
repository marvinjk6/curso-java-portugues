package tratamento_excecoes_exercicio_fixacao;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}


	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		/* o validateWidraw fica no método withdraw, pois 
		 quando chamar a função ela fica responsavel pelas
	 	exceções */
		validateWithdraw(amount);
		balance -= amount;
	}
	
	private void validateWithdraw(double amount) {
		if (amount > getWithdrawLimit()) {
			// exceção customizada
			throw new BusinessException("Erro de saque: O valor excede o limite de saque");
		}
		if (amount > getBalance()) {
			// exceção customizada
			throw new BusinessException("Erro de saque: Saldo insuficiente");
		}
	}
}
