/*
Is Palindrome Possible?
*/
public static int isPalindromePossible(int input1){
        HashMap<Integer , Integer> map = new HashMap<>();
        int temp = input1;
        int digit=0,count1=0,count2=0;
        while(temp>0){
            digit =temp%10;
            if(map.containsKey(digit)){
                map.put(digit, map.get(digit)+1);
            }
            else map.put(digit, 1);
            temp =temp/10;
        }
        for(int a :map.values()){
            if(a%2 ==0 ){
                count2++;
            }
            else if(a == 1){
                count1++;
            }
        }
        if(count1>1){
            return 1;
        }else{
            return 2;
        }
    }
