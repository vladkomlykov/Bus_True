package bus;

public class Bus {
    public Bus() {

    }
    public int routNumber;
    public String color;
    public int fuel;
    public Bus(int routNumber, String color, int fuel){
        this.routNumber = routNumber;
        this.color = color;
        this.fuel = fuel;
    }
    public void showColor(){
        System.out.println(color + "- цвет автобуса");
    }
    public void showFuel(){
        System.out.println(fuel + "- топливо автобуса");
    }
    public void showRoutNumber(){
        System.out.println(routNumber + "- номер автобуса");
    }
}
