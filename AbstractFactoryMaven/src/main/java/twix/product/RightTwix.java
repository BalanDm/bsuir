package twix.product;

/**
 * Created by L650 on 17.10.14.
 */
public class RightTwix implements Cookie {
    @Override
    public void packageCookie() {
        System.out.print("The pack contains 2 RIGHT STICKS!!!\n");
//        System.out.print("╔════╦╗╔╗╔╦══╦══╗╔══╗\n");
//        System.out.print("╚═╗╔═╣║║║║╠╗╔╩═╗║║╔═╝\n");
//        System.out.print("──║║─║║║║║║║║──║╚╝║\n");
//        System.out.print("──║║─║║║║║║║║──║╔╗║\n");
//        System.out.print("──║║─║╚╝╚╝╠╝╚╦═╝║║╚═╗\n");
//        System.out.print("──╚╝─╚═╝╚═╩══╩══╝╚══╝\n");
//        System.out.print("╔═══╦══╦═══╦╗╔╦════╗\n");
//        System.out.print("║╔═╗╠╗╔╣╔══╣║║╠═╗╔═╝\n");
//        System.out.print("║╚═╝║║║║║╔═╣╚╝║─║║\n");
//        System.out.print("║╔╗╔╝║║║║╚╗║╔╗║─║║\n");
//        System.out.print("║║║║╔╝╚╣╚═╝║║║║─║║\n");
//        System.out.print("╚╝╚╝╚══╩═══╩╝╚╝─╚╝\n");
    }

    @Override
    public String getCaramelInfo() {
        //String  caramelInfo="Карамель струится.";
        String  caramelInfo="Right Twix caramel cascaded caramel on cookie.";
        return  caramelInfo;
    }

    @Override
    public String getChocolateInfo() {
        //String chocolateInfo="Шоколад наливается сверху вниз";
        String chocolateInfo="Right Twix cloaked in chocolate";
        return chocolateInfo;
    }
}
