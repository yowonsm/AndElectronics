package com.and.lodgekiosk.infrastructure.enums;

/**
 * Created by Won on 2016-11-06.
 */
public enum RoomType {
    Special("특실"),
    Standard("일반실");

    private String typeName;

    RoomType(String type) {
        typeName = type;
    }

    public String getTypeName() {
        return typeName;
    }
}
