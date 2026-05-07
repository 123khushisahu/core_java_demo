package method;
			public class c {
			    public static void main(String[] args) {
			        int num = 1234;
			        int rev = 0;

			        while(num != 0) {
			            int rem = num % 10;   // last digit
			            rev = rev * 10 + rem; // adding digit to reverse
			            num = num / 10;       // removing last digit
			        }

			        System.out.println("Reverse number: " + rev);
			    }
			}

			
		}
	}

}
