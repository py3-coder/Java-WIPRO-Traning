/*
Is Palindrome Number?
*/
public static int isPalindrome(int input1){
        int num=0,digit=0;
        int a=input1;
        while(a>0){
            digit = a%10;
            num = 10*num+digit;
            a/=10;
        }
        if(num==input1){
            return 2;
        }else{
            return 1;
        }
    }
