package Chapter04;

/*
*クラス名：E_04_25_B
*概要：読み込んだ整数を加算(合計が指定された定数を超えない範囲で加算する)し、
*合計と平均を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/10
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_25_B {

	/*
	*関数名：main
	*概要：読み込んだ整数を加算(合計が指定された定数を超えない範囲で加算する)し、
	*合計と平均を表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/10
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 超えてはならない定数を宣言
		final int SPECIFIED_NUMBER = 1000;

		// プログラム内容を表示
		System.out.println("整数を加算します。:");
		// 加算する正の整数値の個数の入力を促す
		System.out.print("何個加算しますか:");
		// 入力された正の整数値を表示
		int integerCount = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (integerCount <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 読み込んだ正の整数値を表示
			integerCount = standardInput.nextInt();

		}

		// 合計値を初期化
		int totalValue = 0;
		// 加算された整数の個数を初期化
		double increaseValue = 0;
		// 加算された値の平均値を初期化
		double averageValue = 0;

		// 入力された個数分、整数値の入力と加算を繰り返す
		for (int i = 0; i < integerCount; i++) {

			// 加算する整数値の入力を促す
			System.out.print("整数:");
			// 入力された加算する整数値を読み込む
			int addQuantity = standardInput.nextInt();

			// 加算すると合計値が指定された定数を超える場合
			if (totalValue + addQuantity > SPECIFIED_NUMBER) {

				// 合計値が指定された定数を超えたことを表示
				System.out.println("合計が" + SPECIFIED_NUMBER + "を超えました。");
				// 最後に入力した値を加算しないことを表示
				System.out.println("最後の数値は無視します。");

				// 入力と加算の繰り返しを終了する
				break;

			}

			// 何回加算したか数える
			increaseValue++;
			// 総量に入力された値を加算する
			totalValue += addQuantity;
		}

		// 整数が1つでも入力された場合
		if (increaseValue != 0) {

			// 入力された値の平均を求める
			averageValue = totalValue / increaseValue;

		}

		// 合計を表示
		System.out.println("合計は" + totalValue + "です。");
		// 平均を表示
		System.out.println("平均は" + averageValue + "です。");

	}

}
