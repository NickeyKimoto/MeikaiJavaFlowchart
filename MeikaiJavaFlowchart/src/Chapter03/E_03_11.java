package Chapter03;

/*
*クラス名：E_03_11
*概要：読み込んだ二つの整数値の差が10以下か11以上かを調査し表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_11 {
	
	/*
	*関数名：main
	*概要：読み込んだ二つの整数値の差が10以下か11以上かを調査し表示するプログラム
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
		 
		// それらの差が10以下の場合
	    if ((maximumValue - minimumValue) <= 10) {
	    	
	    	// それらの差が10以下であることを表示
		    System.out.print("それらの差は10以下です。");
	    
		// それらの差が11以上の場合
	    } else {
		    	
	    	// それらの差が11以上であることを表示
	    	System.out.print("それらの差は11以上です。");
			    
	    }

	}

}
