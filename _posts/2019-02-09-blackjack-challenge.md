---
layout: post
title: おさらい練習問題 ブラックジャック編
tags:
  - Java
  - 問題
---

これまでの授業のおさらいということで、単純なブラックジャックを作ってみました。

そこで、この問題を最後まで解くともれなくブラックジャックが作れる（はず）なので興味がある方は解いてみてください。

もしわからなくても GitHub のリポジトリを見れば答えが載っているので、困ったら参照してみてください。

また、以前のような簡単な問題のほうがよければ休み明けにでもお知らせ下さい。

**1 問目** 以下の要件を満たす Card クラスを作成してください

1. 引数にカードの種類とカードの数字を与えると初期化できるコンストラクタをつくってください
2. `showSuit`というメソッドを作り、`0`から`3`に応じてカードの模様を改行なしで出してください
3. `showRank`というメソッドを作り、`1`から`13`までの値を改行なしで表示してください
   ただし、1 のときは`エース`、11 のときは`ジャック`、12 のときは`クイーン`、13 のときは`キング`と表示してください
4. `showName`というメソッドを作り、`スペード の 3`というように、カードのインスタンスの中身がわかるように表示してください

```java
public class Card {

  // ヒント: ここは後から別ファイルで呼び出すのでpublicにしてください
	public Card() {
    // ヒント: プリント参照
	}

  // ヒント: ここは後から別ファイルで呼び出すのでpublicにしてください
  public void showName() {
    // ヒント: showSuitとshowRankを実行します
  }

  // 以下のメソッドはわかりやすい名前に変えても構いません
  private void showSuit() {
    // ヒント: switch文を使うといいかも
  }

  private void showRank() {
    // ヒント: switch文を使うといいかも
  }

}
```

_注意:_ メソッドはすべて`public`にしても構いません

**2 問目** Game クラスを作成し、すべてのカードで`showName`を実行してください。

```java
public class Game {

	public static void main(String[] args) {
    // ヒント: 二重のfor文を使ってCardを初期化すると簡単です
	}

}
```

**3 問目** 以下の要件を満たす Deck クラスを作成してください

1. 52 枚のカードを代入するためのフィールドをつくってください
2. 引数なしで初期化すると`buildCards`というコンストラクタをつくってください
3. `buildCards`が実行されると先程のフィールドに 52 枚のカードがすべて格納されるようにしてください

```java
public class Deck {

  // ヒント: ここは後から別ファイルで呼び出すのでpublicにしてください
	public Deck() {
		buildCards();
	}

  // 以下のメソッドはわかりやすい名前に変えても構いません
	private void buildCards() {
    // ヒント: showNameを配列に置き換えて、初期化した配列に代入します
	}

}
```

**4 問目** Deck クラスに`shuffle`メソッドを追加してください

`shuffle`は引数を受けても受けなくても手札が毎回ランダムに変更されていれば構いません

```java
public class Deck {

  // ここで追加するシャッフルの方法はネットで調べるか、独自に実装してください
	public void shuffle() {
    // 自力で実装するときのヒント
    // 1. 乱数で入れ替えるカードaとカードbのインデックスを取得する
    // 2. 一時変数tmp等を用意するなどしてカードaを代入する
    // 3. 配列のカードaをカードbで代入する
    // 4. 配列のカードbを一時変数で代入する
	}

}
```

**5 問目** Deck クラスにプレイヤーの手札用のフィールドと、以下の`drawCard`メソッドを追加してください

```java
public class Deck {

	public Card drawCard() {
    // ヒント: drawCardを1度だけ実行します
	}

	public Card[] drawCard(int n) {
    // ヒント: 引いた分のカードを初期化、引数の分を追加した配列を初期化、引かれた分のカードの配列を初期化して最後に代入する
	}

}
```

**6 問目** Deck クラスにプレイヤーの手札を表示する`showHand`メソッドを追加してください

```java
public class Deck {

	public void showHand() {
    // ヒント: CardのshowNameを一枚ずつ実行します
	}

}
```

**7 問目** Deck クラスにプレイヤーの手札を計算して、合計値を返す`calcHand`を追加してください。
ただし、ブラックジャックではエースが 11 または 1 の値を持っています。

```java
public class Deck {

	public void calcHand() {
    // ヒント: Cardクラスを改造して11が21よりもオーバーしたときは1のときの値を返すようにしてください
	}

}
```

**8 問目** Deck クラスにディーラー用に以下のメソッドを追加してください

1. ディーラーの手札をあらわすフィールド
2. 引数ありと引数なしの`drawDealerCard`を追加し、山札からディーラーの手札に加えられるようにしてください
3. `showDealerHand`を追加し、ディーラーの手札を表示してください
4. `calcDealerHand`を追加し、ディーラーの手札の得点を計算してください

_ヒント:_ 新しくメソッドを作るのではなく、既存のメソッドを拡張して対応すると楽です

**9 問目** 以下の要件を満たす Game クラスに変更してください

1. 山札のインスタンスを作成する
2. 山札をシャッフルする
3. プレイヤーとディーラーはそれぞれ 2 枚カードを引く
4. プレイヤーはカードの合計が 21 未満の時、自分の手札に応じてカードを引くか、引かないかを選べる
5. プレイヤーはカードを引いて、21 を出した時ディーラーとの勝負に勝利する
6. プレイヤーはカードを引いて、22 以上の時ゲームに敗北する

_ヒント:_ ここに書いてある内容は最低限の要件のみなので、各自改良を加えて下さい

**10 問目** 以下の要件を満たす Game クラスを完成させてください

1. ディーラーは手札の合計が 17 以上になるまでカードを加える
2. ディーラーの手札の合計が 21 ならディーラーの勝利
3. ディーラーの手札の合計が プレイヤーと同じなら引き分け
4. ディーラーの手札の合計とプレイヤーの手札の合計が大きい方が勝ち
5. ディーラーとプレイヤーのどちらかの手札が 21 を超えた方が負け
6. ディーラーとプレイヤーのどちらも手札が 21 を超えたらプレイヤーが負け

完成したら GitHub の公開や、Slack チャンネルなどでの告知もしてみてください