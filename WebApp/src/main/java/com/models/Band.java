package com.models;

import lombok.Data;

@Data
public class Band extends Entity{
	Band(){
		super(EntityType.BAND);
	}
}