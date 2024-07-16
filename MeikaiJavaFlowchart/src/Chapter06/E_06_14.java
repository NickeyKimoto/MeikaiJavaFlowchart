package Chapter06;

/*
*クラス名：E_06_14
*概要：月を1～12の数値として表示し、その英語表現を入力させる英単語学習プログラム
*作成者：N.Kimoto
*作成日：2024/04/15
*/

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_14 {
	
	/*
	*関数名：main
	*概要：月を1～12の数値として表示し、その英語表現を入力させる
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/15
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();

		// 1以上の乱数を生成するための定数を宣言
		final int ADJUSTMENT_NUMBER = 1;
		// 実行を終了するときの定数を宣言
		final int END_NOMBER = 0;
		// 再び実行するときの定数を宣言
		final int RETRY_NOMBER = 1;
		// 11までの乱数を生成するための定数を宣言
		final int MONTH_VALUE = 12;

		// もう一度行うかどうかを確かめるために宣言
		int retryJudgment = 0;

		// 文字列の配列を宣言
		String[] monthString = {

				// 1～8月の英単語
				"January", "February", "March", "April", "May", "June", "July", "August",
				// 9～12月の英単語
				"September", "October", "November", "December"

		};

		// 問題文を表示
		System.out.println("英語の月名を入力してください。");
		// 回答方式を表示
		System.out.println("なお、先頭は大文字で、２文字目以降は小文字とします。");

		// 当てるべき月の値を初期化
		int monthNumber = 0;
		// 出題した月の値を初期化
		int beforeMonth = 0;

		// 当てるべき月を出題する
		do {

			// 出題する月の値を乱数で生成する
			do {

				// // 出題する月の値を乱数で生成する
				monthNumber = randomVariable.nextInt(MONTH_VALUE);

				// 前回出題した月と同じ月でなかった場合
				if (monthNumber != beforeMonth) {

					// 出題する月の値を決定する
					break;

				}

				// 前回出題した月と同じ月でなくなるまで繰り返す
			} while (monthNumber == beforeMonth);

			// 今回出題した答えを記録する
			beforeMonth = monthNumber;

			// 正しい英単語を入力するまで
			while (true) {

				// 出題する
				System.out.print(monthNumber + ADJUSTMENT_NUMBER + "月：");
				// 入力された回答を読み込む
				String inputWord = standardInput.next();

				// 入力された回答と答えが一致した場合
				if (inputWord.equals(monthString[monthNumber])) {

					// 回答入力を停止する
					break;

				}

				// 不正解であることを表示
				System.out.println("違います。");

			}

			// 正解であることを表示
			System.out.println("正解です。");

			// 繰り返し問題を回答するかの選択の入力を促す
			System.out.print("もう一度？。１…Yes／０…No：");
			// 繰り返しの選択を読み込む
			retryJudgment = standardInput.nextInt();

			// 0か1以外の整数を入力した場合
			if (retryJudgment < END_NOMBER || retryJudgment > RETRY_NOMBER) {

				// 入力をやり直させる
				do {

					// 繰り返しの選択の入力を促す
					System.out.print("0か1を入力してください。\nもう一度？。１…Yes／０…No：");
					// 繰り返しの選択を読み込む
					retryJudgment = standardInput.nextInt();

					// 0か1を入力するまで繰り返す
				} while (retryJudgment < END_NOMBER || retryJudgment > RETRY_NOMBER);

			}

			// 1を入力した場合もう一度出題する
		} while (retryJudgment == RETRY_NOMBER);

	}

}
