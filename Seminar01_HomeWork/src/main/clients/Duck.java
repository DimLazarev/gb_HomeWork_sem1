package main.clients;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void toGo() {
        System.out.println("Утка: Я хожу по земле!");
    }

    @Override
    public void toFly() {
        System.out.println("Утка: Я летаю!");
    }

    @Override
    public void toSwim() {
        System.out.println("Утка: Я плаваю!");
    }
}
