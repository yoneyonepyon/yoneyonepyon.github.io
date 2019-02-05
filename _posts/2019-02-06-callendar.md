---
layout: post
title: Javaで月末を調べる方法
tags:
  - Java
  - Calendar
---

本日怒涛の 3 本目です。問題のカレンダーを出力する問題で、ある月の開始曜日と日数を調べる必要がありました。

すでに引数`firstday`(開始曜日)と`lastday`(日数)を受け取る`calendarDisp`は用意できていました。

2019 年 2 月の場合は 1 日が金曜日で、月末が 28 日なので`calendarDisp(5, 28)`を受け取ればカレンダーが出力できます。

**注:** この問題では日曜開始のカレンダーを使用しているため、日曜日が`0`で土曜日が`6`です。

```java
import java.util.Calendar;

public class Method_NowCalendarDisp {

	public static void main(String[] args) {
		System.out.println("2019年2月");
		Calendar cal = Calendar.getInstance(); // 実行した日のカレンダーを取得
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		cal.set(year, month, 1); // その月の1日に変更する
		int firstday = cal.get(Calendar.DAY_OF_WEEK) - 1; // Javaは月曜日が0なので-1する
		int lastday = cal.getActualMaximum(Calendar.DATE); // 月末の取得
		calendarDisp(firstday, lastday);
	}

}
```

インスタンスを取得した上でさらに定数で`get`および`getActualMaximum`しなければならないのでずいぶん回りくどい使い方です。

[set-int-int-int]: https://docs.oracle.com/javase/jp/8/docs/api/java/util/Calendar.html#set-int-int-int-

また、[`set(int year, int month, int date)`][set-int-int-int]で任意の日付に指定できるのですが、month は`0`開始です。

`month`が`0`開始は非常にハマりやすいので注意が必要です。

とはいえ JavaScript も似たような挙動をしています。

```javascript
>> var cal = new Date();
>> cal.getMonth();
1 // 2月
```

おそらく月に関しては`January`とか`February`などの文字列で表現しやすいように配列のインデックスで使う前提なのかもしれません。
