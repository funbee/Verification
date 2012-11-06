/**
 * 
 */
package code;

/**
 * @author Oded
 *
 */
public class NumberEncoder {

	private char[] code = null;
	private char[] invertedCode = null;

	

	public NumberEncoder(String newCode){
		String lim = new String("09");
		char[] limits = lim.toCharArray();
		
		if(code != null) throw new NumberFormatException("code already set!");
		if(newCode.length() != 10) throw new NumberFormatException("replaceWithString wrong length!");
		
		invertedCode = new char[newCode.length()];		
		code = newCode.toCharArray();
		if (!isNumeric(code)) throw new NumberFormatException("Non digit in code!");
		
		for(char i = limits[0]; i<=limits[1]; i++){
			invertedCode[Character.getNumericValue(code[Character.getNumericValue(i)])] = i;
		}
	}



	public String decode(String number) {
		char[] decodedNumber = number.toCharArray();
		int digit;

		for(int i=0; i< decodedNumber.length; i++){
			digit = Character.getNumericValue(decodedNumber[i]);
			switch(digit){
			case 0: decodedNumber[i] = code[digit]; break;
			case 1: decodedNumber[i] = code[digit]; break;
			case 2: decodedNumber[i] = code[digit]; break;
			case 3: decodedNumber[i] = code[digit]; break;
			case 4: decodedNumber[i] = code[digit]; break;
			case 5: decodedNumber[i] = code[digit]; break;
			case 6: decodedNumber[i] = code[digit]; break;
			case 7: decodedNumber[i] = code[digit]; break;
			case 8: decodedNumber[i] = code[digit]; break;
			case 9: decodedNumber[i] = code[digit]; break;
			default: throw new NumberFormatException("Non digit in code");
			}
		}
		return new String(decodedNumber);
	}
	
	public String encode(String number) {
		char[] encodedNumber = number.toCharArray();
		int digit;
		for(int i=0; i< encodedNumber.length; i++){
			digit = Character.getNumericValue(encodedNumber[i]);
			switch(digit){
			case 0: encodedNumber[i] = invertedCode[digit]; break;
			case 1: encodedNumber[i] = invertedCode[digit]; break;
			case 2: encodedNumber[i] = invertedCode[digit]; break;
			case 3: encodedNumber[i] = invertedCode[digit]; break;
			case 4: encodedNumber[i] = invertedCode[digit]; break;
			case 5: encodedNumber[i] = invertedCode[digit]; break;
			case 6: encodedNumber[i] = invertedCode[digit]; break;
			case 7: encodedNumber[i] = invertedCode[digit]; break;
			case 8: encodedNumber[i] = invertedCode[digit]; break;
			case 9: encodedNumber[i] = invertedCode[digit]; break;
			default: throw new NumberFormatException("Non digit in number");
			}
		}
		return new String(encodedNumber);
	}
	
	
	public boolean isNumeric(char[] candidate){
		for(int i=0; i< candidate.length; i++){
			if (!Character.isDigit(candidate[i]))	return false ;
		}		
		return true;
	}
	
	
}