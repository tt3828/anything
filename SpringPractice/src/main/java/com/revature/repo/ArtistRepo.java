package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojo.Artist;

@Repository
public interface ArtistRepo extends JpaRepository<Artist, String> {

}
