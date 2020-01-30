package com.cicd.cicdappliedtospringbootjavaapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cicd.cicdappliedtospringbootjavaapp.controller.CicdController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CicdAppliedToSpringBootJavaAppApplicationTests {

	@Autowired
	private CicdController controller;
	
	@Test
	void contextLoads() {
		//Assert.assertEquals("Gracias Totales Cerati!!!", controller.home());
		assertTrue("Gracias Totales Cerati!!!".equals(controller.home()));
	}

}
