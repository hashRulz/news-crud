package com.newspaper.newswebsite.repository;

import com.newspaper.newswebsite.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface NewsRepository extends JpaRepository<News,Long> {

}
