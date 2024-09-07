public class Practice9 {
    public static void main(String[] args){
        /* if文の練習 */
        int num = 10;

        if (num != 10)
            System.out.println("numの値:" + 10);    // if文で｛｝が省略されている場合は処理文が1文しかないことに注意
            System.out.println("if文の外にある実行文");    // このコードはif文には含まれていないので注意
    }
}
