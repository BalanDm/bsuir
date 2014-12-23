package twix.product;

/**
 * Created by L650 on 17.10.14.
 */
public class LeftTwix implements Cookie {
    @Override
    public void packageCookie() {
        System.out.print("The pack contains 2 LEFT STICKS!!!\n");
//        System.out.print("╔════╦╗╔╗╔╦══╦══╗╔══╗\n");
//        System.out.print("╚═╗╔═╣║║║║╠╗╔╩═╗║║╔═╝\n");
//        System.out.print("──║║─║║║║║║║║──║╚╝║\n");
//        System.out.print("──║║─║║║║║║║║──║╔╗║\n");
//        System.out.print("──║║─║╚╝╚╝╠╝╚╦═╝║║╚═╗\n");
//        System.out.print("──╚╝─╚═╝╚═╩══╩══╝╚══╝\n");
//        System.out.print("╔╗─╔═══╦══╦════╗\n");
//        System.out.print("║║─║╔══╣╔═╩═╗╔═╝\n");
//        System.out.print("║║─║╚══╣╚═╗─║║\n");
//        System.out.print("║║─║╔══╣╔═╝─║║\n");
//        System.out.print("║╚═╣╚══╣║───║║\n");
//        System.out.print("╚══╩═══╩╝───╚╝\n");
    }

    @Override
    public String getCaramelInfo() {
       // String caramelInfo="Карамель наливается волнами.";
        String caramelInfo="Left Twix flowed caramel on cookie.";
        return caramelInfo;
    }

    @Override
    public String getChocolateInfo() {
        //String chocolateInfo="Шоколад наливается вертикально.";
        String chocolateInfo="Left Twix bathed in chocolate.";
        return chocolateInfo;
    }
}
