package test.com.model;

import com.model.Hero;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tiaraju on 06/02/17.
 */
public class TestHero {

    @Test
    public void testHeroName(){
        Hero vuvuzela = new Hero("Vuvuzela");
        Assert.assertTrue(vuvuzela.getName().equalsIgnoreCase("Vuvuzela"));
    }
}
