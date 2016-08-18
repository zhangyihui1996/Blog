package net.test.unit.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

	Book book = null;
	
	@Before
	public void setUp() throws Exception {
        System.out.println("testing start");
        book = new Book();
        System.out.println("book be init");
	}

	@After
	public void tearDown() throws Exception {
	    System.out.println("book be clearn");
        book = null;
        System.out.println("Testing finish");
	}

	   @Test
       public void caseId() {
           book.setId("001"); //设置id属性的值为001
           //使用Assert查看id属性的值是否为001
           assertEquals("001", book.getId());
           System.out.println("id be test");
       }
   
       @Test
       public void caseName() {
           book.setName("ASP"); //设置name属性的值为ASP
           //使用Assert查看name属性的值是否为JSP，这是个必然出现错误的测试
          assertEquals("ASP", book.getName());
           System.out.println("name be test");
       }

}
