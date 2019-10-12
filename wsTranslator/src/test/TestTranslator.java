/**
 * 
 */
package test;

import java.util.List;

import org.junit.Test;

import cn.com.webxml.EnglishChinese;
import cn.com.webxml.EnglishChineseSoap;

/**
 * 【业务编码】：调用翻译的webservice
 * @工程： wsTranslator
 * @类名： TestTranslator
 * @模块： 
 * @作者： 常雷雷
 * @创建日期： 2019年10月12日
 * @修改记录（修改时间、作者、原因）：
 */
public class TestTranslator {

    @Test
    public void translator() {
        /**
         * 1.提供服务
         * 2.提供具体的方法集合:端点
         * 3.某个具体的方法，给方法设置参数，获得返回值
         */
        EnglishChinese ws = new EnglishChinese();
        EnglishChineseSoap port = ws.getEnglishChineseSoap();
        List<String> stringList = port.translatorString("rose").getString();
        for(int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
