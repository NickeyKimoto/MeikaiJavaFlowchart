package Chapter04;

/*
*クラス名：E_04_21_A
*概要：*で作られた左上側が直角の直角三角形を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_21_A {
	
	/*
	*関数名：main
	*概要：*で作られた左上側が直角の直角三角形を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/09
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 段数の入力を促す
		System.out.print("段数は：");
		// 入力された値を読み込む
		int triangleHeight = standardInput.nextInt();
		
		// 正の整数値が入力されるまで繰り返す
		while (triangleHeight <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 読み込んだ正の整数値を表示
			triangleHeight = standardInput.nextInt();

		}

		// 段数分繰り返す
		for (int i = 0; i < triangleHeight; i++) {

			// その行で(段数-出力してる段)回繰り返す
			for (int j = triangleHeight - i; j >= 1; j--) {

				// *を表示する
				System.out.print('*');

			}
				
			// 次の段に進む
			System.out.println();

		}

	}

}
