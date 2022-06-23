/**
Create PIN using alpha, beta, gamma.
/**
public static int PinGenerate(int input1,int input2,int input3){
    int Pin[] = new int[4];
		int fst,sec,third=0;
		int max=0;
		int i=3;
		while(input1>0 && input2>0 && input3>0){
		    int min=1000;
			fst = input1%10;
			if(fst >max){
				max=fst;
			}
			if(fst <min){
				min =fst;
			}
			sec= input2%10;
			if(sec >max){
				max=sec;
			}
			if(sec <min){
				min =sec;
			}
			third =input3%10;
			if(third >max){
				max=third;
			}
			if(third <min){
				min =third;
			}
            Pin[i] =min;
            i--;
			input1/=10;
			input2/=10;
			input3/=10;
		}
		Pin[0] = max;
		return Pin[0]*1000+Pin[1]*100+Pin[2]*10+Pin[3];
    }
