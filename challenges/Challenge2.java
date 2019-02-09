
public class Challenge2 {

	public static void main(String[] args) {
		int carrot = 1;
		int sandal = 2;
		int yacht = 3;
		int gomasio = 4;
		int rocket = 5;
		
		// i<6 または i<= 5 でも正解
		// i<5 の時は i+1 == carrotでも正解
		for (int i = 1; i < 6; i++) {
			if (i == carrot) {
				System.out.println("にんじん");
			} else if (i == sandal) {
				System.out.println("サンダル");
			} else if (i == yacht) {
				System.out.println("ヨット");			
			} else if (i == gomasio) {
				System.out.println("ごましお");			
			} else if (i == rocket) {
				System.out.println("ロケット");			
			}	
		}
	}

}
