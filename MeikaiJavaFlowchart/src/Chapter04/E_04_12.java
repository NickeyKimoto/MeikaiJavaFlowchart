package Chapter04;

/*
*クラス名：E_04_12
*概要：正の整数値を０からカウントアップするプログラム
*作成者：N.Kimoto
*作成日：2024/04/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_12 {

	/*
	*関数名：main
	*概要：正の整数値を０からカウントアップする
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/09
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// カウントダウンすることを表示する
		System.out.println("カウントアップします。");
		
		// 正の整数値の入力を促す
		System.out.print("正の整数値：");
		// 入力された正の整数値を読み込み表示
		int integerVariable = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("不正な値が入力されました。\nもう一度入力してください:");
			// 読み込んだ正の整数値を表示
			integerVariable = standardInput.nextInt();

		}

		// xが0になるまで繰り返す
		for (int i = 0; i <= integerVariable; i++) {

			// xの値を表示
			System.out.println(i);

		}

	}

}
