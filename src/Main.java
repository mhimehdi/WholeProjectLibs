import com.javaUtils.ObjectNature;
import com.logs.LogService;
import com.maths.numbersTheory.ImpIntegerUtil;
import com.maths.numbersTheory.IntegerUtil;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Created by mhafidi on 29/08/2016.
 */
public class Main
{
    public static java.lang.Integer MAX_VALUE = java.lang.Integer.valueOf(12);
    public static ArrayList<java.lang.Integer> lArrayList = new ArrayList<>();

    public static ArrayList<String> lArrayListStr = new ArrayList<>();
    public static HashMap<String, HashMap<String, java.lang.Integer>> lHashMapHashMap = new HashMap<>();


    public static void initList()
    {

            lArrayList = IntegerUtil.getListBetween(1, MAX_VALUE);
            lArrayListStr.add("NE1-2");
            lArrayListStr.add("NE1-3");
            lArrayListStr.add("NE2-7");

            lArrayListStr.add("NE2-8");
            lArrayListStr.add("NE3-9");
            lArrayListStr.add("NE3-10");

            HashMap<String, java.lang.Integer> tempHashMap = new HashMap<>();
            tempHashMap.put("eNB1", 33);
            tempHashMap.put("eNB2", 3);
            tempHashMap.put("eNB3", 1);

            HashMap<String, java.lang.Integer> tempHashMap1 = new HashMap<>();
            tempHashMap1.put("eNB4", 33);
            tempHashMap1.put("eNB5", 3);
            tempHashMap1.put("eNB6", 2);
            lHashMapHashMap.put("OM1", tempHashMap);
            lHashMapHashMap.put("OM2", tempHashMap1);


    }

    class DataProcessor {
        private int currentValue;
        public void process() {
            ArrayList<ArrayList> myData =new ArrayList();
            myData.forEach(d -> d.add(currentValue++));
        }
    }



    public static void main(String args[])
    {
        final int[] currentValue = new int[1];

        System.out.println("******************************************");
        LogService.getInstance().logInfo("Tests Start:");
        System.out.println("******************************************");

        initList();


        lArrayListStr.stream().forEach(System.out::println);
       final Function<String,String> f = t->
        (String) t.substring(0,t.indexOf("-"));

       HashMap lhashmap3 = (HashMap) lArrayListStr.stream().collect(Collectors.groupingBy(s->s.substring(0,s.indexOf("-"))));

        HashMap lhashmap =(HashMap) lArrayListStr.stream().collect(Collectors.groupingBy(s->s.substring(0,s.indexOf("-")),
                Collectors.mapping(s->s.substring(0,s.length()),Collectors.toList())));
        HashMap lhashmap1 =(HashMap) lArrayListStr.stream().collect(Collectors.groupingBy(s->s.substring(0,s.indexOf("-")),
                Collectors.toList()));
        lhashmap.keySet().stream().forEach(System.out::println);
        lhashmap1.keySet().stream().forEach(System.out::println);
        lhashmap3.keySet().stream().forEach(System.out::println);




/*        try
        {

            if(ObjectNature.isDouble("S"))
            Double.isNaN(Double.valueOf("S"));

        } catch (Exception e)
        {

            LogService.getInstance().logError("MainClass", e.getMessage());

        }

        Predicate<java.lang.Integer> OnlyPrime = t -> {
            IntegerUtil l = new ImpIntegerUtil(t);
            return l.isPrime();
        };


        initList();*/

        //HashMap lhaHashMap = ArraysUtil.convertArrayListToSeveralEquiSizedLists(lArrayListStr,3);
        //HashMapsUtils.print(lhaHashMap);
  /*      HashMap ltmp= new HashMap();
        ltmp=(HashMap) lHashMapHashMap.values().stream().
                flatMap(alpha->alpha.entrySet().stream()).
                filter(p->p.getValue()<=2).
                collect(Collectors.groupingBy(p->p.getKey()));

        String lp=(String) ltmp.keySet().iterator().next();
        System.out.println(lp);*/

/*
        if (false)
        {
            if (!lArrayList.isEmpty())
            {
                System.out.println("size of the list is: " + lArrayList.size());


                Map<java.lang.Integer, List<java.lang.Integer>> listMap =
                        lArrayList.parallelStream().collect(Collectors.groupingBy(t -> lArrayList.indexOf(t) / 50000));


                listMap.keySet().
                        parallelStream().
                        peek(t ->
                        {

                            List l = listMap.get(t);
                            List p = (List) l.stream().filter(OnlyPrime).collect(Collectors.toList());
                            listMap.replace(t, p);
                        }).count();


                listMap.keySet().stream().forEach(t ->
                {
                    System.out.println("********************************");
                    System.out.println("**********" + t + "********************");
                    System.out.println("********************************");
                    System.out.println(Double.valueOf(Double.valueOf(((List) listMap.get(t)).size()) / Double.valueOf(50000)) * 100.0);
                    //((List) listMap.get(t)).stream().forEach(l->System.out.print(l));

                });

            }*/
       //}
        System.out.println("******************************************");
        LogService.getInstance().logInfo("Tests End:");
        System.out.println("******************************************");


    }


}