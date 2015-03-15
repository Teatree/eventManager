package json;

import excel.ExcelParser;

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
        GameEvent gameEvent = new GameEvent();
        for(Field property : gameEvent.getClass().getDeclaredFields() ){
            JSONParser parser = new JSONParser();
            KeyFinder finder = new KeyFinder();
            finder.setMatchKey(property.getName());
            try{
                parser.parse(text, finder, true);
                while(!finder.isEnd() && !invalidNames.contains(property.getName())){
                    if(finder.isFound()){
                        finder.setFound(false);
                        property.setAccessible(true);
                        property.set(gameEvent,finder.getValue());
                        System.out.println(property.getName());
                        System.out.println(finder.getValue());
                        break;
                    }
                }
                continue;
            }
            catch(ParseException pe){
                pe.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
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
//        String jsonFile = jsonParser.encodeJson(event);
//        Utils.writeFile("D:\\testCopy.json", jsonFile);
        System.out.println(event);

//        ExcelParser excelParser = new ExcelParser();
//        excelParser.parseExcel("C:\\Users\\MainUser\\Desktop\\table.xlsx");
    }
}
