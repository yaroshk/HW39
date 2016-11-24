package core;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

 

public class AppTest {

@BeforeClass
       public static void beforeClass() throws Exception {
                                                          }
@AfterClass
       public static void afterClass() throws Exception  {
                                                          }
@Before
       public void beforeMethod() throws Exception       {
                                                          }
@After
       public void afterMethod() throws Exception       {
                                                         }
@Test // @Ignore
       public void test_01_AssertEquals_Positive()      {
       assertEquals("Not equal", "Who is the boss???", App.boss);   }
@Test // @Ignore
       public void test_02_AssertEquals_Negative()      {
       assertEquals("Not equal", "JUnit 4.13", App.boss);   }
@Test @Ignore
       public void test_03_AssertEquals_Igno­­red()       {
       assertEquals("Not equal", "JUnit 4.12", App.boss);   }
@Test // @Ignore
       public void test_04_AssertSame_Positive()        {
       assertSame("Integer not the same", 50, App.i);    }
@Test // @Ignore
       public void test_05_AssertSame_Negative()        {
       assertSame("Integer not the same", 40, App.i);    }
@Test @Ignore
       public void test_06_AssertSame_Ignored()         {
       assertSame("Integer not the same", 39, App.i);    }
@Test // @Ignore
       public void test_07_AssertFalse_Positive()       {
       assertFalse("Must be false", App.f);             
       }
}
