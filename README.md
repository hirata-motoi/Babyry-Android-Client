Babyry-Android-Client
=====================

### ORMLiteのセットアップ

ORMapperとしてORMLiteを使う。
セットアップは以下と http://qiita.com/radiocatz/items/5f1dce3f8c5faa55e6f6 でよろしゅ

1. ライブラリのダウンロード
http://ormlite.com/releases/  からライブラリをダウンロード。2014/12/25時点では最新の4.48を使用。 
ダウンロードするのは以下2つ
 * ormlite-android-x.xx.jar
 * ormlite-core-x.xx.jar

2. ビルドパスに上記でダウンロードしたjarを追加

3. 「順番およびエクスポート」で上記ライブラリを使うチェックを入れる
 * プロパティ > Javaのビルドパス > 順番およびエクスポート > 全部チェック

4. それでもエラーが収まらない時はeclipseを再起動

5. ORMLiteの利用

| 操作 | 詳細 |
|:-----|:-----|
| DatabaseHelperを作成 | create文やalter文を実行するクラス。スーパークラスはOrmLiteSqliteOpenHelper | 
| Entityの作成 | rowオブジェクトとなるクラス。ここでschemaを定義する。 スーパークラスはjava.lang.Object |
| Model作成 | レコードの操作を行うクラス。スーパークラスはjava.lang.Object。CRUD + select用methodの作成 |
| Activityからレコードを操作 | |


