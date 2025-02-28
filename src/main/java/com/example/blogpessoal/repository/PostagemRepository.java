package com.example.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> { // postagem vem da model, o long é o tipo (id).

}
