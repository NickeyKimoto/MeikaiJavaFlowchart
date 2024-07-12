package Chapter03;

/*
*クラス名：E_03_13
*概要：読み込んだ三つの整数値の中央値を求めて表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_13 {
	
	/*
	*関数名：main
	*概要：読み込んだ三つの整数値の中央値を求めて表示するプログラム
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
		// 三つ目の整数の入力を促し、読み込む
	    System.out.print("整数c："); int thirdVariable = standardInput.nextInt();
			    
		 // 一つ目の整数を最小値として、初期化する
	    int minimumValue = firstVariable;
	    
		// 二つ目の整数の値が初期化された最小値よりも小さい場合
	    if (secondVariable < minimumValue) {
			    	
	    	// 表示する最小値の値に二つ目の整数の値を代入する。
	    	minimumValue = secondVariable;
	    	
	    }
			    
		// 三つ目の値が初期化された最小値よりも小さい場合
	    if (thirdVariable < minimumValue) {
	    	
	    	// 表示する最小値の値に三つ目の整数の値を代入する。
	    	minimumValue = thirdVariable;
	    
	    }
		
	    // 計算前の中央値を宣言する
	    int centerValue = 0;
		    
	    // 一つ目の整数値が最小値の場合
	    if (minimumValue == firstVariable) {
	    	
	    	// 三つ目の整数値より二つ目の整数値のほうが小さい場合
	    	if (secondVariable < thirdVariable) {
	    		
	    		// 中央値は二つ目の整数値である
	    		centerValue = secondVariable;
	    		
			// 二つ目の整数値と三つ目の整数値が同じ値か、三つ目の整数値のほうが小さい場合
	    	} else {
	    		
	    		// 中央値は三つ目の整数値である
		    		centerValue = thirdVariable;
		    		
	    	}
	    	
		// 二つ目の整数値が最小値の場合
	    } else if (minimumValue == secondVariable) {
	    	
	    	// 三つ目の整数値より一つ目の整数値のほうが小さい場合
	    	if (firstVariable < thirdVariable) {
		    		
	    		// 中央値は一つ目の整数値である
	    		centerValue = firstVariable;
		    		
			// 一つ目の整数値と三つ目の整数値が同じ値か、三つ目の整数値のほうが小さい場合
	    	} else {
	    		
	    		// 中央値は三つ目の整数値である
	    		centerValue = thirdVariable;
	    		
	    	}
	    	
		// 三つ目の整数値が最小値の場合
	    } else {
	    	
	    	// 二つ目の整数値より一つ目の整数値のほうが小さい場合
	    	if (firstVariable < secondVariable) {
		    		
	    		// 中央値は一つ目の整数値である
	    		centerValue = firstVariable;
	    		
			// 一つ目の整数値と二つ目の整数値が同じ値か、二つ目の整数値のほうが小さい場合
	    	} else {
		    		
	    		// 中央値は二つ目の整数値である
	    		centerValue = secondVariable;
	    		
	    	}
	    	
	    }
		    
		// 中央値を表示
	    System.out.print("中央値は" + centerValue + "です。");

	}

}
