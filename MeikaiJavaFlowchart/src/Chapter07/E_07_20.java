package Chapter07;

/*
*クラス名：E_07_20
*概要：配列の指定したインデックスに要素を挿入する
*作成者：N.Kimoto
*作成日：2024/04/23
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_20 {
	
	/*
	*関数名：aryRmvIns
	*概要：配列の指定したインデックスに要素を挿入する
	*引数：配列(int型), インデックス番号(int型)、代入値(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	static void aryIns(int[] a, int idx, int x) {

		// 要素を指定するための定数を宣言
		final int ADJUSTMENT_NUMBER = 1;

		// 指定したインデックスまで、最も後ろの要素にひとつ前の要素を順に代入する
		for (int i = a.length - ADJUSTMENT_NUMBER; i > idx; i--) {

			// その要素に前の要素の値を代入する
			a[i] = a[i - ADJUSTMENT_NUMBER];

		}

		// 指定した要素に指定した値を代入する
		a[idx] = x;

	}

	/*
	*関数名：main
	*概要：配列の指定したインデックスに要素を挿入する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/
	
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

		// 各要素に値を入力する
		for (int i = 0; i < integerVariable; i++) {

			// 要素に代入する値の入力を促す
			System.out.print("x[" + i + "]：");
			// 入力された値を読み込む
			firstArray[i] = standardInput.nextInt();

		}

		// 挿入するインデックス番号の入力を促す
		System.out.print("挿入するインデックス：");
		// 入力された値を読み込む
		int deleteElements = standardInput.nextInt();

		// 負の整数値や存在しないインデックスが入力された場合
		while (deleteElements < 0 || deleteElements >= firstArray.length) {

			// 消去する要素のインデックスの入力を促す
			System.out.print("有効なインデックスを入力してください：");
			// 入力された値を読み込む
			deleteElements = standardInput.nextInt();

		}

		// 挿入する要素に代入する値の入力を促す
		System.out.print("挿入する要素に代入する値：");
		// 入力された値を読み込む
		int assignmentValue = standardInput.nextInt();

		// 配列に指定した要素を挿入する
		aryIns(firstArray, deleteElements, assignmentValue);

		// 指定した要素を挿入した配列の要素を順番に表示
		for (int i = 0; i < integerVariable; i++) {

			// 要素を表示
			System.out.println("x[" + i + "] = " + firstArray[i]);

		}

	}

}
