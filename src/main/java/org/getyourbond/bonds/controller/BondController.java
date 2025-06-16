package org.getyourbond.bonds.controller;

import org.getyourbond.bonds.model.dto.BondAndCodeDTO;
import org.getyourbond.bonds.model.service.BondService;
import org.getyourbond.bonds.model.service.PrintResult;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BondController {
    private final BondService bondService;
    private final PrintResult printResult;

    public BondController(){
        bondService = new BondService();
        printResult = new PrintResult();
    }

    public void selectByCode(Map<String, String> parameter) {
            int bondCode = Integer.parseInt(parameter.get("bondCode"));
            List<BondAndCodeDTO> bondList = bondService.selectBondByBondCode();

            //filtering해서 bondCode가 맞는 것만 print
            List<BondAndCodeDTO> filteredBondList = bondList.stream()
                    .filter(bond -> bond.getBondCode() == bondCode)
                    .collect(Collectors.toList());
            if (filteredBondList != null){
                printResult.printBondByCode(bondList);
            } else {
                printResult.printErrorMsg("selectBondByCode");

            }
            return null;
        }

    public void createNewBond() {
        String bondName = parameter.get("bondName");
        int bondType = parameter.get("bondType");
        double bondYield = parametmer.get("bondYield");
        Date bondDuration = parameter.get("bondDuration");
    }
}
