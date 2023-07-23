package net.luminis.quic;

import java.net.DatagramSocket;
import java.net.SocketException;

public interface DatagramSocketFactory {

    DatagramSocket createDatagramSocket() throws SocketException;

}
