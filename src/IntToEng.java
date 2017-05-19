import java.util.Scanner;
public class IntToEng {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));
	}
	static String translateEng(int n) {
		//int num = n/10;
		int num=n;
		final String[] eNum1 = {"zero", "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine",
				"ten"};
	if(n==10){
		return eNum1[10];
	}else if(num%10==1){
			return eNum1[1];
	}else if(num%10==2){
		return eNum1[2];
	}else if(num%10==3){
		return eNum1[3];
	}else if(num%10==4){
		return eNum1[4];
	}else if(num%10==5){
		return eNum1[5];
	}else if(num%10==6){
		return eNum1[6];
	}else if(num%10==7){
		return eNum1[7];
	}else if(num%10==8){
		return eNum1[8];
	}else if(num%10==9){
		return eNum1[9];
	}else if(num%10==0){
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
}
