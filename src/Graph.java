import java.util.*;

public class Graph {
    public static void main(String[] args) {
        Set<String> checkPeople= new LinkedHashSet<>();
        Map<String,String[]> hashMap=new HashMap<>();
       hashMap.put("I",new String[]{"Jone","Kate","Sasha"});
        hashMap.put("Jone",new String[]{"I","Masha","Andrey"});
        hashMap.put("Kate",new String[]{"Mima","I"});
        hashMap.put("Dima",new String[]{"Q","I"});
        hashMap.put("Sasha",new String[]{"I","Dima"});
        hashMap.put("Masha",new String[]{"I"});



        Queue<String> graphQueue = new LinkedList<>();
        graphQueue.add("I");



        while  ( !graphQueue.isEmpty()){

            if (checkPeople.contains(graphQueue.peek())){
                graphQueue.poll();


            }
            checkPeople.add(graphQueue.peek());
                String[] frendPeopleFromQueue = hashMap.get( graphQueue.poll() );


                /*если у человека нет друзей  */if(frendPeopleFromQueue==null){
                    graphQueue.poll();
                    continue;
                }

                for (String somepeople : frendPeopleFromQueue) {
                    char foundvuleu = 'D';
                    if (somepeople.charAt(0) == foundvuleu) {
                        for ( String onepeople:checkPeople){
                            System.out.println(onepeople);

                        }
                        System.out.println(somepeople);
                        System.exit(0);
                    } else {
                        graphQueue.add(somepeople);
                    }

                }


        }
        System.out.println("Таких людей нет ");

    }
}
