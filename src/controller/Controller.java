package controller;

import bus.Bus;
import java.util.Objects;

public class Controller extends Bus {
    String startOfShiftController;
    public double cash;
    public double ticket;

    public Controller(String startOfShiftController, double cash, double ticket) {
        this.cash = cash;
        this.ticket = ticket;
        this.startOfShiftController = startOfShiftController;
    }


        public void goingOnShiftController() {
            if (Objects.equals(startOfShiftController, "6 AM")) {
                System.out.println("начало смены - Пора начинать смену (Кондуктор)");
            } else
                System.out.println("начало смены - Ещё не время (Кондуктор)");
        }

        public void choosingABusController() {
            if (routNumber == 77) {
                System.out.println("выбор автобуса - Это мой автобус (Кондуктор)");
            } else
                System.out.println("выбор автобуса - Это не мой автобус (Кондуктор)");
        }

        public void checkMoney(double cash){
            if (cash >= 10_000) {
                System.out.println("проверка сдачи - Сдача есть");
            } else
                System.out.println("проверка сдачи - Нужно взять сдачу");
        }

        public void pass ( double ticket){
            if (ticket >= 1_000) {
                System.out.println("проверка билетов - Билты есть");
            } else
                System.out.println("проверка билетов - Нужно взять билеты");
        }
    }


