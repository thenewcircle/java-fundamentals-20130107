package com.marakana.objects;
import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectsTest {

	@Test
	public void test() {
		Memory[] memory = { new Memory(8, "DIMM"), new Memory(8, "DIMM") };
		Disk[] disks = { new Disk(512, "SATA") };
		Laptop lappy = new Laptop("MacBook Pro", 15, memory, disks);

		lappy.turnOn();

		LaptopBag bag = new LaptopBag(15);
		bag.insertLaptop(lappy);
		
		System.out.println(bag);
	}

}
