---
layout: post
title: 不正な数値を返すときはIntegerを使う
tags:
  - Java
  - メソッド
---

メソッドの血圧値の問題で以下のような記述がありました。

```java
public class Method_KetuatuTiBunrui {

	private static int ketuatuTiBurui(int high, int low) {
		if (high < 1 || low < 1) {
			return -999; // 引数エラー
		}
		if (high < 120 && low < 80) {
			return -1;
		}
		if (high < 130 && low < 85) {
			return 0;
		}
		if (high < 140 && low < 90) {
			return 1;
		}
		if (high < 160 && low < 100) {
			return 2;
		}
		if (high < 180 && low < 110) {
			return 3;
		}
		return 4;
	}

}
```

この`return -999;`の不正な値を出す場合、返り値が`int`のような基本型の場合は上記のように必ず`int`の範囲内の整数を返さなければなりません。

問題では至適血圧値に`-1`を指定しているのがそもそもの違和感の原因だと思います。

往々にして都道府県などの ID をつけるとき、最初は`1,2,...`と連番で作っていたのに、海外を表すのに`99`とか`999`などの番号がつくことはありました。

それはさておき上記のように引数エラーを表現したいときに基本型のメソッドで`null`を返すことはできません。

どうするかというと、Integer を返り値に設定してあげるとよいそうです。

```java
public class Method_KetuatuTiBunrui {

	private static Integer ketuatuTiBurui(int high, int low) {
		if (high < 1 || low < 1) {
			return null; // 引数エラー
		}
		if (high < 120 && low < 80) {
			return -1;
		}
		if (high < 130 && low < 85) {
			return 0;
		}
		if (high < 140 && low < 90) {
			return 1;
		}
		if (high < 160 && low < 100) {
			return 2;
		}
		if (high < 180 && low < 110) {
			return 3;
		}
		return 4;
	}

}
```

これなら違和感なく表現できます。

上記のコードを実行してみると`null`か数値を返すので、なんらかの処理は加えなければなりません。

ただ、少なからず`-999`にすべきか`-5000`などにすべきかで悩む必要はなくなるので、いざという時は`null`を使いましょう。

余談ですが、GitHub 上のエディタで書いていたらクラッシュしたので同じ内容を書き直す羽目になりました。とほほ。
