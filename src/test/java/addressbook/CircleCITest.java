package addressbook;

import addressbook.ApplicationController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest(classes= ApplicationController.class)
@AutoConfigureMockMvc
public class CircleCITest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RepositoryAddressBook mockRepo;


    /**
     * Basic test
     */
    @Test
    public void testCreateAddressBook() throws Exception {
        this.mockMvc.perform(post("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("")));
    }
}