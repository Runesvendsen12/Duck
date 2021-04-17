package com.company;

public class MiniDuckSim {
    public static void main(String [] args){

        System.out.println("");
        System.out.println("new mallard duck: ");
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();


        System.out.println("");
        System.out.println("new model duck: ");
        Duck model = new ModelDuck();
        model.display();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println("");
        System.out.println("New redhead duck: ");
        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performFly();
        redhead.performQuack();

        System.out.println("");
        System.out.println("new redhead model duck: ");
        Duck redheadmodel = new RedheadDuck();
        redheadmodel.display();
        redheadmodel.setQuackBehavior(new MuteQuack());
        redheadmodel.performQuack();
        redheadmodel.setFlyBehavior(new FlyNoWay());
        redheadmodel.performFly();


        System.out.println("");
        System.out.println("new model duck: ");
        Duck secondmodel = new ModelDuck();
        secondmodel.display();
        secondmodel.performFly();

    }
}
