package com.grudiy.slownews.controller;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Owner on 31.08.2016.
 *
 */
public class GlobalStorage { //Global storage to store any data

    private static Map<String, Map<String, Object>> hashmap = new HashMap<>();

    public static Map<String, Map<String, Object>> getHashmap() {
        return hashmap;
    }

    public static Object getFromMapByKey (String key){
        return hashmap.get(key);
    }

    public static void addToMap (String key, Map<String, Object> objectsMap){
        hashmap.put(key, objectsMap);
    }
}
