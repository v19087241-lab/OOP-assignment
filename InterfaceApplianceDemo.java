interface Switchable {
    void turnOn();
    void turnOff();
}

class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light: The bulb is glowing.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light: The bulb is off.");
    }
}

class AirConditioner implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("AC: Cooling has started.");
    }

    @Override
    public void turnOff() {
        System.out.println("AC: Cooling has stopped.");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: The blades are rotating.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: The blades have stopped.");
    }
}

// New class added later. Main does not need to be changed.
class Television implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("TV: The screen is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV: The screen is off.");
    }
}

public class InterfaceApplianceDemo {
    public static void main(String[] args) {
        Switchable[] appliances = {
            new Light(),
            new AirConditioner(),
            new Fan(),
            new Television()
        };

        for (Switchable appliance : appliances) {
            appliance.turnOn();
            appliance.turnOff();
            System.out.println();
        }
    }
}
