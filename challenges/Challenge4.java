
public class Challenge4 {
	
	public static void main(String[] args) {
		System.out.println("1 = " + gomasioSandal(1)); // 1
		System.out.println("2 = " + gomasioSandal(2)); // 2
		System.out.println("3 = " + gomasioSandal(3)); // サンダル
		System.out.println("4 = " + gomasioSandal(4)); // 4
		System.out.println("5 = " + gomasioSandal(5)); // ごましお
		System.out.println("6 = " + gomasioSandal(6)); // サンダル
		System.out.println("7 = " + gomasioSandal(7)); // 7
		System.out.println("8 = " + gomasioSandal(8)); // 8
		System.out.println("9 = " + gomasioSandal(9)); // サンダル
		System.out.println("10 = " + gomasioSandal(10)); // ごましお
	}
	
	// 数値も文字列として返すのがポイントです
	public static String gomasioSandal(int num) {
		if (num % 3 == 0) {
			return "サンダル";
		} else if (num % 5 == 0) {
			return "ごましお";
		} else {
			return "" + num;
		}
	}

}
