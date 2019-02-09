
public class Challenge5 {
	
	public static void main(String[] args) {
		String[] items = {"にんじん","サンダル","ヨット","ごましお","ロケット"};
		
		for (int i = 0; i < items.length; i++) {
			String item = items[i];
			System.out.println(item);
		}
		
		// 今回の問題では使いませんでしたが、以下の記述も覚えておきましょう
		for (String item : items) {
			System.out.println(item);
		}
	}

}
