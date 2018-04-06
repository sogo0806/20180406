import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Magic magic1 = new Magic("凱薩","水","麼法棒",(short)1);
        System.out.println("姓名:"+magic1.getName());
        System.out.println("攻擊:"+magic1.getAttack());
        System.out.println("武器:"+magic1.getArms());
        System.out.println("性別:"+magic1.getGender());
    }
}
