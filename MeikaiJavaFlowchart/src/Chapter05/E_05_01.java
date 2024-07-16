package Chapter05;

/*
*クラス名：E_05_01
*概要：10進整数を読み込んで、その値を8進数と16進数で表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/10
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_05_01 {

	/*
	*関数名：main
	*概要：10進整数を読み込んで、その値を8進数と16進数で表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/10
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 整数の入力を促す
		System.out.print("整数：");
		// 入力された整数を読み込む
		int integerVariable = standardInput.nextInt();
		
		// 内容を表示
		System.out.print("8進数では");
		// 入力された値を8進数で表示
		System.out.printf("%o", integerVariable);
		// 表示
		System.out.println("です。");
		
		// 内容を表示
		System.out.print("16進数では");
		// 入力された値を16進数で表示
		System.out.printf("%x", integerVariable);
		// 表示
		System.out.print("です。");

	}

}
