package test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-30
 */
public class TestPython {

    private final static Logger logger = LoggerFactory.getLogger(TestPython.class);
    private String PYTHONBINPATH="/usr/bin/python";

    private String PY_MAIN="/home/samuel/shop/shopcms/src/test/java/test/python/ElasticsearchUtil.py";

    private String WORD_MAIN = "/home/samuel/shop/shopcms/src/test/java/test/python/Word.py";
    @Test
    public void test(){

        BufferedReader reader = null;
        StringBuffer stringBuffer = new StringBuffer();
        String shellCommand = PYTHONBINPATH+" " + PY_MAIN;
        logger.info("shell command : "+shellCommand);
        try {
            Process pid = null;
            //String[] cmd = {"/bin/sh","-c",shellCommand};
            //
            pid = Runtime.getRuntime().exec(shellCommand);
            if(pid != null){
                reader = new BufferedReader(new InputStreamReader(pid.getInputStream()),1024);
                pid.waitFor();
            }
            String line = null;
            // 读取Shell的输出内容，并添加到stringBuffer中
            while (reader != null && (line = reader.readLine()) != null) {
                stringBuffer.append(line).append("\t");
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            logger.info(stringBuffer.toString());
        }


    }
}
