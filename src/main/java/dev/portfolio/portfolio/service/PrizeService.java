package dev.portfolio.portfolio.service;

import dev.portfolio.portfolio.dto.PrizeDTO;
import java.io.IOException;
import java.util.List;

public interface PrizeService {
    List<PrizeDTO> readAllPrize() throws IOException;
}
