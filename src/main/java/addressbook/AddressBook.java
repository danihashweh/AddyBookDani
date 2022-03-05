package addressbook;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "addressBook")
    private List<BuddyInfo> listOfBuddyInfos;

    public AddressBook(){
        this(null);
    }

    public AddressBook(Long id) {
        this.id = id;
        this.listOfBuddyInfos = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null) {
            listOfBuddyInfos.add(buddy);
        }
    }

    public void removeBuddy(int index){
        if(index < listOfBuddyInfos.size()) {
            listOfBuddyInfos.remove(index);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<BuddyInfo> getBuddies(){
        return listOfBuddyInfos;
    }

    public BuddyInfo getBuddy(String name) {
        for (BuddyInfo buddy: listOfBuddyInfos) {
            if (buddy.getName().equals(name)) return buddy;
        }
        return null;
    }

    public void setBuddies(List<BuddyInfo> buddies) {
        this.listOfBuddyInfos = buddies;
    }

    public int getSizeOfAddressBook(){
        return(listOfBuddyInfos.size());
    }

//    public static void main(String[] args){
//        //Create address book
//        AddressBook book = new AddressBook(0L);
//
//        //Add two buddy's to the address book
//        book.addBuddy(new BuddyInfo("Dani", "6130001111"));
//        book.addBuddy(new BuddyInfo("Dani2", "6130002222"));
//
//        //Print out the information in the address book.
//        System.out.println("First entry Name: " + book.listOfBuddyInfos.get(0).getName());
//        System.out.println("First entry Phone number: " + book.listOfBuddyInfos.get(0).getPhoneNumber());
//
//        System.out.println("Second entry Name: " + book.listOfBuddyInfos.get(1).getName());
//        System.out.println("Second entry Phone number: " + book.listOfBuddyInfos.get(1).getPhoneNumber());
//    }
}
