/*
Number of Primes in a specified range
*/
public static int PrimeCount(int input1,int input2){
       int xount=0;
        boolean flag = false;
        for(int i=input1;i<=input2;i++){
            for(int j=2;j<i;j++){
                flag =true;
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                xount++;
            }
        }
        return xount;
    }
