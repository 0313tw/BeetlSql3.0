package com.example.demo.entity.base;

import com.example.demo.annotation.Base64;
import com.example.demo.annotation.GetFile;
import com.example.demo.entity.Attachment;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.beetl.sql.annotation.builder.UpdateTime;
import org.beetl.sql.annotation.entity.AutoID;

import java.util.Date;

/**
 * Author: 陈艺博
 * Date:  2020-10-14 14:36
 * Description:
 */

@Data
@EqualsAndHashCode
public class File extends Base {

//    @GetFile
    private Attachment fileName;

//    @AutoID
//    private Integer id;
//
//    @Base64
//    private String name;
//
//    private Date createTime;
//
//    @UpdateTime
//    private Date lastModified;
}
