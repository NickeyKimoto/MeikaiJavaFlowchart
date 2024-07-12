package Chapter04;

/*
*クラス名：E_04_03
*概要：二つの整数値を読み込んで小さいほうの値から順に大きいほうの
*整数値まで表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/08
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_03 {
	
	/*
	*関数名：main
	*概要：二つの整数値を読み込んで小さいほうの値から順に大きいほうの
	*整数値まで表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/08
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner stdstandardInput = new Scanner(System.in);
		
		// 整数aの入力を促す
		System.out.print("整数a：");
		// 入力された整数aを読み込む
		int firstVariable = stdstandardInput.nextInt();
		// 整数bの入力を促す
	    System.out.print("整数b：");
	    // 入力された整数bを読み込む
	    int secondVariable = stdstandardInput.nextInt();
	    
	    // 最大値を初期化
	    int maximumValue = 0;
	    // 最小値を初期化
	    int minimumValue = 0;
	    
		// 整数aが整数bより大きい場合
	    if(firstVariable > secondVariable) {
	    	
	    	// 最大値は整数aである
	    	maximumValue = firstVariable;
	    	// 最小値は整数bである
	    	minimumValue = secondVariable;
	    	
    	// 整数bが整数aより大きい場合とどちらも同じ値の場合
	    } else {
	    	
	    	// 最大値は整数bである
	    	maximumValue = secondVariable;
	    	// 最小値は整数aである
	    	minimumValue = firstVariable;
	    }
	    
	    // 最小値を表示
	    System.out.print(minimumValue + " ");
	    
	    // 表示された値が最大値になってない場合
	    if (minimumValue != maximumValue) {
	    
	    	// 最大値と同じ値になるまで
		    do {
		    	
		    	// 最小値に1を加える
		    	minimumValue = minimumValue + 1;
		    	// 次の数字を表示
		    	System.out.print(minimumValue + " ");
		    	
	    	// 最大値と同じ値になるまで繰り返す
		    } while (minimumValue != maximumValue);
		    
	    }
	    	

	}

}
