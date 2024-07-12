package Chapter03;

/*
*クラス名：E_03_09
*概要：読み込んだ二つの実数値の大きいほうの値を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_09 {
	
	/*
	*関数名：main
	*概要：読み込んだ二つの実数値の大きいほうの値を表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/05
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
												
		// 一つ目の実数の入力を促し、読み込む
		System.out.print("実数a："); double firstVariable = standardInput.nextDouble();
		// 二つ目の実数の入力を促し、読み込む
	    System.out.print("実数b："); double secondVariable = standardInput.nextDouble();
		    
		// 大きいほうの実数を調査
	    double maximumValue = firstVariable > secondVariable ? firstVariable : secondVariable;
		 
		 // 大きいほうの実数を表示
	    System.out.print("大きいほうの値は" + maximumValue + "です。");

	}

}
