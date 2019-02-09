---
layout: post
title: おさらい練習問題
tags:
  - Java
  - 問題
---

もっと簡単な問題がほしいというリクエストがあったので、すぐに解ける問題を作ってみました。

あくまで任意なので興味のある方は挑戦してみてください。

**1 問目** if 文の問題。1~5 の入力に応じて文字列を出力するプログラムにしてください

```java
public class Challenge1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int carrot = 1;
		int sandal = 2;
		int yacht = 3;
		int gomasio = 4;
		int rocket = 5;

		if () {
			System.out.println("にんじん");
		} else if () {
			System.out.println("サンダル");
		} else if () {
			System.out.println("ヨット");
		} else if () {
			System.out.println("ごましお");
		} else if () {
			System.out.println("ロケット");
		}

		sc.close();
	}

}
```

[解答](https://github.com/yoneyonepyon/yoneyonepyon.github.io/blob/master/challenges/Challenge1.java)

**2 問目** for 文の問題。1 問目の問題を for 文で出力するプログラムに変更してください

```java
public class Challenge2 {

	public static void main(String[] args) {
		int carrot = 1;
		int sandal = 2;
		int yacht = 3;
		int gomasio = 4;
		int rocket = 5;

		for (int i = ; i < ; i++) {
			if () {
				System.out.println("にんじん");
			} else if () {
				System.out.println("サンダル");
			} else if () {
				System.out.println("ヨット");
			} else if () {
				System.out.println("ごましお");
			} else if () {
				System.out.println("ロケット");
			}
		}
	}

}
```

[解答](https://github.com/yoneyonepyon/yoneyonepyon.github.io/blob/master/challenges/Challenge2.java)

**3 問目** while 文の問題。プログラム実行後にカウントダウンをした後に`ファイナル・カウントダウン!`を出力するように修正してください

```java
public class Challenge3 {

	/*
	 * https://www.youtube.com/watch?v=9jK-NcRmVcw
	 */
	public static void main(String[] args) {
		int countdown = 10;

		while (countdown) {
			System.out.println("残り" + countdown + "秒...");
		}

		System.out.println("ファイナル・カウントダウン!");
	}

}
```

[解答](https://github.com/yoneyonepyon/yoneyonepyon.github.io/blob/master/challenges/Challenge3.java)

**4 問目** メソッドの問題。与えられた数値が 3 の倍数の場合は`サンダル`、5 の倍数の場合は`ごましお`、それ以外はその数値を出力するメソッド`gomasioSandal`を用意してください

```java
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

}
```

_注:_ 3 と 5 の両方で割り切れる場合はどちらかがでていれば OK とします。

[解答](https://github.com/yoneyonepyon/yoneyonepyon.github.io/blob/master/challenges/Challenge4.java)

**5 問目** 配列の問題。配列`items`を用意して 1 行ごとに`にんじん` `サンダル` `ヨット` `ごましお` `ロケット`を出力してください(問題 1 と問題 2 の出力と同じになるはずです)

```java
public class Challenge5 {

	public static void main(String[] args) {
		for (int i = 0; i < items.length; i++) {
			String item = items[i];
			System.out.println(item);
		}
	}

}
```

[解答](https://github.com/yoneyonepyon/yoneyonepyon.github.io/blob/master/challenges/Challenge5.java)
