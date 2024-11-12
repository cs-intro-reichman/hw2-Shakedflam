// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheerInPut=args[0];
                int repetition=Integer.parseInt(args[1]);
                String cheers= cheerInPut.toUpperCase();
                String letters="AEFHILMNORSX";
                String aAn="";
                for (int i=0;i<cheers.length();i++){
                        char c= cheers.charAt(i);
                        for (int j=0; j<letters.length();j++){
                                if (letters.charAt(j)==c){
                                        aAn= "an";
                                }else {
                                        aAn= "a";
                                };
                        }
                        System.out.println("Give me "+aAn+" "+c+": "+c+"!");
                }
                System.out.println("What does that spell?");
                for (k=0;k<repetition;k++){
                 System.out.println(cheers+"!!!");
                }
        }
}
