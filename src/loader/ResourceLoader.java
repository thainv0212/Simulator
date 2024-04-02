package loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * キャラクターの設定ファイルや画像等のリソースをロードするためのシングルトンパターンクラス．
 */
public class ResourceLoader {

	/**
	 * クラスコンストラクタ．
	 */
	private ResourceLoader() {
		Logger.getAnonymousLogger().log(Level.INFO, "Create instance: " + ResourceLoader.class.getName());
	}

	/**
	 * ResourceLoaderクラスの唯一のインスタンスを取得する．
	 *
	 * @return ResourceLoaderクラスの唯一のインスタンス
	 */
	public static ResourceLoader getInstance() {
		return ResourceLoaderHolder.instance;
	}

	/**
	 * getInstance()が呼ばれたときに初めてインスタンスを生成するホルダークラス．
	 */
	private static class ResourceLoaderHolder {
		private static final ResourceLoader instance = new ResourceLoader();
	}

	/**
	 * 読み込みたいファイルを開き，そのBufferedReaderを返す．
	 *
	 * @param filePath
	 *            読み込みたいファイルまでのパス
	 *
	 *
	 * @return BufferedReader
	 */
	public BufferedReader openReadFile(String filePath) {
		try {
			File file = new File(filePath);
			return new BufferedReader(new FileReader(file));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
