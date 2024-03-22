import BeingsOfTheEarth.Human;
import BeingsOfTheEarth.LivingBeing;
import SkyBeings.SkyBeing;


public class Main {
    public static void main(String[] args) {
        Creator creator = new LivingBeingCreator();
        Human human = creator.createLivingBeing();
        human.born();
        human.grow();
        human.reproduce();
        human.die();
        ((SkyBeing) human).fly(); // This works because Human implements SkyBeing
        ((SkyBeing) human).changeDimension(); // This works because Human implements SkyBeing


        LivingBeing bird = new LivingBeing() {
            @Override
            public void born() {

            }

            @Override
            public void grow() {

            }

            @Override
            public void reproduce() {

            }

            @Override
            public void die() {

            }

            @Override
            public void fly() {

            }

            @Override
            public void changeDimension() {

            }
        };


        bird.born();
        bird.grow();
        bird.reproduce();
        bird.die();


    }
}

