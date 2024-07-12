package Chapter04;

/*
*クラス名：E_04_13
*概要：1からnまでの和を求めるList4-10をfor文で実現する
*作成者：N.Kimoto
*作成日：2024/04/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_13 {

	/*
	*関数名：main
	*概要：1からnまでの和を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/09
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// プログラムの説明を表示
		System.out.println("1からnまでの和を求めます。");
		// nの値となる変数を初期化(教本準拠のため変数n)
		int n = 0;

		// 正の整数値を入力させる
		do {

			// nの値の入力を促す
			System.out.print("nの値:");
			// 入力された値を読み込む
			n = standardInput.nextInt();

			// 正の整数値が入力されるまで繰り返す
		} while (n <= 0);

		// 教本準拠のため正の整数値以外の入力に対するコメント無し

		// 求める合計となる変数を初期化(教本準拠のため変数sum)
		int sum = 0;

		// iがnになるまで繰り返す
		for (int i = 1; i <= n; i++) {
			
			// 元の数に一つ増えた数を加える
			sum = sum+= i;
			
		}
		
		// 合計の結果を表示する
		System.out.println("1から" + n + "までの和は" + sum + "です。");

	}

}
