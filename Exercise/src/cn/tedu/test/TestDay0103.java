package cn.tedu.test;
/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 *
 * @author Xiloer
 *
 */
public class TestDay0103 {
    public static void main(String[] args) {
        String str = "上海自来水来自海上";
        check(str);
        if (check(str)) {
            System.out.println("是回文");
        } else {
            System.out.println("不是回文");
        }
    }
    public static boolean check(String str){
        int j=str.length()-1;
        for(int i=0;i<4;i++){
            if(str.charAt(i)==str.charAt(j)){
                j--;
                return true;
            }
        }
        return false;
    }
}