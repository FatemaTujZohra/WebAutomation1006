
Feature: Google Footer links Checkup 
As a Google Lover, I want to learn about the legal policies and terms of service of Google and Gmail. 
 
Background:
Given I launch the Google home page url     
And I scroll down to the end of the page 
 @GoogleFooterLinkTest @Important
Scenario Outline: Selecting different footer links and checking the corresponding page     
When I select "<footerLink_text>" link in the Google footer     
Then I verified the selected Google page by the existence of the "<linkedPage_text>" text 
 
    Examples:        
    |footerLink_text|linkedPage_text|
      
    |Privacy|This Privacy Policy is meant to help you|  
    |Terms|Thanks for using our products and services|
    
    Scenario Outline: Selecting different sublinks on the Google Privacy footer link     
    Given I select the Privacy link in the Google footer     
    When I click on a specific Privacy Policy  "<privacy_policy>"     
    Then I verified the selected "<policy_detail>" Policy detail 
 
    Examples:     
      | privacy_policy                           |policy_detail|
      | Introduction                             | We build a range of services that help millions of people daily to explore and interact |
      | Information Google collects              | We collect information to provide better services to all our users                      |
      | Why Google collects data                 | We use the information we collect from all our services                                 |
      | Your privacy controls                    | You have choices regarding the information we collect                                   |
      | Sharing your information                 | When you share your information                                                         |
      | Keeping your information secure          | We build security into our services to protect your information                         |
      | Exporting & deleting your information    | You can export a copy of your information or delete it from your                        |
      | Compliance & cooperation with regulators | We regularly review this Privacy Policy                                                 |
      | About this policy                        | This Privacy Policy applies to all of the services                                      |
      | Related privacy practices                | The following privacy notices provide additional information about some Google services |
      | Data transfer frameworks                 | European Union member countries                                                         |
      | Key terms                                | A unique identifier is a string of characters                                           |
      | Partners                                 | YouTube also allows advertisers and creators to serve                                   |
      | Updates                                  | We want to be as transparent as possible about                                          |

   
 
 @GoogleFooterLinkTest
  Scenario Outline: Selecting different sublinks on the Google Terms footer link     
  Given I select the Terms link in the Google footer          
  When  I click on a specific Terms of Service "<terms_service>"      
  Then  I verified the selected "<terms_detail>" Terms detail 
 
  Examples: 
  
      
      | terms_service                          | terms_detail|
      
      | Using our Services                     | You must follow any policies made available                            |
      | Your Google Account                    | You may need a Google Account in order                                 |
      | Privacy and Copyright Protection       | We respond to notices of alleged copyright infringement                |
      | Your Content in our Services           | you upload, submit, store, send or receive content                     |
      | About Software in our Services         | Google gives you a personal, worldwide                                 |
      | Modifying and Terminating our Services | We are constantly changing and improving our Services                  |
      | Our Warranties and Disclaimers         | We provide our Services using a commercially reasonable level of skill |
      | Liability for our Services             | TO THE EXTENT PERMITTED BY LAW                                         |
      | Business uses of our Services          | If you are using our Services on behalf of a business                  |
      | About these Terms                      | We may modify these terms or any additional terms                      |
      | Updates                                | Comparison                                                             |
 


