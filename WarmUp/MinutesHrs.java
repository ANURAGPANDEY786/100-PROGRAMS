package WarmUp;

public class MinutesHrs {
    public static void main(String[] args) {
        int totalSecond=333360;

        int hrs=totalSecond/3600;
        int minutes=(totalSecond%3600)/60;
        int second=totalSecond%60;
        String time=String.format("%02d : %02d : %02d", hrs,minutes,second);
        System.out.println(time);
        System.out.println(hrs +": " + minutes+ " : "+ second);
    }

    
}
