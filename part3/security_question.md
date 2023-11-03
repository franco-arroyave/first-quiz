# Security Report

By Jose Franco Arroyave Cardona

## Objective
Define controls to mitigate the risk of a security event that could compromise business continuity.

---------------------------

As a foundational resource, we will use OWASP Top 10 2021, which defines the 10 most representative types of vulnerabilities and from which we will describe the minimum controls necessary to certify the production deployment of different components of the application, such as web, mobile, backend, and DB.

### A01:2021-Broken Access Control
* Define roles that ensure the minimum necessary access for each internal and external user of the startup and facilitate permission management.
* Segment developers into teams responsible for independent software components such as web, mobile, backend, and DB. This is to compartmentalize information and reduce the volume in case of information leakage.

### A02:2021-Cryptographic Failures
* Use secure communication protocols that employ current encryption techniques such as TLS 1.2 and 1.3.
* Renew cryptographic keys annually.
* Classify information according to its sensitivity level and store it properly encrypted in the databases.

### A03:2021-Injection
* Use an ORM to provide data to the application.
* Validate inputs on the server side.

### A04:2021-Insecure Design
* Use secure design patterns.
* Limit resource usage per user or service.
* Segment the system by layers and establish rules between layers based on the level of exposure.

### A05:2021-Security Misconfiguration
* Use recommended security configurations for the different AWS services.
* Remove configurations or hardcoded data in the testing and development phases of the software.

### A06:2021-Vulnerable and Outdated Components
* Inventory components such as libraries, frameworks, among others, to manage and apply updates, ensuring the latest stable versions.
* Remove unused components.

### A07:2021-Identification and Authentication Failures
* Define a password format with a length of more than 10 characters and high complexity, including uppercase, lowercase, numbers, and special characters.
* Implement MFA through tokens sent to previously registered and validated contact mediums, such as email and mobile phone.
* Properly obscure session identifiers, establish a session expiration period due to inactivity of no more than 10 minutes.
* Use incremental delay times for recurrent login attempts and captcha.

### A08:2021-Software and Data Integrity Failures
* Use digital signatures to verify data and ensure it has not been tampered with.
* Establish a code change review process to minimize the introduction of malicious code.

### A09:2021-Security Logging and Monitoring Failures
* Record timestamps and connection data for logins.
* Establish policies for suspicious login attempts.
* Log information in a readable format.

### A10:2021-Server-Side Request Forgery
Analyze and validate all client-provided input data.
Strengthen the URL scheme by establishing a list of allowed access.

## References
OWASP Top 10; 2021; https://owasp.org/Top10/

**Note: Translation by ChatGPT**