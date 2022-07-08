/*
FindStringCode
Crazy Zak has designed the below steps which can be applied on any given string (sentence) to produce a number.
STEP1. In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word.
STEP2. Concatenate the sums of each word to form the result.
For example –
If the given string is “WORLD WIDE WEB”
STEP1. In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word.
WORLD = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40]
WIDE = [W-E]+[I-D] = [23-5]+[9-4] = [18]+[5] = [23]
WEB = [W-B]+[E] = [23-2]+[5] = [21]+[5] = [26]
STEP2. Concatenate the sums of each word to form the result
[40] [23] [26]
[402326]
The answer (output) should be the number 402326.
NOTE1:The value of each letter is its position in the English alphabet system i.e. a=A=1, b=B=2, c=C=3, and so on till z=Z=26.
So, the result will be the same for “WORLD WIDE WEB” or “World Wide Web” or “world wide web” or any other combination of uppercase and lowercase letters.
IMPORTANT Note: In Step1, after subtracting the alphabets, we should use the absolute values for calculating the sum. For instance, in the below example, both [H-O] and [E-L] result in negative number -7, but the positive number 7 (absolute value of -7) is used for calculating the sum of the differences.
Hello = [H-O]+[E-L]+[L] = [8-15]+[5-12]+[12] = [7]+[7]+[12] = [26]
Assumptions: The given string (sentence) will contain only alphabet characters and there will be only one space character between any two consecutive words.
You are expected to help Zak, by writing a function that takes a string (sentence) as input, performs the above mentioned processing on the sentence and returns the result (number).
Example1:
input1 = “World Wide Web”
output1 = 402326
Example2:
input1 = “Hello World”
output1 = 2640
Explanation:
Hello = [H-O]+[E-L]+[L] = [8-15]+[5-12]+[12] = [7]+[7]+[12] = [26]
World = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40]
Result = Number formed by concatenating [26] and [40] = 2640
*/
/*
Code:
*/
import java.util.*;
import java.io.*;
public class Main
{
    public static int findStringCode(String input1){
        String str = input1.toUpperCase();
        String word[] = str.split(" ");
        String res="";
        for(int i=0;i<word.length;i++){
            int sum=0;
            int n= word[i].length();
            for(int j=0;j<n/2;j++){
                int first = word[i].charAt(j);
                int last =word[i].charAt(n-1-j);
                sum+=Math.abs(first-last);
                System.out.println(sum);
            }
            if(n%2 !=0){
                sum +=Math.abs(word[i].charAt(n/2)-64);
            }
            System.out.println(sum);
            String val =Integer.toString(sum);
            res +=val;
        }
        return Integer.parseInt(res);
    }
	public static void main(String[] args) {
	    String str = "World Wide Web";
		System.out.println(findStringCode(str));
	}
}
