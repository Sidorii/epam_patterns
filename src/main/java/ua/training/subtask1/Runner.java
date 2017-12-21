package ua.training.subtask1;

public class Runner {

    /*state pattern implemented*/
    public static void main(String[] args) {
        ConcreteHuman human = new ConcreteHuman();
        human.doAction();
        System.out.println("Location: " + human.getLocation());

        human.cameInWood();
        human.doAction();
        System.out.println("Location: " + human.getLocation());

        human.cameToBeach();
        human.doAction();
        human.doAction();
        System.out.println("Location: " + human.getLocation());

        human.metAnimal();
        human.doAction();
        System.out.println("Location: " + human.getLocation());
    }
}
