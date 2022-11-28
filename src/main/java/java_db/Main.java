/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_db;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;

/**
 *
 * @author Benjamin
 */
public class Main {
    public static void main(String[] args) {
		Cart cart = new Cart();
		cart.setName("MyCart");

		Item item1 = new Item();
		item1.setItem_id("IT1");
		item1.setQuantity(5);
		item1.setItem_total(item1.getQuantity() * 5);
		item1.setCart_id(cart);

		Item item2 = new Item();
		item2.setItem_id("IT2");
		item2.setQuantity(5);
		item2.setItem_total(item1.getQuantity() * 3);
		item2.setCart_id(cart);

		Set<Item> itemSet = new HashSet<>();
		itemSet.add(item1);
		itemSet.add(item2);

		cart.setItemSet(itemSet);
		cart.setTotal(item1.getItem_total() + item2.getItem_total());

		
		//Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
		session.save(cart);
		session.save(item1);
		session.save(item2);

		//session.save(emp);
		//EmployeeTest.readEmployee(session,1);
		//Commit transaction
		session.getTransaction().commit();
		System.out.println("Cart ID: "+cart.getCart_id());
		//System.out.println("Employee ID="+emp.getId());
		
		//terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}
}
