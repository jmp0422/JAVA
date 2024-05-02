package com.multi.c_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 100번 반복하여 서버에 연결
        for(int i=0; i<100; i++){
            // 로컬호스트의 포트 9200에 소켓 생성하여 서버에 연결
            Socket socket = new Socket("localhost", 9200);

            // 서버와 소통할 스트림 오픈
            // 소켓의 입력 스트림을 BufferedReader로 래핑하여 데이터를 읽음
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 서버에서 전송한 데이터를 읽음
            String data = bufferedReader.readLine();
            // 받은 데이터를 출력
            System.out.println("서버에서 받은 데이터 : " + data);

            // 사용한 자원 해제 (소켓은 닫지 않음으로써 서버에 대한 반복적인 연결을 유지함)
        }
    }
}