package Chapter13.shape2;

/*
*クラス名：LowerRightTriangle
*概要：クラスAbstractTriangleから派生した右上直角の二等辺三角形を表すクラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public class UpperRightTriangle extends AbstractTriangle {
	
	/*
	*コンストラクタ名：UpperRightTriangle
	*概要：右上直角の二等辺三角形の斜辺ではない一辺の長さを初期化する
	*引数：右上直角の二等辺三角形の斜辺ではない一辺の長さ(int)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public UpperRightTriangle(int triangleSideLength) { 
		
		// 右上直角の二等辺三角形の斜辺ではない一辺の長さを初期化
		super(triangleSideLength);
		
	}
	
	/*
	*関数名：toString
	*概要：右上直角の二等辺三角形に関する図形情報を表す文字列を返却
	*引数：なし
	*戻り値：右上直角の二等辺三角形に関する図形情報を表す文字列(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public String toString() {
		
		// 右上直角の二等辺三角形に関する図形情報を表す文字列を返却
		return "UpperRightTriangle(triangleSideLength:" + getTriangleSideLength() + ")";
		
	}
	
	/*
	*関数名：draw
	*概要：右上直角の二等辺三角形を描画する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public void draw() {
		
		// 斜辺ではない一辺の長さの回数分アステリスク記号'*'を横に並べる
		for (int i = 0; i < getTriangleSideLength(); i++) {
			
			// その行で段数回だけ' 'を連続表示
			for (int j = 0; j < i; j++) {
			
				// ' 'を表示
				System.out.print(' ');
					
			}
			
			// その行で(段数-出力してる段)回だけ'*'を連続表示
			for (int j = getTriangleSideLength() - i; j > 0; j--) {
				
				// '*'を表示
				System.out.print('*');

			}
			
			// 改行する
			System.out.println();
			
		}
		
	}

}
