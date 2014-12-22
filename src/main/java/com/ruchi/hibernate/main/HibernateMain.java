package com.ruchi.hibernate.main;

import com.ruchi.hibernate.model.Restaurant;
import org.hibernate.Session;
import com.ruchi.hibernate.util.HibernateUtil;

/**
 * Created by Thamayanthy on 12/22/2014.
 */
public class HibernateMain {
    public static void main(String ... args){
        Restaurant restaurant=new Restaurant();
        restaurant.setCity_id("111111");
        restaurant.setRest_id("1222");
        restaurant.setRest_name("restaurant_name");
        restaurant.setFull_address("sadfsfdsfsdg");

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //start transaction
        session.beginTransaction();
        //Save the Model object
        session.save(restaurant);
        //Commit transaction
        session.getTransaction().commit();
        System.out.println("Restaurant ID="+restaurant.getRest_id());

        //terminate session factory, otherwise program won't end
        HibernateUtil.getSessionFactory().close();

    }
}
