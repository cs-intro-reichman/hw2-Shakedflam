// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int inputNum=Integer.parseInt(args[0]);
		double PI=Math.PI;
		System.out.println("pi according to Java: "+PI);
		double total=1;
		double reduction=0;
		int repetition=5;
		while (inputNum>0){
			total+=(1/(double)repetition);
			inputNum-=2;
			repetition+=4;

		}
		int rep=3;
		while (inputNum>0) {
			reduction-=(1/(double)rep);
			inputNum-=2;
			rep+=4;
		}
		total-=reduction;
		System.out.println("pi, approximated: "+ total);

		}
	}
}
