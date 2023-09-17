import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyCollection;

    public void addBuddy(BuddyInfo buddy){
        buddyCollection.add(buddy);

    }
    public void removeBuddy(BuddyInfo buddy){
        buddyCollection.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613-123-4567");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
