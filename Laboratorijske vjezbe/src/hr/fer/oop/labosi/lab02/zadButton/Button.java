package hr.fer.oop.labosi.lab02.zadButton;

class Button {
    private boolean state;
    private OnOffCapability capability;

    public Button(OnOffCapability capability) {
        this.capability = capability;
        this.state = false;
    }

    public void click() {
        if(state) {
            capability.turnOn(true);
            state = false;
        }
        else {
            capability.turnOn(false);
            state = true;
        }
  }
}
