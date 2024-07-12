package Chapter04;

/*
*クラス名：E_04_18
*概要：1からnまでの整数値の2乗値を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_18 {

	/*
	*関数名：main
	*概要：1からnまでの整数値の2乗値を表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/09
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 整数値の値の入力を促す
		System.out.print("nの値：");
		// 入力された値を読み込む(教本準拠のため変数はn)
		int n = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (n <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 読み込んだ正の整数値を表示
			n = standardInput.nextInt();

		}
		
		// 1からnまで繰り返す
		for (int i = 1; i <= n; i ++) {
			
			// 1からnまでの値の2乗値を表示する
			System.out.println(i + "の2乗は" + i * i);
			
		}
	}

}
