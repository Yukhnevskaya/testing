package task2;
import java.time.LocalTime;
import java.util.List;

public class Park {
	private List<Attraction> attractions;
	
	private class Attraction{
		private String name;
		private Integer cost;
	    private LocalTime startTime;
	    private LocalTime endTime;
		
		public Attraction(String name, Integer cost, LocalTime startTime, LocalTime endTime) {
			this.name = name;
			this.cost = cost;
			this.startTime = startTime;
			this.endTime = endTime;
	    }
		public Attraction() {
			
		}
		
		public String getName() {
			return this.name;
		}
		public Integer getCost() {
			return this.cost;
		}
		public LocalTime getStartTime() {
			return this.startTime;
		}
		public LocalTime getEndTime() {
			return this.endTime;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setCost(Integer cost) {
			this.cost = cost;
       }
		public void setStartTime(LocalTime startTime) {
			this.startTime = startTime;
        }
		public void setEndTime(LocalTime endTime) {
			this.endTime = endTime;
        }
		@Override
		public String toString() {
			return ("An attraction " + name + "Work time" + startTime + "   " + endTime + "Cost" + cost);
		    
		}
	}

    public void addAttraction(String name, Integer cost, LocalTime startTime, LocalTime endTime) {
		Attraction attraction =new Attraction(name, cost, startTime, endTime);
		attractions.add(attraction);
	    }
	    
    public List<Attraction> getAttractions() {
		return this.attractions;
	    }
	
	    public Attraction getAttractionByName(String name) {
		for (Attraction item : attractions) {
			if (item.getName().equals(name)) {
				return item;
			}
		}
		return null;
        }
}


