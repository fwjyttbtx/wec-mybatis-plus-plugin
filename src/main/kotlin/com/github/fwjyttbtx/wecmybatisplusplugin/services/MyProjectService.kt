package com.github.fwjyttbtx.wecmybatisplusplugin.services

import com.intellij.openapi.project.Project
import com.github.fwjyttbtx.wecmybatisplusplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
