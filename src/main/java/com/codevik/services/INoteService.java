package com.codevik.services;

import com.codevik.models.Note;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ankit Bansal on 10/25/2016.
 */
@Service
public interface INoteService {

    Note add(Note note) ;
    Note delete(long id) ;
    Note update(long id, String note);
    Note getById(long id);
    List<Note> getAll();
    long count();
}
