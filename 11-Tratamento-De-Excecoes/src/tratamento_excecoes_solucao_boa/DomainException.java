package tratamento_excecoes_solucao_boa;


// se for extensao de Exception o compilador obriga a tratar a exceção
// se for extensão de RuntimeException o compilador não obriga a tratar
public class DomainException extends Exception  {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
	
}
