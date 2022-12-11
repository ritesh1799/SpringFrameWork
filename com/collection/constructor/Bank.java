package com.collection.constructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Bank {
    private List<String> bankList;
    private Set<String>  bankSet;
    private Map<Integer,String>  bankMap;
    private Properties bankProperties;

    public Bank(List bankList, Set bankSet, Map bankMap, Properties bankProperties) {
        this.bankList = bankList;
        this.bankSet = bankSet;
        this.bankMap = bankMap;
        this.bankProperties = bankProperties;
    }

    public void getALlBankList(){
        System.out.println(bankList);
    }
    public void getALlBankSet(){
        System.out.println(bankSet);
    }

    public void getALlBankMap(){
        System.out.println(bankMap);
    }
    public void getALlBankProperties(){
        System.out.println(bankProperties);
    }
}
