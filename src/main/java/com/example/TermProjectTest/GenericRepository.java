package com.example.TermProjectTest;

import com.example.TermProjectTest.Construction.Construction;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.List;

@NoRepositoryBean
public interface GenericRepository<T extends GenericTable> extends JpaRepository<T, String> {
//    @Query(value = "SELECT * FROM Construction WHERE name = :Tablename" , nativeQuery=true)
//    List<T> findyByName(@Param("Tablename") String name);
}
