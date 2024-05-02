package com.multi.c_network.model;

import com.multi.c_network.view.MyFrame;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Messenger {
    private MyFrame f;
    private DatagramSocket socket;
    private InetAddress address = null;
    private final int MP ;
    private final int OTHMP ;

    public Messenger(int myPort, int otherPort) {
        this.MP = myPort;
        this.OTHMP = otherPort;

        try {
            address = InetAddress.getByName("127.0.0.1");
            socket = new DatagramSocket(myPort);

            f = new MyFrame(address, otherPort, socket);

        } catch (UnknownHostException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public MyFrame getMyFrame() {
        // TODO Auto-generated method stub
        return f;
    }
}
