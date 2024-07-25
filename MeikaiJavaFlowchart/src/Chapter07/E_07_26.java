package Chapter07;

/*
*クラス名：E_07_26
*概要：配列の指定したインデックスに要素を挿入する
*作成者：N.Kimoto
*作成日：2024/04/24
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_26 {
	
	/*
	*関数名：aryRmvIns0f
	*概要：配列の指定したインデックスに要素を挿入した配列を生成
	*引数：配列(int型), インデックス番号(int型)、代入値(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static int[] arrayIns0f(int[] a, int idx, int x) {

		// 要素を指定するための定数を宣言
		final int ADJUSTMENT_NUMBER = 1;

		// 元の配列に新たな要素を挿入した配列を宣言
		int[] firstArray = new int[a.length + ADJUSTMENT_NUMBER];

		// 挿入した要素に指定した値を代入する
		firstArray[idx] = x;

		// 先ほど宣言した配列に元の配列の挿入要素より前の全要素をコピー
		for (int i = 0; i < idx; i++) {

			// その要素に元の配列の挿入要素より前の要素の値を代入
			firstArray[i] = a[i];

		}

		// 宣言した配列に元の配列の挿入要素より後の全要素をコピー
		for (int i = idx + ADJUSTMENT_NUMBER; i < firstArray.length; i++) {

			// その要素に元の配列の挿入要素より後の要素の値を代入する
			firstArray[i] = a[i - ADJUSTMENT_NUMBER];

		}

		// 要素を挿入した配列を返却
		return firstArray;

	}
	
	/*
	*関数名：main
	*概要：配列の指定したインデックスに要素を挿入する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
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

		// 各要素に値を代入する
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

			// 挿入するインデックス番号の入力を促す
			System.out.print("有効なインデックスを入力してください：");
			// 入力された値を読み込む
			deleteElements = standardInput.nextInt();

		}

		// 挿入する要素に代入する値の入力を促す
		System.out.print("挿入する要素に代入する値：");
		// 入力された値を読み込む
		int assignmentValue = standardInput.nextInt();

		// 指定した要素を挿入した配列の要素を順番に表示
		for (int i = 0; i <= integerVariable; i++) {

			// 要素を表示
			System.out.println("x[" + i + "] = " + arrayIns0f(firstArray, deleteElements, assignmentValue)[i]);

		}

	}

}
