/*
Of 5 numbers, how many are even or odd?
*/
public static int evenoddCount(int input1,int input2,int input3,int input4,int input5, String input6){
       if(input6.equalsIgnoreCase("even")){
            int count =0;
            if(input1%2==0) count+=1;
            if(input2%2==0) count+=1;
            if(input3%2==0) count+=1;
            if(input4%2==0) count+=1;
            if(input5%2==0) count+=1;
            return count;
        }else {
            int count =0; 
            if(input1%2 !=0) count+=1;
            if(input2%2 !=0) count+=1;
            if(input3%2 !=0) count+=1;
            if(input4%2 !=0) count+=1;
            if(input5%2 !=0) count+=1;
            return count;
        }
    }
