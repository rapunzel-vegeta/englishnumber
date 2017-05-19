import java.util.Scanner;
public class IntToEng {
	
	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input>10&&input<20){
        	System.out.println(eleven(input));
        }else if(input>=10&&input%10==0){
        	System.out.println(kiriban(input));
        	
        }else{
        System.out.println(translateEng(input));
        }
	}
	static String translateEng(int n) {
		int num = n%10;
		//int num=n;
		final String[] eNum1 = {"zero", "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine",
				};
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
		/*if(n==0){
			return "zero";
	    }else if(n==1){		
			return "one";
		}else if(n==2){
			return "two";
		}else if(n==3){
			return "three";
		}else if(n==4){
			return "four";
		}else if(n==5){
			return "five";
		}else if(n==6){
			return "six";		
		}else if(n==7){
			return "seven";
		}else if(n==8){
			return "eight";
		}else if(n==9){
			return "nine";
		}else if(n==10){
			return "ten";
		}*/
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
		
		final String[] eNum1 = {"ten", "twenty", "thirty", "forty", "fifty",
				"sixty", "seventy", "eighty", "ninety", "one-hundred",
				"ten"};
	if(n==10){
		return eNum1[0];
	}else if(n==20){
			return eNum1[1];
	}else if(n==30){
		return eNum1[2];
	}else if(n==40){
		return eNum1[3];
	}else if(n==50){
		return eNum1[4];
	}else if(n==60){
		return eNum1[5];
	}else if(n==70){
		return eNum1[6];
	}else if(n==80){
		return eNum1[7];
	}else if(n==90){
		return eNum1[8];
	}else if(n==100){
		return eNum1[9];
	}
	return "";		
	}
}
