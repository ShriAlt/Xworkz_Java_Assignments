package com.xworkz.sunday;

public class Country {
    PrimeMinister primeMinister;
    String name="INDIA";
    State[] states;
    public Country(){
        System.out.println("Country details");
    }
    public Country(PrimeMinister primeMinister,State[] states){
        this.states=states;
        this.primeMinister=primeMinister;
    }


    public void display(){
        Ward ward=new Ward("Thirthahalli");
        Ward[] wards={ward};
        City city=new City("shivmogga",wards);
        City[] cities={city};
        District district=new District("Shivmogga",wards);
        District[] districts={district};
        Education education=new Education("BE","Shree devi institute of technology");
        Education[] educations={education};
        ExperienceDetail experienceDetail=new ExperienceDetail("Winman",educations);
        ExperienceDetail[] experienceDetails={experienceDetail};
        Experience experience=new Experience(4,experienceDetails);
        Skill skill=new Skill("Nothing",experience);
        Personnel personnel=new Personnel("Harsha",skill);
        Personnel[] personnels={personnel};
        Security security=new Security("high",personnels);

        State state=new State("Karnataka",districts,cities);
        states= new State[]{state};


        Detail detail=new Detail("Budget Allocation", "Managing National Budget", 12, "Ongoing");
        Detail[] details={detail};

        Portfolio portfolio=new Portfolio(details,10000,"finance");

        PersonalAssistant personalAssistant=new PersonalAssistant("Ananya",5);

        Room room=new Room("king size",300,607,true);
        Room[] rooms={room};

        Transport transport=new Transport("Car");

        HouseKeep houseKeep=new HouseKeep("sagar",transport);
        HouseKeep[] houseKeeps={houseKeep};

        House house=new House(rooms,houseKeeps,"Manglore");

        Minister minister=new Minister("Yadurappa",portfolio,personalAssistant,house);
        Minister[] ministers={minister};


        String primeName="Modi";
        primeMinister=new PrimeMinister(ministers,primeName);

        System.out.println(" country name:"+name);
        if(primeMinister!=null){
            primeMinister.displayPrimeMinister();
        }
        else System.out.println("primeminister is null");
        if(states!=null){
            for (State states:states){
                state.display();
        }
        }else System.out.println("states is null");



    }
}
