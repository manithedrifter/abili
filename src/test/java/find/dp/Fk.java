package find.dp;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Fk 
{
	public static void main(String[] args) throws IOException, ParseException
	{
		JSONParser parser=new JSONParser();
        FileReader reader=new FileReader("data.json");
        Object read_obj=parser.parse(reader);
        JSONObject getdata=(JSONObject) read_obj;
        JSONArray dataarray=(JSONArray)getdata.get("Sheet1");
        Iterator ds = dataarray.iterator();
        ArrayList ds1 = new ArrayList();
        HashMap<String,String> map = new HashMap<>();
        while(ds.hasNext())
        {
        	
        	map=(HashMap<String, String>) ds.next();
        	ds1.add(map);
        	
        }
        
        HashMap<String,String> dsp= (HashMap<String, String>) ds1.get(0);
        System.out.println(dsp.get("Email"));
        
		
		
	}

}
