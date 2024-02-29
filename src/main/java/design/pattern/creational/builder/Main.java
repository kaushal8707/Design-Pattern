package design.pattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        HttpClient httpClient=new HttpClient.HttpClientBuilder().url("http").method("GET").getHttpClient();
        System.out.println(httpClient);
    }
}
