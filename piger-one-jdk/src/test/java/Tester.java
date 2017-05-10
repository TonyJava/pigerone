import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by pigercc.liang on 2017/5/6.
 */
public class Tester {

    public static void main(String[] args) {
        C1 c1=new C1();
        System.out.println(c1.getBigDecimal());
    }
}


class  C1 implements Serializable
{
    private BigDecimal bigDecimal;

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }
}

//测试回滚