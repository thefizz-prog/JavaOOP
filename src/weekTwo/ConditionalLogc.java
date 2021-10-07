package weekTwo;

import java.util.Scanner;

public class ConditionalLogc {

	
		static Scanner sc = new Scanner(System.in);
		
		
		public static void main (String[] args) {

			switchMathOperation();
			//ternaryOperator();
			//ifMonth();
			//switchVowelOrConsonant();
//			System.out.print("Enter the certificaiton age");
//			int certificationAge = sc.nextInt();
//			int agePerson = sc.nextInt();
//			System.out.println("Person is able to view movie: " + admitToFile(certificationAge,agePerson ));
			//preAndPostDifference();
//			System.out.println("Please enter two numbers");
//			int number1 = sc.nextInt();
//			int number2 = sc.nextInt();
//			System.out.println("booleanLogicShortCircuitOps");
//			booleanLogicShortCircuitOps(number1,number2);
//			System.out.println("-------------------------------");
//			System.out.println("booleanBitwiseOps");
//			booleanBitwiseOps(number1, number2);
//			System.out.println(" Enter two names");
//			String s1 = sc.next();
//			String s2 = sc.next();
//			comapreString(s1,s2);
		}
		
		public static void preAndPostDifference() {
			int x= 5;
			int y = 10;
			
			// Did not bother doing the same for y as it was the same exercise 
			System.out.println("The value of x is " + x);
			System.out.println("The value of ++x is " + ++x);
			System.out.println("The value of x++ is " + x++);
			System.out.println("The value of x is " + x);
			}
		
		public static void booleanLogicShortCircuitOps(int In1, int In2) {
				int num1 = In1;
				int num2 = In2;
				
				if (num1< 0 && num2 ++ <0)  {
					System.out.println(num2);
				}
				else if (num1 > 0 && num2++ > 0) {
					System.out.println(num2);
				}
				else if (num1 == 0 | num2++ == 0) {
					System.out.println(num2);
				}
				else if (num1 < 0 | num2++ < 0) { 
					System.out.println(num2); 
				}
				//return num1;
			}
		
		public static void booleanBitwiseOps (int In1, int In2) {
			int num1 = In1;
			int num2 = In2;
			
			
			if (num1< 0 & num2 ++ <0)  {
				System.out.println(num2 + "A");
			}
			else if (num1 > 0 & num2++ > 0) {
				System.out.println(num2+ "B and: "+  num2++ );
			}
			else if (num1 == 0 | num2++ == 0) {
				System.out.println(num2 + "C");
			}
			else if (num1 < 0 | num2++ < 0) { 
				System.out.println(num2 + "D"); 
			}
			//return num1;
		}
		
		public static void comapreString(String s1, String s2) {
			//System.out.print("Using == returns " + s1 == s2);
			String name1 = "Sean";
			String name2 = "Sean";
			String name3 = "John";
			String name4 = new String("john");
			//System.out.print("Using == returns " + s1.equals(s2));
			
			//System.out.print("Using == returns " + name1.equals(name2));
			System.out.print("Using == returns " + name1 == name2);
		}
		
		public static boolean admitToFile(int certificationAge, int agePerson ) {
//			if (agePerson<certificationAge) {
//				return false;
//			}
//			else {
//			return true;
//			}
			
		boolean result = agePerson < certificationAge ?  false :  true;
		return result;
		}
		
		public static void ternaryOperator() {
			boolean isHappy = true;
			String mood = isHappy == true ? "I am happy" : "I'm not happy "; 
			
			System.out.println("Enter two numbners");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int minVal = x<y ? x :y;
			System.out.println("minVal: " + minVal);
		}
		
		public static void switchVowelOrConsonant() {
			System.out.println("Enter a character");
			char letter = sc.next().charAt(0);
			
			switch (letter ) {
				
				case (int) 'A' : System.out.println("Its a vowel"); break ;
				case (int) 'a': System.out.println("Its a vowel");	break ;
				case (int) 'E': System.out.println("Its a vowel");	break ;
				case (int) 'e': System.out.println("Its a vowel");	break ;
				case (int) 'I': System.out.println("Its a vowel");	break ;
				case (int) 'i': System.out.println("Its a vowel");	break ;
				case (int) 'O': System.out.println("Its a vowel");	break ;
				case (int) 'o': System.out.println("Its a vowel");	break ;
				case (int) 'U': System.out.println("Its a vowel");	break ;
				case (int) 'u': System.out.println("Its a vowel");	break ;
				
				default: System.out.println("Its a contant");
//				if (letter ==  (int) 'A'   || letter == (int) 'a'|| letter == (int) 'E'  || letter == (int) 'e' || letter ==  (int) 'I' || letter == (int) 'i' || letter ==  (int) 'O' || letter ==  (int) 'o' ||  letter ==  (int) 'U' || letter ==  (int) 'u' ) {
//					
//					System.out.print("It's a vowel");
//					
//				}
//				
//				else {
//					System.out.print("It's a constant");
//				}
//				
			}

		}
		
		public static void ifMonth() {

			final int Jan=1;
			final int Feb=2;
			final int Mar=3;
			final int Apr=4;
			final int May=5;
			final int Jun=6;
			final int Jul=7;
			final int Aug=8;
			final int Sep=9;
			final int Oct=10;
			final int Nov=11;
			final int Dec=12;
			
			System.out.print("Enter month in range 1-> 12");
				
				try {
					int month = sc.nextInt();
					
					if (month == Jan ) {
						System.out.print("January");
					}
					else if (month == Feb) {
						System.out.print("Feb");
					}
					else if (month == Mar) {
						System.out.print("Mar");
					}
					else if (month == Apr) {
						System.out.print("April");
					}
					else if (month == May) {
						System.out.print("May");
					}
					else if (month == Jun) {
						System.out.print("June");
					}
					else if (month == Jul) {
						System.out.print("July");
					}
					else if (month == Aug) {
						System.out.print("Aug");
					}
					else if (month == Sep) {
						System.out.print("Sep");
					}
					else if (month == Oct) {
						System.out.print("Oct");
					}
					else if (month == Nov) {
						System.out.print("Nov");
					}
					else if (month == Dec) {
						System.out.print("Dec");
					}
					else {
						System.out.print("Out of range");
					}
					}
					
				catch (Exception e ) {
					
					System.out.println("Exception caught");
					e.printStackTrace();
				}
					
			
		}
		
		public static void switchMathOperation() {
			double answer = 0.0;
			boolean charOK = true;
			System.out.println("Enter two numbers and then an operation");
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			char operation = sc.next().charAt(0);
			System.out.println("Input 1:" + num1 + "\n" + "Input 2: " + num2 + "\n" + "operation " + operation );
			
			switch (operation)  {
			
			case '+':
				answer = num1 + num2;
				break;
			case '-':
				answer = num2 -num1;
				break;
			case '*':
				answer = num2 * num1;
				break;
			case '/':
				answer = num1 / num2;
				break;
			default:
				charOK = false;
				System.out.println( "Unknown mathematical operator " + operation + charOK );
		
			}
			
			if (charOK ==true) {
				System.out.println("Answer:" + answer);
			}
			
			
;		}
}