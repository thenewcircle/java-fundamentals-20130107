package com.marakana.shapes;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ShapesTest {

	private static final Random RANDOM = new Random();

	@Test
	public void squaresMustRemainSquare() {
		for (int i = 0; i < 100; i++) {
			Square s = arbitrarySquare();
			s.setWidth(RANDOM.nextInt(50));
			assertEquals(s.getWidth(), s.getHeight());
		}
	}

	@Test
	public void setWidthMustNotChangeHeight() {
		for (int i = 0; i < 100; i++) {
			Rectangle r = arbitraryRectangle();
			int expected = r.getHeight();
			r.setWidth(RANDOM.nextInt(50));
			assertEquals(expected, r.getHeight());
		}
	}

	private static Square arbitrarySquare() {
		return new Square(RANDOM.nextInt(50));
	}

	private static Rectangle arbitraryRectangle() {
		return RANDOM.nextBoolean()
				? arbitrarySquare()
				: new Rectangle(RANDOM.nextInt(50), RANDOM.nextInt(50));
	}
}
