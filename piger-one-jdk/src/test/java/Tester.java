import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by pigercc.liang on 2017/5/6.
 */
public class Tester {

    public static void main(String[] args) {

        long currentTime =System.currentTimeMillis();

        List<Long> trackIds =new ArrayList<Long>();

        trackIds.add(5L);
        trackIds.add(3L);
        trackIds.add(4L);



        System.out.println(trackIds);

        Collections.sort(trackIds,Collections.<Long>reverseOrder());
        System.out.println(trackIds);

        Calendar calendar =Calendar.getInstance();
        calendar.setTime(new Date(currentTime));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
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