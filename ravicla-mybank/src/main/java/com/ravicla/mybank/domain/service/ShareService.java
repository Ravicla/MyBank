package com.ravicla.mybank.domain.service;

import com.ravicla.mybank.domain.Share;
import com.ravicla.mybank.domain.repository.ShareRepository;
import com.ravicla.mybank.persistence.entity.Cuota;
import com.ravicla.mybank.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShareService {
    private static final Logger log = LoggerFactory.getLogger(ShareService.class);

    @Autowired
    ShareRepository shareRepository;
    @Autowired
    private JsonUtil jsonUtil;

    public List<Share> getAll() {
        List<Share> shareGetAllOut = shareRepository.getAll();
        log.info("OUT: " + jsonUtil.toJson(shareGetAllOut));
        return (List<Share>) shareGetAllOut;
    }

    public Optional<Share> getShare(int shareId) {
        Optional<Share> shareIdOut = shareRepository.getShare(shareId);
        log.info("OUT getShare: " + jsonUtil.toJson(shareIdOut));
        return (Optional<Share>) shareIdOut;
    }

    public Share save(Share share) {
        Share shareSaveOut = shareRepository.save(share);
        log.info("OUT: " + jsonUtil.toJson(shareSaveOut));
        return shareSaveOut;
    }

    public boolean delete(int shareId) {
        return getShare(shareId).map(share -> {
            shareRepository.delete(shareId);
            return true;
        }).orElse(false);
    }
}
