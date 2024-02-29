package design.pattern.creational.builder;

public class HttpClient {
    private String method;
    private String url;
    private String userName;
    private String password;
    private String header;
    private String body;

    public HttpClient(HttpClientBuilder httpClientBuilder) {
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.userName = httpClientBuilder.userName;
        this.password = httpClientBuilder.password;
        this.header = httpClientBuilder.header;
        this.body = httpClientBuilder.body;
    }

    static class HttpClientBuilder{
        private String method;
        private String url;
        private String userName;
        private String password;
        private String header;
        private String body;

        public HttpClientBuilder method(String method) {
            this.method = method;
            return this;
        }

        public HttpClientBuilder url(String url) {
            this.url = url;
            return this;
        }

        public HttpClientBuilder UserName(String userName) {
            this.userName = userName;
            return this;
        }

        public HttpClientBuilder Password(String password) {
            this.password = password;
            return this;
        }

        public HttpClientBuilder Header(String header) {
            this.header = header;
            return this;
        }

        public HttpClientBuilder Body(String body) {
            this.body = body;
            return this;
        }

        public HttpClient getHttpClient(){
            return new HttpClient(this);
        }
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
