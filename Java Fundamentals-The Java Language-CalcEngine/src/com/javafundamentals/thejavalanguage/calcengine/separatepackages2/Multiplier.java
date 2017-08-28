package com.javafundamentals.thejavalanguage.calcengine.separatepackages2;

public class Multiplier extends CalculateBase{
	public Multiplier(){}
	public Multiplier(double leftVal, double rightVal) {
		//calling base class constructor
		super(leftVal, rightVal);
	}
	@Override
	public void calculate() {
		double value = getLeftVal() * getRightVal();
		setResult(value);
	}

}