package Chapter02;

/*
*クラス名：E_02_06
*概要：三角形の底辺と高さを読み込んで、その面積を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/04
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_02_06 {
	
	/*
	*関数名：main
	*概要：三角形の底辺と高さを読み込んで、その面積を表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
	
		Scanner standardInput = new Scanner(System.in);
		
		// プログラムの内容を表示
		System.out.println("三角形の面積を求めます。");
		
		// 底辺の値の入力を促す
		System.out.print("底辺：");
		// 入力された底辺の値を読み込む
		double triangleBase = standardInput.nextDouble();
		
		// 高さの値の入力を促す
		System.out.print("高さ：");
		// 入力された高さの値を読み込む
		double triangleHeight = standardInput.nextDouble();
		
		// 入力された値の三角形の面積を表示
		System.out.println("面積は" + triangleBase * triangleHeight / 2 + "です。");

	}

}
