package williamjbf.com.github.javaoo.main;

import williamjbf.com.github.javaoo.classes.Carro;
import williamjbf.com.github.javaoo.classes.Moto;
import williamjbf.com.github.javaoo.classes.Veiculo;
import williamjbf.com.github.javaoo.excecoes.*;

public class Main {

	public static void main(String[] args) {

		try {
			// Carro corsa= new Carro("Corsa","GM");
			Veiculo corsa = new Moto("Corsa", "GM");
			corsa.setChassi("ABCDE");
			corsa.abastecer(10);
			// ((Carro)corsa).setQuantidadePortas(4);
			System.out.println(corsa.getNome());
			System.out.println(corsa.getQuantidadeCombustivel());
			System.out.println(corsa.getQuantidadeRodas());
			System.out.println(String.format("O veículo %s está ligado? %b", corsa.getNome(), corsa.isLigado()));
			corsa.ligar();
			corsa.acelerar();
			System.out.println(String.format("Velocidade atual do veículo: %.2f", corsa.getVelocidade()));
			corsa.frear();
			System.out.println(String.format("Velocidade atual do veículo: %.2f", corsa.getVelocidade()));

		} catch (AbastecimentoVeiculoLigadoException e) {
			System.out.println("Você não pode abastecer um veículo enquanto ele estiver ligado.");
		} catch (ChassiInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("** Ocorreu um erro: " + e.getMessage());
		}

	}

}
