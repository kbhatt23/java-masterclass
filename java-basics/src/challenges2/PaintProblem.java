package challenges2;

public class PaintProblem {
	public static void main(String[] args) {
		System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
	}

//method to help find number of bukets to buy
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if (extraBuckets < 0 || width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		double areaNeededToPaint = width * height;
		double areaThatCanbeCoveredWithCurrentBuckets = extraBuckets * areaPerBucket;
		double extraAreaNeeded = areaNeededToPaint - areaThatCanbeCoveredWithCurrentBuckets;
		if (extraAreaNeeded <= 0) {
			return 0;
		}
		int newBucketsNeeded = (int) Math.ceil(extraAreaNeeded / areaPerBucket);
		return newBucketsNeeded;
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		return getBucketCount(width, height, areaPerBucket, 0);
	}
	public static int getBucketCount(double area, double areaPerBucket) {
		if (area <= 0 ||areaPerBucket <= 0) {
			return -1;
		}
		int extraBuckets = 0;
		double areaNeededToPaint = area;
		double areaThatCanbeCoveredWithCurrentBuckets = extraBuckets * areaPerBucket;
		double extraAreaNeeded = areaNeededToPaint - areaThatCanbeCoveredWithCurrentBuckets;
		if (extraAreaNeeded <= 0) {
			return 0;
		}
		int newBucketsNeeded = (int) Math.ceil(extraAreaNeeded / areaPerBucket);
		return newBucketsNeeded;
	}
}
