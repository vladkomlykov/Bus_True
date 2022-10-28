package driver;

import bus.Bus;

import java.util.Objects;

public class Driver extends Bus {
    public String startOfShiftDriver;
    public String endOfShiftDriver;
    public int busNumberDriver;

    public Driver(String startOfShiftDriver, String endOfShiftDriver, int busNumberDriver) {
        this.startOfShiftDriver = startOfShiftDriver;
        this.endOfShiftDriver = endOfShiftDriver;
        this.busNumberDriver = busNumberDriver;
    }
            public void checkFuel(){
            if (fuel >= 50) {
                System.out.println("проверка топлива - Можно ехать");
            } else
                System.out.println("проверка топлива - Нужно заправиться");
        }

        public void goingOnShiftDriver () {
            if (Objects.equals(startOfShiftDriver, "6 AM")) {
                System.out.println("начало смены - Пора начинать смену (Водитель)");
            } else
                System.out.println("начало смены - Ещё не время (Водитель)");
        }

        public void choosingABusDriver ( int routNumber){
            if (routNumber == 77) {
                System.out.println("выбор автобуса - Это мой автобус (Водитель)");
            } else
                System.out.println("выбор автобуса - Это не мой автобус (Водитель)");
        }
    }
