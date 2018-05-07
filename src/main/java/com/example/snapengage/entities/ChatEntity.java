package com.example.snapengage.entities;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ChatEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;
	private UUID widgetId;
	private String url;
	private String snapshotImageUrl;
	private String type;
	private String requestedBy;
	private String description;
	private Date createdAtDate;
	private int createdAtSeconds;
	private int createdAtMilliseconds;
	private boolean proactiveChat;
	private String pageUrl;
	private String referrerUrl;
	private String entryUrl;
	private String ipAddress;
	private String userAgent;
	private String browser;
	private String os;
	private String countryCode;
	private String country;
	private String region;
	private String city;
	private double latitude;
	private double longitude;
	private int sourceId;
	private int chatWaittime;
	private int chatDuration;
	private String languageCode;
	
	
	public ChatEntity(UUID id, UUID widgetId, String url, String snapshotImageUrl, String type, String requestedBy,
			/*RequesterDetails requesterDetails,*/ String description, Date createdAtDate, int createdAtSeconds,
			int createdAtMilliseconds, boolean proactiveChat, String pageUrl, String referrerUrl, String entryUrl,
			String ipAddress, String userAgent, String browser, String os, String countryCode, String country,
			String region, String city, double latitude, double longitude, int sourceId, int chatWaittime,
			int chatDuration, String languageCode) {
		
		this.id = id;
		this.widgetId = widgetId;
		this.url = url;
		this.snapshotImageUrl = snapshotImageUrl;
		this.type = type;
		this.requestedBy = requestedBy;
		this.description = description;
		this.createdAtDate = createdAtDate;
		this.createdAtSeconds = createdAtSeconds;
		this.createdAtMilliseconds = createdAtMilliseconds;
		this.proactiveChat = proactiveChat;
		this.pageUrl = pageUrl;
		this.referrerUrl = referrerUrl;
		this.entryUrl = entryUrl;
		this.ipAddress = ipAddress;
		this.userAgent = userAgent;
		this.browser = browser;
		this.os = os;
		this.countryCode = countryCode;
		this.country = country;
		this.region = region;
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
		this.sourceId = sourceId;
		this.chatWaittime = chatWaittime;
		this.chatDuration = chatDuration;
		this.languageCode = languageCode;
	}



	@Override
	public String toString() {
		return String.format("ChatEntry[created_at_date='%s']", this.createdAtDate);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getWidgetId() {
		return widgetId;
	}

	public void setWidgetId(UUID widgetId) {
		this.widgetId = widgetId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSnapshotImageUrl() {
		return snapshotImageUrl;
	}

	public void setSnapshotImageUrl(String snapshotImageUrl) {
		this.snapshotImageUrl = snapshotImageUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAtDate() {
		return createdAtDate;
	}

	public void setCreatedAtDate(Date createdAtDate) {
		this.createdAtDate = createdAtDate;
	}

	public int getCreatedAtSeconds() {
		return createdAtSeconds;
	}

	public void setCreatedAtSeconds(int createdAtSeconds) {
		this.createdAtSeconds = createdAtSeconds;
	}

	public int getCreatedAtMilliseconds() {
		return createdAtMilliseconds;
	}

	public void setCreatedAtMilliseconds(int createdAtMilliseconds) {
		this.createdAtMilliseconds = createdAtMilliseconds;
	}

	public boolean isProactiveChat() {
		return proactiveChat;
	}

	public void setProactiveChat(boolean proactiveChat) {
		this.proactiveChat = proactiveChat;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public String getReferrerUrl() {
		return referrerUrl;
	}

	public void setReferrerUrl(String referrerUrl) {
		this.referrerUrl = referrerUrl;
	}

	public String getEntryUrl() {
		return entryUrl;
	}

	public void setEntryUrl(String entryUrl) {
		this.entryUrl = entryUrl;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getChatWaittime() {
		return chatWaittime;
	}

	public void setChatWaittime(int chatWaittime) {
		this.chatWaittime = chatWaittime;
	}

	public int getChatDuration() {
		return chatDuration;
	}

	public void setChatDuration(int chatDuration) {
		this.chatDuration = chatDuration;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}
