package demo1.com.demo.demo1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.demo.demo1.F;
/**
 * 
 * @author liu
 * @Date :2017-05-03
 * @version v-1.0
 * @since v -1.0
 * F test
 *
 */
public class TestF {
	private static F f=null;
	@Before
	public void init(){
		f=new F();
		
	}
	@Test
	public void testPrint() {
		int version=f.print();
		Assert.assertTrue(version==1);
	}

}
