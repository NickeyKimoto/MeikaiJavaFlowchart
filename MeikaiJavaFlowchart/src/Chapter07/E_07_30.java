package Chapter07;

/*
*クラス名：E_07_30
*概要：二値、三値、配列の要素の最小値を求める
*作成者：N.Kimoto
*作成日：2024/04/24
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_30 {
	
	/*
	*関数名：min
	*概要：二値の最小値を求め返却する。
	*引数：整数(int型)
	*戻り値：最小値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static int min(int a, int b) {

		// 二値を比較し、小さいほうを返却
		return a < b ? a : b;

	}

	/*
	*関数名：min
	*概要：三値の最小値を求め返却する。
	*引数：整数(int型)
	*戻り値：最小値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/
	
	static int min(int a, int b, int c) {

		// 最小値を一つ目の整数に初期化
		int minimumValue = a;
		
		// 二つ目の整数値のほうが現在の最小値より小さい場合
		if (b < minimumValue) {
			
			// 最小値を二つ目の整数値にする
			minimumValue = b;
			
		}
		
		// 三つ目の整数値のほうが現在の最小値より小さい場合
		if (c < minimumValue) {
			
			// 最小値を三つ目の整数値にする
			minimumValue = c;
		}

		// 最小値を返却
		return minimumValue;

	}
	
	/*
	*関数名：min
	*概要：配列の要素の最小値を求め返却する。
	*引数：配列(int型)
	*戻り値：最小値の要素の値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static int min(int[] a) {

		// 最小値をインデックス0に初期化
		int minimumValue = a[0];

		// 配列をインデックス順にその時の最小値と比較
		for (int i = 1; i < a.length; i++) {

			// その要素の値のほうがその時の最小値より小さい場合
			if (a[i] < minimumValue) {

				// 最小値をその要素の値にする
				minimumValue = a[i];

			}

		}

		// 最小値を返却
		return minimumValue;

	}
	
	/*
	*関数名：main
	*概要：二値、三値、配列の要素の最小値を求め表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 一つ目の整数値の入力を促す
		System.out.print("xの値：");
		// 入力された値を読み込む
		int firstVariable = standardInput.nextInt();
		// 二つ目の整数値の入力を促す
		System.out.print("yの値：");
		// 入力された値を読み込む
		int secondVariable = standardInput.nextInt();
		// 三つ目の整数値の入力を促す
		System.out.print("zの値：");
		// 入力された値を読み込む
		int thirdVariable = standardInput.nextInt();

		// 配列の要素数の入力を促す
		System.out.print("配列aの要素数：");
		// 入力された値を読み込む
		int elementCount = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (elementCount <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			elementCount = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言
		int[] firstArray = new int[elementCount];

		// 配列の要素に順に値を代入
		for (int i = 0; i < elementCount; i++) {

			// 該当する要素に代入する値の入力を促す
			System.out.print("a[" + i + "] = ");
			// 入力された値を読み込む
			firstArray[i] = standardInput.nextInt();

		}

		// 二値の最小値を表示
		System.out.println("x, yの最小値は" + min(firstVariable, secondVariable) + "です。");
		// 三値の最小値を表示
		System.out.println("x, y, zの最小値は" + min(firstVariable, secondVariable, thirdVariable) + "です。");
		// 配列の要素の最小値を表示
		System.out.println("配列aの要素の最小値は" + min(firstArray) + "です。");

	}

}
