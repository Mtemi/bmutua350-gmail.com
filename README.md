# bmutua350-gmail.com
Microsoft Graph API Java Code that Utilizes Selenium to Log into Google OneDrive  and Identify if New Files Have been updated 

## Prerequisites
Extract the Project Folder above. INSPECT THE CONTENTS ::The Java Files 
ending with extension: .java, oAuth.properties and the pom.xml file
The below steps will assist you get MS APP ID.  You will need this to be able to insert on
the app.id variable in oAuth.properties file:  

Here, you will create a new Azure AD application using the Azure Active Directory admin center.

1. Open a browser and navigate to the [Azure Active Directory admin center](https://aad.portal.azure.com) and 
login using a **personal account** (aka: Microsoft Account) or **Work or School Account**.

1. Select **Azure Active Directory** in the left-hand navigation, then select **App registrations** under **Manage**.

1. Select **New registration**. On the **Register an application** page, set the values as follows.

    - Set **Name** to `Java Graph Tutorial`.
    - Set **Supported account types** to **Accounts in any organizational directory and personal Microsoft accounts**.
    - Leave **Redirect URI** empty.

1. Choose **Register**. On the **Java Graph Tutorial** page, copy the value of the **Application (client) ID** and save it, 
you will need it in the next step.

1. Select the **Add a Redirect URI** link. On the **Redirect URIs** page, locate the **Suggested Redirect URIs for 
public clients (mobile, desktop)** section. Select the `https://login.microsoftonline.com/common/oauth2/nativeclient` URI.

1. Locate the **Default client type** section and change the **Treat application as a public client** 
toggle to **Yes**, then choose **Save**.

Now we are going to obtain the necessary OAuth access token to call the Microsoft Graph. 
In this step you will integrate the [Microsoft Authentication Library (MSAL) for 
Java](https://github.com/AzureAD/microsoft-authentication-library-for-java) into the application.

In the file named **oAuth.properties**, and add the following text in that file.

app.id=YOUR_APP_ID_HERE
app.scopes=User.Read,Calendars.Read

Before you start you should have the 
[Java SE Development Kit (JDK)](https://java.com/en/download/faq/develop.xml) and 
[Maven](https://maven.apache.org/) installed on your development machine. 
If you do not have the JDK or Maven, visit the previous links for download options.

This project has been written with OpenJDK version 12.0.1 and 
Maven 3.6.1. 

Add some additional dependencies that you will use later.

- [Microsoft Authentication Library (MSAL) for Java](https://github.com/AzureAD/microsoft-authentication-library-for-java) 
	to authenticate the user and acquire access tokens.
- [Microsoft Graph SDK for Java](https://github.com/microsoftgraph/msgraph-sdk-java) to make calls to the Microsoft Graph.
- [SLF4J NOP Binding](https://mvnrepository.com/artifact/org.slf4j/slf4j-nop) to suppress logging from MSAL.

----Import the Project into Eclipse Environment and run App.java file that contains the main classes.   

In this exercise you will incorporate the Microsoft Graph into the application. For this application, you will use the 
[Microsoft Graph SDK for Java](https://github.com/microsoftgraph/msgraph-sdk-java) to make calls to Microsoft Graph.

## AN authentication provider IS Implemented : 

The Microsoft Graph SDK for Java requires an implementation of the `IAuthenticationProvider` 
interface to instantiate its `GraphServiceClient` object. We have done this by creating a simple class to 
add the access token to outgoing requests. There is a file named SimpleAuthProvider.java** 

The Graph.java class compares files by virtue of time created and file size data with data available on OneDrive. 
This was it's possible to determine existence of new files/folders and even new changes in file systems. 

                   
