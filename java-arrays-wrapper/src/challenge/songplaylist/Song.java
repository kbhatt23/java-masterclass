package challenge.songplaylist;

public class Song {
	//asuming each title will be unique for each song
	private String title;
	//duration in milli seconds
	//will simulate using Thread.sleep
	private long duration;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	public Song(String title, long duration) {
		this.title = title;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", duration=" + duration + "]";
	}
	public String getTitle() {
		return title;
	}
	public long getDuration() {
		return duration;
	}
}
