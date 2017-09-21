package com.mmm.springboot.jparedisdemo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/**
 *@Author 马孟孟【mamengmeng@msymobile.com】
 *@Date 2017/9/21 11:05
 */
public class CryptCodeUtil {
    private static final Logger logger = LoggerFactory.getLogger(CryptCodeUtil.class);

    /**
     * 将字符串进行base64加密
     * @param data 需要加密的字符串
     * @return
     */
    public static String base64EncryptCode(byte[] data){
        return new BASE64Encoder().encode(data);
    }

    /**
     * 将base64加密后的密文进行base64解密
     * @param data 需要解密的密文
     * @return
     * @throws Exception
     */
    public static String base64DecryptCode(String data) throws Exception {
        return new String(new BASE64Decoder().decodeBuffer(data));
    }
}
