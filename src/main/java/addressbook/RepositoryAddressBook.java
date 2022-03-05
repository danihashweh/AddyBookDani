package addressbook;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "addressbook", path = "addressbook")
public interface RepositoryAddressBook extends PagingAndSortingRepository<AddressBook, Long> {
        List<AddressBook> findAddressBookById(@Param("id") Long id);
    }
