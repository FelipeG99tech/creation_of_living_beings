import BeingsOfTheEarth.Human;
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

        // Create another living being (Bird)
        LivingBeing bird = new LivingBeing() {
            @Override
            void born() {

            }

            @Override
            void grow() {

            }

            @Override
            void reproduce() {

            }

            @Override
            void die() {

            }
        };
        bird.born();
        bird.grow();
        bird.reproduce();
        bird.die();


    }
}

