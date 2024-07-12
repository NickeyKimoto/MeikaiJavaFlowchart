package Chapter3;

/*
*クラス名：E_03_04
*概要：二つの整数値を読み込み、大きさを比較するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_04 {
	
	/*
	*関数名：main
	*概要：二つの整数値を読み込み、大きさを比較するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/05
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
							
		// 一つ目の整数の入力を促し読み込む
		System.out.print("整数a："); int firstVariable = standardInput.nextInt();
		// 二つ目の整数の入力を促し読み込む
		System.out.print("整数b："); int secondVariable = standardInput.nextInt();
					
		// 二つ目の整数より一つ目の整数のほうが大きい場合
		if (firstVariable > secondVariable) {
			
			// 二つ目の整数より一つ目の整数のほうが大きいことを表示
			System.out.println("aのほうが大きいです。");
			
		// 一つ目の整数より二つ目の整数のほうが大きい場合
		} else if (firstVariable < secondVariable) {
			
			// 一つ目の整数より二つ目の整数のほうが大きいことを表示
			System.out.println("bのほうが大きいです。");
			
		// 一つ目の整数と二つ目の整数が同じ値の場合
		} else if (firstVariable == secondVariable) {
			
			// 一つ目の整数と二つ目の整数が同じ値であることを表示
			System.out.println("aとbは同じ値です。");
			
		}
		
	}

}
