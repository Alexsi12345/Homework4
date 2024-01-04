package org.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TreeRepository extends JpaRepository<Tree, Integer> {
    // Может потребоваться добавить дополнительные методы
}
