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
            capability.turnOn(state);
            state = false;
        }
        else {
            capability.turnOn(state);
            state = true;
        }
  }
}
