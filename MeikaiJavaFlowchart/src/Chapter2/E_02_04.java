package Chapter2;

/*
*クラス名：E_02_04
*概要：入力された値に10を加えた値と10を減じた値を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/04
*/
	
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_02_04 {
	
	/*
	*関数名：main
	*概要：入力された値に10を加えた値と10を減じた値を表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値の入力を促す
		System.out.print("整数値：");
		// 入力された整数値を読み込む
		int firstVariable = standardInput.nextInt();
		
		// 入力された値に10を加えた値を表示
		System.out.println("10を加えた値は" + (firstVariable + 10) + "です。");
		
		// 入力された値に10を減じた値を表示
		System.out.println("10を減じた値は" + (firstVariable - 10) + "です。");

	}

}
