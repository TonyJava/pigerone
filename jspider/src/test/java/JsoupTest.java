import com.piger.jspider.mapper.DetailMapper;
import com.piger.jspider.model.Detail;
import com.piger.jspider.model.Star;
import com.piger.jspider.model.Tag;
import com.piger.jspider.mybatis.JspiderDataSourceFactory;
import com.piger.jspider.parse.DetailHelper;
import com.piger.util.JsoupUtil;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pigercc.liang on 2017/5/20.
 */
public class JsoupTest {

    public final static String url = "http://www.j12lib.com/cn/vl_newrelease.php";

    @Test
    public void test() throws Exception {
        String url = "http://www.j12lib.com/cn/?v="+"javlikjg64";
        printHtml(url);
    }

    private void printHtml(String url) throws Exception {
        Document doc = JsoupUtil.parse(url);
        System.out.println(doc.html());
    }

    @Test
    public void getDetail() throws Exception {

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

            for(String hashUrl:new String[]{"javlijbr2e" ,"javlikj5yy","javlikjg64"})
            {
                String url = "http://www.j12lib.com/cn/?v="+hashUrl;
                Document doc = JsoupUtil.parse(url);
                Detail detailPage= DetailHelper.parseDetail(doc);
                mapper.insertDetail(detailPage);
                System.out.println(detailPage);
            }
        } finally {
            session.commit();
            session.close();
        }


    }
}
