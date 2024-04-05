class Main{
    public static void main(String[] args) {
        System.out.println
        ("Inicianalizando....");
        System.out.println("car....");
        Car car = new Car("Toyota",new
        Account("Luis Lopez","AIW2321","luisl@hotmail.com",
        "13424"));
        car.passenger = 3;
        car.printDataCar();
        
        System.out.println("Uberx....");
        Uberx uberx = new Uberx
        ("MYE745",new Account ("Mario 
        Portillo","KWE13524",
        "mariop@hotmail.com","234524"),"Toyota","Corolla");
        Uberx.printDataCar();

        System.out,println("Uberblack....");
        Uberblack uberblack= new Uberblack
        ("MWEL3568", new Account("Andres 
        Gonzalez","JSD1257",
        "andresg@hotmail.com","234678"),
        "Nissan","Corolla")
        Uberblack.printDataCar();
        }

        System.out,println("Uberpool....");
        Uberpool uberpool= new Uberpool
        ("MWEL3568", new Account("Eduardo
        Mejia","UED7348",
        "eduardom@hotmail.com","384562"),
        "Mercedes","Corolla")
        Uberpool.printDataCar();
        
        }
    }
}