package challenge.songplaylist;

import java.util.List;
//data class
public class Album {

	private String title;
	private List<Song> songList;
	public Album(String title, List<Song> songList) {
		this.title = title;
		this.songList = songList;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Song> getSongList() {
		return songList;
	}
	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}
}
