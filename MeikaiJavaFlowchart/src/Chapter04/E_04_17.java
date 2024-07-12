package Chapter04;

/*
*クラス名：E_04_17
*概要：読み込んだ整数値のすべての約数を表示するList4-13を、
*約数の個数が出力されるようにするプログラム
*作成者：N.Kimoto
*作成日：2024/04/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_17 {

	/*
	*関数名：main
	*概要：読み込んだ整数値のすべての約数を表示するList4-13を、
	*約数の個数が出力されるようにするプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/09
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値の値の入力を促す
		System.out.print("整数値：");
		// 入力された値を読み込む(教本準拠のため変数はn)
		int n = standardInput.nextInt();
		
		// 教本準拠のため正の整数値でない場合の処理は行わない
		
		// 約数の個数を表示するために宣言
		int divisorCount = 0;

		// nの約数を1からnまで確かめる
		for (int i = 1; i <= n; i++) {
			
			// iがnの約数である場合
			if (n % i == 0) { // 割り切れたら
				
				// 約数を表示
				System.out.println(i); // 表示
				
				// 約数をカウントする
				divisorCount++;
				
			}
			
		}
		
		// 数えた約数の個数を表示
		System.out.println("約数は" + divisorCount + "個です。");

	}

}
