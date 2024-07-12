package Chapter04;

/*
*クラス名：E_04_15
*概要：身長と標準体重の対応表を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_15 {

	/*
	*関数名：main
	*概要：身長と標準体重の対応表を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/09
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 標準体重を求めるのに必要な定数を宣言(1)
		final int FIRST_CALCULATION = 100;
		// 標準体重を求めるのに必要な定数を宣言(2)
		final double SECOND_CALCULATION = 0.9;
		// 標準体重を求めるのに必要な定数を宣言(3)
		final int THIRD_CALCULATION = 900;
		// 標準体重を求めるのに必要な定数を宣言(4)
		final int FOURTH_CALCULATION = 10;
		// 標準体重を求めるのに必要な定数を宣言(4)
		final int FIFTH_CALCULATION = 9;

		// 身長の範囲の開始値の正の整数の入力を促す
		System.out.print("何cmから：");
		// 入力された正の整数値を読み込み表示
		int startHigh = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (startHigh <= 0) {

			// 正の整数値の入力を促す
			System.out.print("不正な値が入力されました。\nもう一度入力してください:");
			// 読み込んだ正の整数値を表示
			startHigh = standardInput.nextInt();

		}

		// 身長の範囲の終了値の整数値を入力を促す
		System.out.print("何cmまで：");
		// 入力された正の整数値を読み込み表示
		int endHigh = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (endHigh <= startHigh) {

			// 正の整数値の入力を促す
			System.out.print("開始値より高い身長を入力してください：");
			// 読み込んだ正の整数値を表示
			endHigh = standardInput.nextInt();

		}

		// 身長の範囲の増分の整数値を入力を促す
		System.out.print("何cmごと：");
		// 入力された正の整数値を読み込み表示
		int incrementWidth = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (incrementWidth <= 0) {

			// 正の整数値の入力を促す
			System.out.print("不正な値が入力されました。\nもう一度入力してください:");
			// 読み込んだ正の整数値を表示
			incrementWidth = standardInput.nextInt();

		}

		// 身長と標準体重のリストを以下に表示
		System.out.println("身長   標準体重");

		// 開始値が増分ずつ加算され、終了値と同じかそれ以上になるまで繰り返す
		for (int i = startHigh; i <= endHigh; i += incrementWidth) {
			
			// 小数点以下が0の場合
			if (i % FOURTH_CALCULATION == 0) {

				// 標準体重を身長から求める
				int k = i * FIFTH_CALCULATION - THIRD_CALCULATION;
				// .0の表記をなくした状態で標準体重を表示する
				System.out.println(i + "cm  " + (k / FOURTH_CALCULATION) + "kg");
				
			// 小数点以下が0でない場合
			} else {

				// 標準体重を身長から求める
				double j = (i - FIRST_CALCULATION) * SECOND_CALCULATION;

				// 身長ごとの標準体重を表示する
				System.out.println(i + "cm  " + j + "kg");

			}

		}

	}

}
