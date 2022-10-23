package com.project.webproject.model.Request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseRequest {
    private Date gmtCreate;
    private Date gmtModified;
}
