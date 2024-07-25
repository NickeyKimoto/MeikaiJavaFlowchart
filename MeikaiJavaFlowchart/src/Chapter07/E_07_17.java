package Chapter07;

/*
*クラス名：E_07_17
*概要：配列aの要素から指定した値を持つ要素を末尾側から探索する
*作成者：N.Kimoto
*作成日：2024/04/22
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_17 {

	/*
	*関数名：linearSearchR
	*概要：配列の全要素から指定した値を持つ要素を末尾側から探索する
	*引数：配列
	*戻り値：該当要素のインデックス
	*作成者：N.Kimoto
	*作成日：2024/04/22
	*/

	static int linearSearchR(int[] a, int findingKey) {

		// 探索に失敗したことを表す定数を宣言
		final int SEARCH_FAILURE = -1;

		// その要素の末尾側から探索する
		for (int i = a.length - 1; i > 0; i--) {

			// 指定した値を持つ要素が見つかった場合
			if (a[i] == findingKey) {

				// その要素のインデックスを返却
				return i;

			}

		}

		// その要素が見つからないことを表す定数を返却
		return SEARCH_FAILURE;

	}
	
	/*
	*関数名：main
	*概要：配列の全要素から指定した値を持つ要素を末尾側から探索する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/22
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 探索に失敗したことをことを表す定数を宣言
		final int SEARCH_FAILURE = -1;

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

		// 探索する値の入力を促す
		System.out.print("探す値：");
		// 入力された値を読み込む
		int findingKey = standardInput.nextInt();

		// 配列でその値を持つ要素を末尾側から探索する
		int indexNumber = linearSearchR(firstArray, findingKey);

		// 配列内にその値が無かった場合
		if (indexNumber == SEARCH_FAILURE) {

			// 配列内にその値が無かったことを表示
			System.out.println("その値の要素は存在しません。");

			// 配列内にその値があった場合
		} else {

			// その要素のインデックスを表示
			System.out.println("その値はx[" + indexNumber + "]にあります。");

		}

	}

}
