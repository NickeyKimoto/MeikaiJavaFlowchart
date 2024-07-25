package Chapter07;

/*
*クラス名：E_07_22
*概要：指定された配列と同じ要素数、すべての要素が同じ値を持つ配列を生成する
*作成者：N.Kimoto
*作成日：2024/04/23
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_22 {
	
	/*
	*関数名：arrayClone
	*概要：指定された配列と同じ要素数、すべての要素が同じ値を持つ配列を生成する
	*引数：配列(int型)
	*戻り値：引数の配列と同じ要素数、すべての要素が同じ値を持つ配列(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	static int[] arrayClone(int[] a) {

		// 引数と同じ要素数を持つ配列を生成
		int[] cloneArray = new int[a.length];

		// 各要素に引数の配列と同じ値を代入
		for (int i = 0; i < cloneArray.length; i++) {

			// その要素と同じインデックスの要素の値を代入
			cloneArray[i] = a[i];

		}

		// 複製した配列を返却
		return cloneArray;

	}
	
	/*
	*関数名：main
	*概要：指定された配列と同じ要素数、すべての要素が同じ値を持つ配列を生成し表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 要素数の入力を促す
		System.out.print("要素数は：");
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
			System.out.print("a[" + i + "]：");
			// 入力された値を読み込む
			firstArray[i] = standardInput.nextInt();

		}
		
		// 配列を複製したことを表示
		System.out.println("配列を複製しました。" );

		// 複製した配列を順に表示
		for (int i = 0; i < integerVariable; i++) {

			// 複製した配列の各要素を表示
			System.out.println("cloneArray[" + i + "] = " + arrayClone(firstArray)[i]);

		}

	}

}
