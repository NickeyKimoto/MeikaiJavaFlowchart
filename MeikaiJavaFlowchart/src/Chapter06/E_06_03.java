package Chapter06;

/*
*クラス名：E_06_03
*概要：要素型がdouble型で要素数が5の配列に対し、先頭から順に1.1,2.2,3.3,4.4,5.5を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/12
*/

public class E_06_03 {

	/*
	*関数名：main
	*概要：要素型がdouble型で要素数が5の配列に対し、先頭から順に1.1,2.2,3.3,4.4,5.5を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/12
	*/

	public static void main(String[] args) {

		// 5～1の順に値を表示するための計算に必要な定数を宣言
		final double FIRST_CONSTANT = 11;
		// 5～1の順に値を表示するための計算に必要な定数を宣言
		final double SECOND_CONSTANT = 1;
		// 5～1の順に値を表示するための計算に必要な定数を宣言
		final double THIRD_CONSTANT = 10;
		// 配列の要素数の定数を宣言
		final int ELEMENTS_COUNT = 5;

		// int型で要素数が5の配列を宣言
		double[] firstArray = new double[ELEMENTS_COUNT];

		// 配列の先頭から値を計算し代入する
		for (int i = 0; i < firstArray.length; i++) {

			// 値を計算し代入する
			firstArray[i] = (i + SECOND_CONSTANT) * FIRST_CONSTANT / THIRD_CONSTANT;

		}

		// 配列の先頭から代入された値を要素順に表示
		for (int i = 0; i < firstArray.length; i++) {

			// その要素に代入された値を表示
			System.out.println("a[" + i + "] = " + firstArray[i]);

		}

	}

}
