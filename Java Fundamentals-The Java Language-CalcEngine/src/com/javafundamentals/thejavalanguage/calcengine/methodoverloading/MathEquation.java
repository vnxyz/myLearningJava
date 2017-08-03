package com.javafundamentals.thejavalanguage.calcengine.methodoverloading;

public class MathEquation {

	private double leftVal;
	private double rightVal;
	private char opCode = 'a';//default opCode
	private double result;
	
	public MathEquation(char opCode){
		this.opCode = opCode;
	}
	public MathEquation(double leftVal, double rightVal, char opCode) {
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	public MathEquation() {

	}
	public double getLeftVal() {
		return leftVal;
	}

	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}

	public double getRightVal() {
		return rightVal;
	}

	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}

	public char getOpCode() {
		return opCode;
	}

	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}


	public void execute() {
		switch (opCode) {
		case 'a':
			result = leftVal + rightVal;
			break;
		case 's':
			result = leftVal - rightVal;
			break;
		case 'd':
			result = rightVal != 0 ? leftVal / rightVal : 0.0d;
			break;
		case 'm':
			result = leftVal * rightVal;
			break;
		default:
			System.out.println("Error in valid opCode");
			result = 0.0d;
			break;
		}
	}
	//01.
	public void execute(double leftVal, double rightVal){
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		execute();
	}
	//04. 
	public void execute(int leftVal, int rightVal){
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		execute();
		//ans is 2.25 but for integers it should be 2 so we need to provide another overload method for it
		result = (int)result;
	}
}
