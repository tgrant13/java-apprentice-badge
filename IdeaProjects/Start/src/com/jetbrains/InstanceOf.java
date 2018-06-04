package com.jetbrains;

public class InstanceOf
{
    public InstanceOf()
    {

    }

    public void validate()
    {
        Dog doggo = new Dog();
        Birb birby = new Birb();
        Animal annie = new Animal();

        System.out.println("A dog is an animal: " + (doggo instanceof Animal));
        System.out.println("An animal is a dog: " + (annie instanceof Dog));
        // CANT CHECK IF A BIRB IS A DOG - INCOMPATIBLE TYPES
        //System.out.println("A birb is a dog: " + (birby instanceof Dog));


        //CASTING
        System.out.println("Default animal sounds:");
        doggo.makeSound();
        birby.makeSound();
        annie.makeSound();


        // THIS WILL HAVE NO EFFECT IN JAVA
        System.out.println("After casting to parent:");
        Animal maybeDoggo = (Animal) doggo;
        maybeDoggo.makeSound();

       /*
       YOU CANNOT CAST A PARENT CLASS TO A CHILD CLASS
        Birb maybeBirb = (Birb) annie;
        maybeBirb.makeSound();
        */

       /*
        SIMILARLY, YOU CANNOT CAST A SIBLING CLASS TO ANOTHER SIBLING
        Birb maybeBirb = (Birb) doggo;
        maybeBirb.makeSound();
        */

       System.out.println("Can you cast a child to a parent?");
       Dog thisIsADog = new Dog();
       Animal castToAnimal = (Animal) thisIsADog;

       if(castToAnimal instanceof Animal)
       {
           System.out.println("Yes! However - type of object after casting: " + castToAnimal.getClass());
           System.out.println("Casting a child to a parent object retains the child object's class.");
       }
       else
       {
           System.out.println("Can't cast child to parent class.");
       }

    }

    private class Animal
    {
        Animal(){}
        public void makeSound()
        {
            System.out.println("HEY IM JUST A PLAIN ANIMAL");
        }
    }

    private class Dog extends Animal
    {
        Dog(){}

        @Override
        public void makeSound()
        {
            System.out.println("HEY ITS ME A DOG");
        }
    }

    private class Birb extends Animal
    {
        Birb(){}

        @Override
        public void makeSound()
        {
            System.out.println("HEY I'M A BIRB");
        }
    }
}
