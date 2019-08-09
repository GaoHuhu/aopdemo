package aopdemo;

interface UserManager {
    void addUser(String username,String password);

    void delUser(int userId);

    String findUserById(int userId);

    void modifyUser(int userId,String username,String password);
}
