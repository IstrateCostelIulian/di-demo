package guru.springframework.didemo.solid.dependency_inversion.lowlevel;

import guru.springframework.didemo.solid.dependency_inversion.Switchable;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb : Bulb turned on ... ");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb : Bulb turned off ... ");
    }
}
