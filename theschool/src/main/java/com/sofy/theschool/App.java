package com.sofy.theschool;

import com.sofy.theschool.util.GenerateDataUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       GenerateDataUtil obj= new GenerateDataUtil();
      // obj.createDataManyToOne();
      // GenerateDataUtil.createDataOneToMany();
       
       //GenerateDataUtil.createDataOneToOne();
       GenerateDataUtil.createDataManyToMany();
       
    }
}
