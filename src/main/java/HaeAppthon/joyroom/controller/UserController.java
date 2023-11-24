//package HaeAppthon.joyroom.controller;
//
//import HaeAppthon.joyroom.packet.responsebody.LoginResponseBody;
//import HaeAppthon.joyroom.packet.resquestbody.LoginRequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//public class UserController {
//    @PostMapping("/login")
//    public LoginResponseBody login(@RequestBody LoginRequestBody requestBody){
//        User user = new User();
//        user.setId(requestBody.getId());
//        user.setPassword(requestBody.getPassword());
//
//        return userService.login(user);
//    }
//
//    @PostMapping("/signup")
//    public LoginResponseBody signup(@RequestBody LoginRequestBody requestBody){
//        User user = new User();
//        user.setId(requestBody.getId());
//        user.setPassword(requestBody.getPassword());
//
//        return userService.signup(user);
//    }
//}
