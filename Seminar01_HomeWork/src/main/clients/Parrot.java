package main.clients;

import java.time.LocalDate;

public class Parrot extends Animal{

    public Parrot(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void toGo() {
        System.out.println("Попугай: я ходить не люблю!");
    }

    @Override
    public void toSwim() {
        System.out.println("Попугай: Я плавать не буду!");
    }

    @Override
    public void toFly() {
        System.out.println("Попугай: Я летаю!");
    }
}
