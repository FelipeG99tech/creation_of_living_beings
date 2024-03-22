package BeingsOfTheEarth;
public interface EarthBeing {
    void born();
    void grow();
    void respawn();
    void die();

    // Implementing method from LivingBeing abstract class
    void reproduce();

    // Implementing methods from SkyBeing interface
    void fly();

    void changeDimension();
}
