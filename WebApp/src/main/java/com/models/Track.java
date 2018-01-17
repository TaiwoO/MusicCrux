package com.models;

import lombok.Data;


@Data
public class Track extends Entity {
    Track(){
        super(EntityType.TRACK);
    }
}
