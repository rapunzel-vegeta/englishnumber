import java.util.Scanner;
public class IntToEng {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int x = input%100;
        if(input>10&&input<20){
        	System.out.println(eleven(input));
        }else if(input>=10&&input<100&&input%10==0){
        	System.out.println(kiriban(input));
        }else if(input>20&&input<100&&input%10!=0){
        	System.out.println(kiriban(input)+"-"+translateEng(input));
        }else if(input>=100&&input<=1000&&x<20&&x>10){
        	System.out.println(hundred(input)+"-"+eleven(input));
        }else if(input>=100&&input<=1000){
        	System.out.println(hundred(input)+"-"+kiriban(input)+"-"+translateEng(input));
        }else{
        System.out.println(translateEng(input));
        }
	}
	static String translateEng(int n) {
		int num = n%10;
		final String[] eNum1 = {"zero", "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine"};
	 if(num==1){
		return eNum1[1];
	}else if(num==2){
		return eNum1[2];
	}else if(num==3){
		return eNum1[3];
	}else if(num==4){
		return eNum1[4];
	}else if(num==5){
		return eNum1[5];
	}else if(num==6){
		return eNum1[6];
	}else if(num==7){
		return eNum1[7];
	}else if(num==8){
		return eNum1[8];
	}else if(num==9){
		return eNum1[9];
	}else if(num==0){
		return eNum1[0];
	}
        return "";
	}
	static String eleven(int n){
		int n4=0;
		if(n<100){
			n4=n;
		}else {
			n4=n%100;
		}
		if(n4==11){
			return "eleven";
		}else if(n4==12){
			return "twelve";
		}else if(n4==13){
			return "thirteen";
		}else if(n4==14){
			return "forteen";
		}else if(n4==15){
			return "fifteen";
		}else if(n4==16){
			return "sixteen";
		}else if(n4==17){
			return "seventeen";
		}else if(n4==18){
			return "eighteen";
		}else if(n4==19){
			return "nineteen";
		}
		return"";
	}
	static String kiriban(int n){
		final String[] eNum2 = {"ten", "twenty", "thirty", "forty", "fifty",
				"sixty", "seventy", "eighty", "ninety", "one-hundred",
				"ten"};
		int n2=0;
		if(n<100){
			n2= n;
		}else{
			n2=(n-n%10)%100;
		}
		
	if(n2==10){
		return eNum2[0];
	}else if(n2==20){
			return eNum2[1];
	}else if(n2==30){
		return eNum2[2];
	}else if(n2==40){
		return eNum2[3];
	}else if(n2==50){
		return eNum2[4];
	}else if(n2==60){
		return eNum2[5];
	}else if(n2==70){
		return eNum2[6];
	}else if(n2==80){
		return eNum2[7];
	}else if(n2==90){
		return eNum2[8];
	}
		
	return "";		
	}
	static String hundred(int n){
		final String[] eNum3 = {"one-hundred", "two-hundred", "three-hundred", "four-hundred", "five-hundred",
				"six-hundred", "seven-hundred", "eight-hundred", "nine-hundred", "one-thoudsan",
				"ten"};
		int n3=n/100;
		if(n3==1){
			return eNum3[0];
		}else if(n3==2){
			return eNum3[1];
		}else if(n3==3){
			return eNum3[2];
		}else if(n3==4){
			return eNum3[3];
		}else if(n3==5){
			return eNum3[4];
		}else if(n3==6){
			return eNum3[5];
		}else if(n3==7){
			return eNum3[6];
		}else if(n3==8){
			return eNum3[7];
		}else if(n3==9){
			return eNum3[8];
		}else if(n3==10){
			return eNum3[9];
		}	
		return"";
	}
}
