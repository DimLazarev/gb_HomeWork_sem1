package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 5), new Illness("Лишай") , 10.0); //Создаём экземпляр класса

        System.out.println(cat.getOwner());
        System.out.println(cat.getNickName());
        System.out.println(cat.getIllness());

//        System.out.println(cat.getNickName());
//        cat.setIllness(new Illness(null));
//
//        System.out.println(cat.getIllness());

        Animal dog = new Dog("Шарик", new Owner("Петр Валерьевич"),
                LocalDate.of(2020,9,16), new Illness("Болят зубы"));

        System.out.println(dog.getOwner());
        System.out.println(dog.getNickName());
        System.out.println(dog.getIllness());

        Animal parrot = new Parrot("Кеша", new Owner("Александр Валерьевич"),
                LocalDate.of(2022,4,7), new Illness("Болит клюв"));

        System.out.println(parrot.getOwner());
        System.out.println(parrot.getNickName());
        System.out.println(parrot.getIllness());

        Animal duck = new Duck("Дуся", new Owner("Эдуард Валерьевич"),
                LocalDate.of(2019,2,19), new Illness("Болит лапа"));

        System.out.println(parrot.getOwner());
        System.out.println(parrot.getNickName());
        System.out.println(parrot.getIllness());


//
//
//        Animal testAnimal = new Animal();
//        System.out.println(testAnimal.getNickName());
//
//        dog.lifeCycle();
//
//        Animal catty = new Cat();
//        Dog goodBoy = new Dog();
//
//        System.out.println(goodBoy.getType());
//        System.out.println(catty.getType());
//
//        System.out.println(catty);
//
//        Cat.meow();
//
        List<Animal> animals = new ArrayList<Animal>();

        animals.add(dog);
        animals.add(cat);
        animals.add(parrot);
        animals.add(duck);
        System.out.println("-----------------------------");
        animals.forEach(Animal::toFly);
        System.out.println("-----------------------------");
        animals.forEach(Animal::toGo);
        System.out.println("-----------------------------");
        animals.forEach(Animal::toSwim);
        System.out.println("-----------------------------");

//        int i = 0;
//        for (Animal animals : animals){
//            System.out.println(i + " "+ animal);
//            i++;
//        }

    }
}


