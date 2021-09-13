package com.salzz.crudweb.controller;

import com.salzz.crudweb.model.Mahasiswa;
import com.salzz.crudweb.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MahasiswaController {

    @Autowired
    MahasiswaService mahasiswaService;

    @GetMapping("/mahasiswa")
    public String mahasiswa(Model model){
        model.addAttribute("mahasiswa",mahasiswaService.findAll());
        return "mahasiswa";
    }

    @GetMapping("/mahasiswa/create")
    public String mahasiswaCreate(Model model){
        model.addAttribute("mahasiswa",new Mahasiswa());
        return "form_mahasiswa";
    }

    @RequestMapping(value = "/mahasiswa/create", method = RequestMethod.POST)
    public String saveMahasiswa(Mahasiswa mahasiswa){
        mahasiswaService.save(mahasiswa);
        return "redirect:/mahasiswa";
    }

    @RequestMapping(value = "/mahasiswa/delete/{id}")
    public String deleteMahasiswa(@PathVariable Integer id){
        mahasiswaService.deleteById(id);
        return "redirect:/mahasiswa";
    }

    @RequestMapping(value = "/mahasiswa/edit/{id}",method = RequestMethod.GET)
    public String editMahasiswa(@PathVariable Integer id,Model model){
        model.addAttribute("mahasiswa",mahasiswaService.findById(id));
        return "edit_mahasiswa";
    }


    @PutMapping("/mahasiswa/update")
    public String update(Mahasiswa mahasiswa){
        mahasiswaService.save(mahasiswa);
        return "redirect:/mahasiswa";    }


}
