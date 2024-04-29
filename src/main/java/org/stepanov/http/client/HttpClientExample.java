package org.stepanov.http.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.nio.file.Path;

import static java.net.http.HttpRequest.BodyPublishers;
import static java.net.http.HttpRequest.newBuilder;
import static java.net.http.HttpResponse.BodyHandlers;

public class HttpClientExample {

    public static void main(String[] args) throws IOException, InterruptedException {
        var httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        var request = newBuilder(URI.create("https://www.google.com"))
                .GET()
                .build();

        var request2 = newBuilder(URI.create("https://www.google.com"))
                .POST(BodyPublishers.ofFile(Path.of("path", "to", "file")))
                .build();

        var response = httpClient.send(request, BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println(response.headers());
    }
}
