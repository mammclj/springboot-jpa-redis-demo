package com.mmm.springboot.jparedisdemo.utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 *@Author 马孟孟【mamengmeng@msymobile.com】
 *@Date 2017/9/21 11:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CryptCodeUtilTest{
    private static final Logger logger = LoggerFactory.getLogger(CryptCodeUtilTest.class);
    String sourceString = "mamengmeng";
    @Test
    public void base64EncryptCode() throws Exception {
        String encryptedCode = CryptCodeUtil.base64EncryptCode(sourceString.getBytes());
        logger.info("字符串【"+sourceString+"】加密后为 {}",encryptedCode);
    }

    @Test
    public void base64DecryptCode() throws Exception {
        String encryptedCode = CryptCodeUtil.base64EncryptCode(sourceString.getBytes());
        String decryptedCode = CryptCodeUtil.base64DecryptCode(encryptedCode);
        logger.info("字符串【"+sourceString+"】加密后的字符串【"+encryptedCode+"】解密后为 {}",decryptedCode);
    }

}