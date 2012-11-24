public class HexToDec implements HexConvertor {

	public int let2Num(String substr){
/** takes in a substribring of the hex string @param substr converts letters to their decimal and parses each substring to integer, @return @param num */
		if (substr.equals("a")){
 			substr = "10";
 		}
 		else if (substr.equals("b")) {
 			substr = "11";
 		}
 		else if (substr.equals("c")){
 			substr = "12";
 		}
 		else if (substr.equals("d")){
 			substr = "13";
 		}
 		else if (substr.equals("e")){
 			substr = "14";
 		}
 		else if (substr.equals("f")){
 			substr = "15";
 		}
 		int num = Integer.parseInt(substr);
 		
 		return num;
	}



	public int calcPower(int num, int powerof) {
 /** the calculation is wrong here. It would work fine if I understand how to calculate decimal from hex. but I don't  */
 		int j = 2;
 		int summat = 16; 
 		while(j<= powerof){
 			summat = summat * 16;
 			j++;
 		}
 		num = num + summat;
 		return num;
 	}
 
 	public int decConvert(String str){
 		int decnum1 = let2Num(str.substring(str.length()-1, str.length()));
 		int decnum2 = (let2Num(str.substring(str.length()-2, str.length()-1))*16); // (let2Num(str.substring(1,2))+16) is wrong maths; 
		int totalDec = decnum1 +decnum2;
		int powerof = 2;
		while (powerof < str.length()){
			decnum1 = let2Num(str.substring(str.length()-(powerof+1), str.length()-(powerof)));
			totalDec = totalDec + calcPower(decnum1, powerof);
			powerof++;
		}
		return totalDec;
 		
 	} 
 	
 	public static void main(String[] args) {
 		System.out.println("enter a hex number");
 		String str = System.console().readLine();
 		HexConvertor run = new HexToDec();
 		System.out.println("the decimal number is " + run.decConvert(str));
 	}
 }
