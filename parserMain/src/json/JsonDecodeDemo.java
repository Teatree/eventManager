package json;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

import utils.Utils;

class JsonDecodeDemo 
{
   public static void main(String[] args) 
   {
      JSONParser parser=new JSONParser();
      String s = Utils.readFile("src/test.json");
      try{
         JSONObject event = (JSONObject) parser.parse(s);
         System.out.println(event.getClass().getSimpleName());
         System.out.println(event.get("event_name"));
         
         
         JSONArray tournament_gifts = (JSONArray) event.get("tournament_gifts");
         for(int i=0; i<tournament_gifts.size(); i++){
        	System.out.println("The " + i + " element of the array: "+
         ((JSONObject)(((JSONArray) tournament_gifts.get(i)).get(0))).get("name") + " " + 
         ((JSONObject)(((JSONArray) tournament_gifts.get(i)).get(0))).get("value"));
         }

         JSONObject localized_fields = (JSONObject) event.get("localized_fields");
         JSONObject localized_fields_title = (JSONObject) localized_fields.get("title");
         
         System.out.println(localized_fields_title.get("default")); 
         System.out.println(localized_fields_title.get("en")); 
         System.out.println(localized_fields_title.get("fr")); 
         System.out.println(localized_fields_title.get("de")); 
         
      }catch(ParseException pe){
         System.out.println("position: " + pe.getPosition());
         System.out.println(pe);
      }
   }
}