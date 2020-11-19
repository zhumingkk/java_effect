package chapter_5.ext;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ���ע���е�ĳ��ע������Ԫ����һ���������ͣ���ʹ��ʱ�ֳ���ֻ��Ҫ����һ��ֵ���������ô��ʹ��ע��ʱ����ֱ��дΪ��@ע����(������ = ����ֵ)�����ͱ�׼д����@ע����(������ = {����ֵ})��Ч��
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
@Documented
public @interface ThirdAnnotation {
  String [] name();
}
