package json;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import utils.Utils;

import java.awt.Event;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by MainUser on 28/02/2015.
 */
public class JsonParser {
	
	Set<String> invalidNames = new HashSet<String>();
	
	public JsonParser(){
		invalidNames.add("custom_event_requared_items_array");
		invalidNames.add("custom_event_min_goals_array");
		invalidNames.add("countries_filter_array");
		invalidNames.add("tournament_rank_intervals_array");
		invalidNames.add("tournament_gifts_array");
	}
	
    public GameEvent decodeJsonToEvent(String text){
    	 JSONParser parser=new JSONParser();
         String s = Utils.readFile("src/test.json");
         GameEvent gameEvent = new GameEvent();
         
         try{
            JSONObject event = (JSONObject) parser.parse(s);
            
            gameEvent.setEvent_name((String) event.get("event_name"));
            gameEvent.setEvent_description((String) event.get("event_description"));
            gameEvent.setCustom_event_type((String) event.get("custom_event_type"));
            gameEvent.setCustom_event_title((String) event.get("custom_event_title"));
            gameEvent.setCustom_event_long_description((String) event.get("custom_event_long_description"));
            gameEvent.setCustom_event_icon_id((String) event.get("custom_event_icon_id"));
            gameEvent.setCustom_event_action_id((String) event.get("custom_event_action_id"));
            gameEvent.setCustom_event_action_data((String) event.get("custom_event_action_data"));
            gameEvent.setCustom_event_requared_items((String) event.get("custom_event_requared_items"));
            gameEvent.setCustom_event_min_goals((String) event.get("custom_event_min_goals"));
            gameEvent.setCustom_event_min_goals_description((String) event.get("custom_event_min_goals_description"));
            gameEvent.setCustom_event_priority((String) event.get("custom_event_priority"));
            gameEvent.setCustom_event_versions_list((String) event.get("custom_event_versions_list"));
            gameEvent.setCustom_event_is_vip((String) event.get("custom_event_is_vip"));
            gameEvent.setCountries_filter((String) event.get("countries_filter"));
            
            JSONArray tournament_gift_intervals_array = (JSONArray) event.get("tournament_rank_intervals");
            gameEvent.setTournament_rank_intervals_value_1_min((Long) (((JSONArray)
           		 tournament_gift_intervals_array.get(0)).get(0)));
            gameEvent.setTournament_rank_intervals_value_1_max((Long)((JSONArray)
           		 tournament_gift_intervals_array.get(0)).get(1));
            gameEvent.setTournament_rank_intervals_value_2_min((Long)((JSONArray)
           		 tournament_gift_intervals_array.get(1)).get(0));
            gameEvent.setTournament_rank_intervals_value_2_max((Long)((JSONArray)
           		 tournament_gift_intervals_array.get(1)).get(1));
            gameEvent.setTournament_rank_intervals_value_3_min((Long)((JSONArray)
           		 tournament_gift_intervals_array.get(2)).get(0));
            gameEvent.setTournament_rank_intervals_value_3_max((Long)((JSONArray)
           		 tournament_gift_intervals_array.get(2)).get(1));
            gameEvent.setTournament_rank_intervals_value_4_min((Long)((JSONArray)
           		 tournament_gift_intervals_array.get(3)).get(0));
            gameEvent.setTournament_rank_intervals_value_4_max((Long)((JSONArray)
           		 tournament_gift_intervals_array.get(3)).get(1));
            gameEvent.setTournament_rank_intervals_value_5_min((Long)((JSONArray)
           		 tournament_gift_intervals_array.get(4)).get(0));
            gameEvent.setTournament_rank_intervals_value_5_max((Long)((JSONArray)
           		 tournament_gift_intervals_array.get(4)).get(1));
           		 
            JSONArray tournament_gifts = (JSONArray) event.get("tournament_gifts");
            gameEvent.setTournament_gifts_value_1((String)((JSONObject)(((JSONArray)
           		 tournament_gifts.get(0)).get(0))).get("value"));
            gameEvent.setTournament_gifts_value_2((String)((JSONObject)(((JSONArray)
           		 tournament_gifts.get(1)).get(0))).get("value"));
            gameEvent.setTournament_gifts_value_3((String)((JSONObject)(((JSONArray)
           		 tournament_gifts.get(2)).get(0))).get("value"));
            gameEvent.setTournament_gifts_value_4((String)((JSONObject)(((JSONArray)
           		 tournament_gifts.get(3)).get(0))).get("value"));
            gameEvent.setTournament_gifts_value_5((String)((JSONObject)(((JSONArray)
           		 tournament_gifts.get(4)).get(0))).get("value"));
            gameEvent.setTournament_gifts_value_1((String)((JSONObject)(((JSONArray)
            		tournament_gifts.get(0)).get(0))).get("name"));
            gameEvent.setTournament_gifts_value_2((String)((JSONObject)(((JSONArray)
            		tournament_gifts.get(1)).get(0))).get("name"));
            gameEvent.setTournament_gifts_value_3((String)((JSONObject)(((JSONArray)
            		tournament_gifts.get(2)).get(0))).get("name"));
            gameEvent.setTournament_gifts_value_4((String)((JSONObject)(((JSONArray)
            		tournament_gifts.get(3)).get(0))).get("name"));
            gameEvent.setTournament_gifts_value_5((String)((JSONObject)(((JSONArray)
            		tournament_gifts.get(4)).get(0))).get("name"));
            
            // stuff
            if(((JSONArray) tournament_gifts.get(0)).size() > 1){
	            gameEvent.setTournament_gifts_value_1_vip((String)((JSONObject)(((JSONArray)
	            		tournament_gifts.get(0)).get(1))).get("value"));
	            gameEvent.setTournament_gifts_value_1_vip((String)((JSONObject)(((JSONArray)
	            		tournament_gifts.get(0)).get(1))).get("name"));
            }
            if(((JSONArray) tournament_gifts.get(1)).size() > 1){
	            gameEvent.setTournament_gifts_value_2_vip((String)((JSONObject)(((JSONArray)
	            		tournament_gifts.get(1)).get(1))).get("value"));
	            gameEvent.setTournament_gifts_value_2_vip((String)((JSONObject)(((JSONArray)
	            		tournament_gifts.get(1)).get(1))).get("name"));
            }
            if(((JSONArray) tournament_gifts.get(2)).size() > 1){
	            gameEvent.setTournament_gifts_value_3_vip((String)((JSONObject)(((JSONArray)
	            		tournament_gifts.get(2)).get(1))).get("value"));
	            gameEvent.setTournament_gifts_value_3_vip((String)((JSONObject)(((JSONArray)
	            		tournament_gifts.get(2)).get(1))).get("name"));
            }
            if(((JSONArray) tournament_gifts.get(3)).size() > 1){
	            gameEvent.setTournament_gifts_value_4_vip((String)((JSONObject)(((JSONArray)
	            		tournament_gifts.get(3)).get(1))).get("value"));
	            gameEvent.setTournament_gifts_value_4_vip((String)((JSONObject)(((JSONArray)
	            		tournament_gifts.get(3)).get(1))).get("name"));
            }
            if(((JSONArray) tournament_gifts.get(4)).size() > 1){
	            gameEvent.setTournament_gifts_value_5_vip((String)((JSONObject)(((JSONArray)
	            		tournament_gifts.get(4)).get(1))).get("value"));
	            gameEvent.setTournament_gifts_value_5_vip((String)((JSONObject)(((JSONArray)
	            		tournament_gifts.get(4)).get(1))).get("name"));
            }
            
            JSONObject localized_fields = (JSONObject) event.get("localized_fields");
            JSONObject localized_fields_title = (JSONObject) localized_fields.get("title");
            
            gameEvent.setLocalized_fields_value_default(((String) (localized_fields_title.get("default"))));
            gameEvent.setLocalized_fields_value_en(((String) (localized_fields_title.get("en"))));
//            System.out.println(localized_fields_title.get("en")); 
//            System.out.println(localized_fields_title.get("fr")); 
//            System.out.println(localized_fields_title.get("de")); 
            
            
            gameEvent.setTournament_type((String) event.get("tournament_type"));
            gameEvent.setTournament_delivery((String) event.get("tournament_delivery"));
            gameEvent.setLeaderboard_order((String) event.get("leaderboard_order"));
            gameEvent.setLeaderboard_type((String) event.get("leaderboard_type"));
            gameEvent.setLeaderboard_group_size((Long) event.get("leaderboard_group_size"));
            
            
         }catch(ParseException pe){
            System.out.println("position: " + pe.getPosition());
            System.out.println(pe);
         }
         
         System.out.println(gameEvent);
         
//   		for (Field property : gameEvent.getClass().getDeclaredFields()) {
//   			property.setAccessible(true);
//   			System.out.println(property.getName());
//   			System.out.println(property);
//   		}
         return gameEvent;
    }

    public String encodeJson(GameEvent gameEvent){
        String resultJson = "";
        JSONObject obj=new JSONObject();
        StringWriter out = new StringWriter();
        for(Field property : gameEvent.getClass().getDeclaredFields() ){
            try {
                property.setAccessible(true);
                obj.put(property.getName(), property.get(gameEvent));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        try {
            obj.writeJSONString(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        resultJson = out.toString();
        return resultJson;
    }

    public static void main (String[] args){
        String fileContent = Utils.readFile("src/test.json");
        JsonParser jsonParser = new JsonParser();
        GameEvent event = jsonParser.decodeJsonToEvent(fileContent);
        String jsonFile = jsonParser.encodeJson(event);
        Utils.writeFile("src/testCopy.json", jsonFile);
        System.out.println(event);

//        ExcelParser excelParser = new ExcelParser();
//        excelParser.parseExcel("C:\\Users\\MainUser\\Desktop\\table.xlsx");
    }
}
