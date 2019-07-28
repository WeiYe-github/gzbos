package com.gztech.bos.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.DeploymentBuilder;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.ZipInputStream;

public class ProcessDefinitionAction extends ActionSupport {

    //仓库的service
    @Autowired
    private RepositoryService rs;

    public String list() {
        return "list";
    }

    private File zipFile;
    private String zipFileContentType;
    private String zipFileFileName;

    public void setZipFileContentType(String zipFileContentType) {
        this.zipFileContentType = zipFileContentType;
    }

    public void setZipFileFileName(String zipFileFileName) {
        this.zipFileFileName = zipFileFileName;
    }

    public void setZipFile(File zipFile) {
        this.zipFile = zipFile;
    }

    //发布一个流程
    public String deploy() throws FileNotFoundException {

        //1.获取部署的对象
        DeploymentBuilder builder = rs.createDeployment();

        //2.builder 添加压缩包的输入流
        builder.addZipInputStream(new ZipInputStream(new FileInputStream(zipFile)));

        builder.deploy();


        //部署完后回到list页面
        return "list";
    }
}
