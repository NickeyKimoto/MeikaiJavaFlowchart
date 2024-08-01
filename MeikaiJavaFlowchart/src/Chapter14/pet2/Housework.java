package Chapter14.pet2;

/*
*インタフェース名：Housework
*概要：家事を行う
*作成者：N.Kimoto
*作成日：2024/05/24
*/
public interface Housework {
	// 掃除を表す定数を宣言
	int doClean 	= 0;
	// 洗濯を表す定数を宣言
	int doLaundry 	= 1;
	// 料理を表す定数を宣言
	int doCook 		= 2;
	
	/*
	*関数名：doHousework
	*概要：家事を行う
	*引数：家事を表す数値(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	void doHousework(int numberOfHousework);
}
