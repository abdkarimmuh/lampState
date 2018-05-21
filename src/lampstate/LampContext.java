package lampstate;

class LampContext {
    private State state;

    public LampContext() {
        this.state = new TurnOff();
    }

    public void turn(){
        state.tekan(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}