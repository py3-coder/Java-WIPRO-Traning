
/*
Addition using Strings: Write a function that takes two numbers in string format and forms a string containing the sum (addition) of these two numbers.
Assumption(s):
The input strings will contain only numeric digits
The input strings can be of any large lengths
The lengths of the two input string need not be the same
The input strings will represent only positive numbers
For example –
If input strings are “1234” and “56”, the output string should be “1290”
If input strings are “56” and “1234”, the output string should be “1290”
If input strings are “123456732128989543219” and “987612673489652”, the output string should be “123457719741663032871”
*/
/*
code
*/
public static int get_code_through_string(String input1,String input2){
        BigInteger sum =new BigInteger(input1);
		BigInteger fsum =new BigInteger(input2);
		fsum =fsum.add(sum);
		String str = String.valueOf(fsum);
		return str;
		
    }
