package com.victoria.moments.controllers;

import com.victoria.moments.entities.MomentEntity;
import com.victoria.moments.service.impl.MomentServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;

@Controller
public class BaseController {

    private final MomentServiceImpl momentService;

    @Value("${moment.handler-location}")
    String momentHandlerPath;

    @Value("${moment.handler-path}")
    String momentResourcePath;

    public BaseController(MomentServiceImpl momentService) {
        this.momentService = momentService;
    }

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("moments", momentService.findAll());
        return "momentview";
    }


    @GetMapping("/submitPage")
    public String newMoment(Model model) {
        model.addAttribute("moment", new MomentEntity());
        return "/main/resources/templates/submit/submitPage.html";
    }


    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {


        InputStream inputStream = null;
        OutputStream outputStream = null;
        String fileName = momentResourcePath + file.getOriginalFilename();
        File newFile = new File(fileName);
        try {
            inputStream = file.getInputStream();

            if (!newFile.exists()) {
                newFile.createNewFile();
            }
            outputStream = new FileOutputStream(newFile);
            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        MomentEntity m = new MomentEntity("our Christmas 2020 in Poland(1)",
                momentHandlerPath + "/" + file.getOriginalFilename(), 10L);

        momentService.save(m);
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");
        return "redirect:/";
    }

}
