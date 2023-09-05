package com.starwars;

import java.util.ArrayList;

public class Folder 
    extends FilesystemItemBase {
    
        ArrayList<FilesystemItemBase> items;

        public Folder(String name){
            super(name);

            items = new ArrayList<FilesystemItemBase>();
        }

        public void add(FilesystemItemBase item){
            if(item == null){
                throw new IllegalArgumentException("Item is invalid.");
            }    

            items.add(item);        
        }

        public int count(){
            return items.size();      
        }


}
