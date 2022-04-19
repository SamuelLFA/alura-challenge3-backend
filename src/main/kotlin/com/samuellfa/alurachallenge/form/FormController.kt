package com.samuellfa.alurachallenge.form

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.multipart.MultipartFile

@Controller
class FormController {

    @PostMapping("/upload")
    fun hello(@RequestParam("file") file: MultipartFile): ResponseEntity<*> {
        val filename = file.originalFilename
        val filesize = file.size
        println(filename)
        println(filesize)
        return ResponseEntity.ok(filename)
    }
}