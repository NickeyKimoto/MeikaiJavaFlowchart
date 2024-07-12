package Chapter3;

/*
*クラス名：E_03_07
*概要：読み込まれた正の整数値の3で割ったあまりを検証して表示し、
*正の整数値でない値を読み込むと注意するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_07 {
	
	/*
	*関数名：main
	*概要：読み込まれた正の整数値の3で割ったあまりを検証して表示し、
	*正の整数値でない値を読み込むと注意するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/05
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
													
		// 整数値の入力を促す
		System.out.print("整数値：");
		// 整数値を読み込む
		int integerVariable = standardInput.nextInt();
											
		// 正の整数値が入力された場合
		if (integerVariable > 0) {
			
			// 3で割り切れる場合
			if (integerVariable % 3 == 0) {
				
				// 3で割り切れることを表示
				System.out.print("その値は3で割り切れます。");
		
			// 余りが1の場合
			} else if (integerVariable % 3 == 1) {
				
				// 余りが1であることを表示
				System.out.print("その値を3で割った余りは1です。");
		
			// 余りが2の場合
			} else {
				
				// 余りが2であることを表示
				System.out.print("その値を3で割った余りは2です。");
		
			}
							
		// 正の整数値でない値が入力された場合
		} else {
			
			// 正の整数値でない値が入力されたことを表示
		    System.out.print("正でない値が入力されました。");

		}

	}

}
