package com.ruchi.hibernate.main;

import com.ruchi.hibernate.model.Restaurant;
import com.ruchi.hibernate.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by Thamayanthy on 12/22/2014.
 */
public class HibernateMain {
    public static void main(String ... args){
        Restaurant restaurant=new Restaurant();
//        restaurant.setCity_id("111111");
        restaurant.setRest_id("1408181771009");
//        restaurant.setRest_name("restaurant_name");
//        restaurant.setFull_address("sadfsfdsfsdg");

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //start transaction
        session.beginTransaction();
        session.save(restaurant);
        //Save the Model object
//        session.save(restaurant);
        //Commit transaction
//        session.getTransaction().commit();
//        System.out.println("Restaurant ID="+restaurant.getRest_id());
//        System.out.println(session.get(Restaurant.class, (java.io.Serializable) restaurant.getRest_id()));
        //terminate session factory, otherwise program won't end
        HibernateUtil.getSessionFactory().close();

    }
}
