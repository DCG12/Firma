package com.company;


import java.io.File;
import java.io.FileOutputStream;
import java.security.*;

public class Utils {


    public static boolean areKeysPresent() {
        File keyprivate = new File("private.key");
        File keypublic = new File("public.key");
        if ((keyprivate.exists()) && (keypublic.exists())) {
            return true;
        } else {
            return false;
        }
    }

    public static KeyPair generateKey(String PRIVATE_KEY_FILE, String PUBLIC_KEY_FILE) {
        KeyPair key = null;
        try {
            KeyPairGenerator generador = KeyPairGenerator.getInstance("RSA");
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            generador.initialize(1024);
            key = generador.genKeyPair();

            FileOutputStream salidaprivada = new FileOutputStream(PRIVATE_KEY_FILE);

            String privat = String.valueOf(key.getPrivate());
            salidaprivada.write(Integer.parseInt(privat));

            FileOutputStream salidapublic = new FileOutputStream(PUBLIC_KEY_FILE);

            String publica = String.valueOf(key.getPublic());
            salidapublic.write(Integer.parseInt(publica));


        } catch (Exception e) {
            e.printStackTrace();
        }
        return key;
    }
}
/*
    public static byte[] digestiona(File f, String md5) {

    }


    public static byte[] signar(byte[] digestionat, PrivateKey prik) {
    }

    public static void write(){

    }

    public static void concatenateByteArrays(void read, byte[] encryptdigestionat) {
    }

    public static void read(File f) {
    }


}*/
