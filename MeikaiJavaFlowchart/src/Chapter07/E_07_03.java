package Chapter07;

/*
*クラス名：E_07_03
*概要：三つのint型引数の中央値を求める
*作成者：N.Kimoto
*作成日：2024/04/17
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_03 {
	
	/*
	*関数名：med
	*概要：int型の引数a, b, cの中央値を返却
	*引数：a, b, c(int型)
	*戻り値：中央値
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	static int med(int a, int b, int c) {

		// 一つ目の整数を最小値として、初期化する
		int minimumValue = a;

		// 二つ目の整数の値が初期化された最小値よりも小さい場合
		if (b < minimumValue) {

			// 表示する最小値の値に二つ目の整数の値を代入する。
			minimumValue = b;

		}

		// 三つ目の値が初期化された最小値よりも小さい場合
		if (c < minimumValue) {

			// 表示する最小値の値に三つ目の整数の値を代入する。
			minimumValue = c;

		}

		// 計算前の中央値を宣言する
		int centerValue = 0;

		// 一つ目の整数値が最小値の場合
		if (minimumValue == a) {

			// 三つ目の整数値より二つ目の整数値のほうが小さい場合
			if (b < c) {

				// 中央値は二つ目の整数値である
				centerValue = b;

			// 二つ目の整数値と三つ目の整数値が同じ値か、三つ目の整数値のほうが小さい場合
			} else {

				// 中央値は三つ目の整数値である
				centerValue = c;

			}

		// 二つ目の整数値が最小値の場合
		} else if (minimumValue == b) {

			// 三つ目の整数値より一つ目の整数値のほうが小さい場合
			if (a < c) {

				// 中央値は一つ目の整数値である
				centerValue = a;

			// 一つ目の整数値と三つ目の整数値が同じ値か、三つ目の整数値のほうが小さい場合
			} else {

				// 中央値は三つ目の整数値である
				centerValue = c;

			}

			// 三つ目の整数値が最小値の場合
		} else {

			// 二つ目の整数値より一つ目の整数値のほうが小さい場合
			if (a < b) {

				// 中央値は一つ目の整数値である
				centerValue = a;

			// 一つ目の整数値と二つ目の整数値が同じ値か、二つ目の整数値のほうが小さい場合
			} else {

				// 中央値は二つ目の整数値である
				centerValue = b;

			}

		}

		// 求めた中央値を返却する
		return centerValue;

	}
	
	/*
	*関数名：main
	*概要：三つのint型引数の中央値を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 一つ目の整数の入力を促し、読み込む
		System.out.print("整数a：");
		// 入力された値を読み込む
		int firstVariable = standardInput.nextInt();
		// 二つ目の整数の入力を促し、読み込む
		System.out.print("整数b：");
		// 入力された値を読み込む
		int secondVariable = standardInput.nextInt();
		// 三つ目の整数の入力を促し、読み込む
		System.out.print("整数c：");
		// 入力された値を読み込む
		int thirdVariable = standardInput.nextInt();
		
		// 中央値を表示
	    System.out.print("中央値は" + med(firstVariable, secondVariable, thirdVariable) + "です。");

	}

}
