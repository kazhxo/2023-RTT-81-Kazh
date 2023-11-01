package com.kazhan.hibernateuser;

import com.kazhan.hibernateuser.model.User;
import com.sofy.hibernateuser.controller.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserService obj= new UserService();
        //obj.findUser(4);
        
        //obj.updateUser(3);
        
        obj.deleteUser(3);
        
    }
}
