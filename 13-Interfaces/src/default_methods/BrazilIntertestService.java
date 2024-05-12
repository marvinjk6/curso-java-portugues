package default_methods;

public class BrazilIntertestService implements InterestService {
	
	private Double interestRate;

	public BrazilIntertestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
