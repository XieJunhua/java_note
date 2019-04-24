package com.junhua.concurrence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Student implements Cloneable {
    private int id;

    private String name;
}
