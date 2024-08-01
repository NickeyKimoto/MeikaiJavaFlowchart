package Chapter14.shape3;

/*
*クラス名：VirtLine
*概要：クラスAbsLineから派生した垂直直線を表すクラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public class VirtLine extends AbsLine {
	
	/*
	*コンストラクタ名：VirtLine
	*概要：垂直直線を生成する
	*引数：生成する直線の長さ(int)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public VirtLine(int length) {
		
		// 垂直直線の長さを初期化
		super(length);
		
	}
	
	/*
	*関数名：toString
	*概要：垂直直線に関する図形情報を表す文字列を返却
	*引数：なし
	*戻り値：垂直直線に関する図形情報を表す文字列(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public String toString() {
		
		// 垂直直線に関する図形情報を表す文字列を返却
		return "VirtLine(length:" + getLength() + ")";
		
	}
	
	/*
	*関数名：draw
	*概要：垂直直線を描画する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public void draw() {
		
		// 縦線記号'|'を縦に並べる
		for (int i = MINIMUM_SIZE_OF_SHAPE; i <= getLength(); i++) {
			
			// 長さの個数だけ'|'を連続表示して改行する
			System.out.println('|');
			
		}
		
	}

}
