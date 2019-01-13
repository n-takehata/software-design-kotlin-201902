# 概要
[Software Design 2019年2月号](https://gihyo.jp/magazine/SD/archive/2019/201902)掲載の短期連載、「サーバサイド開発の品質を向上させるJava→Kotlin移行のススメ」のサンプルコードをまとめたプロジェクトになります。Gradleプロジェクトとして作られています。  
JavaとKotlinのコードの比較としてお使いください。  
コード量の違いが分かりやすいよう、あえてJava、Kotlinそれぞれ一つのファイルに全てのコードをまとめてあります。

# 構成
src/main/java/JavaSample.java ・・・ 記事内のJavaのサンプルコードが全て入っています  
src/main/kotlin/KotlinSample.kt ・・・ 記事内のKotlinのサンプルコードが全て入っています

# 注意事項
- あくまで比較用のコードであり、コンパイルエラーを説明するコードも含まれているため、KotlinSample.ktはコンパイルできません
- 各クラス、メソッド、関数にコメントで「リストX」と記事内のリストに合わせて記載しています
- 記事内でメソッド、関数を含んでいないコードに関しては、「listX」という名前のメソッド、関数、もしくは「ListX」という名前のクラスで括っています
- 基本的に記事と同じ形で作られていますが、まとめる都合上名前などで一部差分のあるコードが含まれますので、ご了承ください

※Xは各リストの数字