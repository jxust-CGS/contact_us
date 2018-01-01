package com.cgs.contact_us.bean;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@EntityScan
public class Contact {
    private String id;
    private String title;
    private String content;
}
