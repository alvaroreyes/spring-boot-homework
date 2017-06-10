package com.dh.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ALVARO on 10/06/2017.
 */
@Document
public class Room {
    @Id
    String code;
    int capacyti;

    public String getCode() {
        return code;
    }

    public int getCapacyti() {
        return capacyti;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCapacyti(int capacyti) {
        this.capacyti = capacyti;
    }
}
