package Problem3;
public class Temperature {
    private double temp;
    private char element;
    public Temperature(double temp, char element) {
        this.temp = temp;
        this.element = element;
    }
    public Temperature(double temp) {
        this.temp = temp;
        element='C';
    }
    public Temperature(char element){
       element='C';
       temp=0;


    }
    public void setTemp(double temp) {
        this.temp = temp;

    }
    public void setElement(char element) {
        this.element = element;
    }
    public void setALL(double temp,char element){
        this.temp=temp;
        this.element=element;
    }
    public double getTemp() {
        return temp;
    }
    public char getElement() {
        return element;
    }
    public double toFahren(){
        if(element=='C'){
            return temp = 9 * (getTemp() / 5) + 32;
        }
        return temp;
    }
    public double toCelsius(){
        if(element=='F'){
            return temp = 5 * (getTemp() - 32) / 9;
        }
        return temp;
    }


}


