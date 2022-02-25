import com.dao.StudentDao;
import com.uitl.GetSession;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Test {
    @org.junit.Test
    public void testStudentTwoTable(){
        SqlSession session= GetSession.getSqlSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
        List<HashMap<String, String>> hashMap = studentDao.selectTwoTable();
        for(HashMap<String, String> list:hashMap){
            Set<String> keySet = list.keySet();
            for (String key:keySet){
                System.out.println(key+":"+list.get(key));
            }
        }
    }
}
