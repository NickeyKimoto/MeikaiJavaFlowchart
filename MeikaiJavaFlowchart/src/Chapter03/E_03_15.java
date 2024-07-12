package Chapter03;

/*
*クラス名：E_03_15
*概要：二つの整数値を読み込んで降順（大きい順）にソートするプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_15 {
	
	/*
	*関数名：main
	*概要：二つの整数値を読み込んで降順（大きい順）にソートするプログラム
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
	    
	    // 一つ目の整数が二つ目の整数より小さい場合
	    if (firstVariable < secondVariable) {
	    	
	    	// それぞれの値を交換するために仮の変数に一つ目の整数を代入する
	    	int assignmentValue = firstVariable;
	    	// 一つ目の整数に二つ目の整数を置き換える
	    	firstVariable = secondVariable;
	    	// 二つ目の整数がもともとあった場所に一つ目の整数を置き換える
	    	secondVariable = assignmentValue;
	    	
	    }
	    
	    // ソートしたことを表示
	    System.out.println("a≧bとなるようにソートしました。");
	    // 大きいほうの値をを表示
	    System.out.println("変数aは" + firstVariable + "です。");
	    // 小さいほうの値を表示
	    System.out.println("変数bは" + secondVariable + "です。");

	}

}
