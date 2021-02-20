public class OrderCost {
    private static double getDiscountPrice(int products1Count, double product1Price, int products2Count, double product2Price) {
        int itemsCount = products1Count + products2Count;
        double orderCost = product1Price * products1Count + product2Price * products2Count;
        double discount = 0;
        double discountPerQuantity = 5.0;
        double percentageDivider = 100.0;
        int minItemsCountForDiscount = 10;

        if (itemsCount >= minItemsCountForDiscount) {
            discount += discountPerQuantity;
        }

        double discountFromOrderAmount = 5.0;
        double minOrderCostForDiscount = 1000.0;

        if (orderCost >= minOrderCostForDiscount) {
            discount += discountFromOrderAmount;
        }

        return orderCost - orderCost * discount / percentageDivider;
    }

    public static void main(String[] args) {
        double product1Price = 500;
        double product2Price = 500;
        int products1Count = 1;
        int products2Count = 1;

        System.out.println("Total amount with discount: " + getDiscountPrice(products1Count, product1Price, products2Count, product2Price));
    }
}
