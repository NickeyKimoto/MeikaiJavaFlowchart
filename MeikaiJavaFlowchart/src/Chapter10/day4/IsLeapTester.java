package Chapter10.day4;

// 日付クラスDay【第4版】利用例：インスタンスメソッド版による閏年の判定

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class IsLeapTester {

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("西暦年：");
		int y = standardInput.nextInt();
		// クラスメソッド(静的メソッド)の呼び出し
		System.out.println("その年は閏年" + (new Day(y).isLeap() ? "です。" : "ではありません。"));

	}

}
