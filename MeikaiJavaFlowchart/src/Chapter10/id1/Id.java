package Chapter10.id1;

/*
*クラス名：Id
*概要：生成したインスタンスに識別番号を1から順に与える
*作成者：N.Kimoto
*作成日：2024/05/09
*/

public class Id {
	
	// 何番までの識別番号を与えたかを表すクラス変数を宣言
	private static int counter = 0;
	// 最後に与えられた識別番号を表すクラス変数を宣言
	private static int newestId;
	// 識別番号を表すインスタンス変数を宣言
	private int id;
	
	//--- コンストラクタ ---//
	/*
	*コンストラクタ名：Id
	*概要：インスタンスの初期化
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/09
	*/
	
	public Id() {
		
		// 識別番号を初期化した後、与える番号をインクリメント
		id = ++counter;
		// 与えた番号を最後に与えた識別番号として初期化
		newestId = counter;
		
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

}
