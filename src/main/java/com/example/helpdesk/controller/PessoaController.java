package com.example.helpdesk.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Random;

import javax.websocket.server.PathParam;

import com.example.helpdesk.model.Pessoa;
import com.example.helpdesk.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = "pessoa")
public class PessoaController {
    @Autowired
    private PessoaRepository _pessoaRepository;

    @GetMapping("/{id}")
    public Pessoa buscarPessoa(@PathParam("id") int id) {
        try {
            Pessoa pessoa = _pessoaRepository.findById(id);
            return pessoa;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @PostMapping("/login")
    public Pessoa loginPessoa(@RequestBody Pessoa pessoa) {
        try {
            String senha = pessoa.getSenha();
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            String senhaSha = hexString.toString();
            Pessoa pessoaLogada = _pessoaRepository.logarPessoa(pessoa.getEmail(), senhaSha);
            return pessoaLogada;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @PostMapping()
    public boolean criarPessoa(@RequestBody Pessoa pessoa) {
        try {
            String senha = pessoa.getSenha();
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            pessoa.setSenha(hexString.toString());
            _pessoaRepository.save(pessoa);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @PostMapping("/envioFoto")
    public String enviarFoto(@RequestParam("image") MultipartFile multipartFile) {
        try {
            byte[] bytes = multipartFile.getBytes();
            Random random = new Random();
            String url = random.nextInt(20) + multipartFile.getOriginalFilename();
            Path path = Paths.get("C:\\Users\\Samsung\\APIHelpdesk\\src\\main\\resources\\templates\\" + url);
            Files.write(path, bytes);
            return url;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @PutMapping()
    public boolean editarPessoa(@RequestBody Pessoa pessoa, @RequestParam("image") MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            Random random = new Random();
            String url = random.nextInt(20) + file.getOriginalFilename();
            Path path = Paths.get("caminho para onde salvar" + url);
            Files.write(path, bytes);
            pessoa.setFoto(url);
            _pessoaRepository.save(pessoa);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}
