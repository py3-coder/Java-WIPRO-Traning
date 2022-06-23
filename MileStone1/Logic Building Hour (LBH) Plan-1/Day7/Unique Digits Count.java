/*
Unique Digits Count
*/
public static int uniqueDigitCount(int input1){
        HashMap<Integer , Integer> map = new HashMap<>();
        int temp = input1;
        int digit=0;
        while(temp>0){
            digit =temp%10;
            if(map.containsKey(digit)){
                map.put(digit, map.get(digit)+1);
            }
            map.put(digit, 0);
            temp =temp/10;
        }
        return  map.size();
    }
