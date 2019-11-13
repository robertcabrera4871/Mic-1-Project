import java.util.Arrays;

public class demo {

	public static void main(String[] args) {

		Boolean[] nextAddress = { true, false, true, true, false, true, true, false, true };
		Boolean[] jam = { true, false, true };
		Boolean[] alu = { true, false, true, true, false, true, true, false };
		Boolean[] cBus = { true, false, true, true, false, true, true, false, true };
		Boolean[] mem = { true, false, true };
		Boolean[] bBus = { true, false, true, true };
		MicroInstruction test = new MicroInstruction(nextAddress, jam, alu, cBus, mem, bBus);
		System.out.println(Arrays.toString(test.getAlu()));
		System.out.println(test.toString());
	}

}
