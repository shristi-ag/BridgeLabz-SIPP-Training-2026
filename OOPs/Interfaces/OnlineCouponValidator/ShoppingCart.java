package OnlineCouponValidator;

public class ShoppingCart implements CouponValidator
{
    @Override
    public boolean validateCoupon(String code)
    {
        // Length check
        if (!CouponValidator.isLengthValid(code))
        {
            return false;
        }

        // Coupon should start with "SAVE"
        if (code.startsWith("SAVE"))
        {
            return true;
        }

        return false;
    }

    public void checkCoupons(String[] coupons)
    {
        System.out.println("Coupon Validation Report");
        System.out.println("------------------------");

        for (String coupon : coupons)
        {
            if (validateCoupon(coupon))
            {
                System.out.println(coupon + " -> Valid Coupon");
            }
            else
            {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }
    }
}