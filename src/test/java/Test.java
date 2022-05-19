import com.sias.entity.city;
import com.sias.mapper.CityWeather;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Edgar
 * @create 2022-05-19 16:08
 * @faction:
 */
public class Test {


    @Autowired
    private CityWeather cityWeather;

   /* @org.junit.Test
    public void Test(){
        city city = cityWeather.selectById("CN101010100");
        System.out.println(city);
    }*/
}
