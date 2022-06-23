/*
digitSum : sum of all digits in N
*/
public static int digitSum(int input1){
        int n=Math.abs(input1);
		int sum=0;
		while(n>0 || sum>9){
		    if(n==0){
		        n=sum;
		        sum=0;
		    }
			sum +=n%10;
			n/=10;
		}
		
		if(input1>0){
			return sum;
		}else{
			return -sum;
		}
    }
