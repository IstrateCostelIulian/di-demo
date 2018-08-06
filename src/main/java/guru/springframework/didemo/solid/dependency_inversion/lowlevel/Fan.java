package guru.springframework.didemo.solid.dependency_inversion.lowlevel;

import guru.springframework.didemo.solid.dependency_inversion.Switchable;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan : Fan turned on ... ");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan : Fan turned off ... ");
    }
}
