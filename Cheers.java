// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheerInPut=args[0];
                int repetition=Integer.parseInt(args[1]);
                String cheers= cheerInPut.toUpperCase();
                String letters="AEFHILMNORSX";
                String anA="";
                for (int i=0;i<cheers.length();i++){
                        char c= cheers.charAt(i);
                        for (int j=0; j<letters.length();j++){
                                if (letters.indexOf(c)==-1){
                                        anA= "a ";
                                        break;
                                }else {
                                        anA= "an";
                                };
                        }
                        System.out.println("Give me "+anA+" "+c+": "+c+"!");
                }
                System.out.println("What does that spell?");
                for (int k=0;k<repetition;k++){
                 System.out.println(cheers+"!!!");
                }
        }
}
