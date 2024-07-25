package Chapter07;

/*
*クラス名：E_07_04
*概要：1からnまでの全整数の和を求める
*作成者：N.Kimoto
*作成日：2024/04/17
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_04 {
	
	/*
	*関数名：sumUp
	*概要：1からint型の引数nのまでの全整数の和を返却
	*引数：n(int型)
	*戻り値：1からnまでの全整数の和
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	static int sumUp(int n) {

		// 全整数の和を初期化
		int totalValue = 0;

		// nが正の整数値の場合
		if (n > 0) {
		
		// 1からnまで順に加算する
		for (int i = 1; i <= n; i++) {

			// 合計値に加算する
			totalValue += i;

		}
		
		// nが負の整数値の場合
		} else if(n < 0) {
			
			// 1からnまで順に加算する(iはデクリメントする)
			for (int i = 1; i >= n; i--) {

				// 合計値に加算する
				totalValue += i;

			}
			
		// nが0の場合
		} else {
			
			// 合計値は1である
			totalValue = 1;
			
		}

		// 求めた全整数の和を返却する
		return totalValue;

	}
	
	/*
	*関数名：main
	*概要：1からnまでの全整数の和を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 整数の入力を促す()
		System.out.print("整数：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();

		// 1からnまでの全整数の和を表示する
		System.out.println("1からnまでの全整数の和は" + sumUp(integerVariable) + "です。");

	}

}
