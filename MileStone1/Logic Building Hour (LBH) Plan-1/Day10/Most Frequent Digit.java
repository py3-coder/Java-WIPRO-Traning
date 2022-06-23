/**
Most Frequent Digit
**/
/*
Code :01
*/
public static int mostFrequentDigit(int input1,int input2,int input3,int input4){
        String num = String.valueOf(input1) + String.valueOf(input2) + String.valueOf(input3) + String.valueOf(input4);
		int[] digitFrequency = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
		
		for (int i = 0; i < num.length(); i++) {
			digitFrequency[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
		}
		
		int mfd = 0;
		
		for (int i = 0; i <= 9; i++) {
			mfd 	= digitFrequency[i] >= digitFrequency[mfd] ? i : mfd;
		}
		
		return mfd;
    
 /*
 Code :2
 */
 public static int mostFrequentDigit(int input1,int input2,int input3,int input4){
        int arr[] = new int[4];
		arr[0] = input1;
		arr[1] = input2;
		arr[2] = input3;
		arr[3] = input4;
		HashMap<Integer,Integer > map  = new HashMap<>();
		for(int i=0;i<4;i++){
			int num = arr[i];
			while(num>0){
				int digit = num%10;
				if(map.containsKey(digit)){
					map.put(digit, map.get(digit)+1);
				}
				else map.put(digit, 1);
				num/=10;
			}
    	}
    	int res=0;
		res = Collections.max(map.values());
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) { 
            if (entry.getValue()==res) {
                return entry.getKey();    
            }
        }
        return 0;

    }
