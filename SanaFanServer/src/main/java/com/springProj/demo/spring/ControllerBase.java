package com.springProj.demo.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ControllerBase {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/giveip")
    public String giveIP(@RequestParam(value = "ip", defaultValue = "0.0.0.0") String ip) {
        File f1 = new File("ipAddresses.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(f1);
            BufferedWriter out = new BufferedWriter(fw);
            out.write(ip+"\n");
            out.flush();
            fw.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @GetMapping("/checkstate")
    public String checkState() {
        return "1";
    }

    @GetMapping("/")
    public String index() {
        return "Hello, from SanaFan!";
    }
}
