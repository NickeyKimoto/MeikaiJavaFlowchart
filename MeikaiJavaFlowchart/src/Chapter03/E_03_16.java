package Chapter03;

/*
*クラス名：E_03_16
*概要：三つの整数値を読み込んで昇順（小さい順）にソートするプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_16 {
	
	/*
	*関数名：main
	*概要：三つの整数値を読み込んで昇順（小さい順）にソートするプログラム
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
		    
		// 一つ目の整数が最小値だった場合
	    if (minimumValue == firstVariable) {
	    	
	    	// 二つ目の整数より三つ目の整数のほうが小さい場合
	    	if (secondVariable > thirdVariable) {
	    		
	    		// 二つ目の整数と三つ目の整数を交換するため、仮の変数に二つ目の整数を代入する
		    	int firstAssignment = secondVariable;
		    	// 二つ目の整数に三つ目の整数を置き換える
		    	secondVariable = thirdVariable;
		    	// 三つ目の整数に、置き換えておいた二つ目の整数を置き換える
		    	thirdVariable = firstAssignment;
		    	
	    	}
		    	
		// 二つ目の整数が最小値だった場合
	    } else if (minimumValue == secondVariable) {
	    	
	    	// 三つ目の整数より一つ目の整数のほうが小さい場合
	    	if (thirdVariable > firstVariable) {
	    		
	    		// 一つ目の整数と二つ目の整数を交換するため、仮の変数に一つ目の整数を代入する
	    		int secondAssignment = firstVariable;
	    		// 一つ目の整数に二つ目の整数を置き換える
	    		firstVariable = secondVariable;
	    		// 二つ目の整数に、置き換えておいた一つ目の整数を置き換える
	    		secondVariable = secondAssignment;
	    		
	        // 一つ目の整数より三つ目の整数のほうが小さい場合、もしくは値が同じ場合
	    	} else {
	    		
	    		// 三つの整数の値を交換するため、仮の変数に一つ目の整数を代入する
	    		int secondAssignment = firstVariable;
	    		// 空になった場所に二つ目の整数を置き換える
	    		firstVariable = secondVariable;
	    		// 二つ目の整数がもともとあった場所に三つ目の整数を置き換える
	    		secondVariable = thirdVariable;
	    		// 三つ目の整数に、置き換えておいた一つ目の整数を置き換える
	    		thirdVariable = secondAssignment;
	    		
	    	}
		    
    	// 二つ目の整数が最小値だった場合
	    } else {
	    	
	    	// 二つ目の整数より一つ目の整数のほうが小さい場合
	        if (secondVariable > firstVariable) {
	        	
	        	// 三つの整数の値を交換するため、仮の変数に一つ目の整数を代入する
	        	int thirdAssignment = firstVariable;
	        	// 一つ目の整数に三つ目の整数を置き換える
	        	firstVariable = thirdVariable;
	        	// 三つ目の整数がもともとあった場所に二つ目の整数を置き換える
	        	thirdVariable = secondVariable;
	        	// 二つ目の整数に、置き換えておいた一つ目の整数を置き換える
	        	secondVariable = thirdAssignment;
	        	
        	// 二つ目の整数より一つ目の整数のほうが小さい場合、もしくは値が同じ場合
	        } else {
	        	
	        	// 一つ目の整数と三つ目の整数を交換するため、仮の変数に一つ目の整数を代入する
	        	int thirdAssignment = firstVariable;
	        	// 空になった場所に三つ目の整数を置き換える
	        	firstVariable = thirdVariable;
	        	// 三つ目の整数に、置き換えておいた一つ目の整数を置き換える
	        	thirdVariable = thirdAssignment;
	        	
	        }
	    	
	    }
		    
	    // ソートしたことを表示
	    System.out.println("a≦b≦cとなるようにソートしました。");
		// 一番小さい整数を表示
	    System.out.println("変数aは" + firstVariable + "です。");
	    // 二番目に小さい整数を表示
	    System.out.println("変数bは" + secondVariable + "です。");
	    // 三番目に小さい整数を表示
	    System.out.println("変数cは" + thirdVariable + "です。");

	}

}