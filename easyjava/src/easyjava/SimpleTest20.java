package easyjava;

public class SimpleTest20 extends Thread {
	//동작하고 있는 프로그램을 프로세스(Process)라고 한다. 
	//보통 한 개의 프로세스는 한 가지의 일을 하지만,
	//이 쓰레드를 이용하면 한 프로세스 내에서 두 가지 또는 그 이상의 일을 동시에 할 수 있게 된다. 
	public void run() {
		System.out.println("쓰레드 시작");
	}

	public static void main(String[] args) {
		System.out.println("쓰레드 예제입니다.");
		System.out.println("쓰레드는  언제 시작할까요?");
		SimpleTest20 test = new SimpleTest20();
		test.start();
	}

}
