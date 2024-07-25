package Chapter07;

/*
*クラス名：E_07_07
*概要：入力された値の段数の左下が直角の三角形を表示
*作成者：N.Kimoto
*作成日：2024/04/17
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_07 {

	/*
	*関数名：putChars
	*概要：指定された数の文字を連続表示する
	*引数：個数(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	static void putChars(char c, int n) {

		// 指定回文字を表示する
		while (n-- > 0) {

			// 文字を表示する
			System.out.print(c);

		}

	}

	/*
	*関数名：putStars
	*概要：指定された数の*を連続表示する
	*引数：個数(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	static void putStars(int n) {

		// 指定された数の*を連続表示する
		putChars('*', n);

	}

	/*
	*関数名：main
	*概要：入力された値の段数の左下が直角の三角形を表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// プログラムの内容を表示
		System.out.println("左下直角の三角形を表示します。");
		// 整数の入力を促す()
		System.out.print("段数は：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();
		// 正の整数値以外の値を受け付けないようにする
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();

		}

		// 入力された値の段数の左下が直角の三角形を表示
		for (int i = 1; i <= integerVariable; i++) {

			// その段の段数分*を連続表示する
			putStars(i);
			//改行する
			System.out.println();

		}

	}

}
