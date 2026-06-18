// Practice 6: Duplicate Finder

public class DuplicateFinder {
    public static void main(String[] args) {

        String[] guests = {
            "Aarav", "Maya", "Sita", "Aarav",
            "Ram", "Maya", "Nabin", "Sita"
        };

        System.out.println("Duplicate guest names:");

        for (int i = 0; i < guests.length; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (guests[i].equals(guests[k])) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue; // avoids printing the same duplicate name again
            }

            for (int j = i + 1; j < guests.length; j++) {
                if (guests[i].equals(guests[j])) {
                    System.out.println(guests[i]);
                    break;
                }
            }
        }
    }
}
