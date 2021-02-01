package williamjbf.com.github.javaoo.classes;

import williamjbf.com.github.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import williamjbf.com.github.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import williamjbf.com.github.javaoo.excecoes.ChassiInvalidoException;
import williamjbf.com.github.javaoo.excecoes.FrenagemVeiculoDesligadoException;
import williamjbf.com.github.javaoo.interfaces.VeiculoInterface;

public abstract class Veiculo implements VeiculoInterface {

	private String nome;
	private String marca;
	private String chassi;
	protected int quantidadeRodas;
	private float quantidadeCombustivel;
	private Boolean ligado;
	protected float velocidade;

	public Veiculo() {
		this.ligado = false;
		this.velocidade = 0;
	}

// ===============================GETs && SETs =========================================
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) throws ChassiInvalidoException {
		if (chassi.length() == 5) {
			this.chassi = chassi;
		} else {
			throw new ChassiInvalidoException(chassi);
		}
	}

// ======================================================================================		

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public Boolean isLigado() {
		return ligado;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public final void ligar() {
		this.ligado = true;
		this.velocidade = 0;
		System.out.println("O veículo ligou!");
	}

	public final void desligar() {
		this.ligado = false;
		this.velocidade = 0;
		System.out.println("O veículo desligou!");
	}

	public final void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
		if (!this.ligado) {
			quantidadeCombustivel += litros;
		} else {
			throw new AbastecimentoVeiculoLigadoException();
		}
	}

	public void acelerar() throws AceleracaoVeiculoLigadoException {
		if (this.ligado) {
			this.velocidade += 10;
		} else {
			throw new AceleracaoVeiculoLigadoException();
		}
	}

	public void frear() throws FrenagemVeiculoDesligadoException {
		if (this.ligado && this.velocidade > 10) {
			this.velocidade -= 10;
		} else if (this.ligado && this.velocidade <= 10) {
			this.velocidade = 0;
		} else {
			throw new FrenagemVeiculoDesligadoException();
		}
	}

	public abstract void preparar();
}
