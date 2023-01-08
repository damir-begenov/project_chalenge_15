package com.example.demo.repository;

import com.example.demo.entity.Song;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SongRepository extends Neo4jRepository<Song, Long> {
}
