package Chapter07;

/*
*クラス名：E_07_09
*概要：正の整数値をキーボードから読み込み、0か負の整数の場合やり直させる
*作成者：N.Kimoto
*作成日：2024/04/18
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_09 {

	// 引数で標準入力System.inを指定
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：readplusInt
	*概要：正の整数値をキーボードから読み込み返却し、0か負の整数の場合やり直させる。
	*引数：なし
	*戻り値：正の整数値
	*作成者：N.Kimoto
	*作成日：2024/04/18
	*/

	static int readplusInt() {

		// 正の整数の入力を促す
		System.out.print("正の整数値：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();
		
		// 正の整数値を入力するまで繰り返す
		while (integerVariable <= 0) {
			
			// 整数の入力を促す
			System.out.print("正の整数値：");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();
			
		}
		
		// 読み込んだ整数値を返却する
		return integerVariable;

	}
	
	/*
	*関数名：main
	*概要：正の整数を入力させる
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/18
	*/


	public static void main(String[] args) {

		// 正の整数を入力させる
		readplusInt();

	}

}
