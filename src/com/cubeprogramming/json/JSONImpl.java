package com.cubeprogramming.json;


import java.io.StringReader;
import com.oracle.json.*;

/**
 * Created by cube on 18/04/2017.
 */
public class JSONImpl implements JSON{

    @Override
    public <T> T parse(String jsonString) {
        return null;
    }

    @Override
    public String stringify(T t) {
        return null;
    }

    public void parseJSON(String jsonString) {
        JsonReader jsonReader = Json.createReader(new StringReader("[]"));
        JsonArray array = jsonReader.readArray();
        jsonReader.close();
    }
}
