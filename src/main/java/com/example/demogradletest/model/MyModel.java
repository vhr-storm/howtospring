package com.example.demogradletest.model;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class MyModel {
    private String name;

    @Override
    public String toString() {
        return name+" 228";
    }
}
