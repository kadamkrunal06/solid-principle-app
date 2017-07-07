package com.techlabs.lsp.violation.test;

import com.techlabs.lsp.violation.Rectangle;

public class TestLSP {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(100, 50);
		shouldNotChange(rectangle);
		// Rectangle square = new Square(100);
		// shouldNotChange(square);
	}

	public static void shouldNotChange(Rectangle rect) {
		int valueBeforeChange = rect.getHeight();
		rect.setWidth(120);
		int valueAfterChange = rect.getHeight();
		System.out.println("Before =" + valueBeforeChange);
		System.out.println("After =" + valueAfterChange);

	}
}