package com.kurly.jmstest;


import lombok.Data;

import java.io.Serializable;


@Data
public class KurlyMessage implements Serializable {

    private static final long serialVersionUID = -1163890830946122942L;

    private String id;
    private String name;
}
