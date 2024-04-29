package org.stepanov.http.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {

    public static void main(String[] args) throws IOException {
        var url = new URL("file:/home/inkerinmaa/http-servlets-start/src/main/java/org/stepanov/http/socket/DatagramRunner.java");
        var connection = url.openConnection();

        System.out.println(new String(connection.getInputStream().readAllBytes()));
    }

    private static void checkGoogle() throws IOException {
        var url = new URL("https://www.google.com");
        var connection = url.openConnection();

        connection.setDoOutput(true);

        try (var outputStream = connection.getOutputStream()) {
        }

        System.out.println();
    }
}
