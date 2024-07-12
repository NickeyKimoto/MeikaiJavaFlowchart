package Chapter3;

/*
*クラス名：E_03_10
*概要：読み込んだ二つの整数値の差を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_10 {
	
	/*
	*関数名：main
	*概要：読み込んだ二つの整数値の差を表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/05
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
										
		// 一つ目の整数の入力を促し、読み込む
		System.out.print("整数a："); int firstVariable = standardInput.nextInt();
		// 二つ目の整数の入力を促し、読み込む
	    System.out.print("整数b："); int secondVariable = standardInput.nextInt();
	    
	    // 大きいほうの値を調査
	    int maximumValue = firstVariable > secondVariable ? firstVariable : secondVariable;
		// 小さいほうの値を調査
	    int minimumValue = firstVariable < secondVariable ? firstVariable : secondVariable;
		 
		// 大きいほうの値から小さいほうの値を引いて差を表示
    	System.out.print("二つの整数値の差は" + (maximumValue - minimumValue) + "です。");

	}

}
