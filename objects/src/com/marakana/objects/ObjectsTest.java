package com.marakana.objects;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ObjectsTest {

	@Test
	public void test() {
		List<Storage> storage = new ArrayList<Storage>();
		storage.add(new Memory(4096, "DIMM"));
		storage.add(new Memory(4096, "DIMM"));
		storage.add(new Disk(512, "SATA"));

		Laptop lappy = new Laptop("MacBook Pro", 15, storage);
		Set<String> applications = new HashSet<String>();
		applications.add("Eclipse");
		applications.add("BitTorrent");
		lappy.setApplications(applications);

		assertEquals(520, lappy.totalStorage());

		lappy.turnOn();

		LaptopBag bag = new LaptopBag(15);
		bag.insertLaptop(lappy);

		System.out.println(bag);
	}

}
