package org.getyourbond.run;

import org.getyourbond.bonds.controller.BondController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BondController bondController = new BondController();
        System.out.println("====+ Get Ur BONDS! +====");
        System.out.println("1. Create : 새 채권 등록");
        System.out.println("2. Read (All) : 전체 채권 목록 조회");
//        System.out.println("3. Read (One) : 단건 조회 (상세 보기)");
        System.out.println("3. Read (Detail) : 코드로 상세 조회");
        System.out.println("5. Update : 기존 채권 데이터 수정");
        System.out.println("6. Delete : 채권 판매 완료/종료");
        System.out.println("9. 프로그램 종료");
        System.out.print("번호 입력 : ");
        int no = sc.nextInt();

        switch (no) {
            case 1: bondController.createNewBond(inputAuthor());break;
            case 2: bondController.readAllBond(); break;
            case 3: bondController.readOneBondByCode(inputBondCode()); break;
            case 4: bondController.updateAuthorInfo(inputUpdateInfo()); break;
            case 5: bondController.deleteAuthorInfo(deleteAuthor()); break;
            case 9:
                System.out.println("프로그램 종료"); return;
        }
    }

    private static Map<String, String> inputAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("작가코드 입력 (5번부터) : ");
        String authorId = sc.nextLine();
        System.out.print("작가이름 입력 : ");
        String authorName = sc.nextLine();
        System.out.print("수상내역 여부 (true/false) : ");
        Boolean awarded = Boolean.valueOf(sc.nextLine());
        System.out.print("담당 직원 사번 입력(300...) : ");
        String empId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("authorId", authorId);
        parameter.put("authorName", authorName);
        parameter.put("awarded", String.valueOf(awarded));
        parameter.put("empId", empId);

        return parameter;
    }

    private static Map<String, String> inputBondCode(int bondCode) {
        System.out.print("채권코드 입력 (1...) : ");

        switch (bondCode){
            case 1:
                List<Map<String,String>> govBondList =
                        BondController.selectByCode();
                for(Map<String, String> code : govBondList){
                    System.out.println(code);
                }
                break;
            case 2:
                List<Map<String, String>> copBondList =
                        BondController.selectByCode();
                for (Map<String, String> code : copBondList){
                    System.out.println(code);
                }



        }

        Map<String, String> parameter = new HashMap<>();
        parameter.put("authorId", authorId);

        return parameter;
    }


    private static Map<String, String> inputUpdateInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("작가 코드 입력 : ");
        String editAuthorId = sc.nextLine();
        System.out.print("수상내역이 추가되었나요? (true/false) : ");
        String editAwarded = sc.nextLine();
        System.out.print("담당직원 사번(300-) : ");
        String editEmpId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("editAuthorId", editAuthorId);
        parameter.put("editAwarded", editAwarded);
        parameter.put("editEmpId", editEmpId);

        return parameter;
    }


    private static int deleteAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("계약 종료된 작가 코드 입력 : ");
        int authorId = sc.nextInt();
        return authorId;
    }
}