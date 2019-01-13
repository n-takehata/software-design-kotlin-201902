class KotlinSample {

    /**
     * リスト2
     */
    fun callHelloJava() {
        val sample = JavaSample()
        sample.helloJava()
    }

    /**
     * リスト3
     */
    fun helloKotlin() {
        println("Hello Kotlin!")
    }

    /**
     * リスト6
     */
    fun list6() {
        val str1: String = null  // Null不可、コンパイルエラーになる
        val str2: String? = null // Null可
    }

    /**
     * リスト7
     */
    fun printMessageLengh(message: String?) {
        println(message.length) // コンパイルエラー
    }

    /**
     * リスト8
     */
    fun printMessageLengh2(message: String?) {
        if (message == null) {
            return
        }
        // 上の処理でNullでないことが保証されているので実行できる
        println(message.length)
    }

    /**
     * リスト10
     */
    fun list10() {
        val num1: Int // 変更不可
        var num2: Int // 変更可
    }

    /**
     * リスト12
     */
    class Game {
        // public
        fun play() {
            // ・・・
        }

        // private
        private fun execute() {
            // ・・・
        }
    }

    /**
     * リスト14
     */
    fun list14() {
        val name = "竹端"
    }

    /**
     * リスト15
     */
    class List15 {
        fun getStr(): String {
            return "sample"
        }

        fun callGetStr() {
            // getStr()の戻り値の型からStringとして型推論してくれる
            val str = getStr()
        }

    }

    /**
     * リスト17
     */
    class User {
        // プロパティを定義するだけでアクセサメソッドが作られる
        var name: String? = null
    }

    /**
     * リスト19
     */
    fun list19() {
        val user = User()
        // 直接プロパティにアクセスしているかのように書ける
        user.name = "竹端" // setName("竹端")と同等
        user.name          // getName()と同等
    }

    /**
     * リスト21
     */
    class Company {
        var engineerCount: Int = 0
        var designerCount: Int = 0

        // プロパティtotalMemberCountのgetterを拡張し、
        // engineerCountとdesignerCountの合計数を返却する
        val totalMemberCount: Int
            get() = engineerCount + designerCount
    }

    /**
     * リスト23
     */
    fun list23() {
        val company = Company()
        company.totalMemberCount
    }

    /**
     * リスト25
     */
    // 1行で全てのメソッドが作られる
    data class UserData(var id: Int, var name: String)

    /**
     * リスト27
     */
    fun list27() {
        val name = "竹端"
        val message = "私の名前は${name}です。"
    }
}
