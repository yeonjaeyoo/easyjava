/**
 * 
 */
package easyjava;

interface Fruit {
	public void getName();
}

/**
 * @author educar
 *
 */
public class OneInterface implements Fruit {
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("과일이름 가져오기.");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneInterface myOneInterface = new OneInterface();
		myOneInterface.getName();
	}
}
