package com.example.eduservice.service;

import com.example.eduservice.entity.EduChapter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.eduservice.entity.chapter.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author testjava
 * @since 2020-07-19
 */
public interface EduChapterService extends IService<EduChapter> {

    List<ChapterVo> getChapterVideoByCourseId(String courseId);

    boolean deleteChapter(String chapterId);
    //2 根据课程id删除章节
    void removeChapterByCourseId(String courseId);
}
