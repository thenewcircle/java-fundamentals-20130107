package com.marakana.objects;

public class LaptopBag {
	private final int size;
	private Laptop laptop;

	public LaptopBag(int size) {
		this.size = size;
	}

	public void insertLaptop(Laptop laptop) {
		if (laptop.getSize() > size) {
			throw new IllegalArgumentException("laptop too big");
		}

		if (this.laptop != null) {
			throw new IllegalStateException("bag already contains a laptop");
		}

		this.laptop = laptop;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public int getSize() {
		return size;
	}

}
