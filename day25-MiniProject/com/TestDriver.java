package com;

public class TestDriver {

    public static void main(String[] args) {

        // Create Driver objects
        Driver d1 = new Driver(101, "Sudhagar", "Car", 4200);
        Driver d2 = new Driver(102, "Ramesh", "Bike", 6500);
        Driver d3 = new Driver(103, "Kiran", "Car", 3800);
        Driver d4 = new Driver(104, "Suresh", "Bus", 7200);
        Driver d5 = new Driver(105, "Rajesh", "Car", 5500);

        // Store Driver objects in an array
        Driver[] drivers = { d1, d2, d3, d4, d5 };

        // Create Travel object
        Travel travel = new Travel();

        // ------------------------------------------------
        // 1. Test isCarDriver()
        // ------------------------------------------------

        System.out.println("----- isCarDriver -----");

        System.out.println(
                d1.getDriverName() + " is Car Driver: "
                + travel.isCarDriver(d1)
        );

        System.out.println(
                d2.getDriverName() + " is Car Driver: "
                + travel.isCarDriver(d2)
        );


        // ------------------------------------------------
        // 2. Test retrivebyDriverId()
        // ------------------------------------------------

        System.out.println("\n----- retrivebyDriverId -----");

        String result = travel.retriveByDriverId(drivers, 101);

        System.out.println(result);


        // ------------------------------------------------
        // 3. Test retriveCountOfDriver()
        // ------------------------------------------------

        System.out.println("\n----- retriveCountOfDriver -----");

        int count = travel.retriveCountOfDriver(drivers, "Car");

        System.out.println("Number of Car drivers: " + count);


        // ------------------------------------------------
        // 4. Test retriveDriver()
        // ------------------------------------------------

        System.out.println("\n----- retriveDriver -----");

        Driver[] carDrivers = travel.retriveDriver(drivers, "Car");

        System.out.println("Car drivers:");

        for (Driver driver : carDrivers) {
            System.out.println(driver);
        }


        // ------------------------------------------------
        // 5. Test retriveMaximumDistanceTravelledDriver()
        // ------------------------------------------------

        System.out.println("\n----- retriveMaximumDistanceTravelledDriver -----");

        Driver maxDriver =
                travel.retriveMaximumDistanceTravelledDriver(drivers);

        System.out.println("Driver with maximum distance:");

        System.out.println(maxDriver);
    }
}