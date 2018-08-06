package guru.springframework.didemo.solid.dependency_inversion;

import guru.springframework.didemo.solid.dependency_inversion.highlevel.ElectricPowerSwitch;
import guru.springframework.didemo.solid.dependency_inversion.lowlevel.Fan;
import guru.springframework.didemo.solid.dependency_inversion.lowlevel.LightBulb;
import org.junit.Test;

public class ElectricPowerSwitchTest {
    @Test
    public void testPress() throws Exception {
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}
