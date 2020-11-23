package com.example.demo;

import com.example.demo.Services.AtorPrincipalService;
import com.example.demo.Services.AtorCoadjuvanteService;
import com.example.demo.Services.DiretorService;
import com.example.demo.Services.FilmeService;
import com.example.demo.Services.LocalService;
import com.example.demo.Services.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppPersistencia implements CommandLineRunner {
	@Autowired
	private FilmeService filmeService;
	@Autowired
	private AtorPrincipalService atorPrincipalService;
	@Autowired
	private AtorCoadjuvanteService atorCoadjuvanteService;
	@Autowired
	private DiretorService diretorService;
	@Autowired 
	private PessoaService pessoaService;
	@Autowired
	private LocalService localService;

	public static void main(String[] args) {
		SpringApplication.run(AppPersistencia.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		//filmeService.criarFilmes();
		System.out.println("\n\nFILMES SEM ATRIBUIÇOES:");
		for (Filme f: filmeService.obterTodos()){
			System.out.println(f);	
		}
		//System.out.println(filmeService.sayHello());

		/*for (Ator a : atorService.obterTodos) {
			System.out.println(a);
		}

		for (Diretor d : diretorService.obterTodos) {
			System.out.println(d);
		}*/

		//pessoaService.criarAtorPrincipal();
		//pessoaService.criarAtoresCoadjuvantes();
		//pessoaService.criarDiretores();
		//localService.criarLocais();

		System.out.println("\n\nATOR PRINCIPAL:" + atorPrincipalService.obterTodos().toString());
		System.out.println("\n\nATORES COADJUVANTES:" + atorCoadjuvanteService.obterTodos().toString());
		System.out.println("\n\nDIRETORES:" + diretorService.obterTodos().toString());
		System.out.println("\n\nLOCAIS:" + 	localService.obterLocais().toString());

		
		Filme f1 = filmeService.findFilmeById("ffb59ccd-5639-4495-b761-d92e3ce9ddf9");
		Diretor d1 = diretorService.findDiretorById("8d5c5b22-911f-4c1a-b2c5-49121fd6044d");
		f1.setDiretor(d1);
		
		AtorPrincipal a1 = atorPrincipalService.findAtorPrincipalbyId("b69b181c-6633-4720-b0d5-303f0f42effa");
		f1.setAtorPrincipal(a1);

		AtorCoadjuvante c2 = atorCoadjuvanteService.findAtorCoadjuvantelbyId("59a312ec-67a8-4b55-b4f0-785989be300e");
		f1.setAtorCoadjuvante(c2);

		f1.setTotalBilheteria(150_000_000.00);
		
		
		
		Local l1 = localService.findLocalById("c9f881bc-3f06-4716-83dd-ca7bcc612cc0");
		f1.setLocalGravaçao(l1);


		Filme f2 = filmeService.findFilmeById("9a0fc251-7f1d-4163-9b0a-3df038a11060");
		f2.setTotalBilheteria(250_000_000.00);
		//Diretor d2 = diretorService.findDiretorById("e0f8a451-8553-4b25-b46f-a4f77c0df0f6");
		//AtorPrincipal a2 = atorPrincipalService.findAtorPrincipalbyId(26febacc-9d9b-45cd-bcc6-ad2117f847da);

		//f2.setDiretor(d2);
		//f2.setAtorPrincipal(a1);
		f2.setAtorCoadjuvante(c2);


		/*for (Filme f: filmeService.obterTodos()){
			System.out.println(f);	
		}*/

		//System.out.println(f1.toString());
		//System.out.println(f2.toString());

		System.out.println("\n\n\n\n---             ATOR PRINCIPAL A1              ---");
		System.out.println("\n\nAtor Principal: " + a1.getNome());
		System.out.println(" filmes participados:" + a1.getFilmesParticipados());
		System.out.println("\n\n\n ---                 DIRETOR D1               ---");
		System.out.println("\nd1 filme produzido:" + d1.getFilmeProduzido());	


		System.out.println("\n\n\n---             COADJUVANTE C2              ---");
		System.out.println("Coadjuvante nome=" + c2.getNome());
		System.out.println("\ncache total:" + c2.getCacheTotalFilmes());

		System.out.println("ator="+ c2.getNome() + ", filmes participados:" + c2.getFilmesParticipados());
		//System.out.println("ator= " + c2.getNome() + "cache total em filmes participados=" + c2.getCacheTotalFilmes());
	}

}
