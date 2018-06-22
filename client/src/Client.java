import io.socket.client.IO;
import io.socket.client.Socket;

import java.net.URISyntaxException;

public class Client {

    private Socket mSocket;

    void attemptConnection()
    {
        try {
            mSocket = IO.socket("http://localhost:4000");
        } catch (URISyntaxException e) {
            System.out.printf("asnda"+e);
        }
        mSocket.connect();
    }
}
