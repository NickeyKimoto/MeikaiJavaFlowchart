package Chapter07;

/*
*クラス名：E_07_19
*概要：配列の指定したインデックスから指定した個数消去する
*作成者：N.Kimoto
*作成日：2024/04/23
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_19 {

	/*
	*関数名：aryRmvN
	*概要：配列の指定したインデックスから指定した個数消去する
	*引数：配列(int型), インデックス番号(int型)、要素数(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	static void aryRmvN(int[] a, int idx, int n) {

		// 消去した要素からそれ以降の要素を消去した要素分前に代入する
		for (int i = 0; i < a.length - idx - n; i++) {

			// その要素に消去した要素の次の要素の値を順に代入する
			a[idx + i] = a[idx + n + i];

		}

	}

	/*
	*関数名：main
	*概要：配列の指定したインデックスから指定した個数消去する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 要素数が一つしかなかった場合のための定数を宣言
		final int ONLY_ONE = 1;

		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言
		int[] firstArray = new int[integerVariable];

		// 各要素に値を入力する
		for (int i = 0; i < integerVariable; i++) {

			// 要素に代入する値の入力を促す
			System.out.print("x[" + i + "]：");
			// 入力された値を読み込む
			firstArray[i] = standardInput.nextInt();

		}
		
		// もし要素数が一つしかない場合
		if (integerVariable == ONLY_ONE) {
			
			// 要素を消去できないことを表示
			System.out.println("要素数が一つの配列からは要素を消去できません。");
			
		// 要素数が複数ある場合、要素の消去を行う
		} else {
	
			// 消去する要素のインデックスの入力を促す
			System.out.print("消去するインデックス：");
			// 入力された値を読み込む
			int deleteElements = standardInput.nextInt();
	
			// 負の整数値や存在しないインデックスが入力された場合
			while (deleteElements < 0 || deleteElements >= firstArray.length) {
	
				// 消去する要素のインデックスの入力を促す
				System.out.print("有効なインデックスを入力してください：");
				// 入力された値を読み込む
				deleteElements = standardInput.nextInt();
	
			}
	
			// 消去する要素の個数の入力を促す
			System.out.print("消去する要素の個数：");
			// 入力された値を読み込む
			int deleteCount = standardInput.nextInt();
	
			// 0や負の整数値、要素数以上の値を入力された場合
			while (deleteCount <= 0 || deleteCount > firstArray.length - deleteElements) {
	
				// 消去する要素の個数の入力を促す
				System.out.print("有効な個数を入力してください：");
				// 入力された値を読み込む
				deleteCount = standardInput.nextInt();
	
			}
			
			// 配列から指定した要素を消去する
			aryRmvN(firstArray, deleteElements, deleteCount);

			// 配列から指定した要素を消去したことを表示
			System.out.println("x[" + deleteElements + "]から" + deleteCount + "個の要素を消去しました。");

			// 指定した要素を消去した配列の要素を順番に表示
			for (int i = 0; i < integerVariable; i++) {

				// 要素を表示
				System.out.println("x[" + i + "] = " + firstArray[i]);

			}

		}

	}

}
