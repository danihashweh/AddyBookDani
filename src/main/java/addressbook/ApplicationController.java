package addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ApplicationController {
    @Autowired
    RepositoryAddressBook repository;

    @GetMapping("/")
    public String indexModel(Model model) {
        AddressBook addressBook = new AddressBook(new Long(1));
        model.addAttribute("addressbook", addressBook);
        model.addAttribute("newBuddy", new BuddyInfo());
        return "addressbook";
    }

    @PostMapping("/")
    public String addBuddy(@ModelAttribute BuddyInfo buddy, Model model) {
        AddressBook addressBook  = repository.findById(new Long(1)).orElse(new AddressBook(new Long(1)));
        addressBook.addBuddy(buddy);
        buddy.setAddressBook(addressBook);
        repository.save(addressBook);

        model.addAttribute("addressbook", addressBook);
        model.addAttribute("newBuddy", new BuddyInfo());
        return "addressbook";
    }
}
