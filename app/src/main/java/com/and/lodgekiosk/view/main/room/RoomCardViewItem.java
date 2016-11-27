package com.and.lodgekiosk.view.main.room;

/**
 * Created by Won on 2016-03-28.
 */
public class RoomCardViewItem {

    private int image;
    private String title;

    public int getImage(){
        return this.image;
    }
    public  String getTitle(){
        return this.title;
    }

    public RoomCardViewItem(int image, String title){
        this.image=image;
        this.title=title;
    }
}
