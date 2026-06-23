package com.ex;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private List<Category> categories;


    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n[ 실시간 커머스 플랫폼 메인 ]");
            System.out.println("1. 전자제품");
            System.out.println("2. 의류");
            System.out.println("3. 식품");
            System.out.println("0. 종료      | 프로그램 종료");
            System.out.print("선택: ");

            int mainMenuInput = scanner.nextInt();


            if (mainMenuInput == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }


            if (mainMenuInput == 1) {
                Category selectedCategory = categories.get(0);

                while (true) {
                    System.out.println("\n[ " + selectedCategory.getName() + " 카테고리 ]");
                    List<Product> products = selectedCategory.getProducts();


                    for (int i = 0; i < products.size(); i++) {
                        Product p = products.get(i);
                        System.out.println((i + 1) + ". " + p.getName() + "     | " + p.getPrice() + "원 | " + p.getDescription());
                    }
                    System.out.println("0. 뒤로가기");
                    System.out.print("선택: ");

                    int productInput = scanner.nextInt();


                    if (productInput == 0) {
                        break;
                    }


                    if (productInput > 0 && productInput <= products.size()) {
                        Product selectedProduct = products.get(productInput - 1);
                        System.out.println("선택한 상품: " + selectedProduct.getName() + " | " + selectedProduct.getPrice() + "원 | " + selectedProduct.getDescription() + " | 재고: " + selectedProduct.getQuantity() + "개");
                    break;

                    } else {
                        System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    }
                }
            } else if (mainMenuInput == 2 || mainMenuInput == 3) {
                System.out.println("선택한 카테고리에는 등록된 상품이 없습니다.");
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
