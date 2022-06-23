/*
digitSum opt: sum of even or odd digits
*/
public static int oddevendigitSum(int input1,String input2){
       if(input2.equalsIgnoreCase("odd")){
        int digit=0,sum=0;
        while(input1>0){
            digit = input1%10;
            if(digit%2 !=0){
                sum+=digit;
            }
            input1/=10;
        }
        return sum;
        }
        else{
        int digit=0,sum=0;
        while(input1>0){
            digit = input1%10;
            if(digit%2 ==0){
                sum+=digit;
            }
            input1/=10;
        }
        return sum;
        }
    }
