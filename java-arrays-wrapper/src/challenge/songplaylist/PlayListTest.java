package challenge.songplaylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class PlayListTest {
	private static List<Album> albums = new ArrayList<Album>();
	private static List<Song> playList = new ArrayList<Song>();
	private static Scanner scanner = new Scanner(System.in);
	private static int currentSongIndex = 0;

	public static void main(String[] args) {
		PlayListTest obj = new PlayListTest();
		populateAlbums();
		boolean quit = false;
		while (!quit) {
			printInstructoins();
			if (scanner.hasNextInt()) {
				int option = scanner.nextInt();
				switch (option) {
				case 1:
					obj.listallsongs();
					break;
				case 2:
					obj.addSongToPlayList();
					break;
				case 3:
					obj.startPlayList();
					break;
				case 4:
					obj.startPlayListNext();
					break;
				case 5:
					obj.startPlayListPrevious();
					break;
				case 6:
					obj.startPlayList();
					break;
				case 7:
					obj.showPlayList();
					break;
				case 8:
					quit = true;
					break;

				default:
					break;
				}
			}
			scanner.nextLine();
		}
		scanner.close();
	}

	private void showPlayList() {
		playList.stream().forEach(song -> System.out.println("* "+song.getTitle()));
	}

	private void startPlayListPrevious() {
		currentSongIndex--;
		startPlayList();
	}

	private void startPlayListNext() {
		currentSongIndex++;
		startPlayList();
	}

	private void startPlayList() {
		if (playList.isEmpty()) {
			System.out.println("Play list is empty");
		} else {
				playSongInSeperateThread(playList);

		}
	}

	private void playSongInSeperateThread(List<Song> songs) {
		CompletableFuture.runAsync(() -> {
			for(; currentSongIndex < songs.size() ; currentSongIndex++) {
			Song song = playList.get(currentSongIndex);
			System.out.println("Started Playing song " + song.getTitle());
			try {
				Thread.sleep(song.getDuration());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Ended Playing song " + song.getTitle());
			}
		});
	}

	private void addSongToPlayList() {
		System.out.println("Please enter album name ");
		String albumName = scanner.next();
		System.out.println("Please enter song name from album");
		String songName = scanner.next();
		Album albumFound = albums.stream().filter(album -> album.getTitle().equals(albumName)).findFirst().orElse(null);
		if (albumFound == null) {
			System.err.println("Kindly enter valid album name");
			return;
		}
		Song songFound = albumFound.getSongList().stream().filter(song -> song.getTitle().equals(songName)).findFirst()
				.orElse(null);
		if (songFound == null) {
			System.err.println("Kindly enter valid song name");
			return;
		}
		playList.add(songFound);
	}

	private void listallsongs() {
		for (Album album : albums) {
			System.out.println("====================" + "Songs of Album " + album.getTitle() + "====================");
			List<Song> songList = album.getSongList();
			for (int i = 0; i < songList.size(); i++) {
				System.out.println((i + 1) + ". Song -> " + songList.get(i));
			}
		}
	}

	private static void printInstructoins() {
		System.out.println("Welcome to myplaylist app");
		System.out.println("Kindly Enter 1 to list all songs");
		System.out.println("Kindly Enter 2 to add song to playlist");
		System.out.println("Kindly Enter 3 to start the playlist");
		System.out.println("Kindly Enter 4 to go to next song");
		System.out.println("Kindly Enter 5 to go to previous song");
		System.out.println("Kindly Enter 6 to restart the last played song");
		System.out.println("Kindly Enter 7 to show playlist");
		System.out.println("Kindly Enter 8 to quit");
	}

	private static void populateAlbums() {
		List<Song> songs = new ArrayList<Song>();
		for (int i = 1; i < 6; i++) {
			// all songs will have 50000 ms as duration -> for quickness of setting up data
			songs.add(new Song("song_" + i + "_album_1", 15000));
		}
		Album album1 = new Album("album1", songs);

		songs = new ArrayList<Song>();
		for (int i = 1; i < 6; i++) {
			// all songs will have 50000 ms as duration -> for quickness of setting up data
			songs.add(new Song("song_" + i + "_album_2", 15000));
		}
		Album album2 = new Album("album2", songs);

		songs = new ArrayList<Song>();
		for (int i = 1; i < 6; i++) {
			// all songs will have 50000 ms as duration -> for quickness of setting up data
			songs.add(new Song("song_" + i + "_album_3", 15000));
		}
		Album album3 = new Album("album3", songs);

		songs = new ArrayList<Song>();
		for (int i = 1; i < 6; i++) {
			// all songs will have 50000 ms as duration -> for quickness of setting up data
			songs.add(new Song("song_" + i + "_album_4", 15000));
		}
		Album album4 = new Album("album4", songs);

		songs = new ArrayList<Song>();
		for (int i = 1; i < 6; i++) {
			// all songs will have 50000 ms as duration -> for quickness of setting up data
			songs.add(new Song("song_" + i + "_album_5", 15000));
		}
		Album album5 = new Album("album5", songs);
		albums.add(album1);
		albums.add(album2);
		albums.add(album3);
		albums.add(album4);
		albums.add(album5);
	}
}
