package Chapter03;

/*
*クラス名：E_03_01
*概要：読み込んだ整数値の絶対値を求めて表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_01 {
	
	/*
	*関数名：main
	*概要：読み込んだ整数値の絶対値を求めて表示する
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
					
		// もしも読み込んだ整数値が負の値の場合
		if (integerVariable < 0) {
			
			// 絶対値を求めて表示
		    System.out.println("その絶対値は" + (integerVariable * -1) + "です。");
			
	    // 読み込んだ整数値が負の値以外の場合
		} else {
			
			// 読み込んだ整数値をそのまま表示
			System.out.println("その絶対値は" + integerVariable + "です。");
			
		}

	}

}