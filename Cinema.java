package task3;

import java.time.LocalTime;
import java.util.List;


public class Cinema {
  private class Film {
	  private String name;
	  private Integer duration;
	  private String genre;
	  
	  public Film( String name, Integer duration, String genre) {
		  this.setName(name);
		  this.setDuration(duration);
		  this.setGenre(genre);
		  
	  }

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private Integer getDuration() {
		return duration;
	}

	private void setDuration(Integer duration) {
		this.duration = duration;
	}

	private String getGenre() {
		return genre;
	}

	private void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return ("Film " + name  + " Duration " +  duration + " Genre " + genre);
	}
  }
  private List<Session> sessions;
  private String address;
  
  private class Session {
	  private String name;
	  private Film film;
	  private LocalTime startTime;
	  
	  public Session(String name, LocalTime startTime, Film film) {
			this.name = name;
			this.startTime = startTime;
			this.film = film;
	    }
	    public Session() {
		  
	    }
	    public String getName() {
			return this.name;
		}
		public LocalTime getStartTime() {
			return this.startTime;
		}
		public Film getFilm() {
			return this.film;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setStartTime(LocalTime startTime) {
			this.startTime = startTime;
      }
		public void setFilm(Film film) {
			this.film = film;
      }
		@Override
		public String toString() {
			return ("Cinema " + name + " Work time " + startTime + " Name of film " + film.toString());
		}
  }
  public void addSession(String name, String address, LocalTime startTime, Film film) {
	  Session session =new Session(name, startTime, film);
	  sessions.add(session);
	    }
  public List<Session> getSessions() {
		return this.sessions;
	    }
	
	    public Session getSession(String name) {
		for (Session item : sessions) {
			if (item.getName().equals(name)) {
				return item;
			}
		}
		return null;
      }
}




