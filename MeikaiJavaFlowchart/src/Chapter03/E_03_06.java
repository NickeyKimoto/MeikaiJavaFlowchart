package Chapter03;

/*
*クラス名：E_03_06
*概要：読み込まれた正の整数値が10の倍数かを検証して表示し、
*正の整数値でない値を読み込むと注意するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_06 {
	
	/*
	*関数名：main
	*概要：読み込まれた正の整数値が10の倍数かを検証して表示し、
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
			
			// 10の倍数である場合
			if (integerVariable % 10 == 0) {
				
				// 10の倍数であることを表示
				System.out.print("その値は10の倍数です。");
			
			// 10の倍数でない場合
			} else {
				
				// 10の倍数でない場合
				System.out.print("その値は10の倍数ではありません。");
					
			}
							
		// 正の整数値でない値が入力された場合
		} else {
			
			// 正の整数値でない値が入力されたことを表示
		    System.out.print("正でない値が入力されました。");
			    
		}

	}

}
