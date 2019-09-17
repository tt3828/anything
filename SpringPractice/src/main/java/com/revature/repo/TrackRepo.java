package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojo.Track;

@Repository
public interface TrackRepo extends JpaRepository<Track, String> {

}
