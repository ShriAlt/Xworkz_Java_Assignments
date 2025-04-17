package com.xworkz.runner;

import com.xworkz.internal.*;

public class MainRunner {
    public static void main(String[] args) {
        Fan fan = new FanImpl();
        fan.rule();
        fan.changeSpeed();
        fan.turnOff();
        fan.turnOn();
        Oven oven = new OvenImpl();
        oven.rule();
        oven.bake();
        oven.preheat();
        oven.shutDown();
        Laptop laptop = new LaptopImpl();
        laptop.rule();
        laptop.powerOn();
        laptop.runProgram();
        laptop.sleepMode();
        Phone phone = new PhoneImpl();
        phone.rule();
        phone.makeCall();
        phone.sendText();
        phone.takePhoto();
        Car car = new CarImpl();
        car.rule();
        car.accelerate();
        car.brake();
        car.accelerate();
        Camera camera = new CameraImpl();
        camera.rule();
        camera.capture();
        camera.zoomIn();
        camera.zoomOut();
        Watch watch = new WatchImpl();
        watch.rule();
        watch.setAlarm();
        watch.showTime();
        watch.startTimer();
        Television television = new TelevisionImpl();
        television.rule();
        television.increaseVolume();
        television.powerOff();
        television.switchChannel();
        Microwave microwave = new MicrowaveImpl();
        microwave.rule();
        microwave.setTimer();
        microwave.startHeating();
        microwave.stopHeating();
        Printer printer = new PrinterImpl();
        printer.rule();
        printer.cancelJob();
        printer.printDocument();
        printer.scanDocument();
        Router router = new RouterImpl();
        router.rule();
        router.resetRouter();
        router.checkSignal();
        router.connectInternet();
        Refrigerator refrigerator = new RefrigeratorImpl();
        refrigerator.rule();
        refrigerator.coolItems();
        Speaker speaker = new SpeakerImpl();
        speaker.rule();
        speaker.adjustVolume();
        speaker.pauseMusic();
        speaker.playMusic();
        Projector projector = new ProjectorImpl();
        projector.rule();
        projector.adjustFocus();
        projector.powerDown();
        projector.projectImage();
        Headphones headphones = new HeadphonesImpl();
        headphones.rule();
        headphones.connectBluetooth();
        headphones.connectBluetooth();
        headphones.decreaseVolume();
        Tablet tablet = new TabletImpl();
        tablet.rule();
        tablet.lockDevice();
        tablet.openApp();
        tablet.rotateScreen();
        Desk desk = new DeskImpl();
        desk.rule();
        desk.adjustHeight();
        desk.closeDrawer();
        desk.openDrawer();
        Chair chair = new ChairImpl();
        chair.rule();
        chair.recline();
        chair.sit();
        chair.roll();
        Shoe shoe = new ShoeImpl();
        shoe.rule();
        shoe.remove();
        shoe.tieLaces();
        shoe.wear();
        Book book = new BookImpl();
        book.rule();
        book.bookmarkPage();
        Pen pen = new PenImpl();
        pen.rule();
        pen.draw();
        Lamp lamp = new LampImpl();
        lamp.rule();
        lamp.switchOff();
        Mug mug = new MugImpl();
        mug.rule();
        mug.clean();
        mug.sip();
        mug.fill();
        Bottle bottle = new BottleImpl();
        bottle.rule();
        bottle.closeCap();
        bottle.openCap();
        bottle.pourWater();

        Backpack backpack = new BackpackImpl();
        backpack.rule();
        backpack.storeItem();
        backpack.zipClose();
        backpack.zipOpen();
        Window window = new WindowImpl();
        window.rule();
        window.closeWindow();
        window.closeWindow();
        window.openWindow();
        Door door = new DoorImpl();
        door.rule();
        door.closeDoor();
        door.openDoor();
        door.closeDoor();
        Bicycle bicycle = new BicycleImpl();
        bicycle.rule();
        bicycle.brake();
        Scooter scooter = new ScooterImpl();
        scooter.rule();
        scooter.kickStart();
        scooter.park();
        scooter.ride();
        Drill drill = new DrillImpl();
        drill.rule();
        drill.startDrill();
        drill.stopDrill();
        drill.changeBit();
        Hammer hammer = new HammerImpl();
        hammer.rule();
        Keyboard keyboard = new KeyboardImpl();
        keyboard.rule();
        Mouse mouse = new MouseImpl();
        mouse.rule();
        Monitor monitor = new MonitorImpl();
        monitor.rule();
        Calculator calculator = new CalculatorImpl();
        calculator.rule();
        Remote remote = new RemoteImpl();
        remote.rule();
        Fridge fridge = new FridgeImpl();
        fridge.rule();
        WashingMachine washingmachine = new WashingMachineImpl();
        washingmachine.rule();
        Dishwasher dishwasher = new DishwasherImpl();
        dishwasher.rule();
        Toaster toaster = new ToasterImpl();
        toaster.rule();
        Mixer mixer = new MixerImpl();
        mixer.rule();
        Blender blender = new BlenderImpl();
        blender.rule();
        Juicer juicer = new JuicerImpl();
        juicer.rule();
        AirConditioner airconditioner = new AirConditionerImpl();
        Heater heater = new HeaterImpl();
        heater.rule();
        VacuumCleaner vacuumcleaner = new VacuumCleanerImpl();
        vacuumcleaner.rule();
        Broom broom = new BroomImpl();
        broom.rule();
        Mop mop = new MopImpl();
        mop.rule();
        Sunglasses sunglasses = new SunglassesImpl();
        sunglasses.rule();
        Helmet helmet = new HelmetImpl();
        helmet.rule();
        Flashlight flashlight = new FlashlightImpl();
        flashlight.rule();
        Rope rope = new RopeImpl();
        rope.rule();
        Ladder ladder = new LadderImpl();
        ladder.rule();
        Notebook notebook = new NotebookImpl();
        notebook.rule();
        Stapler stapler = new StaplerImpl();
        stapler.rule();
        Globe globe = new GlobeImpl();
        globe.rule();
        Whiteboard whiteboard = new WhiteboardImpl();
        whiteboard.rule();
        Calendar calendar = new CalendarImpl();
        calendar.rule();
        Clock clock = new ClockImpl();
        clock.rule();
        Bed bed = new BedImpl();
        bed.rule();
        Mattress mattress = new MattressImpl();
        mattress.rule();
        Pillow pillow = new PillowImpl();
        pillow.rule();
        Blanket blanket = new BlanketImpl();
        blanket.rule();
        Comb comb = new CombImpl();
        comb.rule();
        Brush brush = new BrushImpl();
        brush.rule();
        Toothbrush toothbrush = new ToothbrushImpl();
        toothbrush.rule();
        Towel towel = new TowelImpl();
        towel.rule();
        Plate plate = new PlateImpl();
        plate.rule();
        Bowl bowl = new BowlImpl();
        bowl.rule();
        Spoon spoon = new SpoonImpl();
        spoon.rule();
        Fork fork = new ForkImpl();
        fork.rule();
        Knife knife = new KnifeImpl();
        knife.rule();



        Fan fan1 = new FanOvenDevice();
        Oven oven1 = new FanOvenDevice();

        Oven oven2 = new OvenLaptopDevice();
        Laptop laptop1 = new OvenLaptopDevice();

        Laptop laptop2 = new LaptopPhoneDevice();
        Phone phone1 = new LaptopPhoneDevice();

        Phone phone2 = new PhoneCarDevice();
        Car car1 = new PhoneCarDevice();

        Car car2 = new CarCameraDevice();
        Camera camera1 = new CarCameraDevice();

        Camera camera2 = new CameraWatchDevice();
        Watch watch1 = new CameraWatchDevice();

        Watch watch2 = new WatchTelevisionDevice();
        Television tv1 = new WatchTelevisionDevice();

        Television tv2 = new TelevisionMicrowaveDevice();
        Microwave microwave1 = new TelevisionMicrowaveDevice();

        Microwave microwave2 = new MicrowavePrinterDevice();
        Printer printer1 = new MicrowavePrinterDevice();

        Printer printer2 = new PrinterRouterDevice();
        Router router1 = new PrinterRouterDevice();

        Router router2 = new RouterRefrigeratorDevice();
        Refrigerator fridge1 = new RouterRefrigeratorDevice();

        Refrigerator fridge2 = new RefrigeratorSpeakerDevice();
        Speaker speaker1 = new RefrigeratorSpeakerDevice();

        Speaker speaker2 = new SpeakerProjectorDevice();
        Projector projector1 = new SpeakerProjectorDevice();

        Projector projector2 = new ProjectorHeadphonesDevice();
        Headphones headphones1 = new ProjectorHeadphonesDevice();

        Headphones headphones2 = new HeadphonesTabletDevice();
        Tablet tablet1 = new HeadphonesTabletDevice();

        Tablet tablet2 = new TabletDeskDevice();
        Desk desk1 = new TabletDeskDevice();

        Desk desk2 = new DeskChairDevice();
        Chair chair1 = new DeskChairDevice();

        Chair chair2 = new ChairShoeDevice();
        Shoe shoe1 = new ChairShoeDevice();

        Shoe shoe2 = new ShoeBookDevice();
        Book book1 = new ShoeBookDevice();

        Book book2 = new BookPenDevice();
        Pen pen1 = new BookPenDevice();

        Pen pen2 = new PenLampDevice();
        Lamp lamp1 = new PenLampDevice();

        Lamp lamp2 = new LampMugDevice();
        Mug mug1 = new LampMugDevice();

        Mug mug2 = new MugBottleDevice();
        Bottle bottle1 = new MugBottleDevice();

        Bottle bottle2 = new BottleBackpackDevice();
        Backpack backpack1 = new BottleBackpackDevice();

        Backpack backpack2 = new BackpackWindowDevice();
        Window window1 = new BackpackWindowDevice();

        airconditioner.adjust();

    }
}
