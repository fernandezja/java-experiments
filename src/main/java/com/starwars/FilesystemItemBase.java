package com.starwars;

public abstract class FilesystemItemBase {
    
    //private static String NULL_STRING = null;
    private static String EMPTY_STRING = "";
    //private static String BLANK_STRING = " ";


    private String name;

    public String getName() {
        return name;
    }

    public FilesystemItemBase(String name){
        setName(name);
    }
    

    public void setName(String name) {
        if(StringIsNullOrEmpty(name)){
            throw new IllegalArgumentException("Name is invalid.");
        }

        this.name = name;
    }

    private boolean StringIsNullOrEmpty(String value) {
        if (value == null 
            || value.equals(EMPTY_STRING) 
            || value.trim().equals(EMPTY_STRING)){
                
            return true;
        }

        return false;
    }

    
}
