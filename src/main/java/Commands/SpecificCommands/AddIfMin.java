package Commands.SpecificCommands;

import Commands.AbstractCommand;
import Data.Product;
import Utilities.Logging;
import Utilities.Receiver;

import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.logging.Level;

public class AddIfMin extends AbstractCommand implements Serializable {
    private static final long serialVersionUID = 1234567L;

    @Override
    public void execute(Object o, DatagramSocket datagramSocket, DatagramPacket datagramPacket) throws IOException {
        Logging.log(Level.INFO, "Server is executing Add if price is min command....");
        Receiver receiver = new Receiver(datagramSocket, datagramPacket);
        receiver.addIfMin((Product) o);
    }
}
