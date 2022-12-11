package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Bank {
    List bankList;
    Set  bankSet;
    Map  bankMap;
    Properties bankProperties;

    public void setBankList(List bankList) {
        this.bankList = bankList;
    }

    public void setBankSet(Set bankSet) {
        this.bankSet = bankSet;
    }

    public void setBankMap(Map bankMap) {
        this.bankMap = bankMap;
    }

    public void setBankProperties(Properties bankProperties) {
        this.bankProperties = bankProperties;
    }

    public void getbankListDetails(){
        System.out.println(bankList);
    }
    public void getbankSettDetails() {
      System.out.println(bankSet);
    }
    public void getbankMapDetails(){
        System.out.println(bankMap);
    }
    public void getbankPropertiesDetails(){
        System.out.println(bankProperties);
    }

}
