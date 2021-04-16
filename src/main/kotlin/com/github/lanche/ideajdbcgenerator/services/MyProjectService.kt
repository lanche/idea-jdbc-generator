package com.github.lanche.ideajdbcgenerator.services

import com.github.lanche.ideajdbcgenerator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
