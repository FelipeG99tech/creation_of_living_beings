import BeingsOfTheEarth.Human;

public class LivingBeingCreator implements Creator {
    @Override
    public Human createLivingBeing() {

        return new Human();
    }
}
