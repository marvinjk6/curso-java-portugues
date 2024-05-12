package default_methods;

import java.security.InvalidParameterException;

public interface InterestService {
	
	/*
	 * Esse método não pode ser padrão, pois ele depende da variavel
	 * que ésta armazenada no serviço
	 */
	double getInterestRate();
	
	/* metodo default pois as classes que implementam
	essa interface possuem esse método */
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Os meses devem ser maiores do que zero");
		}
		return amount * Math.pow(1 + getInterestRate() / 100.0, months);
	}


}
