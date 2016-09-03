package com.grudiy.slownews.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Owner on 03.09.2016.
 */
public class UserStorage {
    private static Map<Integer, User> usersmap = new HashMap<>();
    public static void addToMap (Integer id, User user ){ usersmap.put(id, user);}
    public static Object getById (Integer id){
        return usersmap.get(id);
    }
    public static Map<Integer, User> getUsers(){return usersmap;}

    public boolean isEmailUnique(String email) {
        for (Map.Entry<Integer, User> entry : usersmap.entrySet()) {
            if (entry.getValue().getEmail().equalsIgnoreCase(email)) {
                return false;
            }
        }
        return true;
    }
}
