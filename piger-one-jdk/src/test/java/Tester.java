import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by pigercc.liang on 2017/5/6.
 */
public class Tester {

    public static void main(String[] args) {

       C1 c1 =new C1();
       C2 c2 =new C2();
       c2.setId(123L);
       c1.setId(c2.getId());
    }
}


class  C1 implements Serializable
{
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
class C2
{
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

//测试回滚