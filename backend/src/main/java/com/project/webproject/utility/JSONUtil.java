package com.project.webproject.utility;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class JSONUtil {
    public static JSONObject parse(String json) {
        try {
            return new JSONObject(json);
        } catch (JSONException e) {
            return null;
        }
    }

    public static Object get(JSONObject jsonObject, String key) {
        try {
            return jsonObject.get(key);
        } catch (JSONException e) {
            return null;
        }
    }

    public static String getString(JSONObject jsonObject, String key) {
        try {
            return (String) jsonObject.get(key);
        } catch (JSONException e) {
            return null;
        }
    }

    public static void put(JSONObject jsonObject, String key, String value) {
        try {
            jsonObject.put(key, value);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static void put(JSONObject jsonObject, String key, Boolean value) {
        try {
            jsonObject.put(key, value);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static String convertToString(JSONObject jsonObject) {
        return jsonObject.toString();
    }
}
