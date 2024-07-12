package Chapter3;

/*
*クラス名：E_03_03
*概要：List3-5の最後のelseを、else if (n == 0)に変更した場合の検証
*作成者：N.Kimoto
*作成日：2024/04/05
*/

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_03 {
	
	/*
	*関数名：main
	*概要：List3-5の最後のelseを、else if (n == 0)に変更した場合の検証
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
		// 整数値を読み込む（教本準拠のためn）
		int n = standardInput.nextInt();
							
		// 読み込んだ整数値の符号が正の場合
		if (n > 0) {
			
			// 読み込んだ整数値の符号が正であることを表示
			System.out.print("その値は正です。");
			
		// 読み込んだ整数値の符号が負の場合
		} else if (n < 0) {
			
			// 読み込んだ整数値の符号が負であることを表示
		    System.out.print("その値は負です。");
		    
		// 読み込んだ整数値が0の場合
		} else if (n == 0) {
			
			// 読み込んだ整数値が０であることを表示
			System.out.print("その値は０です。");
			
		}
		
		// 0を入力すると『その値は０です』と表示される。

	}

}
