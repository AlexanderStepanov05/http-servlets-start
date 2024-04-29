package org.stepanov.http.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramServerRunner {

    public static void main(String[] args) throws IOException {
        try (var datagramServer = new DatagramSocket(7777)) {
            var bytes = new byte[512];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            datagramServer.receive(packet);

            System.out.println(new String(bytes));
        }
    }
}
