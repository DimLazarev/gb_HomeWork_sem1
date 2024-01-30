package main.clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    @Override
    public void toGo() {
        System.out.println("Собака:- я хожу по земле!");
    }

    @Override
    public void toSwim() {
        System.out.println("Собака:- я плаваю!");
    }

    @Override
    public void toFly() {
        System.out.println("Собака:- я не летаю!");
    }

    public Dog(){
        super();
    }
}
