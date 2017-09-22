import com.piger.jspider.mapper.DetailMapper;
import com.piger.jspider.mapper.TbDetailMapper;
import com.piger.jspider.model.Detail;
import com.piger.jspider.model.TbDetail;
import com.piger.jspider.mybatis.JspiderDataSourceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Test;
import java.io.InputStream;
import javax.sql.DataSource;

/**
 * Created by pigercc.liang on 2017/5/21.
 */
public class MybatisTest {

    @Test
    public void testFromCode() throws Exception
    {
        DataSource dataSource = JspiderDataSourceFactory.getDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.addMapper(DetailMapper.class);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            DetailMapper mapper = session.getMapper(DetailMapper.class);
            Detail detail = mapper.selectDetail(6);
            System.out.println(detail);
        } finally {
            session.close();
        }

    }

    @Test
    public void testFromXml() throws Exception
    {
        InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        try
        {
            TbDetailMapper tbDetailMapper =session.getMapper(TbDetailMapper.class);
            TbDetail tbDetail =tbDetailMapper.selectByPrimaryKey(1L);
            System.out.println(tbDetail.getTitle());
        }finally {
            session.close();
        }
    }
}
