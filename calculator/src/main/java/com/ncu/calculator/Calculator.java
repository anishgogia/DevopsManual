package com.ncu.calculator;


	public class Calculator implements Calc {
		public int evaluate(String expression) {
			int sum = 0;
			for (String expr : expression.split("\\+")) {
	sum+=Integer.valueOf(expr);
			}
			return sum;
		}

		public int add(int x, int y) {
			// TODO Auto-generated method stub
			return x+y;
		}

		
		public int subtract(int x, int y) {
			// TODO Auto-generated method stub
			return x-y;
		}

	
		public int multiply(int x, int y) {
			// TODO Auto-generated method stub
			return x*y;
		}

		
		public double divide(int x, int y) {
			// TODO Auto-generated method stub
			return x/y;
		}




		
	}

