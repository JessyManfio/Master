package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By BtnAbrirConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By BtnAbrirContaPf = By.id("bt1");
	private By CampoNome = By.id("nome");
	private By CampoTelefone = By.id("telefone");
	private By CampoEmail = By.id("email");
	private By CampoCpf = By.id("cpf");
	private By QueroSerCliente = By.id("btnEnviar");

	public By getBtnAbrirConta() {
		return BtnAbrirConta;
	}

	public By getBtnAbrirContaPf() {
		return BtnAbrirContaPf;
	}

	public By getCampoNome() {
		return CampoNome;
	}

	public By getCampoTelefone() {
		return CampoTelefone;
	}

	public By getCampoEmail() {
		return CampoEmail;
	}

	public By getCampoCpf() {
		return CampoCpf;
	}

	public By getQueroSerCliente() {
		return QueroSerCliente;
	}

}
