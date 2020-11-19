package chapter_5.ext;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ���ע�Ȿ��û��ע������Ԫ�أ���ô��ʹ��ע���ʱ�����ʡ��()��ֱ��дΪ��@ע���������ͱ�׼�﷨@ע����()��Ч��
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
@Documented
public @interface FirstAnnotation {

}
