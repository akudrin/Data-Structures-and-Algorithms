import java.util.Arrays;

public class GenericDemoUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericDemo demo = new GenericDemo();
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		demo.reverse(cars);
		System.out.println(Arrays.toString(cars));
	}

}
