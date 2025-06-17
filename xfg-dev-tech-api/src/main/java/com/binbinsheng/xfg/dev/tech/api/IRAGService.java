package com.binbinsheng.xfg.dev.tech.api;

import com.binbinsheng.xfg.dev.tech.api.response.Response;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IRAGService {
    //查询知识库列表
    Response<List<String>> queryRagTagList();

    //上次知识库
    Response<String> upload(String ragTag, List<MultipartFile> files);

    //拉去git仓库文件并解析到向量数据库preSql中
    Response<String> analyzeGitRepository(String repoUrl, String userName, String token) throws Exception;
}
