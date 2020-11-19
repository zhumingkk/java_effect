package chapter_5.ext;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ���ע�Ȿ����ֻ��һ��ע������Ԫ�أ���������Ϊvalue����ô��ʹ��ע���ʱ�����ֱ��ʹ�ã�@ע����(ע��ֵ)�����Ч�ڣ�@ע����(value = ע��ֵ)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD})
@Documented
public @interface SencodAnnotation {

  String value();
}
