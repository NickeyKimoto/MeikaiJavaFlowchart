package Chapter13.shape2;

/*
*クラス名：AbsLine
*概要：クラスShapeから派生した直線を表す抽象クラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public abstract class AbsLine extends Shape {
	
	// 直線の長さを表すフィールドを宣言
	private int length;
	
	/*
	*コンストラクタ名：AbsLine
	*概要：直線を生成する
	*引数：生成する直線の長さ(int)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public AbsLine(int length) {
		
		// 直線の長さを設定する
		setLength(length);
		
	}
	
	/*
	*関数名：getLength
	*概要：直線の長さを取得
	*引数：なし
	*戻り値：直線の長さ(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public int getLength() {
		
		// 直線の長さを返却
		return length;
		
	}
	
	/*
	*関数名：setLength
	*概要：直線の長さを設定
	*引数：直線の長さ(int型)
	*戻り値：なし)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public void setLength(int length) {
		
		// 直線の長さを設定
		this.length = length;
		
	}
	
	/*
	*関数名：toString
	*概要：直線に関する図形情報を表す文字列を返却
	*引数：なし
	*戻り値：直線に関する図形情報を表す文字列(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public String toString() {
		
		// 直線に関する図形情報を表す文字列を返却
		return "AbsLine(length:" + length + ")";
		
	}

}
