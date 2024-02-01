package org.quangphan.encryption;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class HmacSha256Demo {

    private static final String UTF_8 = "UTF-8";
    private static final String HMAC_ALGORITHM = "HmacSHA256";

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            byte[] hmacSha256 = HmacUtils.calcHmacSha256("VeryPay@2021".getBytes("UTF-8"), "{\"phone\":\"0084935210786\"}".getBytes("UTF-8"));
            System.out.println(String.format("Hex: %032x", new BigInteger(1, hmacSha256)));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(calculateHMac("VeryPay@2021", "{\"phone\":\"0084935210786\"}"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("=====");
        System.out.println(generateSHA256("VeryPay@2021", "{\"id\":\"11\"}"));
        System.out.println(generateSHA256("Verypay@2021", "{\"phone\":\"0084935210786\"}"));
    }

    public static final String ALGORITHM = "HmacSHA256";

    public static String calculateHMac(String key, String data) throws Exception {
        Mac sha256_HMAC = Mac.getInstance(ALGORITHM);
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), ALGORITHM);
        sha256_HMAC.init(secret_key);
        return byteArrayToHex(sha256_HMAC.doFinal(data.getBytes("UTF-8")));
    }

    public static String byteArrayToHex(byte[] a) {
        StringBuilder sb = new StringBuilder(a.length * 2);
        for (byte b : a) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static String generateSHA256(String key, String data)
            throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        Mac mac = Mac.getInstance(HMAC_ALGORITHM);
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(UTF_8), HMAC_ALGORITHM);
        mac.init(secretKey);
        byte[] bytes = mac.doFinal(data.getBytes(UTF_8));

        StringBuilder sb = new StringBuilder(bytes.length * 2);

        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }
}
