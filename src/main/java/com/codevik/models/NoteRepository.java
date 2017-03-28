package com.codevik.models;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 * Created by ankit on 26/3/17.
 */
@Repository
@Transactional
public interface NoteRepository extends JpaRepository<Note,Long> {
}
