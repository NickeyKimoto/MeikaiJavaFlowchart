package Chapter04;

/*
*クラス名：E_04_11
*概要：正の整数値を０までカウントダウンするList4-4をfor文で実現する
*作成者：N.Kimoto
*作成日：2024/04/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_11 {

	/*
	*関数名：main
	*概要：正の整数値を０までカウントダウンする
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/09
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// カウントダウンすることを表示する
		System.out.println("カウントダウンします。");
		// xを初期化する(教本準拠のため変数x)
		int x;

		// 繰り返される範囲、ループ本体
		do {
			// 正の整数値の入力を促す
			System.out.print("正の整数値：");
			// 入力された正の整数値を読み込む
			x = standardInput.nextInt();

		// xが正の整数値になるまで繰り返す
		} while (x <= 0);
		
		// 教本準拠のため正の整数値以外の入力に対するコメント無し
		
		
		// xが0になるまで表示を繰り返す
		for (int i = x; i >= 0; i--) {
			
			// xの値を表示
			System.out.println(i);
			
		}

	}

}
