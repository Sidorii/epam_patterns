package ua.training.subtask1;

public class ConcreteHuman implements Human {

    private HumanState state;

    private String location;

    public ConcreteHuman() {
        state = new HomeHumanState();
    }

    public String getLocation() {
        return location;
    }

    public void doAction() {
        state.doAction();
    }

    public void metAnimal() {
        state.metAnimal();
    }

    public void cameToBeach() {
        state.cameToBeach();
    }

    public void cameInWood() {
        state.cameInWood();
    }


    private abstract class DemoHumanState implements HumanState {
        
        public void metAnimal() {
            state = new HunterHumanState();
        }

        public void cameToBeach() {
            state = new BeachHumanState();
        }

        public void cameInWood() {
            state = new MushroomerHumanState();
        }
    }

    private class HomeHumanState extends DemoHumanState {

        HomeHumanState() {
            location = "home";
        }

        public void doAction() {
            System.out.println("Wasting time...");
        }
    }

    private class HunterHumanState extends DemoHumanState {

        public void doAction() {
            System.out.println("Hunting animal...");
        }

        @Override
        public void metAnimal() {
        }
    }

    private class BeachHumanState extends DemoHumanState {

        BeachHumanState() {
            location = "beach";
        }

        public void doAction() {
            System.out.println("Laying on the sand...");
        }

        @Override
        public void cameToBeach() {
        }
    }

    private class MushroomerHumanState extends DemoHumanState {

        MushroomerHumanState() {
            location = "wood";
        }

        public void doAction() {
            System.out.println("Looking for mushrooms...");
        }

        @Override
        public void cameInWood() {
        }
    }
}
