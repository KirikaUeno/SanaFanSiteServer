package com.springProj.demo;

import com.springProj.demo.spring.SpringApplicationMain;
import com.springProj.demo.ui.MainFrame;
import org.springframework.boot.SpringApplication;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("aa");
		System.out.println("main called");
		SwingUtilities.invokeLater(MainFrame::new);
		SpringApplication.run(SpringApplicationMain.class, args);
	}
}
