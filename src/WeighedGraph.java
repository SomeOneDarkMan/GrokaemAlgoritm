import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeighedGraph {
    public static void main(String[] args) {
        Map< String, Map<String,Integer> > graph=new HashMap<>();
        Map<String,Integer> costs=new HashMap<>();

        Map<String,String> parents=new HashMap<>();

        //отвечает за graph со всеми ценами
         Map<String,Integer> a=new HashMap<>();
        a.put("A",6);
       a.put("B",2);

        Map<String,Integer> b=new HashMap<>();
        b.put("Конец",1);

        Map<String,Integer> c=new HashMap<>();
        c.put("A",3);
        c.put("End",5);

        //узлы графа
        graph.put("Start",  a );
        graph.put("A",  b );
        graph.put("B",  c);
        graph.put("End",  null );

        //отвечает за costs
        costs.put("A",6);
        costs.put("B",2);
        costs.put("End", (int) Double.POSITIVE_INFINITY);

        //таблица родителей
        parents.put("Start","A");
        parents.put("Start","B");
        parents.put("End",null);
        List<String> processed=new ArrayList<>();


        // String node=findeNode(costs);
       // while () {


       // }




    }
}
