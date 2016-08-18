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
           book.setId("001"); //����id���Ե�ֵΪ001
           //ʹ��Assert�鿴id���Ե�ֵ�Ƿ�Ϊ001
           assertEquals("001", book.getId());
           System.out.println("id be test");
       }
   
       @Test
       public void caseName() {
           book.setName("ASP"); //����name���Ե�ֵΪASP
           //ʹ��Assert�鿴name���Ե�ֵ�Ƿ�ΪJSP�����Ǹ���Ȼ���ִ���Ĳ���
          assertEquals("ASP", book.getName());
           System.out.println("name be test");
       }

}
