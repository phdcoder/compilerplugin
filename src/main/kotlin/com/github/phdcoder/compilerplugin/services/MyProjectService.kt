package com.github.phdcoder.compilerplugin.services

import com.intellij.openapi.project.Project
import com.github.phdcoder.compilerplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
