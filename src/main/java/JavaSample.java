import java.util.Objects;

public class JavaSample {

    /**
     * リスト1
     */
    public void helloJava() {
        System.out.println("Hello Java!");
    }

    /**
     * リスト4
     */
    public void callHelloKotlin() {
        KotlinSample sample = new KotlinSample();
        sample.helloKotlin();
    }

    /**
     * リスト5
     */
    public void list5() {
        // 基本的にNull可
        // Optionalやサードパーティライブラリのアノテーションを使って実行時エラーにすることは可
        String str = null;
    }

    /**
     * リスト9
     */
    public void list9() {
        Integer num1;       // 変更可
        final Integer num2; // 変更不可
    }

    /**
     * リスト11
     */
    public class Game {
        // public
        public void play() {
            // ・・・
        }

        // private
        private void execute() {
            // ・・・
        }
    }

    /**
     * リスト13
     */
    public void list13() {
        String name = "竹端";
    }

    /**
     * リスト16
     */
    public class User {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * リスト18
     */
    public void list18() {
        User user = new User();
        // アクセサメソッド経由でプロパティを取得、更新
        user.setName("竹端");
        user.getName();
    }

    /**
     * リスト20
     */
    public class Company {
        // エンジニアのメンバー数
        public Integer engineerCount;
        // デザイナーのメンバー数
        public Integer designerCount;

        public Integer getEngineerCount() {
            return engineerCount;
        }

        public void setEngineerCount(Integer engineerCount) {
            this.engineerCount = engineerCount;
        }

        public Integer getDesignerCount() {
            return designerCount;
        }

        public void setDesignerCount(Integer designerCount) {
            this.designerCount = designerCount;
        }

        // engineerCountとdesignerCountを足し合わせ、合計のメンバー数を返却するメソッド
        public Integer getTotalMemberCount() {
            return this.engineerCount + this.designerCount;
        }
    }

    /**
     * リスト22
     */
    public void list22() {
        Company company = new Company();
        company.getTotalMemberCount();
    }

    /**
     * リスト24
     */
    public class UserData {
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UserData userData = (UserData) o;
            return Objects.equals(id, userData.id) &&
                    Objects.equals(name, userData.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "UserData{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    /**
     * リスト26
     */
    public void list26() {
        String name = "竹端";
        String message = "私の名前は" + name + "です。";
    }
}
