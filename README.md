# travis-groovy
Execute groovy scripts on travis-ci 

[![Build Status](https://travis-ci.org/kdabir/travis-groovy.svg?branch=master)](https://travis-ci.org/kdabir/travis-groovy)

- Example `script.groovy` included in the repo. Replaced it with groovy script(s) of choice. 
- Multiple groovy scripts can be executed. 
- All groovy scripting goodness like `Grab` available in the scripts.

Here is the sample output

![image](https://user-images.githubusercontent.com/735240/29739403-9a27c8b6-8a5a-11e7-8f61-0c5ea1ed0336.png)


### Adding Environment Variables

Env variables added via Travis settings are accesible in the script via `System.env.<var-here>` syntax.

![image](https://user-images.githubusercontent.com/735240/29739421-ed1772f6-8a5a-11e7-9c91-d768d41c4e4c.png)


### Scheduled Execution

Build (i.e. any script execution) can be triggered via cron settings available on Travis settings.

![image](https://user-images.githubusercontent.com/735240/29739419-e28ad8b4-8a5a-11e7-9978-97d4f07d91ea.png)


### Notifications

Exiting with non-zero value is considered as build failure and a notification will be sent by Travis.
