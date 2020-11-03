package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import FactoryMethod.Concessionaria;
import FactoryMethod.Fiat;

class testFactory {

	@Test
	void test() {
		Concessionaria test = new Fiat();
		assertEquals(null,test.MakeMacchina("Ciccia"));
	}
	
	@Test
	void test2() {
		Concessionaria test = new Fiat();
		assertNotEquals(null,test.MakeMacchina("Abarth"));
	}

}
