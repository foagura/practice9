public class Practice9 {
    public static void main(String[] args){
        /* if文の練習 */
        int num = 10;

        if (num != 10)
            System.out.println("numの値は10ではありません");    // if文で｛｝が省略されている場合は処理文が1文しかないことに注意
            System.out.println("if文の外にある実行文");    // このコードはif文には含まれていないので注意


        if (num != 10)
            System.out.println("numの値は10ではありません");    // 条件不一致の為実行されない
        else
            System.out.println("numの値:" + 10);    // if文がfalseだったためelse文の処理文が実行される


        if (num != 10)
            System.out.println("numの値は10ではありません");    // 条件不一致の為実行されない
        else if (num == 10)
            System.out.println("numの値:" + 10);    // if文がfalseかつelse if文がtrueの為、処理文が実行される
        else
            System.out.println("条件不一致");    // else if文がtrueだった為、else文は実行されない

    }
}
