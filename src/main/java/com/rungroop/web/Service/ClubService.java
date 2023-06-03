package com.rungroop.web.Service;

import com.rungroop.web.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
