package Chapter10.id2;

/*
*クラス名：IdTester
*概要：インスタンスを生成し識別番号を1から順に与える
*作成者：N.Kimoto
*作成日：2024/05/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class ExIdTester {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：入力された値(int型)
	*戻り値：読み込んだ値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	static int inputRange(int inputValue) {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		inputValue = standardInput.nextInt();
		// 読み込んだ値を返却する
		return inputValue;

	}
	
	/*
	*関数名：main
	*概要：インスタンスを生成し識別番号を1から順に与える
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/

	public static void main(String[] args) {
		
		// インスタンスを生成することを表示
		System.out.println("インスタンスを生成します。");
		// インスタンスの生成数の入力を促す
		System.out.print("何個生成しますか？");
		// 入力された値を読み込む
		int numberOfInstances = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (numberOfInstances <= 0) {
			
			// 正の整数値を入力させる
			numberOfInstances = inputRange(numberOfInstances);
			
		}
		
		// 入力された値の個数分インスタンスを生成
		ExId instancesArray[] = new ExId[numberOfInstances];
		
		// それぞれのインスタンスの識別番号を調査
		for (int i = 0; i < instancesArray.length; i++) {
			
			// 与える識別番号の値を変更するか選択させる
			System.out.println("与える識別番号を変更しますか？");
			// 0か1の値の入力を促す
			System.out.print("[0…No／1…Yes]：");
			
			// 与える識別番号の値を変更しない意思を表す定数を宣言
			final int NO_CHANGE_BUTTON = 0;
			// 与える識別番号の値を変更する意思を表す定数を宣言
			final int YES_CHANGE_BUTTON = 1;
			// 入力された値を読み込む
			int enteredButton = standardInput.nextInt();
			// 入力された値が0か1以外の場合
			while (enteredButton != NO_CHANGE_BUTTON && enteredButton != YES_CHANGE_BUTTON) {
				
				// 0か1を入力させる
				enteredButton = inputRange(enteredButton);
				
			}
			
			// 1が入力された場合
			if (enteredButton == YES_CHANGE_BUTTON) {
			
				// 与える識別番号の値を変更する
				ExId.changeValueIncrease();
				
			}
			
			// 生成したインスタンスを初期化
			instancesArray[i] = new ExId();
			
			// 表示する配列の要素順を1からとするための定数を宣言
			final int ADJUSTMENT_NUMBER = 1;
			
			// インスタンスに識別番号が割り振られたことを表示
			System.out.println((i + ADJUSTMENT_NUMBER) + "つ目の識別番号を生成しました。");
			// 現時点における最後に与えられた識別番号を表示するか選択させる
			System.out.println("最後に与えられた識別番号を表示しますか？");
			// 0か1の値の入力を促す
			System.out.print("[0…No／1…Yes]：");
			
			// 最後に与えられた識別番号を表示しない意思を表す定数を宣言
			final int NO_INDICATE_BUTTON = 0;
			// 最後に与えられた識別番号を表示する意思を表す定数を宣言
			final int YES_INDICATE_BUTTON = 1;
			
			// 入力された値を読み込む
			enteredButton = standardInput.nextInt();
			// 入力された値が0か1以外の場合
			while (enteredButton != NO_INDICATE_BUTTON && enteredButton != YES_INDICATE_BUTTON) {
				
				// 0か1を入力させる
				enteredButton = inputRange(enteredButton);
				
			}
			
			// 1が入力された場合
			if (enteredButton == YES_INDICATE_BUTTON) {
				
				// 最後に与えられた識別番号を表示
				System.out.println("最後に与えた識別番号 = " + ExId.getMaxId());
				
			}
			
		}

	}

}