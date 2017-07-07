package com.techlabs.lsp.violation;

public class Rectangle implements Polygon {
	protected int width;
	protected int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea(int width, int height) {
		return width * height;
	}

	@Override
	public int getArea() {
		int area = 0;
		return area;
	}
}
