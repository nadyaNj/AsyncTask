package com.mlab.asynctask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
    	super.onCreate(savedInstanceState);
    	// TODO Auto-generated method stub
    	setContentView(R.layout.activity_main);
//    	new MyAsync().execute(new String[]{});
//    	
//    	ArrayList<String> list = new ArrayList<String>();
//    	String[] content = list.toArray(new String[]{});
    	
    	try
		{
			JSONObject json = new JSONObject("{}");
			JSONArray jsonArr = new JSONArray("[]");
			json.put("val", 456);
			json.put("arr", jsonArr);
			json.getJSONArray("arr");
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
