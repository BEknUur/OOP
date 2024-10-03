import java.util.Scanner;
public class Time{
    private int hour;
    private int minute;
    private int second;
    public Time (int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour ){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    // making an universal time
    public String universal(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    // making Standart time
    public String standart(){
        int standarttime;
        if(hour%12==0){
            standarttime=12;
        }
        else{
            standarttime=hour%12;
        }
        String ampm;
        if(hour<12){
            ampm="AM";
        }
        else{
            ampm="PM";
        }
        return String.format("%02d:%02d:%02d %s",standarttime,minute,second,ampm);
    }

    // just add two times togeather
    public Time add(Time t){
        int totalSeconds=(this.hour*3600+this.minute*60+this.second)+(t.hour*3600+t.minute*60+t.second);
        int totalhours=(totalSeconds/3600)%24;
        int totalminutes=(totalSeconds/60)%60;
        int totalseconds=totalSeconds%60;
        return new Time(totalhours,totalminutes,totalseconds);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Time uakyt=new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("Time into universal: "+uakyt.universal());
        System.out.println("Time to standart: "+uakyt.standart());
        Time sagat=new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("Time into universal: "+sagat.universal());
        System.out.println("Time to standart: "+sagat.standart());
        System.out.println();

        Time addedTime=uakyt.add(sagat);
        System.out.println("Two times added universal: "+ addedTime.universal());
    System.out.println("Two times added standart: "+ addedTime.standart());
    }

}
