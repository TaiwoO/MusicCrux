package com.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Molecule {
    private List<Entity> entities = new ArrayList<>();
    private List<Relationship> relationships = new ArrayList<>();
}
