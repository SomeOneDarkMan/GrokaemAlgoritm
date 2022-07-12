import java.nio.charset.StandardCharsets;

public class ByteCode {
    public static void main(String[] args) {
     /*   String mes= " Я люблю Мир";
        byte codmes=123;
        char[] m1= mes.toCharArray();
        for (int i=0;i<mes.length();++i){
            m1[i] ^= codmes;
        }
         mes=new String(m1);
        System.out.println(mes);
        for (int i=0;i<mes.length();++i){
            m1[i] ^= codmes;
        }
       mes=new String(m1);
        System.out.println(mes);*/
        String string="Hello";
        String str="asada";
        byte[] str1=string.getBytes(StandardCharsets.UTF_8);
        byte[] mes=string.getBytes(StandardCharsets.UTF_8);
        byte[] mas = new byte[string.length()];
        for( int i=0;i<mes.length;i++){
            mas[i]= (byte) (mes[i]^str1[i]);
        }


    }




}
