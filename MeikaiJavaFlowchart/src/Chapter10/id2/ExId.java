package Chapter10.id2;

/*
*クラス名：ExId
*概要：生成したインスタンスに変更可能な識別番号を与える
*作成者：N.Kimoto
*作成日：2024/05/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class ExId {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	// 与える識別番号を設定する値を表すクラス変数を宣言
	private static int valueIncrease = 1;
	// 与える識別番号を表すクラス変数を宣言
	private static int setNumber = 0;
	// 最後に与えられた識別番号を表すクラス変数を宣言
	private static int newestId;
	// 識別番号を表すインスタンス変数を宣言
	private int id;
	
	/*
	*コンストラクタ名：ExId
	*概要：インスタンスの初期化
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/
	
	public ExId() {
		
		// 初期化する値を更新する
		setNumber += valueIncrease;
		
		// 識別番号を初期化する
		id = setNumber;
		// 与えた番号を最後に与えた識別番号として初期化
		newestId = setNumber;
		
	}
	
	/*
	*関数名：getId
	*概要：インスタンスの識別番号を返却
	*引数：なし
	*戻り値：インスタンスの識別番号(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/
	
	public int getId() {
		
		// インスタンスの識別番号を返却
		return id;
		
	}
	
	/*
	*関数名：getId
	*概要：与える識別番号を返却
	*引数：なし
	*戻り値：与える識別番号(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/
	
	public int getSetNumber() {
		
		// 与える識別番号を返却
		return setNumber;
		
	}
	
	/*
	*関数名：getValueIncrease
	*概要：与える識別番号を設定する値を返却
	*引数：なし
	*戻り値：識別番号を設定する値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/
	
	public int getValueIncrease() {
		
		// 与える識別番号を設定する値を返却
		return valueIncrease;
		
	}
	
	/*
	*関数名：getMaxId
	*概要：最後に与えられた識別番号を返却
	*引数：なし
	*戻り値：最後に与えられた識別番号(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/
	
	public static int getMaxId() {
		
		// 最後に与えられた識別番号を返却
		return newestId;
		
	}
	
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
	*関数名：changeValueIncrease
	*概要：識別番号を増やす値を変更する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/
	
	public static void changeValueIncrease() {
		
		// 識別番号を増やす値の入力を促す
		System.out.print("識別番号を増やす値：");
		// 入力された値を読み込む
		valueIncrease = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (valueIncrease <= 0) {
			
			// 正の整数値を入力させる
			valueIncrease = inputRange(valueIncrease);
			
		}
		// 識別番号を増やす値が変更されたことを表示
		System.out.println("識別番号を増やす値を変更しました。");
		
	}

}
