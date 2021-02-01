package williamjbf.com.github.javaoo.interfaces;

import williamjbf.com.github.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import williamjbf.com.github.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import williamjbf.com.github.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public interface VeiculoInterface {
	
	void ligar();
	void desligar();
	void abastecer(float litros) throws AbastecimentoVeiculoLigadoException;
	void acelerar() throws AceleracaoVeiculoLigadoException;
	void frear() throws FrenagemVeiculoDesligadoException;
	void preparar();
}
