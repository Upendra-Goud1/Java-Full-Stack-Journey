package com;


public class Travel {
	
	

	public boolean isCarDriver(Driver driver) {
		 if (driver.getCategory().equalsIgnoreCase("Car")) {
	            return true;
	        }

	        return false;
	}
	
	public String retriveByDriverId(Driver [] drivers, int driverId){
		
		for(Driver driver:drivers) {
			if(driver.getDriverId() == driverId) {
				return " driver name is " + driver.getDriverName()+ "belonging to the category "+
			           driver.getCategory() + " travelled " + driver.getTotalDistance() + " km so far ";
			}
		}
		return null;
	}
	
	public int retriveCountOfDriver(Driver [] drivers, String category) {
		int count = 0;
		for(Driver driver:drivers) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				count++;
			}
		}
		return count;
	}
	
	public Driver [] retriveDriver(Driver[] drivers, String category) {
		
		int count = retriveCountOfDriver(drivers,category);
		
		Driver[] result = new Driver[count];
		int index = 0;
		
		for(Driver driver:drivers) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				result[index] = driver;
				index++;
			}
		}
		return result;
	}
	
	public Driver retriveMaximumDistanceTravelledDriver(Driver[] drivers) {
		if(drivers == null || drivers.length == 0) {
			return null;
		}
		Driver maximumDriver = drivers[0];
		
		for (int i = 1; i < drivers.length; i++) {

            if (drivers[i].getTotalDistance()
                    > maximumDriver.getTotalDistance()) {

                maximumDriver = drivers[i];
            }
        }

        return maximumDriver;
	}

}
