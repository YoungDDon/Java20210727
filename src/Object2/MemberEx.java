package Object2;

public class MemberEx {
    public static void main(String[] args) {
        Member m = new Member();
//        m.age = -10;
        m.setAge(-10);
        System.out.println(m.getAge());
    }
}

class Member {
    private int no;
    private String name, id, pw, mobile;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0) this.age = age;
        System.out.println("나이에 걸맞지 않습니다.");
    }
}
