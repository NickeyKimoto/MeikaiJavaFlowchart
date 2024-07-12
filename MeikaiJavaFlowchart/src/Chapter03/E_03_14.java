package Chapter03;

/*
*クラス名：E_03_14
*概要：二つの整数値の小さいほうの値と大きいほうの値を求めて表示し、
*等しい場合は『二つの値は同じです』と表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_14 {
	
	/*
	*関数名：main
	*概要：二つの整数値の小さいほうの値と大きいほうの値を求めて表示し、
	*等しい場合は『二つの値は同じです』と表示するプログラム
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
		    
	    // 一つ目の整数値と二つ目の整数値が等しい場合
	    if (firstVariable == secondVariable) {
	    	
	    	// 値が同じであることを表示
		    System.out.println("二つの値は同じです。");
		    
		// 一つ目の整数値と二つ目の整数値が異なる場合 
		} else {
			
			// 小さいほうの値を二つ目の整数、大きいほうの値を一つ目の整数として初期化
		    int minimumValue = secondVariable, maximumValue = firstVariable;
		    
			// 一つ目の整数値が二つ目の整数値より小さい場合
		    if(firstVariable < secondVariable) {
		    	
		    	// 最小値は一つ目の整数値
		    	minimumValue = firstVariable;
		    	// 最大値は二つ目の整数値
		    	maximumValue = secondVariable;
		
		    }
		    
		    // 最小値を表示
		    System.out.println("小さいほうの値は" + minimumValue + "です。");
		    // 最大値を表示
		    System.out.println("大きいほうの値は" + maximumValue + "です。");
		    
		}   

	}

}
