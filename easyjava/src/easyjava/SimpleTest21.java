package easyjava;

public class SimpleTest21 extends Thread {
    int seq;
    
    public SimpleTest21(int seq) {
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
        for(int i=0; i<10; i++) {
        	SimpleTest21 t = new SimpleTest21(i);
            t.start();
        }
        System.out.println("main end.");
        /*
         * 0번 쓰레드부터 9번 쓰레드까지 순서대로 실행이 되지 않고
         *  그 순서가 일정치 않은 것을 보면 쓰레드는 순서에 상관없이 동시에 실행된다는 사실을 알 수 있다.
         *   더욱 재밌는 사실은 쓰레드가 종료되기 전에 main 메소드가 종료되었다는 사실이다.
         *   main 메소드 종료 시 "main end."라는 문자열이 출력되는데 위 결과를 보면 중간쯤에 출력되어 있다.


         */
    }
}

