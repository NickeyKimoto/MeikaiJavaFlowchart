package Chapter07;

/*
*クラス名：E_07_21
*概要：二つの配列の全要素の値を交換する
*作成者：N.Kimoto
*作成日：2024/04/23
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_21 {

	/*
	*関数名：aryExchng
	*概要：二つの配列の全要素の値を交換する
	*引数：配列(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	static void aryExchng(int[] a, int[] b) {

		// 配列aの要素数より配列bの要素数のほうが少ない場合
		if (a.length > b.length) {

			// 要素数が少ないほうの要素数分、全要素の値を交換する
			for (int i = 0; i < b.length; i++) {

				// 仮の変数に片方の要素の値を代入
				int assignmentValue = a[i];
				// 先ほど値を代入した要素にもう片方の要素の値を代入
				a[i] = b[i];
				// 一つ前に代入した要素に仮の変数の値を代入
				b[i] = assignmentValue;

			}

			// 二つの配列の要素数が同じ場合か、配列bの要素数より配列aの要素数のほうが少ない場合
		} else {

			// 要素数が少ないほうの要素数分、全要素の値を交換する
			for (int i = 0; i < a.length; i++) {

				// 仮の変数に片方の要素の値を代入
				int assignmentValue = a[i];
				// 先ほど値を代入した要素にもう片方の要素の値を代入
				a[i] = b[i];
				// 一つ前に代入した要素に仮の変数の値を代入
				b[i] = assignmentValue;

			}

		}

	}

	/*
	*関数名：main
	*概要：二つの配列の全要素の値を交換する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 要素数の入力を促す
		System.out.print("配列aの要素数：");
		// 入力された値を読み込む
		int firstVariable = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (firstVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			firstVariable = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言
		int[] firstArray = new int[firstVariable];

		// 各要素に値を入力する
		for (int i = 0; i < firstVariable; i++) {

			// 要素に代入する値の入力を促す
			System.out.print("a[" + i + "]：");
			// 入力された値を読み込む
			firstArray[i] = standardInput.nextInt();

		}

		// 要素数の入力を促す
		System.out.print("配列bの要素数：");
		// 入力された値を読み込む
		int secondVariable = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (secondVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			secondVariable = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言
		int[] secondArray = new int[secondVariable];

		// 各要素に値を入力する
		for (int i = 0; i < secondVariable; i++) {

			// 要素に代入する値の入力を促す
			System.out.print("b[" + i + "]：");
			// 入力された値を読み込む
			secondArray[i] = standardInput.nextInt();

		}

		// 二つの配列の全要素の値を交換する
		aryExchng(firstArray, secondArray);

		// 二つの配列の全要素の値を交換したことを表示
		System.out.println("配列aとbの全要素の値をこうかんしました。");

		// 片方の配列を順に表示
		for (int i = 0; i < firstVariable; i++) {

			// 要素に代入された値の表示
			System.out.print("a[" + i + "] = " + firstArray[i]);
			// 改行
			System.out.println();

		}

		// もう片方の配列を順に表示
		for (int i = 0; i < secondVariable; i++) {

			// 要素に代入された値の表示
			System.out.print("b[" + i + "] = " + secondArray[i]);
			// 改行
			System.out.println();

		}

	}

}
