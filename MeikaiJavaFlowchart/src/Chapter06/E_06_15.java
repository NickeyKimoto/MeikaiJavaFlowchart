package Chapter06;

/*
*クラス名：E_06_15
*概要：曜日表示し、その英語表現を入力させる英単語学習プログラム
*作成者：N.Kimoto
*作成日：2024/04/15
*/

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_15 {
	
	/*
	*関数名：main
	*概要：曜日表示し、その英語表現を入力させる
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
		// 6までの乱数を生成するための定数を宣言
		final int MONTH_VALUE = 7;

		// もう一度行うかどうかを確かめるために宣言
		int retryJudgment = 0;

		// 文字列の配列を宣言
		String[] weekString = {

				// 月～日曜日の英単語
				"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"

		};

		// 文字列の配列を宣言
		String[] weekKanji = {

				// 月～日曜日の頭文字
				"月", "火", "水", "木", "金", "土", "日"

		};

		// 問題文を表示
		System.out.println("英語の曜日名を入力してください。");

		// 当てるべき曜日の値を初期化
		int weekNumber = 0;
		// 出題した曜日の値を初期化
		int beforeweek = 0;

		// 当てるべき曜日を出題する
		do {

			// 出題する曜日の値を乱数で生成する
			do {

				// // 出題する曜日の値を乱数で生成する
				weekNumber = randomVariable.nextInt(MONTH_VALUE);

				// 前回出題した曜日と同じ月でなかった場合
				if (weekNumber != beforeweek) {

					// 出題する曜日の値を決定する
					break;

				}

				// 前回出題した曜日と同じ曜日でなくなるまで繰り返す
			} while (weekNumber == beforeweek);

			// 今回出題した答えを記録する
			beforeweek = weekNumber;

			// 正しい英単語を入力するまで
			while (true) {

				// 出題する
				System.out.print(weekKanji[weekNumber] + "曜日：");
				// 入力された回答を読み込む
				String inputWord = standardInput.next();

				// 入力された回答と答えが一致した場合
				if (inputWord.equals(weekString[weekNumber])) {

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
