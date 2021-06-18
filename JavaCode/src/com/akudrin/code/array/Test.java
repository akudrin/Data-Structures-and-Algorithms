package com.akudrin.code.array;

public class Test {

	class A {
		private int a = 1;

		public void addOne() {
			a++;
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Test test1 = new Test();
		Test.A a = test1.new A();
		a.addOne();
		Test.A b = a;
		b.addOne();
	}

}
