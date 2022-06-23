/**
Nth Fibonacci
**/
public static int nthFibonacci(int input1){
       if(input1 == 1){
            return 0;
        }
        else if(input1== 2|| input1 ==3){
            return 1;
        }
        else{
            return nthFibonacci(input1-1)+nthFibonacci(input1-2);
        }
    }
