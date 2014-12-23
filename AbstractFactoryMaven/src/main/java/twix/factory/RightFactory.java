package twix.factory;

import twix.product.Cookie;
import twix.product.RightTwix;

/**
 * Created by L650 on 17.10.14.
 */
public class RightFactory implements CookieFactory {
    @Override
    public Cookie createCookie() {
        return new RightTwix();
    }
}
