package com.multi.c_network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) throws Exception {
        // DatagramSocket을 생성하여 UDP 패킷을 전송할 준비
        DatagramSocket socket = new DatagramSocket();

        // 수신할 호스트의 IP 주소를 설정
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        // 전송할 문자열을 설정
        String str = "java programmer";

        // 전송할 데이터를 바이트 배열로 변환
        byte[] data = str.getBytes();

        // 전송할 DatagramPacket 생성하여 데이터, 데이터 길이, 수신할 호스트의 IP 주소, 포트 번호를 전달
        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 9300);

        // 소켓을 통해 패킷을 전송
        socket.send(packet);

        // 소켓 닫기
        socket.close();
    }
}