package Chapter06;

/*
*クラス名：E_06_06
*概要：テストの点数の合計点・平均点・最高点・最低点を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/12
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_06 {

	/*
	*関数名：main
	*概要：テストの点数の合計点・平均点・最高点・最低点を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/12
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 一人目から順に表示するための計算に必要な定数を宣言
		final int CALCULATING_COUNT = 1;

		// 人数の入力を促す
		System.out.print("人数を入力せよ:");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 読み込んだ正の整数値を表示
			integerVariable = standardInput.nextInt();

		}

		// 合計点を求めるため初期化
		int totalValue = 0;

		// それぞれの点数を代入する配列を生成
		int[] pointArray = new int[integerVariable];

		// 順番に点数の入力を促す
		System.out.println(integerVariable + "人の点数を入力せよ:");

		// 点数を入力し読み込む
		for (int i = 0; i < integerVariable; i++) {

			// 一人目から点数の入力を促す
			System.out.print((i + CALCULATING_COUNT) + "番の点数");

			// 入力された値を読み込む
			pointArray[i] = standardInput.nextInt();

			// 0か正の整数値が入力されるまで繰り返す
			while (pointArray[i] < 0) {

				// 0か正の整数値の入力を促す
				System.out.print("正の整数値を入力してください:");
				// 読み込んだ値を表示
				pointArray[i] = standardInput.nextInt();

			}

			// 入力された値を合計値に加算する
			totalValue += pointArray[i];

		}

		// 最大値を求めるため初期化
		int maximumValue = pointArray[0];

		// 最大値を求めるため各要素を比較する
		for (int i = 1; i < pointArray.length; i++) {

			// この時点の最大値より大きい値を持つ場合
			if (pointArray[i] > maximumValue) {

				// 最大値を更新する
				maximumValue = pointArray[i];

			}

		}

		// 最小値を求めるため初期化
		int minimumValue = pointArray[0];

		// 最小値を求めるため各要素を比較する
		for (int i = 1; i < pointArray.length; i++) {

			// この時点の最小値より小さい値を持つ場合
			if (pointArray[i] < minimumValue) {

				// 最小値を更新する
				minimumValue = pointArray[i];

			}

		}

		// 合計値を表示
		System.out.println("合計は" + totalValue + "点です。");
		// 平均値を表示
		System.out.println("平均は" + (double) totalValue / integerVariable + "点です。");
		// 最大値を表示
		System.out.println("最高点は" + maximumValue + "点です。");
		// 最小値を表示
		System.out.println("最低点は" + minimumValue + "点です。");

	}

}
