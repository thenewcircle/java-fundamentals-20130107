package com.marakana.objects;

public class LaptopBag {
	private final int size;
	private final Color color;
	private Laptop laptop;

	public LaptopBag(int size, Color color) {
		this.size = size;
		this.color = color;
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

	public Color getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LaptopBag other = (LaptopBag) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

}
