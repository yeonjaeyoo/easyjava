package easyjava;

import java.util.ArrayList;

public class SimpleTest22 extends Thread {
	int seq;
	
    public SimpleTest22(int seq) {
        this.seq = seq;
    }
    
    public void run() {
        System.out.println(this.seq+" thread start.");
        try {
            Thread.sleep(1000);
        }catch(Exception e) {

        }
        System.out.println(this.seq+" thread end.");
    }
    
	public static void main(String[] args) {
	    ArrayList<Thread> threads = new ArrayList<Thread>();
	    for(int i=0; i<10; i++) {
	    	SimpleTest22 t = new SimpleTest22(i);
	        t.start();
	        threads.add(t);
	    }

	    for(int i=0; i<threads.size(); i++) {
	        Thread t = threads.get(i);
	        try {
	            t.join();
	        }catch(Exception e) {
	        }
	    }
	    System.out.println("main end.");
	    //"main end." 라는 문자열이 가장 마지막에 출력되는 것을 확인 할 수 있다.
	    // 쓰레드 프로그래밍 시 가장 많이 실수하는 부분이 바로 쓰레드가 종료되지 않았는데 쓰레드가 종료된 줄 알고 
	    // 그 다음 로직을 수행하게 만드는 일이다. 쓰레드가 종료된 후 그 다음 로직을 수행해야 할 때 꼭 필요한 것이 바로 이 join 메소드이다.
	}
}
