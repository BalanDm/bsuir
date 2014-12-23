package twix.run;
import twix.factory.*;
import twix.product.*;;

import java.util.concurrent.TimeUnit;
/**
 * Created by L650 on 17.10.14.
 */
public class CreateTwix {
        public void Create(TypeOfFactory type){
            CookieFactory factory = null;
            for(int i=0;i<4;i++){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(i==1){
                    System.out.print("Create cookie ");
                }
                if(i==2)
                {
                    System.out.print(" -> Pour caramel");
                }
                if(i==3)
                {
                    System.out.print(" -> Chocolate wraps");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(" -> Pack");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(" -> ");
                }
            }
            if(type.equals(TypeOfFactory.right))
                factory = new RightFactory();
            if(type.equals(TypeOfFactory.left))
                factory = new LeftFactory();
            if(factory != null){
                Cookie cookie = factory.createCookie();
                cookie.packageCookie();
                System.out.print("Our features\n");
                System.out.print("-"+cookie.getCaramelInfo()+"\n");
                System.out.print("-"+cookie.getChocolateInfo()+"\n");
        }
    }
}
