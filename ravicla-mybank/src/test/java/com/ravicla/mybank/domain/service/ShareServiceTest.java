package com.ravicla.mybank.domain.service;

import com.ravicla.mybank.domain.Share;
import com.ravicla.mybank.domain.repository.ShareRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class ShareServiceTest {
    @Mock
    private ShareRepository shareRepositoryMock;
    private ShareService shareService;

    @Before
    public void setUp() throws Exception {
        shareService = new ShareService();
        shareService.shareRepository = shareRepositoryMock;
    }

    @Test
    public void getAll() {
        List<Share> expectedShares = new ArrayList<>();
        expectedShares.add(new Share());
        when(shareRepositoryMock.getAll()).thenReturn(expectedShares);
        List<Share> actualShares = shareService.getAll();
        assertEquals(expectedShares, actualShares);
    }

    @Test
    public void getShare() {
        Share expectedShare = new Share();
        when(shareRepositoryMock.getShare(anyInt())).thenReturn(Optional.of(expectedShare));
        Optional<Share> actualShare = shareService.getShare(1);
        assertEquals(expectedShare, actualShare.get());
    }

    @Test
    public void save() {
        Share shareToSave = new Share();
        when(shareRepositoryMock.save(shareToSave)).thenReturn(shareToSave);
        Share savedShare = shareService.save(shareToSave);
        assertEquals(shareToSave, savedShare);
    }

    @Test
    public void delete() {
        Share shareToDelete = new Share();
        when(shareRepositoryMock.getShare(anyInt())).thenReturn(Optional.of(shareToDelete));
        boolean deleted = shareService.delete(1);
        assertEquals(true, deleted);
    }
}