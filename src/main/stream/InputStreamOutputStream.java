package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamOutputStream {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.out.println("Input Source: " + Arrays.toString(inSrc)); //0123456789

//01)
//        int data = 0;
//        while ((data = input.read()) != -1) {
//            //ㄴ 파일을 읽어들일게 업다
//        output.write(data);
//        }

        //02)
//        input.read(temp,0, temp.length);
//        output.write(temp,5,5);

        //3)
        while (input.available() > 0) {
            try {
                int length = input.read(temp);
                byte[] temp2 = Arrays.copyOf(temp, length);

//                input.read(temp); //input -> temp에 쓴다.
//                output.write(temp); //temp로 읽어들인걸 출력한다.
                output.write(temp,0,length); //temp로 읽어들인걸 출력한다.
                outSrc = output.toByteArray(); //
                System.out.println("temp: " + Arrays.toString(temp2));//
                System.out.println("outSrc: " + Arrays.toString(outSrc));
                temp = new byte[4];
            } catch (IOException e) {
            }
        }

//        outSrc = output.toByteArray();
//        System.out.println("inSrc"+ Arrays.toString(inSrc));
//        System.out.println("temp : " + Arrays.toString(temp));
//        System.out.println("outSrc"+ Arrays.toString(outSrc));
    }
}