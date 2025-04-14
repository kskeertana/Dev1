package com.dsce1;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.dsce.app;
public class apptest {
@Test
public void testlogin1()
{
app myapp=new app();

Assert.assertEquals(0,myapp.userlogin("abc","abc1234"));
}
@Test
public void testlogin2()
{
app myapp=new app();
Assert.assertEquals(1,myapp.userlogin("abc","abc@1234"));
}
}