package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TreeService {
    private final TreeRepository treeRepository;

    @Autowired
    public TreeService(TreeRepository treeRepository) {
        this.treeRepository = treeRepository;
    }

    public List<Tree> getAllTrees() {
        return treeRepository.findAll();
    }

    // Другие методы сервиса
}
