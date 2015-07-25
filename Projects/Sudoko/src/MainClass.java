public class MainClass {
	public static void main(String[] args) {
		int[][] k = { { 0, 9, 0, 0, 0, 0, 0, 0, 8 },
				{ 0, 0, 3, 2, 0, 7, 0, 9, 0 }, { 0, 6, 0, 0, 0, 0, 7, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 0, 6 }, { 0, 0, 5, 4, 3, 2, 1, 0, 0 },
				{ 4, 0, 0, 7, 0, 0, 0, 0, 0 }, { 0, 0, 7, 0, 0, 0, 0, 3, 0 },
				{ 0, 2, 0, 9, 0, 8, 6, 0, 0 }, { 1, 0, 0, 0, 0, 0, 0, 4, 0 } };
		System.out.println("Hello");
		String s = "";
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				s = s + k[i][j] + "\t";
			}
			s = s + "\n";
		}

		System.out.println(s);
		System.out.println("\n");
		SudokoSolver m = new SudokoSolver(k, 3);
		System.out.println(m.get());
		String t = "";
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				t = t + k[i][j] + "\t";
			}
			t = t + "\n";
		}
		System.out.println(s);
		System.out.println(m.check());
	}

}
