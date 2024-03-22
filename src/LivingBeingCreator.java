import BeingsOfTheEarth.Human;

public class LivingBeingCreator implements Creator {
    @Override
    public Human createLivingBeing() {
        // For simplicity, let's return a Human instance for now
        return new Human();
    }
}
