package challenge.songplaylist;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	private List<Song> songsList;

	public List<Song> getSongsList() {
		return songsList;
	}
	public void addSongToPlayList(Song song) {
		if(songsList.contains(song)) {
			System.err.println("Song is already added to the playlist");
		}else {
			//we always do lifo -> whoever gets added at the end will be played at the last
			songsList.add(song);
		}
	}

	public PlayList() {
		this.songsList = new ArrayList<Song>();
	}
	
}
