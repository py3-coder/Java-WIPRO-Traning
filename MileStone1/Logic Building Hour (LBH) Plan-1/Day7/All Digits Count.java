/*
All Digits Count
*/
public static int digitCount(int input1){
        int temp = input1;
        int count=0;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        return count;
    }
