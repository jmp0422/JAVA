package com.multi.c_network.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class MyFrame extends JFrame implements ActionListener {


    private DatagramSocket socket;
    private DatagramPacket packet;
    private JTextField textField;
    private JTextArea textArea;
    private InetAddress address;
    private int otherPort;

    public MyFrame(InetAddress address, int otherPort, DatagramSocket socket) {

        this.address = address;
        this.otherPort = otherPort;
        this.socket = socket;

        textField = new JTextField(30);
        textField.addActionListener(this);

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);// textArea 수정방지

        this.add(textField, BorderLayout.PAGE_END);
        this.add(textArea, BorderLayout.CENTER);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = textField.getText();
        byte[] buffer = str.getBytes();//UDP방식은 byte[] 데이터로 통신
        DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, address, otherPort);
        // 순서 : 보낼 바이트 배열, 그 배열의 얼마만큼의 데이터, 상대방 아이피, 상대방 포트넘버
        try {
            socket.send(sendPacket);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        textArea.append("SENT : " + str + "\n");// 보낸 내용을 textArea에 출력
        textField.selectAll();//내용 선택 되게~

    }

    public void process() {
        while (true) {
            byte[] buf = new byte[256];
            packet = new DatagramPacket(buf, buf.length);

            try {
                socket.receive(packet);
                textArea.append("RECEIVE : " + new String(buf) + "\n");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
