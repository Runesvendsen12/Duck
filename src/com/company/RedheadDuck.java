package com.company;

public class RedheadDuck extends Duck{
    public RedheadDuck(){
        flyBehavior = new FlyWithWings();

        quackBehavior = new Quack();

        }

        public void display(){
            System.out.println("I'm a redhead Duck!");
        }
}
