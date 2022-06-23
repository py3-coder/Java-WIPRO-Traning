/*
digitSum even: sum of even digits in N
*/
public static int evendigitSum(int input1){
        int digit=0,sum=0;
        while(input1>0){
        digit = input1%10;
        if(digit%2==0){
            sum+=digit;
        }
        input1/=10;
    }
        return sum;
    }
