package chapter_6;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *  ��������
 * @author zhu_ming
 * @since v_1.0 2020-11-19
 */
public class MethoDes {

  /**
   *  ��������Ч��
   */
  public BigDecimal mod (BigInteger m){
    if(m.signum() <=0 )
      throw  new ArithmeticException("modules <= 0" + m);


    return null;
  }

  public static void main(String[] args) {
    MethoDes des = new MethoDes();
    des.mod(new BigInteger("-1"));

  }

}
