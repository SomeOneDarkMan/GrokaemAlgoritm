import java.util.Scanner;

public class FoundBinar {
    public static void main(String[] args) {
        int firstmas;
        int lastmas = 0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("10 чисел это от 0-9 если играете до 10 до пишите 11 чисел"+
                "Ведите до скольки чисел играем(до 10000 или до 100 без ДО)");
       int count= scanner.nextInt();
        int[] found = new int[count];
    for(int i=0; i<count; i++){

             found[i]=i;
        lastmas=found.length-1;}
    firstmas=0;
    int say=0;

    while (firstmas<=lastmas & firstmas!=lastmas &  firstmas!=lastmas-1){

         scanner= new Scanner(System.in);

         int mide=(firstmas+lastmas+1)/2;
        say=found[mide];
        System.out.println(" твое число больше "+say+"?");
        String string =scanner.nextLine();



        if(string.equalsIgnoreCase("Да")){
            firstmas=mide+1;
        }
        if(string.equalsIgnoreCase("Нет")){
           lastmas=mide;
        }
        if(firstmas>lastmas | firstmas==lastmas| firstmas==lastmas-1 ){
            System.out.println("Ответ:"+found[firstmas]+ " или "+found[lastmas]);
            System.out.println("если человек услышав своё число не скажет,что это оно а скажет, что оно не больше или не меньше , то придеться выбрать" +
                    " из трех вариантов ");
        }

    }



    }



}
