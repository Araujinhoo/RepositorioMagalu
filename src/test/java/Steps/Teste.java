package Steps;

import Elementos.elementos;
import Metodos.metodo;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class Teste {

	elementos e = new elementos();
	metodo m = new metodo();
	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String url) {
		m.abrirnavegador(url);
		System.out.println("ok");
	}

	@Quando("eu pesquisar o produto desejado Apple iPhone {int}")
	public void eu_pesquisar_o_produto_desejado_apple_i_phone(Integer int1) throws InterruptedException {
		m.tempo(500);
		m.preencher(e.getPesquisar(),"iphone 14");
		System.out.println("ok");
		m.tempo(500);
		m.clicar(e.getBtnpesqui());
		System.out.println("ok");
	}

	@Quando("clicar no produto")
	public void clicar_no_produto() throws InterruptedException {
		m.tempo(500);
		m.clicar(e.getCelular());
		System.out.println("ok");
	}

	@Quando("clicar em selecionar o armazenamento interno de {int} Gb")
	public void clicar_em_selecionar_o_armazenamento_interno_de_gb(Integer int1) throws InterruptedException {
		m.tempo(500);
		m.clicar(e.getArmazenamento());
		System.out.println("ok");
	}

	@Entao("Entao a pagina me retornara com o GB selecionado")
	public void entao_a_pagina_me_retornara_com_o_gb_selecionado() throws InterruptedException {
		m.tempo(2000);
		m.fechat(null);
	}
	
}
