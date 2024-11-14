// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int inputNum=Integer.parseInt(args[0]);
		double PI=Math.PI;
		System.out.println("pi according to Java: "+PI);
		double total=0;
		double reduction=0;
		int repetition=1;
		int rep=1;
		for (int i=0;i<inputNum;i++){
			if (i%2==0){
			total+=(1/(double)rep);
			}else{
				total-=(1/(double)rep);
			}

			rep+=2;
		}
	
		System.out.println("pi, approximated::     "+ total*4);

		}
	}

