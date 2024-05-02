package com.multi.c_network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 서버 소켓을 포트 9200으로 생성
        ServerSocket server = new ServerSocket(9200);

        // 서버가 클라이언트의 요청을 기다리는 메시지 출력
        System.out.println("클라이언트의 요청을 기다리는 중 ");
        // 클라이언트 접속 횟수를 세는 변수 초기화
        int count = 0;

        // 무한 루프: 클라이언트의 연결을 지속적으로 기다림
        while(true){
            // 클라이언트의 연결 요청이 들어올 때까지 대기하고, 연결되면 해당 소켓을 생성
            Socket socket = server.accept();
            // 클라이언트 접속 횟수 증가
            count++;
            // 클라이언트 연결 메시지 출력
            System.out.println("클라이언트 연결됨 > " + count + "접속");

            // 소켓을 통해 클라이언트에 데이터를 보낼 PrintWriter 생성
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // 클라이언트에게 "java programmer" 문자열을 전송
            out.print("java programmer");

            // 출력 스트림과 소켓을 닫음
            out.close();
            socket.close();
        }
    }
}