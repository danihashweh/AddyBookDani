package addressbook;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BuddyInfoTest {

    private BuddyInfo buddy;

    @Before
    public void setUp() {
        buddy = new BuddyInfo("Dani", "6130001111");
    }

    @Test
    public void getName() {
        assertEquals(buddy.getName(), "Dani");
    }

    @Test
    public void setName() {
        buddy.setName("Dani3");
        assertEquals(buddy.getName(), "Dani3");
    }

    @Test
    public void getPhone() {
        assertEquals(buddy.getPhoneNumber(), "6130001111");
    }

    @Test
    public void setPhoneNumber() {
        buddy.setPhoneNumber("6131112222");
        assertEquals(buddy.getPhoneNumber(), "6131112222");
    }
}