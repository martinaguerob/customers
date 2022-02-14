package com.nttdata.customers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "customers")
public class Customers {

    @Id
    private String id;
    private String name;
    private String typeDoc;
    private String nroDoc;
    private String code;
    private String idProfile;
    private Boolean status;

}
