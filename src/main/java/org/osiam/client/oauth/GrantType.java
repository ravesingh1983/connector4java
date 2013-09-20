package org.osiam.client.oauth;
/*
 * for licensing see the file license.txt.
 */

/**
 * The Grant Type represents the type of Grant that the client expects from the service.
 * At this point the following grant types are supported:
 * <ul>
 * <li>PASSWORD</li>
 * </ul>
 */
public enum GrantType {

	/**
	 * for this GrantType also the user name and the user password are needed
	 */
    RESOURCE_OWNER_PASSWORD_CREDENTIALS("password")
    /**
	 * for this GrantType the user name and the user password are not allowed
	 * If you set one of these a exception will be thrown
	 */
   , AUTHORIZATION_CODE("authorization_code")
   , CLIENT_CREDENTIALS("client_credentials");

    private String urlParam;

    GrantType(String urlParam) {
        this.urlParam = urlParam;
    }

    /**
     * Provide the string for use in the actual request.
     *
     * @return The string representation of the grant type.
     */
    public String getUrlParam() {
        return urlParam;
    }

}
