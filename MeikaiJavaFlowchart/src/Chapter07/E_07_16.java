package Chapter07;

/*
*クラス名：E_07_15
*概要：配列aの要素の最小値を求める
*作成者：N.Kimoto
*作成日：2024/04/22
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_16 {

	/*
	*関数名：min0f
	*概要：配列の全要素の最小値を求める
	*引数：配列
	*戻り値：全要素の最小値
	*作成者：N.Kimoto
	*作成日：2024/04/22
	*/

	static int min0f(int[] a) {

		// 要素の最小値を初期化
		int minimumValue = a[0];

		// 全要素と最小値を比較
		for (int i = 1; i < a.length; i++) {

			// その要素の値が最小値より小さい場合
			if (a[i] < minimumValue) {

				// 最小値を更新
				minimumValue = a[i];

			}

		}

		// 求めた最小値を返却
		return minimumValue;

	}

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();
		// 0か負の整数の値を入力された場合
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言
		int[] firstArray = new int[integerVariable];

		// 配列の全要素に値を入力する
		for (int i = 0; i < integerVariable; i++) {

			// その要素の値の入力を促す
			System.out.print("x[" + i + "]：");
			// 入力された値を読み込む
			firstArray[i] = standardInput.nextInt();

		}

		// 配列の全要素の最小値を表示
		System.out.println("配列aの最小値：" + min0f(firstArray));

	}

}
