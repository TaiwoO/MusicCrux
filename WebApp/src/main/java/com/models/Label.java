package com.models;

import lombok.Data;
@Data
public class Label extends Entity {
    Label(){
        super(EntityType.LABEL);
    }
}
