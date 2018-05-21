package lampstate;

public class TurnOff implements State {
    @Override
    public void tekan(LampContext context) {
        System.out.print("Lampu mati");
        context.setState(new TurnOn());
        System.out.println("to on");
    }
}