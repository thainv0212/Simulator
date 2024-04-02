package setting;

/**
 * ゲームの画面幅、FPS、使うことができるキャラクターなどゲームの基本情報の設定を扱うクラス．
 */
public class GameSetting {

    /**
     * ゲーム画面の横幅．
     */
    public static final int STAGE_WIDTH = 960;

    /**
     * ゲーム画面の縦幅．
     */
    public static final int STAGE_HEIGHT = 640;

    /**
     * ゲームのFPS設定．
     */
    public static final int FPS = 60;

    public static int ROUND_FRAME_NUMBER = 3600;

    /**
     * 重力の影響を設定するパラメータ．
     */
    public static final int GRAVITY = 1;

    /**
     * 摩擦の影響を設定するパラメータ．
     */
    public static final int FRICTION = 1;

    /**
     * キー入力を保持する上限数．
     */
    public static final int INPUT_LIMIT = 30;

    /**
     * コンボ継続を判定するためのフレーム数．<br>
     * ある攻撃がヒットしてから，次の攻撃がヒットするまでのフレーム数がこのフレーム数以下ならコンボが継続する．
     */
    public static final int COMBO_LIMIT = 30;

}
