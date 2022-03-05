package addressbook;

import static org.junit.Assert.*;

public class AddressBookTest {

    /**
     * Test the addition of a buddy from the address book.
     */
    @org.junit.Test
    public void addBuddy() {
        AddressBook book = new AddressBook(0L);
        book.addBuddy(new BuddyInfo("Dani", "6130009090"));
        book.addBuddy(new BuddyInfo("Dani2", "6130002222"));
        //The buddy count in book should be 2 after two buddies are added.
        assertEquals(2, book.getSizeOfAddressBook());
    }

    /**
     * Test the removal of a buddy from the address book.
     */
    @org.junit.Test
    public void removeBuddy() {
        AddressBook book = new AddressBook(0L);
        book.addBuddy(new BuddyInfo("Dani", "6130009090"));
        book.removeBuddy(0);
        //The buddy count in book should be 0 after the removal.
        assertEquals(0, book.getSizeOfAddressBook());
    }


}