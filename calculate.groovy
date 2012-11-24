println "You can add, subtract, multiply and divide. Enter your calculation in the format number operator number, e.g. 2*3 or 3/4 etc."
print "calculate: "

// You have selected Add";
// println "please enter your first number: ";
String str = System.console().readLine();

char char1 = str.charAt(0)
char char2 = str.charAt(2)
int num1 = Integer.parseInt(char1);
int num2 = Integer.parseInt(char2);

char operator = str.charAt(1);
Calculator calculate = new Calculator();
	if (char == '+') {
		int result = calculate.add(num1,num2);
		println "the result is " + result;
	}		
	if (char == '-') {
		int result = calculate.subtract(num1,num2);
		println "the result is " + result;
	}
	if (char == '*') {
		int result = calculate.multiply(num1,num2);
		println "the result is " + result;
	}
	if (char == '/') {
		println "do you want an integer division (x remainder y) or a decimal divsion (x.y)?"
		println "for integer key in 'i', for decimal key in 'd': "
		String str1 = System.console().readLine();
		char div = str1.charAt(0);
		if (div == 'i') {
			int result = calculate.divide(num1,num2);
			print "the result is " + result;
			result = calculate.modulus(num1,num2);
			print " remainder " + result;
		}
		if (div == 'd') {
			// do something else
			"Actually I haven't done this yes, soz."
			
		}
	}
	



//int aa = Integer.parseInt(str);
//println "please enter your second number: ";
//str = System.console().readLine();
//int bb = Integer.parseInt(str);


