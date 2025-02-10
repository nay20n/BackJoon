import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt(); //시작되는 시간
        int min = sc.nextInt();
        int total = sc.nextInt();
        int resHour = hour;
        int resMin = min + total;
        while(resMin >= 60){
            resHour = resHour + 1;
            resMin = resMin - 60;
        }
        if(resHour >= 24){
            resHour = resHour - 24;
        }
        System.out.println(resHour + " " + resMin);
        }
    }

