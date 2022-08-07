package com.ictkeralajavaprog.encapsulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class Eventest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Evenfunc objna=new Evenfunc();
		assertTrue(objna.iseven(4));
	}

}
