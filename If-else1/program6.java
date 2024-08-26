class program6 {
        public static void main(String args[]) {
                int num=0;

		if(num==0) {
			System.out.println("number is zero");
		}
		else {

		if(num%3==0 && num%7==0) {
			System.out.println("21 is divisible by both 3 and 7");
		}

		else if(num%3==0) {
                        System.out.println("Number is divisible by 3");
                }
                else if (num%7==0) {
			System.out.println("Number is divisible by 7 ");
		}
		else {
			System.out.println("Number is neithe divisible by 7 nor by 3");
		}
		}
        }
}

