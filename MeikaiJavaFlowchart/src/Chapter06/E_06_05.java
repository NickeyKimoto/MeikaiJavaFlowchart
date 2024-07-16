package Chapter06;

/*
*クラス名：E_06_05
*概要：配列の要素数と個々の要素の値を読み込んで表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/12
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_05 {

	/*
	*関数名：main
	*概要：配列の要素数と個々の要素の値を読み込んで表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/12
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 最後の値を出力後、表記をなくすための定数を宣言
		final int eliminationCharacter = 1;

		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力された要素数を読み込む
		int integerVariable = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 読み込んだ正の整数値を表示
			integerVariable = standardInput.nextInt();

		}

		// 入力された要素数を持つ配列を生成(教本の表記準拠で配列名はa)
		int[] a = new int[integerVariable];

		// 各要素に値を代入する
		for (int i = 0; i < integerVariable; i++) {

			// 値を入力する対象要素を表示
			System.out.print("a[" + (i) + "] = ");

			// 要素に入力した値を代入
			a[i] = standardInput.nextInt();

		}

		// 改行
		System.out.println();
		// 表示形式を初期化子と同じにそろえる
		System.out.print("a = {");

		// /配列の各要素の値を表示
		for (int i = 0; i < integerVariable; i++) {

			// 要素の値を表示
			System.out.print(a[i]);

			// その要素の後に要素が続かない場合
			if (i == integerVariable - eliminationCharacter) {

				// コンマで区切らない
				break;

			}

			// コンマで区切る
			System.out.print(", ");

		}

		// 表示形式を初期化子と同じにそろえる
		System.out.println("}");

	}

}
