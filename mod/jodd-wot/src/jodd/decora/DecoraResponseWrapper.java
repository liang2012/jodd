// Copyright (c) 2003-2011, Jodd Team (jodd.org). All Rights Reserved.

package jodd.decora;

import javax.servlet.http.HttpServletResponse;

/**
 * Decora response wrapper uses {@link DecoraManager decora manager} to determine
 * if buffering should be enabled or disabled.
 */
public class DecoraResponseWrapper extends BufferResponseWrapper {

	protected final DecoraManager decoraManager;

	public DecoraResponseWrapper(HttpServletResponse originalResponse, LastModifiedData lastModifiedData, DecoraManager decoraManager) {
		super(originalResponse, lastModifiedData);
		this.decoraManager = decoraManager;
	}

	@Override
	protected boolean bufferContentType(String contentType, String mimeType, String encoding) {
		return decoraManager.decorateContentType(contentType, mimeType, encoding);
	}

	@Override
	protected boolean bufferStatusCode(int statusCode) {
		return decoraManager.decorateStatusCode(statusCode);
	}
}