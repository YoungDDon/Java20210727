package lang;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class StringMethodEx {
    public static void main(String[] args) {
        String str = "abc";
        str = new String("abc");
        str = new String(new char[] {'a','b','c'});
        str = new String(new StringBuffer("abc"));

        System.out.println("charAt : "+str.charAt(0));
        System.out.println("compareTo : "+str.compareTo("0abc")); //같으면 0, 크면 음수, 작으면 양수
        System.out.println("concat : "+str.concat("defg"));
        System.out.println("contains : "+str.contains("a"));
        System.out.println("endsWith : "+str.endsWith("c"));
        System.out.println("startsWith : "+str.startsWith("a"));
        System.out.println("equalsIgnoreCase : "+str.equalsIgnoreCase("ABC"));
        System.out.println("indexOf : "+str.indexOf("d"));
        System.out.println("indexOf : "+str.indexOf("bc"));
        System.out.println("indexOf : "+str.indexOf("c"));
        System.out.println("lastIndexOf : "+str.lastIndexOf("c"));
        System.out.println();
        System.out.println("d:\\classJava\\Hello.java".lastIndexOf('.'));
        str = "d\\classJava\\Hello.java";
        System.out.println(str.substring(str.lastIndexOf('.')+1));
        System.out.println(str.substring(str.lastIndexOf('.')+1,20));

        System.out.println();
        str = "abc";
        String str2 = "abc";
        System.out.println(str.intern());
        System.out.println(str.intern() == str2.intern());
        System.out.println(str.length());
        System.out.println(str.replace("a","b"));
        System.out.println("aabbaacc".replace("aa","ees"));
        System.out.println("aabbaacc".replaceAll("aa","ee"));
        System.out.println("aabbaacc".replaceFirst("aa","ee"));
        System.out.println("thor,iron,hulk".split(",")[2]);
        System.out.println(Arrays.toString("Hello World".split("")));
        System.out.println("       Hello      World      ".trim());
        System.out.println(true);
        System.out.println(String.valueOf(1)+String.valueOf(2));
        System.out.println(Integer.parseInt("1")+Integer.parseInt("2"));
    }
}
