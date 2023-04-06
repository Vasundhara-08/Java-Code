package Hashing.HasMap;

import java.util.HashMap;

public class Ques2_Itenary_Tickets {

    public static String startpnt (HashMap<String,String> revtick)
    {
        // we create here reverse map in which key =value and value=key
        HashMap<String,String> revtickets = new HashMap<>();
         // key = key , val = revtick.get(key)
        for(String key : revtick.keySet())
        {
         revtickets.put(revtick.get(key), key);
        }
        for (String key:revtick.keySet())
        {
           if (!revtickets.containsKey(key))
           {
               return key;
           }
        }
        return null;
    }
    public static void main(String[] args) {

        // first step is to find out the strating point

        HashMap<String ,String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        // second create a fucntion that will help in finding out the starting point
        String start = startpnt(tickets);

        while(tickets.containsKey(start))
        {
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }


}
