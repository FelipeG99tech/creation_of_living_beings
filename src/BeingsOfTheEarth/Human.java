package BeingsOfTheEarth;


public class Human extends LivingBeing implements EarthBeing {
    @Override
    public void born() {
        System.out.println("Human born on Earth");
    }

    @Override
    public void grow() {
        System.out.println("Human grows on Earth");
    }

    @Override
    public void respawn() {
        System.out.println("Human respawns on Earth");
    }

    @Override
    public void die() {
        System.out.println("Human dies on Earth");
    }

    // Implementing method from BeingsOfTheEarth.LivingBeing abstract class
    @Override
    public void reproduce() {
        System.out.println("Human reproduces");
    }

    // Implementing methods from SkyBeing interface
    @Override
    public void fly() {
        System.out.println("Human flies in the sky");
    }

    @Override
    public void changeDimension() {
        System.out.println("Human changes dimension");
    }
}