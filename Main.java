البرنامج تنفذ
import java.util.ArrayList;
import java.util.List;

// 1. ضعـي كلاس Main في البداية تماماً
public class Main {
    public static void main(String[] args) {
        Animal<Number> a1 = new Animal<>("Generic Animal", 10);
        Dog<Number> myDog = new Dog<>("Max", 12.5);
        Cat<Number> myCat = new Cat<>("Luna", 3);
        Bird<Number> myBird = new Bird<>("Tweety", 5.2);

        Show.showAnimalData(a1);
        Show.showAnimalData(myDog);
        Show.showAnimalData(myCat);
        Show.showAnimalData(myBird);
    }
}

// 2. باقي الكلاسات تحتها
class Animal<T> {
    private String name;
    private T data;

    public Animal(String name, T data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public T getData() {
        return data;
    }

    public void display() {
        System.out.println("Animal Name: " + name + " | Data: " + data);
    }
}

class Dog<T> extends Animal<T> {
    public Dog(String name, T weight) {
        super(name, weight);
    }
}

class Cat<T> extends Animal<T> {
    public Cat(String name, T age) {
        super(name, age);
    }
}

class Bird<T> extends Animal<T> {
    public Bird(String name, T data) {
        super(name, data);
    }
}

class Show {
    public static void showAnimalData(Animal<? super Number> animal) {
        animal.display();
        System.out.println("-------------------");
    }
}
