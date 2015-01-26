package easyjava;

public class SimpleTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 배열로 변경 
		int[][] arrayNum = new int[9][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				arrayNum[i][j] = (i + 1) * (j + 1);
				System.out.println((i + 1) + " * " + (j + 1) +" = "+ arrayNum[i][j]);
			}
		}
	}
}
