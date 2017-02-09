package ab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zeningjiang on 2/2/2017.
 */
@Controller
public class AddressBookController {

    @RequestMapping(value = "/buddyinfo", method = RequestMethod.GET)
    public String addressbookForm(Model model){
        model.addAttribute("buddyinfo", new BuddyInfo());
        return "buddyinfo";
    }

    @RequestMapping(value = "/buddyinfo", method = RequestMethod.POST)
    public String addressbookSubmit(@ModelAttribute BuddyInfo buddyinfo) {
        return "result";
    }
}
