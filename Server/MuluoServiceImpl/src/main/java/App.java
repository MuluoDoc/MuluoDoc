
import com.alibaba.fastjson.JSON;
import com.ic5e.muluo.db.entity.user.UserVO;
import com.ic5e.muluo.dto.UserDto;
import com.ic5e.muluo.util.beans.BeanUtils;

public class App 
{
	public static String [] ignoreProperties = {"islocked"};
    public static void main( String[] args )
    {
        UserVO vo = new UserVO();
        vo.setCode("1111");
        UserDto dto = new UserDto();
        dto.setEmail("11111");
        dto.setIslocked(true);
        BeanUtils.copyProperties(vo, dto,ignoreProperties);
        System.out.println(JSON.toJSONString(dto));
    }
}