import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int carrot = 1;
		int sandal = 2;
		int yacht = 3;
		int gomasio = 4;
		int rocket = 5;
		
		if (num == carrot) {
			System.out.println("にんじん");
		} else if (num == sandal) {
			System.out.println("サンダル");
		} else if (num == yacht) {
			System.out.println("ヨット");			
		} else if (num == gomasio) {
			System.out.println("ごましお");			
		} else if (num == rocket) {
			System.out.println("ロケット");			
		}
		
		sc.close();
	}

}
