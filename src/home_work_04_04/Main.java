package home_work_04_04;

public class Main {

	public static void main(String[] args) {
		int a[][] = new int[6][5];
		for (int j = 0, c = 30; j < 5; j++) {
			for (int i = 0; i < 6; i++, c--) {
				a[i][j] = c;
			}
		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 6; i++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
