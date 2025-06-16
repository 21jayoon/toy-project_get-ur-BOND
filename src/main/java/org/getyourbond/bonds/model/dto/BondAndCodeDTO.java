package org.getyourbond.bonds.model.dto;

import java.util.Date;

public class BondAndCodeDTO {
    private int bondCode;
    private String bondType;
    private String bondName;
    private Double bondYield;
    private Date bondDuration;

    public BondAndCodeDTO(){}

    public BondAndCodeDTO(int bondCode, String bondType, String bondName, Double bondYield, Date bondDuration) {
        this.bondCode = bondCode;
        this.bondType = bondType;
        this.bondName = bondName;
        this.bondYield = bondYield;
        this.bondDuration = bondDuration;
    }

    public int getBondCode() {
        return bondCode;
    }

    public void setBondCode(int bondCode) {
        this.bondCode = bondCode;
    }

    public String getBondType() {
        return bondType;
    }

    public void setBondType(String bondType) {
        this.bondType = bondType;
    }

    public String getBondName() {
        return bondName;
    }

    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    public Double getBondYield() {
        return bondYield;
    }

    public void setBondYield(Double bondYield) {
        this.bondYield = bondYield;
    }

    public Date getBondDuration() {
        return bondDuration;
    }

    public void setBondDuration(Date bondDuration) {
        this.bondDuration = bondDuration;
    }

    @Override
    public String toString() {
        return "BondAndCodeDTO{" +
                "bondCode=" + bondCode +
                ", bondType='" + bondType + '\'' +
                ", bondName='" + bondName + '\'' +
                ", bondYield=" + bondYield +
                ", bondDuration=" + bondDuration +
                '}';
    }
}
