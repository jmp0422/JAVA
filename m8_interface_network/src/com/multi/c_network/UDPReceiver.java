package com.multi.c_network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        // DatagramSocket을 포트 9300으로 생성하여 UDP 패킷을 수신할 준비
        DatagramSocket socket = new DatagramSocket(9300);

        // 수신된 데이터를 저장할 바이트 배열 생성
        byte[] data = new byte[256];

        // 수신할 DatagramPacket 생성하여 수신된 데이터를 저장할 바이트 배열과 길이 전달
        DatagramPacket packet = new DatagramPacket(data, data.length);

        // "받을 준비중" 메시지 출력
        System.out.println("받을 준비중");

        // 소켓을 통해 패킷을 수신하고, 수신된 패킷을 packet에 저장
        socket.receive(packet);

        // 수신된 데이터를 문자열로 변환하여 출력
        System.out.println(new String(data));

        // 소켓 닫기
        socket.close();
    }
}