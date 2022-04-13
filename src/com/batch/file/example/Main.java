package com.batch.file.example;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		Process p = Runtime.getRuntime().exec("batchFile.bat");
		p.waitFor();
		System.out.println(p.exitValue());
	}
}
