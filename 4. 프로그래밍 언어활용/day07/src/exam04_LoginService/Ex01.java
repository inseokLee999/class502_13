package exam04_LoginService;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        try {
            service.login("user02", "123456");
        }catch(UserIdException | UserPwException e){
            System.out.println(e.getMessage());
        }
    }
}
