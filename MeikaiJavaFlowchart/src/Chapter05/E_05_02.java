package Chapter05;

/*
*クラス名：E_05_02
*概要：float型の変数とdouble型の変数を読み込み表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/11
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_05_02 {

	/*
	*関数名：main
	*概要：float型の変数とdouble型の変数を読み込み表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/11
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// プログラムの内容を説明
		System.out.println("変数xはfloat型で、変数yはdouble型です。");

		// 実数値の入力を促す
		System.out.print("x：");
		// 入力された実数値を読み込む
		float x = standardInput.nextFloat();
		// 実数値の入力を促す
		System.out.print("y：");
		// 入力された実数値を読み込む
		double y = standardInput.nextDouble();
		
		// xに入力された実数値をfloat型で表示する
		System.out.println("x = " + x);
		// yに入力された実数値をdouble型で表示する
		System.out.println("y = " + y);

	}

}
