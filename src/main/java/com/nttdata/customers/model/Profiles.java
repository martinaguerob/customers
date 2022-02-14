package com.nttdata.customers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profiles {

    public String name;
    public String type;
    public String codProfile;
    public Boolean status;
}
