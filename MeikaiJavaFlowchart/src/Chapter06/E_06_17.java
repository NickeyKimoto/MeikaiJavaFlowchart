package Chapter06;

/*
*クラス名：E_06_17
*概要：6人の2科目の点数を読み込み、科目ごとの平均点、学生ごとの平均点を求めるプログラム
*作成者：N.Kimoto
*作成日：2024/04/16
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_17 {

	/*
	*関数名：main
	*概要：6人の2科目の点数を読み込み、科目ごとの平均点、学生ごとの平均点を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/16
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 配列の列や行を指定する定数を宣言(1)
		final int CONSTANT_ONE = 1;
		// 配列の列や行を指定する定数を宣言(2)
		final int CONSTANT_TWO = 2;
		// 配列の列や行を指定する定数を宣言(3)
		final int CONSTANT_SIX = 6;
		// 指定された表記にするための定数を宣言
		final int ADJUSTMENT_NUMBER = 1;

		// 6行2列の行列を宣言
		int[][] firstArray = new int[CONSTANT_SIX][CONSTANT_TWO];

		// 国語の合計点数を初期化
		int japaneseTotal = 0;
		// 数学の合計点数を初期化
		int mathematicalTotal = 0;

		// 国語の点数の入力を促す
		System.out.println("国語");

		// 1行目から代入する
		for (int i = 0; i < CONSTANT_SIX; i++) {

			// 値の入力を促す
			System.out.print((i + ADJUSTMENT_NUMBER) + "人目：");
			// 入力された値を読み込む
			firstArray[i][0] = standardInput.nextInt();
			// 0か正の整数値以外の値を受け付けないようにする
			while (firstArray[i][0] < 0) {

				// 0か正の整数値の入力を促す
				System.out.print("0か正の整数値を入力してください:");
				// 入力された値を読み込む
				firstArray[i][0] = standardInput.nextInt();

			}

			// 国語の合計に加算する
			japaneseTotal += firstArray[i][0];

		}

		// 改行する
		System.out.println();
		// 数学の点数の入力を促す
		System.out.println("数学");

		// 1行目から代入する
		for (int i = 0; i < CONSTANT_SIX; i++) {

			// 値の入力を促す
			System.out.print((i + ADJUSTMENT_NUMBER) + "人目：");
			// 入力された値を読み込む
			firstArray[i][CONSTANT_ONE] = standardInput.nextInt();
			// 0か正の整数値以外の値を受け付けないようにする
			while (firstArray[i][CONSTANT_ONE] < 0) {

				// 0か正の整数値の入力を促す
				System.out.print("0か正の整数値を入力してください:");
				// 入力された値を読み込む
				firstArray[i][CONSTANT_ONE] = standardInput.nextInt();

			}

			// 数学の合計に加算する
			mathematicalTotal += firstArray[i][CONSTANT_ONE];

		}

		// 改行する
		System.out.println();

		// 国語の平均点を計算し表示
		System.out.println("国語の平均点 = " + (double) japaneseTotal / CONSTANT_SIX + "点");
		// 数学の平均点を計算し表示
		System.out.println("数学の平均点 = " + (double) mathematicalTotal / CONSTANT_SIX + "点");

		// 改行する
		System.out.println();

		// 一人目から順に平均点を表示
		for (int i = 0; i < CONSTANT_SIX; i++) {

			// その人の平均点を計算する
			double ninave = (double) (firstArray[i][0] + firstArray[i][CONSTANT_ONE]) / CONSTANT_TWO;

			// その人の平均点を表示
			System.out.println((i + ADJUSTMENT_NUMBER) + "人目の平均点 = " + ninave + "点");

		}

	}

}
