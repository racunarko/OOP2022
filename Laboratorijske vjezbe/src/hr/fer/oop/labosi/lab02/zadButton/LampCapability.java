package hr.fer.oop.labosi.lab02.zadButton;

class LampCapability implements OnOffCapability {
    private Lamp lamp;

    public LampCapability(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void turnOn(boolean state) {
        if (state) {
            lamp.dark();
        }
        else {
            lamp.light();
        }
    }
}
