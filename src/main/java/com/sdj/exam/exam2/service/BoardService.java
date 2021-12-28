package com.sdj.exam.exam2.service;

import com.sdj.exam.exam2.container.Container;
import com.sdj.exam.exam2.container.ContainerComponent;
import com.sdj.exam.exam2.dto.Board;
import com.sdj.exam.exam2.repository.BoardRepository;

public class BoardService implements ContainerComponent {
	private BoardRepository boardRepository;
	
	public void init() {
		boardRepository = Container.boardRepository;
	}

	public Board getBoardById(int id) {
		return boardRepository.getBoardById(id);
	}
}
