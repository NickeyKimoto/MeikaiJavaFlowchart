package Chapter06;


/*
*クラス名：E_06_01
*概要：要素型がdouble型で要素数が5の配列を生成し、その全要素の値を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/11
*/

// 構成要素型がint型の配列(構成要素数は5：newによって本体を生成)

public class E_06_01 {
	
	/*
	*関数名：main
	*概要：要素型がdouble型で要素数が5の配列を生成し、その全要素の値を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/11
	*/

	public static void main(String[] args) {
		
		// 適当なdouble型の実数を代入するために宣言(1)
		final double FIRST_CONSTANT = 3.6;
		// 適当なdouble型の実数を代入するために宣言(2)
		final double SECOND_CONSTANT = 37.0;
		// 適当なdouble型の実数を代入するために宣言(3)
		final double THIRD_CONSTANT = 51.88;
		// 適当なdouble型の実数を代入するために宣言(4)
		final double FOURTH_CONSTANT = 0.5;

		// double型で要素数が5の配列を宣言
		double[] firstArray = new double[5];
		
		// 要素に値を代入する(1)
		firstArray[0] = FIRST_CONSTANT;
		// 要素に値を代入する(2)
		firstArray[1] = SECOND_CONSTANT;
		// 要素に値を代入する(3)
		firstArray[2] = THIRD_CONSTANT;
		// 要素に値を代入する(4)
		firstArray[4] = firstArray[1] * FOURTH_CONSTANT;
		
		// 要素0の値を表示
		System.out.println("a[" + 0 + "] = " + firstArray[0]);
		// 要素1の値を表示
		System.out.println("a[" + 1 + "] = " + firstArray[1]);
		// 要素2の値を表示
		System.out.println("a[" + 2 + "] = " + firstArray[2]);
		// 要素3の値を表示
		System.out.println("a[" + 3 + "] = " + firstArray[3]);
		// 要素4の値を表示
		System.out.println("a[" + 4 + "] = " + firstArray[4]);

	}

}
