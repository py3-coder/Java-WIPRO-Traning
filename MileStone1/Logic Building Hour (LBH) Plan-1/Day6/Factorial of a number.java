/*
Factorial of a number
*/
public static int factorial(int input1){
       int res=1;
        for(int i=input1;i>0;i--){
            res=res*i;
        }
        return res;
    }
