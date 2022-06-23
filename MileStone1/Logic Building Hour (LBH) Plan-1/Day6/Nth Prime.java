/*
Nth Prime
*/
public static int NthPrime(int input1){
       int count=0;
        boolean flag ;
        for(int i=2 ;i>0;i++){
            flag=true;
            for (int j=2;j<i;j++){
                if(i%j ==0){
                    flag =false;
                    break;
                }
            }
            if(flag==true){
            count++;
            }
            if(count == input1){
            return i;
            }
        }
        return 0;
    }
