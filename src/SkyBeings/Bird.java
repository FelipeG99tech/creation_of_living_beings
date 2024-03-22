package SkyBeings;

import BeingsOfTheEarth.LivingBeing;

public class Bird extends LivingBeing implements SkyBeing {
    @Override
    public void born() {
        System.out.println("Bird born in the sky");
    }

    @Override
    public void grow() {
        System.out.println("Bird grows in the sky");
    }

    @Override
    public void reproduce() {
        System.out.println("Bird reproduces in the sky");
    }

    @Override
    public void die() {
        System.out.println("Bird dies in the sky");
    }

    // Implementing methods from SkyBeing interface
    @Override
    public void fly() {
        System.out.println("Bird flies in the sky");
    }

    @Override
    public void changeDimension() {
        System.out.println("Bird changes dimension");
    }
}