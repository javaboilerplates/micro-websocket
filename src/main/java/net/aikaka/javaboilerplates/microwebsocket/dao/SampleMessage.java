package net.aikaka.javaboilerplates.microwebsocket.dao;

import java.io.Serializable;

public class SampleMessage implements Serializable {
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
