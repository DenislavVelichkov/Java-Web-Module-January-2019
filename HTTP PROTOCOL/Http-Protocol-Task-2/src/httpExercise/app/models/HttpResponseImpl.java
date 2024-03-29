package httpExercise.app.models;

import httpExercise.app.models.interfaces.HttpResponse;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HttpResponseImpl implements HttpResponse {
    private HashMap<String, String> header;
    private int statusCode;
    private byte[] content;
    private byte[] bytes;
    private String statusString;

    public HttpResponseImpl() {
        this.header = new LinkedHashMap<>();
    }

    @Override
    public HashMap<String, String> getHeaders() {
        return this.header;
    }

    @Override
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public byte[] getContent() {
        return this.content;
    }

    @Override
    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public byte[] getBytes() {
        return this.bytes;
    }

    @Override
    public void setStatusString(String str) {
        this.statusString = str;
    }

    @Override
    public String getStatusString() {
        return this.statusString;
    }

    @Override
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public void addHeader(String header, String value) {
        this.header.put(header, value);
    }

    @Override
    public void setHeader(HashMap<String, String> header) {
        this.header = header;
    }
}
