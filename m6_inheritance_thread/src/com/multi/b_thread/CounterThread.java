package com.multi.b_thread;

public class CounterThread extends Thread {
    @Override // 어노테이션
    public void run() {
        for (int i = 20; i >= 0; i--) {
            System.out.println("===> 카운트 " + i);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                i--;
            }
            // try-catch 문은 예외가 발생할 수 있는 코드 블록을 시도하고, 예외가 발생할 경우 이를 처리하는데 사용됩니다.
            // try 블록 안에 있는 코드가 실행되고, 만약 예외가 발생하면 해당 예외를 처리하기 위해 catch 블록이 실행됩니다.
            // 이 코드에서는 InterruptedException이 발생할 수 있는 Thread.sleep(1000) 메서드를 실행하고 있습니다.
            // InterruptedException은 스레드가 sleep 중에 interrupt 되었을 때 발생할 수 있는 예외입니다.
            // catch 블록은 InterruptedException을 처리하고, 예외가 발생할 경우에는 스택 트레이스를 출력합니다.
            // 따라서, 이 코드는 1초간 일시 정지하고, 만약 스레드가 sleep 중에 interrupt 되면 스택 트레이스를 출력할 것입니다.
        }
    }
}
