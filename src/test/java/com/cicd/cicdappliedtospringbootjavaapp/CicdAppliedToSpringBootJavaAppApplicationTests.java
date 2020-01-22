package com.cicd.cicdappliedtospringbootjavaapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.cicd.cicdappliedtospringbootjavaapp.controller.CicdController;

@RunWith(SpringRunner.class)
@SpringBootTest
class CicdAppliedToSpringBootJavaAppApplicationTests {

	@Autowired
	private CicdController controller;
	
	@Test
	void contextLoads() {
		Assert.assertEquals("Gracias Totales Cerati!!!", controller.home());
	}

}
