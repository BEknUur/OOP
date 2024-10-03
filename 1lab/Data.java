package Problem1;
public class Data{
    private double sum=0;
    private int cnt;
    private double max=0;
    public Data(){

    }
    public void addValue(double value){
        sum+=value;
        cnt++;
        max=Math.max(max,value);
    }
    public double getAverage(){
        return sum/cnt;
    }
    public double getMax(){
        return max;
    }
}

