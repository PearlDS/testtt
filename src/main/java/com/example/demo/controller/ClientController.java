package com.example.demo.controller;



//@Controller
//@RequestMapping(path="/demo")
public class ClientController {
  //1 login or registration
  //2 list of appointments if exist
  //3 delete  appointment


       // @Autowired // This means to get the bean called userRepository
        // Which is auto-generated by Spring, we will use it to handle the data
      //  private UserRepository userRepository;
        //AppointmentSlot appointmentSlotrepository-----find all by id

//        @PostMapping(path="/add") // Map ONLY POST Requests
//        public @ResponseBody String addNewUser (@RequestParam String name
//                , @RequestParam String email) {
//            // @ResponseBody means the returned String is the response, not a view name
//            // @RequestParam means it is a parameter from the GET or POST request
//
//            User n = new User();
//            n.setName(name);
//            n.setEmail(email);
//            userRepository.save(n);
//            return "Saved";
//        }
//
//        @GetMapping(path="/all")
//        public @ResponseBody Iterable<User> getAllUsers() {
//            // This returns a JSON or XML with the users
//            return userRepository.findAll();
//        }
//    }
}
