package Chapter04;

/*
*クラス名：E_04_08
*概要：正の整数値を読み込み、その桁数を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/08
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_08 {
	
	/*
	*関数名：main
	*概要：正の整数値を読み込み、その桁数を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/08
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値の桁数を求めるための定数を宣言
		final int ADJUSTMENT_NUMBER = 10;
		
		// 入力される整数値を読み込むために宣言
		int integerVariable = 0;
		// 求める桁数を宣言
		int digitNumber = 0;
		
		// 正の整数値の入力を促す
		System.out.print("整数値:");
		// 読み込んだ正の整数値を表示
		integerVariable = standardInput.nextInt();
		
		// 正の整数値が入力されるまで繰り返す
		while (integerVariable <= 0) {
		
			// 正の整数値の入力を促す
			System.out.print("正の整数値以外の値が入力されました。\nもう一度入力してください:");
			// 読み込んだ正の整数値を表示
			integerVariable = standardInput.nextInt();
			
		}
		
		// 0以下になるまで繰り返す
		while (integerVariable > 0) {
			
			// 入力された整数を10ずつ割り、何回割ったかが桁数になる
			integerVariable /= ADJUSTMENT_NUMBER;
			// 何回割ったかカウントする
			digitNumber++;
			
		}
		
		// 桁数の値を表示
		System.out.println("その値は" + digitNumber + "桁です。");

	}

}
