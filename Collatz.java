// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int inputNumber=Integer.parseInt(args[0]);
		String cOrV=args[1];
		String c="c";
		if (cOrV.equals(c)){
			System.out.println("Every one of the first "+inputNumber+" hailstone sequences reached 1.");
		}else{
			for (int i=1;i<=inputNumber;i++){
				System.err.print(i+" ");
				int iteration=1;
				int target=i;
				int num=2;
				while(num>=1){
			         num=target;
					if(target%2==0){
						target/=2;
						num=target;
						System.out.print(target+" ");
					}else{
						target= (target*3)+1;
						System.out.print(target+" ");
						num=target;
					}
					iteration++;
					if (num==1){
						break;
					}
				}
					System.out.print("("+iteration+")");
					System.out.println();
			}
			System.err.println("Every one of the first "+inputNumber+" hailstone sequences reached 1.");

		}
		}
}
