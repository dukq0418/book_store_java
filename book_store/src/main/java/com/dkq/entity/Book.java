package com.dkq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Book implements Serializable {

    private Integer id;
    private String bookname;
    private String author;
    private Double price;
    private Integer classid;
    private String descr;
    private String path;
    private BookClass bookClass;

}
