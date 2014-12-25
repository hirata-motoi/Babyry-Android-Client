package jp.co.meaning.babyry.model;

import java.util.List;

import com.j256.ormlite.dao.Dao;

import jp.co.meaning.babyry.db.DatabaseHelper;
import jp.co.meaning.babyry.entity.Word;
import android.content.Context;
import android.util.Log;

public class WordModel {
	
	private static final String TAG = WordModel.class.getSimpleName();
	private Context context;

	public WordModel(Context context) {
		this.context = context;
	}

	/**
	 * insert or updateする
	 *
	 * @param word 対象のエンティティ
	 */
	public void save(Word word) {
		DatabaseHelper helper = new DatabaseHelper(context);
		try {
			Dao<Word, Integer> dao = helper.getDao(Word.class);
			dao.createOrUpdate(word);
		} catch (Exception e) {
			Log.e(TAG, "例外が発生しました", e);
		} finally {
			helper.close();
		}
	}
	
	/**
	 * deleteする
	 *
	 * @param word 対象のエンティティ
	 * @return 削除件数
	 */
	public int delete(Word word) {
		DatabaseHelper helper = new DatabaseHelper(context);
		try {
			Dao<Word, Integer> dao = helper.getDao(Word.class);
			return dao.delete(word);
		} catch (Exception e) {
			Log.e(TAG, "例外が発生しました", e);
		} finally {
			helper.close();
		}
		return 0;
	}

	/**
	 * 全エンティティを取得する
	 *
	 * @return エンティティのリスト
	 */
	public List<Word> findAll() {
		Log.v("tag", "WordModel.findAll start");
		DatabaseHelper helper = new DatabaseHelper(context);
		Log.v("tag", "WordModel.findAll start 2");
		try {
			Dao<Word, Integer> dao = helper.getDao(Word.class);
		Log.v("tag", "WordModel.findAll start 3");
			return dao.queryForAll();
		} catch (Exception e) {
			Log.e(TAG, "例外が発生しました", e);
			return null;
		} finally {
			helper.close();
		}
	}

	/**
	 * 全件を削除する
	 *
	 * @return 削除件数
	 */
	public int deleteAll() {
		DatabaseHelper helper = new DatabaseHelper(context);
		try {
			Dao<Word, Integer> dao = helper.getDao(Word.class);
			return dao.delete(findAll());
		} catch (Exception e) {
			Log.e(TAG, "例外が発生しました", e);
		} finally {
			helper.close();
		}
		return 0;
	}
}
