/*
Weight of a hill pattern
*/
public int totalHillWeight(int input1,int input2,int input3){
    // Write code here...
		int sum=0;
		for(int i=1;i<=input1;i++){
			sum += input2*i;
			input2 +=input3;
		}
		return sum;
	}
}
