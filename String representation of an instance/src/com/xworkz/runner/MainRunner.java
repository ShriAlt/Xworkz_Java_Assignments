package com.xworkz.runner;
import com.sun.java.accessibility.util.TopLevelWindowListener;
import com.xworkz.external.*;
import com.xworkz.external.Math;

public class MainRunner {
    public static void main(String[] args) {
        Nike nike=new Nike("Nike",7,67);
        String nikeString=nike.toString();
        System.out.println(nikeString);

        Persian persian=new Persian("whiskey",11,3);
        System.out.println(persian);

        Husky husky=new Husky("rony",7,5);
        System.out.println(husky);

        Puma puma=new Puma("Puma",8,9);
        System.out.println(puma);

        Asian asian=new Asian("Asian",7,9);
        System.out.println(asian);

        Zyadan zyadan=new Zyadan("Zaydan",8,9);
        System.out.println(zyadan);

        AirJordan airJordan=new AirJordan("AirJordan",6,8);
        System.out.println(airJordan);

        GoldenRetriver goldenRetriver=new GoldenRetriver("rocky",7,6);
        System.out.println(goldenRetriver);

        Tiger tiger=new Tiger("Tiger","67","white");
        System.out.println(tiger);

        Cow cow=new Cow("cow","56","black");
        System.out.println(cow);

        Cat cat=new Cat("cat","56","orange");
        System.out.println(cat);

        Algea algea=new Algea("Algea","plant","water");
        System.out.println(algea);

        Bamboo bamboo=new Bamboo("bamboo","plant","earth");
        System.out.println(bamboo);

        Cactus cactus=new Cactus("Cactus","plant","dessert");
        System.out.println(cactus);

        Fern fern=new Fern("fern","plant","water");
        System.out.println(fern);

        Hearb hearb=new Hearb("hearb","plant","bush");
        System.out.println(hearb);

        Bush bush=new Bush("bush","plant","bush");
        System.out.println(bush);

        Chisel chisel=new Chisel("chisEl","tool",7);
        System.out.println(chisel);

        Drill drill=new Drill("drill","tool",8);
        System.out.println(drill);

        Moss moss=new Moss("moss","plant","water");
        System.out.println(moss);

        Shrub  shrub=new Shrub("shrub","plant","mud");
        System.out.println(shrub);

        Tree tree=new Tree("tree","plant" ,"ground");
        System.out.println(tree);

        Pine pine=new Pine("pine","plant","forest");
        System.out.println(pine);

        Vine vine=new Vine("vine","plant","forest");
        System.out.println(vine);

        Hammer hammer=new Hammer("hammer","tools",9);
        System.out.println(hammer);

        Nail nail=new Nail("nail","tool",100);
        System.out.println(nail);

        Pliers pliers=new Pliers("pliers","tool",9);
        System.out.println(pliers);
        Saw saw=new Saw("saw","tools",9);
        System.out.println(saw);
        ScrewDriver screwDriver=new ScrewDriver("Screwdriver","tools",9);
        System.out.println(screwDriver);
        Tape tape=new Tape("tape","tools",9);
        System.out.println(tape);
        Wrench wrench=new Wrench("wrench","tool",9);
        Level level=new Level("level","tool",8);
        System.out.println(level);
        PaintBrush paintBrush=new PaintBrush("pain brush","tool",8);
        System.out.println(paintBrush);

        Math math=new Math("maths","A",78);
        System.out.println(math);
        Physics physics=new Physics("physics","B",67);
        System.out.println(physics);
        Psychology psychology=new Psychology("psychology","A",89);
        System.out.println(psychology);
        English english=new English("english","A",78);
        System.out.println(english);
        Economics economics=new Economics("economics","A",89);
        System.out.println(economics);
        ComputerScience computerScience=new ComputerScience("computerscience","a",89);
        System.out.println(computerScience);
        Geography geography=new Geography("geo","A",78);
        System.out.println(geography);
        History history=new History("history","G",56);
        System.out.println(history);
        Biology biology=new Biology("bio","s",78);
        System.out.println(biology);
        Chemistry chemistry=new Chemistry("chem","A",89);
        System.out.println(chemistry);

        CreditCard creditCard=new CreditCard("go",89,89);
        System.out.println(creditCard);
        DebitCard debitCard=new DebitCard("unio",7,9);
        System.out.println(debitCard);
        PayPal payPal= new PayPal("paypal",89,90);
        System.out.println(payPal);
        GooglePay googlePay=new GooglePay("ggole pay",89,89);
        System.out.println(googlePay);
        ApplePay applePay=new ApplePay("apple",89,76);
        System.out.println(applePay);
        Bitcoin bitcoin=new Bitcoin("bitcoin",65,56);
        System.out.println(bitcoin);
        BankTransfer bankTransfer=new BankTransfer("union",67,89);
        System.out.println(bankTransfer);
        Cash cash=new Cash("cash",8,3);
        System.out.println(cash);
        GiftCard giftCard=new GiftCard("giftcard",7,4);
        System.out.println(giftCard);
        Crypto crypto=new Crypto("crypto",67,24);
        System.out.println(crypto);








    }
}
