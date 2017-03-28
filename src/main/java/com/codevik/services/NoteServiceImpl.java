package com.codevik.services;

import com.codevik.models.Note;
import com.codevik.models.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ankit Bansal on 10/25/2016.
 */
@Service
public class NoteServiceImpl implements INoteService {

    @Autowired
    NoteRepository dao;

    @Override
    public Note add(Note note) {
        return dao.save(note);
    }

    @Override
    public Note delete(long id) {
        Note n = dao.findOne(id);
        if(n!=null)
            dao.delete(id);
        return n;
    }

    @Override
    public Note update(long id, String note) {
        return dao.save(new Note(id, note));
    }

    @Override
    public Note getById(long id) {
        return dao.findOne(id);
    }

    @Override
    public List<Note> getAll() {
        return dao.findAll();
    }

    @Override
    public long count() {
        return dao.count();
    }

}
