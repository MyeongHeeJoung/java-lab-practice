
import java.util.*;

public class SimpleCalculator extends Exception {

	public static void main(String[] args) {
		int result=0;
		try {                        
				Scanner scanNum =new Scanner(System.in);
		        
				String calStr =scanNum.next();
				if(calStr.contains("+")){
					String[] opStrings = calStr.split("\\+");
					int addnum1 = Integer.parseInt(opStrings[0]);
					int addnum2 = Integer.parseInt(opStrings[1]);
					if((addnum1<0 && addnum1 >1000)||(addnum1<0 && addnum2 >1000)){ 
						throw new OutOfRangeException();
					}
					if(addnum1==0||addnum2==0) {
						throw new  AddZeroException();
					} 
					result = addnum1 + addnum2;
					
					if(result <0 || result > 1000){ 
						throw new OutOfRangeException();
						}
					}
				if(calStr.contains("-")) {
					String[] opStrings = calStr.split("\\-");
					int subnum1 = Integer.parseInt(opStrings[0]);
					int subnum2 = Integer.parseInt(opStrings[1]);
					if((subnum1<0 && subnum1 >1000)||(subnum1<0 && subnum2 >1000)){ 
						throw new OutOfRangeException();
						}
					if(subnum1==0||subnum2==0) {
						throw new  SubtractZeroException();
					} 
					result = subnum1 - subnum2;
					
					if(result<0 || result > 1000){ 
						throw new OutOfRangeException();
						}
				}
					
				System.out.printf("%d", result);
				System.exit(0);
				}catch(OutOfRangeException e){
					System.out.println("OutOfRangeException");
					System.exit(0);
				}catch(AddZeroException e){
					System.out.println("AddZeroException");
					System.exit(0);
				}catch(SubtractZeroException e){
					System.out.println("SubtractZeroException");
					System.exit(0);
				}

	}
}
class OutOfRangeException extends Exception {
	
	public OutOfRangeException() {
		super();
		}
	}
class AddZeroException extends Exception {
	AddZeroException() {
		super();
	}
}
class SubtractZeroException extends Exception {
	SubtractZeroException() {	
		super();
	
	}
}