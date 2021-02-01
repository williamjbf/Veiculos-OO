package williamjbf.com.github.javaoo.excecoes;

public class ChassiInvalidoException extends Exception{
	
	private static final long serialVersionUID = 1125694066540632408L;

	public ChassiInvalidoException(String chassi) {
		super(String.format("Este chassi é inválido [%s]",chassi));
	}
	
}
