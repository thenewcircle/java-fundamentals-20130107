package com.marakana.objects;
import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectsTest {

	@Test
	public void test() {
		Laptop lappy = new Laptop();
		lappy.setModel("MacBook Pro");
		lappy.setSize(15);
		
		Memory[] memory = { new Memory(), new Memory() };
		memory[0].setSize(8);
		memory[0].setType("DIMM");
		memory[1].setSize(8);
		memory[1].setType("DIMM");
		lappy.setMemory(memory);

		Disk[] disks = { new Disk() };
		disks[0].setSize(512);
		disks[0].setType("SATA");
		lappy.setDisks(disks);

		lappy.turnOn();

		LaptopBag bag = new LaptopBag();
		bag.setSize(15);
		bag.insertLaptop(lappy);
		
		System.out.println(bag);
	}

}
