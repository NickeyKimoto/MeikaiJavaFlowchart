package Chapter06;

/*
*クラス名：E_06_16
*概要：4行3列の行列と3行4列の行列の積を求めるプログラム
*作成者：N.Kimoto
*作成日：2024/04/16
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_16 {
	
	/*
	*関数名：main
	*概要：4行3列の行列と3行4列の行列の積を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/16
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 配列の要素を指定する定数を宣言(1)
		final int FIRST_CONSTANT = 0;
		// 配列の要素を指定する定数を宣言(2)
		final int SECOND_CONSTANT = 1;
		// 配列の要素を指定する定数を宣言(3)
		final int THIRD_CONSTANT = 2;
		// 配列の列や行を指定する定数を宣言(1)
		final int CONSTANT_TREE = 3;
		// 配列の列や行を指定する定数を宣言(1)
		final int CONSTANT_FOUR = 4;
		
		// 4行3列の行列を宣言
		int[][] firstArray = new int[CONSTANT_FOUR][CONSTANT_TREE];
		// 3行4列の行列を宣言
		int[][] secondArray = new int[CONSTANT_TREE][CONSTANT_FOUR];
		// それぞれの配列の積を代入する行列を宣言
		int[][] thirdArray = new int[CONSTANT_FOUR][CONSTANT_FOUR];

		// 行列aの要素に代入する値の入力を促す
		System.out.println("配列a：");

		// 1行目から代入する
		for (int i = 0; i < CONSTANT_FOUR; i++) {

			// 1列目から代入する
			for (int j = 0; j < CONSTANT_TREE; j++) {

				
				// 値の入力を促す
				System.out.print("a[" + i + "][" + j + "] = ");
				// 入力された値を読み込む
				firstArray[i][j] = standardInput.nextInt();

			}

			// 改行する
			System.out.println();

		}

		// 改行する
		System.out.println();

		// 行列bの要素に代入する値の入力を促す
		System.out.println("配列b：");

		// 1行目から代入する
		for (int i = 0; i < CONSTANT_TREE; i++) {

			// 1列目から代入する
			for (int j = 0; j < CONSTANT_FOUR; j++) {

				// 値の入力を促す
				System.out.print("b[" + i + "][" + j + "] = ");
				// 入力された値を読み込む
				secondArray[i][j] = standardInput.nextInt();

			}

			// 改行する
			System.out.println();

		}

		// 改行する
		System.out.println();

		// 行列aと行列bの積を表示
		System.out.println("配列a * b：");

		// 1行目から表示する
		for (int i = 0; i < CONSTANT_FOUR; i++) {

			// 1列目から表示する
			for (int j = 0; j < CONSTANT_FOUR; j++) {

				// 行列aでは行数を固定、行列bでは列数を固定し、指定された行と列のそれぞれの値をかけたものを足す
				thirdArray[i][j] = firstArray[i][FIRST_CONSTANT] * secondArray[FIRST_CONSTANT][j]
				+ firstArray[i][SECOND_CONSTANT] * secondArray[SECOND_CONSTANT][j]
				+ firstArray[i][THIRD_CONSTANT] * secondArray[THIRD_CONSTANT][j];

				// 少なくとも4マスで要素の値を表示
				System.out.printf("%4d", thirdArray[i][j]);

			}

			// 改行する
			System.out.println();

		}

	}

}
