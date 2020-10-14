package com.example.demo.mapper;

import com.example.demo.entity.Attachment;
import org.beetl.sql.mapper.BaseMapper;
import org.beetl.sql.mapper.annotation.SqlResource;
import org.springframework.stereotype.Service;

/**
 * Author: 陈艺博
 * Date:  2020-10-14 14:53
 * Description:
 */
@Service
@SqlResource("user") /*sql文件在user.md里*/
public interface FileMapper extends BaseMapper<Attachment> {
}
