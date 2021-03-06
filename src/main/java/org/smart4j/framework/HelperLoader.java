package org.smart4j.framework;

import org.smart4j.framework.helper.*;
import org.smart4j.framework.util.ClassUtil;

/**
 * 加载相应的Helper类
 * Created by sone on 2018/4/24.
 */
public final class HelperLoader {

    public static void init(){

        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class};

        for (Class<?> cls : classList){
            ClassUtil.loadClass(cls.getName(),false);
        }
    }

}
