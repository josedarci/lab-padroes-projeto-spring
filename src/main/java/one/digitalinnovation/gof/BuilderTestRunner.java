package one.digitalinnovation.gof;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;

@Component
public class BuilderTestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) {
		Endereco endereco = new Endereco();
		endereco.setCep("01001-000");
		endereco.setLogradouro("Rua Exemplo");
		// complete os outros campos conforme necessário

		Cliente cliente = new Cliente.Builder()
				.id(1L)
				.nome("Maria Silva")
				.endereco(endereco)
				.build();

		System.out.println("Cliente criado via Builder:");
		System.out.println("ID: " + cliente.getId());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CEP: " + cliente.getEndereco().getCep());
	}
}
