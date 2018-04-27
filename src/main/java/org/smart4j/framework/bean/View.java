package org.smart4j.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回视图对象
 * Created by sone on 2018/4/24.
 */
public class View {

    /**
     * 视图路径
     */
    private String path;

    /**
     * 模型数据
     */
    private Map<String,Object> model;


    public View(String path) {
        this.path = path;
        model = new HashMap<String,Object>();
    }

    public View addModel(String key, Object value){
        model.put(key,value);
        return this;
    }


    public Map<String,Object> getModel(){
        return model;
    }

    public String getPath() {
        return path;
    }
}
