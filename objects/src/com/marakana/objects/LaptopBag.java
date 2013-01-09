package com.marakana.objects;
public class LaptopBag {
	private int size;
	private Laptop laptop;

	public void insertLaptop(Laptop laptop) {
		if (laptop.getSize() > size) {
			throw new IllegalArgumentException("laptop too big");
		}
		
		if (this.laptop != null) {
			throw new IllegalStateException("bag already contains a laptop");
		}
		
		this.laptop = laptop;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
