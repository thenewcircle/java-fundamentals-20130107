package com.marakana.objects;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectsTest {

	@Test
	public void test() {

		Memory m1 = new Memory(8, "DIMM"), m2 = new Memory(8, "DIMM");
		assertFalse(m1 == m2);
		assertTrue(m1.equals(m2));

		Memory[] memory = { m1, m2 };

		Disk[] disks = { new Disk(512, "SATA") };
		Laptop lappy = new Laptop("MacBook Pro", 15, memory, disks);

		lappy.turnOn();

		LaptopBag bag = new LaptopBag(15);
		bag.insertLaptop(lappy);

		System.out.println(bag);
	}

}
