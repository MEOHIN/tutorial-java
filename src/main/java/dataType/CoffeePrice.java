package dataType;

import java.util.HashMap;

public class CoffeePrice {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }

    static void printCoffeePrice(CoffeeType coffeeType) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);

        int price = priceMap.get(coffeeType);

        System.out.printf("가격은 %d원 입니다.%n", price);
    }

    public static void main(String[] args) {
        printCoffeePrice(CoffeeType.AMERICANO);
    }
}
