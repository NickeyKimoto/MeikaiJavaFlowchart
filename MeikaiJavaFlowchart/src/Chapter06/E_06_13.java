package Chapter06;

/*
*クラス名：E_06_13
*概要：配列aの全要素を配列bに対して逆順にコピーするプログラム
*作成者：N.Kimoto
*作成日：2024/04/15
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_13 {
	
	/*
	*関数名：main
	*概要：配列aの全要素を配列bに対して逆順にコピーする
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/15
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 配列aを逆順に表示するための定数を宣言
		final int SPECIFIED_NUMBER = 1;

		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力された要素数を読み込む
		int integerVariable = standardInput.nextInt();

		// 正の整数値以外の値を受け付けないようにする
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();
			
		}
		
		// 入力された要素数を持つ配列を宣言する(教本準拠のため配列a)
		int[] a = new int[integerVariable];
		// 入力された要素数を持つ配列を宣言する(教本準拠のため配列b)
		int[] b = new int[integerVariable];

		// 配列aに値を読み込む
		for (int i = 0; i < integerVariable; i++) {

			// その要素に代入する値の入力を促す
			System.out.print("a[" + i + "] = ");
			// 入力された値を読み込む
			a[i] = standardInput.nextInt();

		}

		// 配列aの全要素を配列bに逆順にコピー
		for (int i = 0; i < integerVariable; i++) {

			// 配列bの要素に配列aの末尾側の値を代入
			b[i] = a[integerVariable - i - SPECIFIED_NUMBER];

		}

		// プログラムの内容を表示
		System.out.println("aの全要素をbにコピーしました。");

		// 配列bの全要素を表示
		for (int i = 0; i < integerVariable; i++) {

			// 配列bの全要素を表示
			System.out.println("b[" + i + "] = " + b[i]);

		}

	}

}
