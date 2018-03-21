package politie.jenkins

class Constants {
    // Major version number used by all jobs.
    // Corresponds with the sprint number; update this at the start of each sprint.
    static final MAJOR_VERSION_NUMBER = '1';

    static final SONAR_URL = 'http://wiprorig.eastus.cloudapp.azure.com:9000';
    static final GITLAB_WEB_BASE_URL = 'https://gitlab.com';
    static final GITLAB_API_BASE_URL = 'https://gitlab.com/api/v4/projects';
    static final GITLAB_CHECKOUT_BASE_URL = 'https://gitlab.com/Aashika/sample.git';
    static final GITLAB_VERSION = '8.6';
    static final GITLAB_CREDENTIALS_ID = 'Aashika';
    static final GITLAB_API_TOKEN_CREDENTIALS_ID = 'VHE3sHYb7QgWjr_zFCeN';
    static final ENVIRONMENT_DOMAIN_NAME = '.tld'
    static final ENVIRONMENT_TENANT = 'foobar';
}
