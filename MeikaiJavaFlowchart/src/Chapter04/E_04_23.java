package Chapter04;

/*
*クラス名：E_04_23
*概要：数字で作られたn段のピラミッドを表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/10
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_23 {

	/*
	*関数名：main
	*概要：数字で作られたn段のピラミッドを表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/10
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 段数ごとの*の数を調整するための式に使用する定数を宣言(1)
		final int FIRST_CONSTANT = 1;
		// 段数ごとの*の数を調整するための式に使用する定数を宣言(2)
		final int SECOND_CONSTANT = 2;
		// 下一桁を求める式にしようする定数を宣言(3)
		final int THIRD_CONSTANT = 10;

		// 段数の入力を促す
		System.out.print("段数は：");
		// 正の整数値を読み込む
		int triangleHeight = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (triangleHeight <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 読み込んだ正の整数値を表示
			triangleHeight = standardInput.nextInt();

		}

		// 段数分*の表示を繰り返す
		for (int i = 1; i <= triangleHeight; i++) {

			// その行で(段数-出力してる段)回繰り返す(6段の4段目なら6-4=2個表示)
			for (int j = triangleHeight - i; j >= 1; j--) {

				// 空白を表示する
				System.out.print(' ');

			}

			// その行で段数回分繰り返す(6段の4段目なら(4-1)*2+1=7個表示)
			for (int k = 1; k <= (i - FIRST_CONSTANT) * SECOND_CONSTANT + FIRST_CONSTANT; k++) {

				// その段の数字の下一桁を表示する
				System.out.print(i % THIRD_CONSTANT);

			}

			// 改行する
			System.out.println();

		}

	}

}