package setting;

/**
 * キャラクターの最大HPや試合の繰り返し回数など、試合を行う際に必要な設定を扱うクラス．
 */
public final class LaunchSetting {

	/**
	 * P1,P2の最大HPを格納する配列．
	 */
	public static int[] maxHp = { 400, 400 };

	/**
	 * P1,P2の最大エネルギーを格納する配列．
	 */
	public static int[] maxEnergy = { 300, 300 };

	/**
	 * P1,P2のAI名を格納する配列．<br>
	 * キーボードの場合は"Keyboard"が格納される．
	 */
	public static String[] aiNames = { "KeyBoard", "KeyBoard" };

	/**
	 * P1,P2のキャラクター名．
	 */
	public static String[] characterNames = { "ZEN", "ZEN" };

}
