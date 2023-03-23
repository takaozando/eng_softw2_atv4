package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.Aluno;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void oAlunoDeveTerUmNome(){
		Aluno aluno = new Aluno("joao", "191005");

		assertNotEquals("", aluno.getNome());
	}
}
