package com.eazybytes.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.model.Notice;
import com.eazybytes.repository.NoticeRepository;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class NoticesController {

	@Autowired
	private NoticeRepository noticeRepository;

	@GetMapping("/notices")
	public ResponseEntity<List<Notice>> getNotices(HttpServletRequest request) {
		List<Notice> notices = noticeRepository.findAllActiveNotices();
		if (notices != null) {
			return ResponseEntity.ok()
				.cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
				.body(notices);
		} else {
			return null;
		}
	}

}