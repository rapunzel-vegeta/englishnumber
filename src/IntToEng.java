import java.util.Scanner;
public class IntToEng {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input>10&&input<20){
        	System.out.println(eleven(input));
        }else if(input>=10&&input%10==0){
        	System.out.println(kiriban(input));
        }else if(input>20&&input%10!=0){
        	System.out.println(kiriban(input)+"-"+translateEng(input));
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
		if(n==11){
			return "eleven";
		}else if(n==12){
			return "twelve";
		}else if(n==13){
			return "thirteen";
		}else if(n==14){
			return "forteen";
		}else if(n==15){
			return "fifteen";
		}else if(n==16){
			return "sixteen";
		}else if(n==17){
			return "seventeen";
		}else if(n==18){
			return "eighteen";
		}else if(n==19){
			return "nineteen";
		}
		return"";
	}
	static String kiriban(int n){
		int n2= n-n%10;
		final String[] eNum2 = {"ten", "twenty", "thirty", "forty", "fifty",
				"sixty", "seventy", "eighty", "ninety", "one-hundred",
				"ten"};
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
	}else if(n2==100){
		return eNum2[9];
	}
	return "";		
	}
}
