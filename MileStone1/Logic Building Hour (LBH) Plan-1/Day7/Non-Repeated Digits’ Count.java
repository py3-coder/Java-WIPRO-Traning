/*
Non-Repeated Digits’ Count
*/
public static int nonRepeatDigitCount(int input1){
        HashMap<Integer , Integer> map = new HashMap<>();
        int temp = input1;
        int digit=0;
        while(temp>0){
            digit =temp%10;
            if(map.containsKey(digit)){
                map.put(digit, map.get(digit)+1);
            }
            else map.put(digit, 1);
            temp =temp/10;
        }
        int count=0;
        for(int a :map.values()){
            if(a==1){
                count++;
            }
        }
        return  count;
    }
