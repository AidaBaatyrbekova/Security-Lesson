package peaksoft;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {
    public static void main(String[] args) {
        BCryptPasswordEncoder cryptPasswordEncoder = new BCryptPasswordEncoder();

//        String password  = "Sardar";

//        System.out.println(cryptPasswordEncoder.encode(password));

        System.out.println(cryptPasswordEncoder.matches("Sardar","$2a$10$3OA/098yZtxpXNsMS6piluCdcxMQ2.30LOSinJerN4vLO8gtVo5k."));


    }
}
