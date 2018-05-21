package lampstate;

public class TurnOn implements State {
    @Override
    public void tekan(LampContext context) {
        System.out.print("Lampu menyala");
        context.setState(new Brighter());
        System.out.println("to Brighter");
    }
}