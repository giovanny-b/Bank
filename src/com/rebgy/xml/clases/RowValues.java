package com.rebgy.xml.clases;

import java.util.*;

public class RowValues {
    public static ArrayList<String> type = new ArrayList<>();
    public static ArrayList<String> name = new ArrayList<>();
    public static ArrayList<Boolean> serial = new ArrayList<>();
    public static ArrayList<Boolean> notNull = new ArrayList<>();
    
    public static void init(int pos){
        type.add(pos, "");
        name.add(pos, "");
        serial.add(pos, false);
        notNull.add(pos, false);
    }
}