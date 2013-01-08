import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectsTest {

	@Test
	public void test() {
		Laptop lappy = new Laptop();
		lappy.model = "MacBook Pro";
		lappy.size = 15;
		
		Memory[] memory = { new Memory(), new Memory() };
		memory[0].size = 8;
		memory[0].type = "DIMM";
		memory[1].size = 8;
		memory[1].type = "DIMM";
		lappy.memory = memory;

		Disk[] disks = { new Disk() };
		disks[0].size = 512;
		disks[0].type = "SATA";
		lappy.disks = disks;

		LaptopBag bag = new LaptopBag();
		bag.contents = lappy;
		
		System.out.println(bag);
	}

}
