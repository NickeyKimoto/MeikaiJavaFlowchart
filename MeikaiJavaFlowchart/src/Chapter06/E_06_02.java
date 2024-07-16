package Chapter06;

/*
*クラス名：E_06_02
*概要：要素型がint型で要素数が5の配列に対し、先頭から順に5,4,3,2,1を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/11
*/

public class E_06_02 {

	/*
	*関数名：main
	*概要：要素型がint型で要素数が5の配列に対し、先頭から順に5,4,3,2,1を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/11
	*/

	public static void main(String[] args) {
		
		// 5～1の順に値を表示するための計算に必要な定数を宣言
		final int SPECIFIED_NUMBER = 5;
		// 配列の要素数の定数を宣言
		final int ELEMENTS_COUNT = 5;
		
		// int型で要素数が5の配列を宣言
		int[] firstArray = new int[ELEMENTS_COUNT];
		
		// 先頭から要素内の値を計算し代入する
		for (int i = 0; i < firstArray.length; i++) {

			// 値を計算し代入する
			firstArray[i] = SPECIFIED_NUMBER - i;

		}

		// 要素ごとに代入された値を要素順に表示
		for (int i = 0; i < firstArray.length; i++) {

			// その要素に代入された値を表示
			System.out.println("a[" + i + "] = " + firstArray[i]);
			
		}

	}

}
