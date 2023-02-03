
public class test {

	public static void main(String[] args) {
		System.out.print("\t 구구단");
		System.out.println();

		for (int dan = 1; dan <= 9; dan += 3) {
			for (int i = 0; i <= 2; i++) {
				System.out.print("==" + (dan + i) + "단==\t");
			}
			System.out.println();

			for (int gop = 2; gop <= 9; gop++) {
				for (int i = 0; i <= 2; i++) {
					System.out.print((dan + i) + "*" + gop + "=" + (dan + i) * gop + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}