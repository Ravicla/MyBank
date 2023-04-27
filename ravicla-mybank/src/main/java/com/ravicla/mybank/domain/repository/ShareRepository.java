package com.ravicla.mybank.domain.repository;

import com.ravicla.mybank.domain.Share;

import java.util.List;
import java.util.Optional;

public interface ShareRepository {
    List<Share>getAll();
    Optional<Share>getShare(int shareId);
    List<Share> getShareLoan(int loanId);
    Share save(Share share);
    void delete(int shareId);

}
