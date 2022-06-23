/***
Return second last digit of given number
***/
public static int secodLast(int input1){
       int n= Math.abs(input1);
        if(n>9){
            return (n/10)%10;

        }
        else return -1;

    }
