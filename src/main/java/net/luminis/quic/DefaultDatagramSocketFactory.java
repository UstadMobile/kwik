package net.luminis.quic;


import java.net.DatagramSocket;
import java.net.SocketException;

public class DefaultDatagramSocketFactory implements DatagramSocketFactory {

    @Override
    public DatagramSocket createDatagramSocket() throws SocketException {
        return new DatagramSocket();
    }

}
