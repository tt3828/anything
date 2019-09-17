package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojo.Album;

@Repository
public interface AlbumRepo extends JpaRepository<Album, String> {

}
