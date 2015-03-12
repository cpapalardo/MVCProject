package com.example.carla.mvcproject.Models;

/**
 * Created by Carla on 3/2/2015.
 */
public class Pessoa
{
    private String Nome;
    private String Sobrenome;
    private int Idade;

    public Pessoa(String _nome, String _sobrenome, int _idade)
    {
        Nome = _nome;
        Sobrenome = _sobrenome;
        Idade = _idade;
    }

    public int getIdade()
    {
        return Idade;
    }

    public String getNome()
    {
        return Nome;
    }

    public String getSobrenome()
    {
        return Sobrenome;
    }

    public void setIdade(int idade)
    {
        Idade = idade;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public void setSobrenome(String sobrenome)
    {
        Sobrenome = sobrenome;
    }
}
