package xmlresponseparser;
/**
 * 
 * @author kanis
 * This class is used for imagining a book
 */
public class Book {		
        private String title;
		private String author;
		private int publicationYear;
		private double averageRating;
		private int ratingsCount;
		private String imageUrl;
		
		// Add getters & setters for author, averageRating, and ratingsCount
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		public int getPublicationYear() {
			return publicationYear;
		}
		public void setPublicationYear(int publicationYear) {
			this.publicationYear = publicationYear;
		}
		
		/**
		 * This is public javadoc info
		 * @return String imageURL
		 */
		/*
		 * This will be ignored by javadoc as it is meant for inner showcasting and info to other dev of same project and api client
		 */
		public String getImageUrl() {
			return imageUrl;
		}
		
		/**
		 * 
		 * @param imageUrl as the image string url
		 */
		
		/*
		 * inner implementaion is hidden, this will be ignored for javadoc as this is for api developer communication
		 * @param imageUrl
		 */
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
	}