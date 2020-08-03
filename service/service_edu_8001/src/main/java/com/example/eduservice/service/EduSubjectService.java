package com.example.eduservice.service;

import com.example.eduservice.entity.subject.OneSubject;
import com.example.eduservice.entity.EduSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author testjava
 * @since 2020-07-19
 */
public interface EduSubjectService extends IService<EduSubject> {
    public void saveSubject(MultipartFile file, EduSubjectService subjectService);
    public List<OneSubject> getAllOneTwoSubject();
}
