package twix.factory;

import twix.product.Cookie;
import twix.product.LeftTwix;

/**
 * Created by L650 on 17.10.14.
 */
public class LeftFactory implements CookieFactory {
    @Override
    public Cookie createCookie() {
        return new LeftTwix();
    }
}
