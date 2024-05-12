package tratamento_excecoes_exercicio_fixacao;

// exceção personalizada
public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/*
	 * estrutura padrao para chamar a mensagem
	 * com o e.getMessage()
	 * */
	public BusinessException(String msg) {
		super(msg);
	}
}
