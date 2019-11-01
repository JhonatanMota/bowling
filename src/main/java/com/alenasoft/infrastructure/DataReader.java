package com.alenasoft.infrastructure;

import com.alenasoft.domain.PlayerGame;
import java.util.Iterator;
import java.util.List;

public interface DataReader {

  List<PlayerGame> readPlayerGames(Iterator rowInputs);
}
