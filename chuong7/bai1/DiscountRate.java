package chuong7.bai1;

public class DiscountRate {
    private static final double serviceDiscountPremium = 0.2;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.1;

    private static final double productDiscountPremium = 0.1;
    private static final double productDiscountGold = 0.1;
    private static final double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type){
        switch(type){
            case "premium":
                return serviceDiscountPremium;
            case "gold":
                return serviceDiscountGold;
            case "silver":
                return serviceDiscountSilver;
            default:
                return 0.0;
        }
    }

    public static double getProductDiscountRate(String type) {
        switch (type) {
            case "premium":
                return serviceDiscountPremium;
            case "gold":
                return serviceDiscountGold;
            case "silver":
                return serviceDiscountSilver;
            default:
                return 0.0;
        }
    }
}
