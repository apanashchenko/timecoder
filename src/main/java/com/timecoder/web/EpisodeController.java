package com.timecoder.web;

import com.timecoder.model.Episode;
import com.timecoder.service.EpisodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class EpisodeController {

    private final EpisodeService episodeService;

    @RequestMapping(value = "/episode", method = RequestMethod.POST)
    public ResponseEntity createEpisode(@Valid @RequestBody Episode episode) {
        return episodeService.createEpisode(episode);
    }

    @RequestMapping(value = "/episodes", method = RequestMethod.GET)
    public Iterable<Episode> getAllEpisodes() {
        return episodeService.getAllEpisodes();
    }


}
