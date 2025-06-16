package org.getyourbond.bonds.model.service;

import org.getyourbond.bonds.model.dto.BondAndCodeDTO;
import org.getyourbond.bonds.model.dto.BondDTO;

import java.util.List;

public class PrintResult {
    public void printResult(List<BondDTO> bondList){
        for(BondDTO bond:bondList){
            System.out.println(bond);
        }
    }

    public void printResult(BondDTO bond){
        System.out.println(bond);
    }

    public void printBondByCode(List<BondAndCodeDTO> bondList) {
    }

    public void printErrorMsg(String errorInput){
        String errorMsg ="";
        switch (errorInput){
            case "selectBondByCode":
                errorMsg = "해당 코드를 가진 채권 조회에 실패하였습니다"; break;
            case "selectBond":
                errorMsg = "채권 전체 조회에 실패했습니다"; break;
        }
        System.out.println("errorMsg:"+errorMsg);
    }

    public void printSuccessMsg(String successInput){
        String successMsg ="";
        switch (successInput){
            case 
        }
    }
}
