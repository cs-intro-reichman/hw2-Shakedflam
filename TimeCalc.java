public class TimeCalc {
    public static void main(String[] args) {
        int hours= Integer.parseInt(""+args[0].charAt(0)+args[0].charAt(1));
        int minetus= Integer.parseInt(""+args[0].charAt(3)+args[0].charAt(4));
        int inputMinetus= Integer.parseInt(args[1]);
        int totalMinutes= hours*60+minetus+inputMinetus;
        int totalHours= totalMinutes/60;
        int newHours= totalHours%24;
        int newMinutes= totalMinutes-(totalHours*60);
        if (newHours<10 && newMinutes>=10){
            System.out.println("0"+newHours+":"+newMinutes);
        }else if (newHours>=10 && newMinutes<10){
            System.out.println(newHours+":0"+newMinutes);
        }else if (newHours<10&&newMinutes<10){
            System.out.println("0"+newHours+":"+newMinutes);
        }else {
            System.out.println(newHours+":"+newMinutes);
        }

    }
}
