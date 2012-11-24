public interface HexConvertor {

/**
* main method to take in hex number and print decimal result;
* - needs a procedure for checking each char for a letter and assigning approp num
* - then calculate the decimal total for each 'digit': whatever the number is multiplied by 16 to the power its charAt position
* - sum the total and return it
*/

	int let2Num(String substr);
/** takes in a substribring of the hex string @param substr converts letters to their decimal and parses each substring to integer, @return @param num */

	int calcPower(int num, int powerof);
 /** where @param num needs to be multipled by 16^charAt(@param powerof ) then calculation done in this method and @return @param num  */
	
 	int decConvert(String str);
 /**calculates digits 0 and 1 separately then for each addition digit calculates its power (@param powerof ) totals the decimal value 
 * of the digit and adds it to a running total, @return @param totalDec */
 
}
