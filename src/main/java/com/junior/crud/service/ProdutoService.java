package com.junior.crud.service;
import java.util.List;
import com.junior.crud.entity.Produto;
import com.junior.crud.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }



    public List<Produto> buscar(){
        return repository.findAll();
    }

    public Produto buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}