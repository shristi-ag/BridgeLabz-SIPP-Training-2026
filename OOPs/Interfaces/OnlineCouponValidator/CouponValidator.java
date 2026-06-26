package OnlineCouponValidator;

public interface CouponValidator
{
    // Abstract Method
    boolean validateCoupon(String code);

    // Static Method
    static boolean isLengthValid(String code)
    {
        return code.length() >= 5 && code.length() <= 10;
    }
}