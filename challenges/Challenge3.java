
public class Challenge3 {
	
	/*
	 * https://www.youtube.com/watch?v=9jK-NcRmVcw
	 */
	public static void main(String[] args) {
		int countdown = 10;

		// 穴埋めではないので残り10秒から始まり残り1秒でループを抜けていれば正解
		while (--countdown > 0) {
			System.out.println("残り" + countdown + "秒...");			
		}

		System.out.println("ファイナル・カウントダウン!");
	}

}
