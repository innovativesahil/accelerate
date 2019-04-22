package com.sahil.accelerateproject.controller;

import com.sahil.accelerateproject.exception.ResourceNotFoundException;
import com.sahil.accelerateproject.model.Note;
import com.sahil.accelerateproject.repository.NoteRepository;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/*")
@RequestMapping(value = "/api")
@Slf4j
public class NoteController {

    @Autowired
    NoteRepository noteRepository;

    // Get all notes
    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        log.debug("Get all notes API Consumed");
        return noteRepository.findAll();
    }

    // Create a note
    @PostMapping("/notes")
    public Note createNote(@Valid @RequestBody Note note) {
        log.debug("Create note API called");
        return noteRepository.save(note);
    }

    // Get a Single Note
    @GetMapping("/notes/{id}")
    public Note getNoteById(@PathVariable(value = "id") Long noteId) {
        log.debug("Get a note API Consumed");
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
    }

    // Update a Note
    @PutMapping("/notes/{id}")
    public Note updateNote(@PathVariable(value = "id") Long noteId,
                           @Valid @RequestBody Note noteDetails) {
        log.debug("Update note API called");
        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        Note updatedNote = noteRepository.save(note);
        return updatedNote;
    }

    // Delete a Note
    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
        log.debug("Delete a note API called");

        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        noteRepository.delete(note);

        return ResponseEntity.ok().build();
    }
}
