package com.example.kino.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHashing {
    public String doHashing(String password) {
        try {
            //messageDigest bliver tilknyttet en specifik algoritme den skal bruge. Her bruges MD5 algoritmen(Message Digest)
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            //password bliver lavet om til en omgang bytes
            //The data is processed through it using the update methods.
            // At any point reset can be called to reset the digest.
            // Once all the data to be updated has been updated, one of the digest methods
            // should be called to complete the hash computation.
            messageDigest.update(password.getBytes());
            // digest giver hos hashing værdien i bytes i form af et byte array
            byte[] resultByteArray = messageDigest.digest();
            //herefter skal disse bytes konverteres til en string, hvor man formaterer dem fra byte værdier til hexaværdier
            StringBuilder sb = new StringBuilder();
            //dette bliver gjort en af gangen med et for each loop, hvor appender sb stringen
            //%02x er en formatering form
            for (byte b : resultByteArray) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
