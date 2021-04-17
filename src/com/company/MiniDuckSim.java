package com.company;

public class MiniDuckSim {
    public static void main(String [] args){
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performFly();
        redhead.performQuack();

        System.out.println("new redhead model duck: ");

        Duck redheadmodel = new RedheadDuck();
        redheadmodel.display();
        redheadmodel.setQuackBehavior(new MuteQuack());
    }
}
