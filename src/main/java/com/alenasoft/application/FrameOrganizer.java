package com.alenasoft.application;

import com.alenasoft.application.exceptions.FrameNotExistsException;
import com.alenasoft.application.exceptions.InvalidInputScoreException;
import java.util.List;

public interface FrameOrganizer {

  List<Frame> organize(List<String> inputPoints) throws InvalidInputScoreException;

  default Frame getByIndex(int index, List<Frame> frames) {
    return frames
        .stream()
        .filter(f -> f.getIndex() == index)
        .findFirst()
        .orElseThrow(FrameNotExistsException::new);
  }

  static FrameOrganizer defaultFrameOrganizer() {
    return new FrameOrganizerImpl();
  }
}
