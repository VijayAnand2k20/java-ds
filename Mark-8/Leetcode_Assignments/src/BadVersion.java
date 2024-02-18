public class BadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(3));
    }

    static boolean isBadVersion(int num) {
        return num>=2;
    }

    static int firstBadVersion(int n) {
        int start=1, end=n;
        while(start<end) {
            int mid= start + (end-start)/2;
            if(isBadVersion(mid)){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}