package com.example.snapengage.controllers.rest;

import org.springframework.web.bind.annotation.RestController;

import com.example.snapengage.entities.ChatEntity;
import com.example.snapengage.respository.ChatRepository;
import com.example.snapengage.services.ChatService;
import com.example.snapengage.utils.Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ChatRestController {

	private ChatService chatService;	
	@Autowired
	private ChatRepository chatRepository;
	@RequestMapping(value = "/")
	 public String index() {
		 return "index";
	 }
	 @RequestMapping(value = "/newEntry", method = RequestMethod.POST)
		public String newEntry(@RequestBody String payload) {
						
			UUID id = null;
			UUID widgetId = null;
			String url = null;
			String snapshotImageUrl = null;
			String type = null;
			String requestedBy = null;
			String description = null;
			Date createdAtDate = null;
			int createdAtSeconds = 0;
			int createdAtMilliseconds = 0;
			boolean proactiveChat = false;
			String pageUrl = null;
			String referrerUrl = null;
			String entryUrl = null;
			String ipAddress = null;
			String userAgent = null;
			String browser = null;
			String os = null;
			String countryCode = null;
			String country = null;
			String region = null;
			String city = null;
			double latitude = 0.0f;
			double longitude = 0.0f;
			int sourceId = 0;
			int chatWaittime = 0;
			int chatDuration = 0;
			String languageCode = null;
			
			JSONObject jObject = null;
			try {
				jObject = new JSONObject(payload.trim());
			} catch (JSONException e) {
				e.printStackTrace();
			}
			Iterator<?> keys = jObject.keys();

			while( keys.hasNext() ) {
			    String key = (String)keys.next();
			    try {
					
					switch(key) {
						case "id":
							id = Utils.getCleanUUID((String) jObject.get(key));
							break;
						case "widget_id":
							widgetId = Utils.getCleanUUID((String) jObject.get(key));
							break;
						case "url":
							url = (String) jObject.get(key);
							break;
						case "snapshot_image_url":
							snapshotImageUrl = (String) jObject.get(key);
							break;
						case "type":
							type = (String) jObject.get(key);
							break;
						case "requested_by":
							requestedBy = (String) jObject.get(key);
							break;
						case "description":
							description = (String) jObject.get(key);
							break;
						case "created_at_date":
							DateFormat format = new SimpleDateFormat("MMMM d, yyyy H:m:s a", Locale.ENGLISH);
							Date date;
							try {
								date = format.parse((String)jObject.get(key));
								createdAtDate = date;
							} catch (ParseException e) {
								e.printStackTrace();
								createdAtDate = new Date();
							}
							break;
						case "created_at_seconds":
							createdAtSeconds = (int) jObject.get(key);
							break;
						case "created_at_milliseconds":
							createdAtMilliseconds = (int) jObject.get(key);
							break;
						case "proactive_chat":
							proactiveChat = (boolean) jObject.get(key);
							break;
						case "page_url":
							pageUrl = (String) jObject.get(key);
							break;
						case "referrer_url":
							referrerUrl = (String) jObject.get(key);
							break;
						case "entryUrl":
							entryUrl = (String) jObject.get(key);
							break;
						case "ip_address":
							ipAddress = (String) jObject.get(key);
							break;
						case "user_agent":
							userAgent = (String) jObject.get(key);
							break;
						case "browser":
							browser = (String) jObject.get(key);
							break;
						case "os":
							os = (String) jObject.get(key);
							break;
						case "country_code":
							countryCode = (String) jObject.get(key);
							break;
						case "country":
							country = (String) jObject.get(key);
							break;
						case "region":
							region = (String) jObject.get(key);
							break;
						case "city":
							city = (String) jObject.get(key);
							break;
						case "latitude":
							latitude = (double) jObject.get(key);
							break;
						case "longitude":
							longitude = (double) jObject.get(key);
							break;
						case "source_id":
							sourceId = (int) jObject.get(key);
							break;
						case "chat_waittime":
							chatWaittime = (int) jObject.get(key);
							break;
						case "chat_duration":
							chatDuration = (int) jObject.get(key);
							break;
						case "language_code":
							languageCode = (String) jObject.get(key);
							break;
						}
					
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
			
			ChatEntity entry = new ChatEntity(id, widgetId, url, snapshotImageUrl, type, requestedBy, /*requesterDetails,*/
					description, createdAtDate, createdAtSeconds, createdAtMilliseconds,
					proactiveChat, pageUrl, referrerUrl, entryUrl, ipAddress,
					userAgent, browser, os, countryCode, country, region, city,
					latitude, longitude, sourceId, chatWaittime, chatDuration, languageCode);
			chatRepository.save(entry);
			return "empty";
		}
	 @RequestMapping("/listEntries")
		public String listEntries(Model model) {
			model.addAttribute("entries", chatService.listAllEntries());
			return "main";
		}

		
}
