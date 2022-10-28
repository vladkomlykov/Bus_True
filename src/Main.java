import bus.Bus;
import driver.Driver;
import controller.Controller;
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(77, "Green", 100);

        bus.showColor();
        bus.showFuel();
        bus.showRoutNumber();

        Driver driver = new Driver("6 AM", "18 PM", 77);

        driver.goingOnShiftDriver();
        driver.choosingABusDriver(bus.routNumber);
        driver.checkFuel();

        Controller controller= new Controller("6 AM", 10_000, 1_000);

        controller.goingOnShiftController();
        controller.choosingABusController();
        controller.checkMoney(controller.cash);
        controller.pass(controller.ticket);

    }
}