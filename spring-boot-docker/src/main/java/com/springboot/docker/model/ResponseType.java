package com.springboot.docker.model;

public class ResponseType {
	
	private String responseCode;

	private String responseStatus;

	private String responseDescription;

	public ResponseType() {
		super();
	}

	public ResponseType(String responseCode, String responseStatus, String responseDescription) {
		super();
		this.responseCode = responseCode;
		this.responseStatus = responseStatus;
		this.responseDescription = responseDescription;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseType [responseCode=");
		builder.append(responseCode);
		builder.append(", responseStatus=");
		builder.append(responseStatus);
		builder.append(", responseDescription=");
		builder.append(responseDescription);
		builder.append("]");
		return builder.toString();
	}

	public String toJson() {
		StringBuilder builder = new StringBuilder();
		builder.append("{ \"ResponseCode\" : \"");
		builder.append(responseCode);
		builder.append("\", \"ResponseStatus\" : \"");
		builder.append(responseStatus);
		builder.append("\", \"ResponseDescription\" : \"");
		builder.append(responseDescription);
		builder.append("\" }");
		return builder.toString();
	}
}