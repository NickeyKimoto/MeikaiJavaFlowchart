package Chapter3;

/*
*クラス名：E_03_02
*概要：二つの整数値A,Bを読み込み、BがAの約数かどうかを表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_02 {
	
	/*
	*関数名：main
	*概要：二つの整数値A,Bを読み込み、BがAの約数かどうかを表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/05
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
							
		// 正の整数Aの入力を促し読み込む
		System.out.print("整数A："); int firstVariable = standardInput.nextInt();
		// 正の整数Bの入力を促し読み込む
		System.out.print("整数B："); int secondVariable = standardInput.nextInt();
		
		// 二つの正の整数値が入力された場合
		if (firstVariable > 0 && secondVariable > 0) {
		
			// もしもBがAの約数の場合
			if (firstVariable % secondVariable == 0) {
				
				// BがAの約数であることを表示
				System.out.println("BはAの約数です。");
				
			// BがAの約数でない場合
			} else {
				
				// BがAの約数でないことを表示
				System.out.println("BはAの約数ではありません。");
				
			}
			
			// どちらかが正の整数値でない値が入力された場合
		} else {
						
			// 正の整数値でない値が入力されたことを表示
			System.out.print("正でない値が入力されました。");
							
		}

	}

}
