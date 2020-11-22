package com.example.demo;

import com.example.demo.Services.FilmeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppPersistencia implements CommandLineRunner {
	@Autowired
	private FilmeService filmeService;

	public static void main(String[] args) {
		SpringApplication.run(AppPersistencia.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		//filmeService.criarFilmes();
		for (Filme f: filmeService.obterTodos()){
			System.out.println(f);	
		}
		System.out.println(filmeService.sayHello());
	}

}
