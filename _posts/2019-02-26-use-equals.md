---
layout: post
title: equalsで文字列を比較できる
tags:
  - Java
  - メソッド
---

例えば以下のようなクラスがあるとします。

```java
import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String code = sc.next();

		if (code == "c") {
			System.out.println("Cのコードを表示");
		} else {
			System.out.println("表示しない");
		}

		sc.close();
	}

}
```

音楽の用語に**コード(和音)**と呼ばれるものがあり、*c*という入力の場合ドミソの音を表示するプログラムを作りたいとします。

ただ、残念ながら上記のプログラムでは残念ながら「Cのコードを表示」が表示されることはありません。

```java
import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char code = sc.next(); // 変更☆

		if (code == 'c') {  // 変更☆
			System.out.println("Cのコードを表示");
		} else {
			System.out.println("表示しない");
		}

		sc.close();
	}

}
```

もし上記のように`code`がchar型であれば問題はありません。

しかし、*Cmaj*や*Cmin*などのように、たった一文字しか判定できないのは問題です。

上記の違いはchar型とString型の違いでしたが、**基本型**と**参照型**の違いでもあります。

基本型はメモリに直接代入されるから`code`の中身は*c*と比較できます。

参照型はメモリに参照が代入されるので、参照値と*c*という文字列は比較しても正しくはありません。

ではどうすればよいのかというと、`equals`というメソッドが登場します。

```java
import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String code = sc.next();

		if (code.equals("c")) { // 変更☆
			System.out.println("Cのコードを表示");
		} else {
			System.out.println("表示しない");
		}

		sc.close();
	}

}
```

上記の内容であればプログラムは意図した通りに実行されるはずです。

以下[TomoyoshiSato](https://github.com/TomoyoshiSato)さんの補足:

「==」は基本型の場合、「値が同じか」を判定します。

参照型の場合は「同一のインスタンスか」を判定します。

同一のインスタンスでなくても中身が同じかチェックしたいときはequalsメソッドを使います。

たとえばStringのequalsメソッドは

1.比較相手が自分と同じインスタンスだったら当然中身も同じなのでtrue

2.比較相手がStringじゃなかったら当然false

3.お互いStringだったら1文字ずつ比較して（char型は==で比較できる）全部同じだったらtrue

という判定をしています。
