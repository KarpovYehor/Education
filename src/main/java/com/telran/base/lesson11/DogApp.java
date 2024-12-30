package com.telran.base.lesson11;

public class DogApp {

    public static void main(String[] args) {
        Dog dogOne = new Dog("Sharik",10,120,"Sharka");
        Dog dogTwo = new Dog("Bobik",5,110,"Bob");
        Dog dogThree = new Dog("Pupsik",11,112,"Pups");

        System.out.println(dogOne);


        Dog[] arrayDogs = {dogOne, dogTwo, dogThree};
        for (Dog arrayDog : arrayDogs) {
            System.out.println("Name: " + arrayDog.name + ", age: " + arrayDog.age + ", height: " + arrayDog.height + ", breed: " + arrayDog.breed);
        }
        //System.out.println("Name: " + dogOne.name + ", age: " + dogOne.age + ", height: " + dogOne.height + ", breed: "+ dogOne.breed);
        for (Dog dog : arrayDogs){
            dog.print();
        }
    }
}
