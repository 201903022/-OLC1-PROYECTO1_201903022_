/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PC
 */
public class Variables {
    private static String id;
    private static Object value;
    public Variables(String id, Object value){
        this.id = id;
        this.value = value;
    }

    /**
     * @return the id
     */
    public static String getId() {
        return id;
    }

    /**
     * @param aId the id to set
     */
    public static void setId(String aId) {
        id = aId;
    }

    /**
     * @return the value
     */
    public static Object getValue() {
        return value;
    }

    /**
     * @param aValue the value to set
     */
    public static void setValue(Object aValue) {
        value = aValue;
    }
    
}
