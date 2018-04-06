public class Person {
    public String name,attack,arms;
    public short gender;
    public Person(String name1,String attack1,String arms1,short gender1){
        this.setName(name1);
        this.setGender(gender1);
        this.setAttack(attack1);
        this.setArms(arms1);
    }

    public void setName(String name1) {
        if (name1.length()<30){
            this.name=name1;
        }else {
            System.out.println("姓名有誤");
            this.name=name1.substring(0,30);
        }
    }

    public String getName() {
        return name;
    }

    public void setGender(short gender1) {
        if (gender1>=0 && gender1<3){
            this.gender=gender1;
        }else {
            System.out.println("999");
            this.gender = 999;
        }
    }

    public short getGender() {
        return gender;
    }

    public void setAttack(String attack1) {
        if (attack1.length()<10){
            this.attack = attack1;
        }else {
            System.out.println("攻擊字數過長");
            this.attack = attack1.substring(0,10);
        }
    }

    public String getAttack() {
        return attack;
    }

    public void setArms(String arms1) {
        if (arms1.length()<10){
            this.arms = arms1;
        }else {
            System.out.println("武器有誤");
            this.arms = arms1.substring(0,10);
        }
    }

    public String getArms() {
        return arms;
    }
}
