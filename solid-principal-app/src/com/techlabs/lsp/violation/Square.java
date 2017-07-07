package com.techlabs.lsp.violation;

public class Square implements Polygon {
	int side;
	public Square(int side) {
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int getArea() {
		return side * side;
	}

}
