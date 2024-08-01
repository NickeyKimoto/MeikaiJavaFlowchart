package Chapter10.numerical_comparison;

/*
*クラス名：MinMax
*概要：二値／三値／配列の最大値・最小値を求めるメソッドを集めたユーティリティクラス
*作成者：N.Kimoto
*作成日：2024/05/09
*/

public final class MinMax {
	
	/*
	*関数名：chooseMinimum
	*概要：二値の最小値を求め返却する。
	*引数：二つの整数(int型)
	*戻り値：最小値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/

	public static int chooseMinimum(int firstVariable, int secondVariable) {

		// 二値を比較し、小さいほうを返却
		return firstVariable < secondVariable ? firstVariable : secondVariable;

	}

	/*
	*関数名：chooseMinimum
	*概要：三値の最小値を求め返却する。
	*引数：三つの整数(int型)
	*戻り値：最小値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/
	
	public static int chooseMinimum(int firstVariable, int secondVariable, int thirdVariable) {

		// 最小値を一つ目の整数に初期化
		int minimumValue = firstVariable;
		
		// 二つ目の整数値のほうが現在の最小値より小さい場合
		if (secondVariable < minimumValue) {
			
			// 最小値を二つ目の整数値にする
			minimumValue = secondVariable;
			
		}
		
		// 三つ目の整数値のほうが現在の最小値より小さい場合
		if (thirdVariable < minimumValue) {
			
			// 最小値を三つ目の整数値にする
			minimumValue = thirdVariable;
		}

		// 最小値を返却
		return minimumValue;

	}
	
	/*
	*関数名：chooseMinimum
	*概要：配列の要素の最小値を求め返却する。
	*引数：配列(int型)
	*戻り値：最小値の要素の値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/

	public static int chooseMinimum(int[] integerArray) {

		// 最小値をインデックス0に初期化
		int minimumValue = integerArray[0];

		// 配列をインデックス順にその時の最小値と比較
		for (int i = 1; i < integerArray.length; i++) {

			// その要素の値のほうがその時の最小値より小さい場合
			if (integerArray[i] < minimumValue) {

				// 最小値をその要素の値にする
				minimumValue = integerArray[i];

			}

		}

		// 最小値を返却
		return minimumValue;

	}
	
	/*
	*関数名：chooseMaximum
	*概要：二値の最大値を求め返却する。
	*引数：二つの整数(int型)
	*戻り値：最大値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/

	public static int chooseMaximum(int firstVariable, int secondVariable) {

		// 二値を比較し、大きいほうを返却
		return firstVariable > secondVariable ? firstVariable : secondVariable;

	}

	/*
	*関数名：chooseMaximum
	*概要：三値の最大値を求め返却する。
	*引数：三つの整数(int型)
	*戻り値：最大値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/
	
	public static int chooseMaximum(int firstVariable, int secondVariable, int thirdVariable) {

		// 最大値を一つ目の整数に初期化
		int maximumValue = firstVariable;
		
		// 二つ目の整数値のほうが現在の最小値より大きい場合
		if (secondVariable > maximumValue) {
			
			// 最大値を二つ目の整数値にする
			maximumValue = secondVariable;
			
		}
		
		// 三つ目の整数値のほうが現在の最大値より大きい場合
		if (thirdVariable > maximumValue) {
			
			// 最大値を三つ目の整数値にする
			maximumValue = thirdVariable;
		}

		// 最大値を返却
		return maximumValue;

	}
	
	/*
	*関数名：chooseMaximum
	*概要：配列の要素の最大値を求め返却する。
	*引数：配列(int型)
	*戻り値：最大値の要素の値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/

	public static int chooseMaximum(int[] integerArray) {

		// 最大値をインデックス0に初期化
		int maximumValue = integerArray[0];

		// 配列をインデックス順にその時の最大値と比較
		for (int i = 1; i < integerArray.length; i++) {

			// その要素の値のほうがその時の最大値より大きい場合
			if (integerArray[i] > maximumValue) {

				// 最大値をその要素の値にする
				maximumValue = integerArray[i];

			}

		}

		// 最大値を返却
		return maximumValue;

	}

}
