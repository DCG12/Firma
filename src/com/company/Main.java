package com.company;

import java.io.*;
import java.security.*;

public class Main {

    public static void main(String[] args) {

        public static final String PRIVATE_KEY_FILE = "private.key";
        public static final String PUBLIC_KEY_FILE = "ppublic.key";
        public static  final String FITXER_PLA = "UF1-NF1-P01-Signatura.pdf";
        final String FITXER_SIGNAT = "firmat.xml";

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, ClassNotFoundException {

        KeyPair keyPair = null;
        PrivateKey prik = null;

        File f = new File(FITXER_PLA);

        if(!Utils.areKeysPresent()){
            keyPair = Utils.generateKey();
            prik = keyPair.getPrivate();
        }else{

            ObjectInputStream inputStream = null;
            inputStream = new ObjectInputStream(new FileInputStream(PRIVATE_KEY_FILE));
            prik = (PrivateKey) inputStream.readObject();
        }
/*
        byte[] digestionat = Utils.digestiona(f,"MD5");

        byte[] encryptdigestionat = Utils.signar(digestionat,prik);

        Utils.write(FITXER_SIGNAT,Utils.concatenateByteArrays(Utils.read(f),encryptdigestionat));


    }
*/
    }
}
