package jp.co.meaning.babyry.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "word")
public class Word {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField
	private String value;

	public Word() {
	}

	public Word(String value) {
		this.value = value;
	}

	public Integer getId() {
		return this.id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}