package com.xworkz.runner;
import com.xworkz.external.*;


public class MainRunner {
    public static void main(String[] args) {
        Persian persian=new Persian("whiskey",11,3);
        System.out.println(persian);
        System.out.println(persian.hashCode());

        Husky husky=new Husky("rony",7,5);
        System.out.println(husky);
        System.out.println(husky.hashCode());
        GoldenRetriver goldenRetriver=new GoldenRetriver("rocky",7,6);
        System.out.println(goldenRetriver);
        System.out.println(goldenRetriver.hashCode());

        Nike nike=new Nike("Nike",7,67);
        String nikeString=nike.toString();
        System.out.println(nike.hashCode());
        System.out.println(nikeString);
        Puma puma=new Puma("Puma",8,9);
        System.out.println(puma);
        System.out.println(puma.hashCode());
        Asian asian=new Asian("Asian",7,9);
        System.out.println(asian);
        System.out.println(asian.hashCode());
        Zyadan zyadan=new Zyadan("Zaydan",8,9);
        Zyadan zyadan1=new Zyadan("zyadan",8,9);
        System.out.println("both are same :"+zyadan.equals(zyadan));
        System.out.println(zyadan);
        System.out.println(zyadan.hashCode());
        AirJordan airJordan=new AirJordan("AirJordan",6,8);
        AirJordan airJordan1=new AirJordan("airjordan",56,89);
        System.out.println("same :"+airJordan1.equals(airJordan));
        System.out.println(airJordan);
        System.out.println(airJordan.hashCode());

        Tiger tiger=new Tiger("Tiger","67","white");
        System.out.println(tiger);
        System.out.println(tiger.hashCode());
        Cow cow=new Cow("cow","56","black");
        System.out.println(cow);
        System.out.println(cow.hashCode());
        Cat cat=new Cat("cat","56","orange");
        System.out.println(cat);
        System.out.println(cat.hashCode());

        Algea algea=new Algea("Algea","plant","water");
        System.out.println(algea);
        System.out.println(algea.hashCode());
        Bamboo bamboo=new Bamboo("bamboo","plant","earth");
        System.out.println(bamboo);
        System.out.println(bamboo.hashCode());
        Cactus cactus=new Cactus("Cactus","plant","dessert");
        System.out.println(cactus);
        System.out.println(cactus.hashCode());
        Fern fern=new Fern("fern","plant","water");
        System.out.println(fern);
        System.out.println(fern.hashCode());
        Hearb hearb=new Hearb("hearb","plant","bush");
        System.out.println(hearb);
        System.out.println(hearb.hashCode());
        Bush bush=new Bush("bush","plant","bush");
        System.out.println(bush);
        System.out.println(bush.hashCode());
        Moss moss=new Moss("moss","plant","water");
        System.out.println(moss);
        System.out.println(moss.hashCode());
        Shrub  shrub=new Shrub("shrub","plant","mud");
        System.out.println(shrub);
        System.out.println(shrub.hashCode());
        Tree tree=new Tree("tree","plant" ,"ground");
        System.out.println(tree);
        System.out.println(tree.hashCode());
        Pine pine=new Pine("pine","plant","forest");
        System.out.println(pine);
        System.out.println(pine.hashCode());
        Vine vine=new Vine("vine","plant","forest");
        System.out.println(vine);
        System.out.println(pine.hashCode());

        Chisel chisel=new Chisel("chisEl","tool",7);
        System.out.println(chisel);
        System.out.println(chisel.hashCode());
        Drill drill=new Drill("drill","tool",8);
        System.out.println(drill);
        System.out.println(drill.hashCode());
        Hammer hammer=new Hammer("hammer","tools",9);
        System.out.println(hammer);
        System.out.println(hammer.hashCode());
        Nail nail=new Nail("nail","tool",100);
        System.out.println(nail);
        System.out.println(nail.hashCode());
        Pliers pliers=new Pliers("pliers","tool",9);
        System.out.println(pliers);
        System.out.println(pliers.hashCode());
        Saw saw=new Saw("saw","tools",9);
        System.out.println(saw);
        System.out.println(saw.hashCode());
        ScrewDriver screwDriver=new ScrewDriver("Screwdriver","tools",9);
        System.out.println(screwDriver);
        System.out.println(screwDriver.hashCode());
        Tape tape=new Tape("tape","tools",9);
        System.out.println(tape);
        System.out.println(tape.hashCode());
        Wrench wrench=new Wrench("wrench","tool",9);
        System.out.println(wrench);
        System.out.println(wrench.hashCode());
        Level level=new Level("level","tool",8);
        System.out.println(level);
        System.out.println(level.hashCode());
        PaintBrush paintBrush=new PaintBrush("pain brush","tool",8);
        System.out.println(paintBrush);
        System.out.println(paintBrush.hashCode());
        Maths math=new Maths("maths","A",78);
        System.out.println(math);
        System.out.println(math.hashCode());
        Physics physics=new Physics("physics","B",67);
        System.out.println(physics);
        System.out.println(physics.hashCode());
        Psychology psychology=new Psychology("psychology","A",89);
        System.out.println(psychology);
        System.out.println(psychology.hashCode());
        English english=new English("english","A",78);
        System.out.println(english);
        System.out.println(english.hashCode());
        Economics economics=new Economics("economics","A",89);
        System.out.println(economics);
        System.out.println(economics.hashCode());
        ComputerScience computerScience=new ComputerScience("computerscience","a",89);
        System.out.println(computerScience);
        System.out.println(computerScience.hashCode());
        Geography geography=new Geography("geo","A",78);
        System.out.println(geography);
        System.out.println(geography.hashCode());
        History history=new History("history","G",56);
        System.out.println(history);
        System.out.println(history.hashCode());
        Biology biology=new Biology("bio","s",78);
        System.out.println(biology);
        System.out.println(biology.hashCode());
        Chemistry chemistry=new Chemistry("chem","A",89);
        System.out.println(chemistry);
        System.out.println(chemistry.hashCode());

        CreditCard creditCard=new CreditCard("go",89,89);
        System.out.println(creditCard);
        System.out.println(creditCard.hashCode());
        DebitCard debitCard=new DebitCard("unio",7,9);
        System.out.println(debitCard);
        System.out.println(debitCard.hashCode());
        PayPal payPal= new PayPal("paypal",89,90);
        System.out.println(payPal);
        System.out.println(payPal.hashCode());
        GooglePay googlePay=new GooglePay("ggole pay",89,89);
        System.out.println(googlePay.hashCode());
        System.out.println(googlePay);
        ApplePay applePay=new ApplePay("apple",89,76);
        System.out.println(applePay);
        System.out.println(applePay.hashCode());
        Bitcoin bitcoin=new Bitcoin("bitcoin",65,56);
        System.out.println(bitcoin);
        System.out.println(bitcoin.hashCode());
        BankTransfer bankTransfer=new BankTransfer("union",67,89);
        System.out.println(bankTransfer);
        System.out.println(bankTransfer.hashCode());
        Cash cash=new Cash("cash",8,3);
        System.out.println(cash);
        System.out.println(cash.hashCode());
        GiftCard giftCard=new GiftCard("giftcard",7,4);
        System.out.println(giftCard);
        System.out.println(giftCard.hashCode());
        Crypto crypto=new Crypto("crypto",67,24);
        System.out.println(crypto);
        System.out.println(crypto.hashCode());

        Electronics electronics=new Electronics("electronics",56,78);
        System.out.println(electronics);
        System.out.println(electronics.hashCode());
        Clothing clothing = new Clothing("clothing",78,89);
        System.out.println(clothing);
        System.out.println(clothing.hashCode());
        Grocery grocery=new Grocery("grocery",67,23);
        System.out.println(grocery);
        System.out.println(grocery.hashCode());
        Furniture furniture=new Furniture("furniture",6,7);
        System.out.println(furniture);
        System.out.println(furniture.hashCode());
        Toys toys=new Toys("toys",8,8);
        System.out.println(toys);
        System.out.println(toys.hashCode());
        Books books=new Books("books",6,8);
        System.out.println(books);
        System.out.println(books.hashCode());
        Beauty beauty=new Beauty("beauty",8,9);
        System.out.println(beauty);
        System.out.println(beauty.hashCode());
        Sports sports=new Sports("sports",8,9);
        System.out.println(sports);
        System.out.println(sports.hashCode());
        Footwear footwear=new Footwear("footwear",8,9);
        System.out.println(footwear);
        System.out.println(footwear.hashCode());
        Jewelry jewelry=new Jewelry("jewelry",8,9);
        System.out.println(jewelry);
        System.out.println(jewelry.hashCode());

        House house=new House("house",7,"manglore");
        System.out.println(house);
        System.out.println(house.hashCode());
        Hospital hospital=new Hospital("hospital",7,"shivmoga");
        System.out.println(hospital);
        System.out.println(hospital.hashCode());
        School school=new School("school",78,"banglore");
        System.out.println(school);
        System.out.println(school.hashCode());
        Library library=new Library("library",4,"manglore");
        System.out.println(library);
        System.out.println(library.hashCode());
        Hotel hotel=new Hotel("hotel",8,"mang");
        System.out.println(hotel);
        System.out.println(hotel.hashCode());
        Office office=new Office("office",3,"banglore");
        System.out.println(office);
        System.out.println(office.hashCode());
        Mall mall=new Mall("mall",7,"location");
        System.out.println(mall);
        System.out.println(mall.hashCode());
        Factory factory=new Factory("factory",7,"location");
        System.out.println(factory);
        System.out.println(factory.hashCode());
        Museum museum=new Museum("museum",8,"kerala");
        System.out.println(museum);
        System.out.println(museum.hashCode());
        SuperMarket superMarket=new SuperMarket("superMarket",6,"location");
        System.out.println(superMarket);
        System.out.println(superMarket.hashCode());

        Car car=new Car("red",8,76);
        System.out.println(car);
        System.out.println(car.hashCode());
        Bike bike=new Bike("blue",4,7);
        System.out.println(bike);
        System.out.println(bike.hashCode());
        Truck truck=new Truck("blue",8,9);
        System.out.println(truck);
        System.out.println(truck.hashCode());
        Bus bus=new Bus("blue",5,24);
        System.out.println(bus);
        System.out.println(bus.hashCode());
        Scooter scooter=new Scooter("red",6,8);
        System.out.println(scooter);
        System.out.println(scooter.hashCode());
        Train train=new Train("red",9,9);
        System.out.println(train);
        System.out.println(train.hashCode());
        Airplane airplane=new Airplane("airplane",89,90);
        System.out.println(airplane);
        System.out.println(airplane.hashCode());
        Ship ship=new Ship("red",9,8);
        System.out.println(ship);
        System.out.println(ship.hashCode());
        Tractor tractor=new Tractor("red",7,0);
        System.out.println(tractor);
        System.out.println(tractor.hashCode());
        Ambulance ambulance=new Ambulance("white",8,9);
        System.out.println(ambulance);
        System.out.println(ambulance.hashCode());

        Phone phone=new Phone("phone",67,9);
        System.out.println(phone);
        System.out.println(phone.hashCode());
        Laptop laptop=new Laptop("laptop",67,9);
        System.out.println(laptop);
        System.out.println(laptop.hashCode());
        TV tv=new TV("tv",89,9);
        System.out.println(tv);
        System.out.println(tv.hashCode());
        SmartWatch smartWatch=new SmartWatch("watch",78,9);
        System.out.println(smartWatch);
        System.out.println(smartWatch.hashCode());
        Printer printer=new Printer("printer",89,9);
        System.out.println(printer);
        System.out.println(printer.hashCode());
        Monitor monitor=new Monitor("monitor",9,8);
        System.out.println(monitor);
        System.out.println(monitor.hashCode());
        Speaker speaker=new Speaker("speaker",8,2);
        System.out.println(speaker);
        System.out.println(speaker.hashCode());
        Console console=new Console("console",8,3);
        System.out.println(console);
        System.out.println(console.hashCode());
        Tablet tablet=new Tablet("tablet",7,9);
        System.out.println(tablet);
        System.out.println(tablet.hashCode());
        Router router=new Router("router",8,8);
        System.out.println(router);
        System.out.println(router.hashCode());

        TwistedLove twistedLove=new TwistedLove("twisted love","smut",10);
        System.out.println(twistedLove);
        System.out.println(twistedLove.hashCode());
        TwistedHate twistedHate=new TwistedHate("twisted hate","smut",10);
        System.out.println(twistedHate);
        System.out.println(twistedHate);
        TwistedLie twistedLie=new TwistedLie("twisted love","smut",10);
        System.out.println(twistedLie);
        System.out.println(twistedLie.hashCode());
        TwistedGame twistedGame=new TwistedGame("twisted lie","smut",10);
        System.out.println(twistedGame);
        System.out.println(twistedGame);
        IgniteMe igniteMe=new IgniteMe("ignite me","fantasy",9);
        System.out.println(igniteMe);
        System.out.println(igniteMe.hashCode());
        ShatterMe shatterMe=new ShatterMe("Shatter me","fantasy",10);
        System.out.println(shatterMe);
        System.out.println(shatterMe.hashCode());
        YourName yourName=new YourName("your name","fantasy",10);
        System.out.println(yourName);
        System.out.println(yourName.hashCode());




        Tshirt tshirt1=new Tshirt();
        tshirt1.setBrand("nike");
        tshirt1.setSize(42);
        tshirt1.setPrice(300);

        Tshirt tshirt2=new Tshirt();
        tshirt2.setBrand("xworkz");
        tshirt2.setSize(42);
        tshirt2.setPrice(300);

    }
}
