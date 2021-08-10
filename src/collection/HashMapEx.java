package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("admin","1234");
        map.put("demo","1234");

        Scanner scan = new Scanner(System.in);
        boolean login = false;
        do{
            if(!login) {
                System.out.println("당신의 아이디: ");
                String id = scan.nextLine();
                System.out.println("당신의 비밀번호: ");
                String pw = scan.nextLine();
                System.out.println(id + "/" + pw);
                if (!map.containsKey((id))) {
                    System.out.println("아이디가 존재하지 않습니다.");
                    continue;
                }
                if (!map.get(id).equals(pw)) {
                    System.out.println("비밀번호가 틀립니다.");
                    continue;
                }
                System.out.println("환영합니다. " + id + "/" + pw);
                login = true;
            }
            showMenu();
            String menu = scan.nextLine();
            if(menu.equals("1")) {

            } else if (menu.equals("2")) {
                int seq = 1;
//              //key, value를 합친 entry로 iterotor 생성
//              Iterator it = map.entrySet().iterator();
//              while (it.hasNext()) {
//                   Map.Entry entry = (Map.Entry) it.next();
//                   System.out.println(seq++ + "." + entry.getKey() + "/" + entry.getValue());
//              }
//                //key로 iterator 생성
//              Iterator it = map.keySet().iterator();
//              while (it.hasNext()) {
//                  String key = it.next().toString();
//                  String value = map.get(key).toString();
//                  System.out.println(seq++ + "." + key + "/" + value);
//              }
            //value로 iterator 생성
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    String value = it.next().toString();
                    System.out.println(seq++ + "." + value);
                }
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        } while(true);
    }
    static void showMenu() {
        System.out.println("원하시는 메뉴를 입력해주세요.");
        System.out.println("1. 회원등록");
        System.out.println("2. 회원목록");
        System.out.println("3. 프로그램 종료");
    }
}
