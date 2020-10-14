package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.beetl.sql.annotation.entity.AutoID;
import org.beetl.sql.annotation.entity.InsertIgnore;
import org.beetl.sql.annotation.entity.UpdateIgnore;

/**
 * Author: 陈艺博
 * Date:  2020-10-14 14:32
 * Description:
 */
@Data
@EqualsAndHashCode()
public class Attachment {

    @AutoID
    private Integer id;

    @JsonIgnore
    private Integer targetId;

    @JsonIgnore
    private String targetType;

    private String fileType;

    @UpdateIgnore
    @InsertIgnore
    private String storageUrl;
}
