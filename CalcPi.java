// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int inputNum=Integer.parseInt(args[0]);
		double PI=Math.PI;
		System.out.println("pi according to Java: "+PI);
		double total=1;
		double reduction=0;
		int repetition=1;
		int rep=5;
		for (int i=2;i<inputNum;i+=2){
			
			total+=(1/(double)rep);
			rep+=4;
		}
		int repMinus=3;
		for (int j=1;j<inputNum;j+=2){
			reduction=(1/(double)repMinus);
			total-=reduction;
			repMinus+=4;
		}
		System.out.println("pi, approximated: "+ total*4);

		}
	}

