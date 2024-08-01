package Chapter08.parson;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

/*
*クラス名：PersonTester2
*概要：クラスPersonを実行し、入力した人の名前・身長・体重を表示する
*作成者：N.Kimoto
*作成日：2024/04/30
*/

public class PersonTester2 {

	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);

	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：入力された値
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/

	static void inputRange(double inputValue) {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		inputValue = standardInput.nextInt();

	}

	/*
	*関数名：main
	*概要：入力した人の名前・身長・体重を表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/

	public static void main(String[] args) {

		// 人物データの入力を促す
		System.out.println("人物のデータを入力せよ。");

		// 名前の入力を促す
		System.out.print("名前は：");
		// 入力された文字を読み込む
		String personName = standardInput.next();
		// 身長の入力を促す
		System.out.print("身長は：");
		// 入力された値を読み込む
		double personHeight = standardInput.nextDouble();
		// 0か負の値が入力された場合
		while (personHeight <= 0) {

			// 正の整数を入力させる
			inputRange(personHeight);

		}

		// 体重の入力を促す
		System.out.print("体重は：");
		// 入力された値を読み込む
		double personWeight = standardInput.nextDouble();
		// 0か負の値が入力された場合
		while (personWeight <= 0) {

			// 正の整数を入力させる
			inputRange(personWeight);

		}

		// 入力されたデータで初期化
		Person yourData = new Person(personName, personHeight, personWeight);

		// 入力されたデータを表示
		yourData.putSpec();
		// 改行
		System.out.println();

	}

}
