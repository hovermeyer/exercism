class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		String [] number_array = Integer.toString(numberToCheck).split("");
		int sum = 0;

		for (int i = 0; i < number_array.length; i++) {
			sum += Math.pow(Integer.parseInt(number_array[i]), number_array.length);
		}
		return sum == numberToCheck;
	}

}