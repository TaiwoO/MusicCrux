package com.models;

import lombok.Data;

@Data
public class Artist extends Entity {
    Artist(){
        super(EntityType.ARTIST);
    }


}
