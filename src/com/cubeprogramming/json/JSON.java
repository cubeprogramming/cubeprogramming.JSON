package com.cubeprogramming.json;

/**
 * Created by cube on 18/04/2017.
 */
public interface JSON {
    <T> T parse(String jsonString);
    String stringify(T t);
}
