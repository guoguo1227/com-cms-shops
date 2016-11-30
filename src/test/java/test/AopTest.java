package test;

import com.cms.shop.model.base.District;
import com.cms.shop.service.DistrictService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-application.xml","classpath:spring-dao.xml"})
public class AopTest {

    @Autowired
    DistrictService districtService;
    @Test
    public  void test(){

        District district = new District();
        district.setDistrictName("test");
        boolean success = districtService.addDistrict(district);
        System.out.println(success);
    }
}
