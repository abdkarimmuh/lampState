package lampstate;

import java.io.IOException;
import java.io.InputStreamReader;

public class LampState {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        LampContext lampContext = new LampContext();
        while(true) {
            System.out.print("Tekan 'Enter'");
            is.read();
            lampContext.turn();
        }
    }
}