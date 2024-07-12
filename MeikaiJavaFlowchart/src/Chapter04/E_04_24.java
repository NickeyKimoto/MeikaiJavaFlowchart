package Chapter04;

/*
*クラス名：E_04_24
*概要：読み込んだ整数値が素数かどうか判定するプログラム
*作成者：N.Kimoto
*作成日：2024/04/10
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_24 {

	/*
	*関数名：main
	*概要：読み込んだ整数値が素数かどうか判定する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/10
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 素数かどうかを判別するための定数を宣言
		final int LIMIT_TWO = 2;

		// 正の整数値の値の入力を促す
		System.out.print("整数値：");
		// 入力された正の整数値を読み込む
		int integerVariable = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 読み込んだ正の整数値を表示
			integerVariable = standardInput.nextInt();

		}

		// 約数の個数を確認するために宣言
		int divisorCount = 0;

		// 正の整数の約数を1からnまで順に割って確かめる
		for (int i = 1; i <= integerVariable; i++) {

			// iがnの約数である場合
			if (integerVariable % i == 0) {

				// 約数をカウントする
				divisorCount++;

				// 約数が三つ以上ある場合
				if (divisorCount > LIMIT_TWO) {

					// それ以上の計算をやめ繰り返しを終了する
					break;

				}

			}

		}

		// 約数が2つだった場合
		if (divisorCount == LIMIT_TWO) {

			// 約数であることを表示
			System.out.println("その整数は素数です。");

		// 約数が1つ、三つ以上だった場合
		} else {

			// 約数でないことを表示
			System.out.println("その整数は素数ではありません。");

		}

	}

}
