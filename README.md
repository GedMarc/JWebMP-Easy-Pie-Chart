# JWebMP-Easy-Pie-Chart

Easy Pie Chart Implementation for JWebMP

Example Usage
```
EasyPieChart epc = new EasyPieChart();
epc.getOptions().setBarColor(new ColourCSSImpl("#45ffee"));
epc.getOptions().setLineWidth(2);
epc.getOptions().getAnimate().setDuration(500);
epc.getOptions().setLineCap(LineCapShap.Round);
epc.getOptions().setEasing(JQEasingEffects.swing);
```


Example Asynchronous update
```
EasyPieChart epc = new EasyPieChart(78.5); //move to 78.5%
epc.setID("id"); //Set id so updates are easier, or use same reference as before
epc.getOptions().setBarColor(new ColourCSSImpl("#45ffee"));
epc.getOptions().setLineWidth(2);
epc.getOptions().getAnimate().setDuration(500);
epc.getOptions().setLineCap(LineCapShap.Round);
epc.getOptions().setEasing(JQEasingEffects.swing);

AtmosphereResource async = GuiceContext.get(AtmosphereResource.class);
AjaxResponse response = new AjaxResponse();
response.addComponent(epc);
async.write(response.toString());
```

# Easy Pie Chart

Lightweight plugin to render simple, animated and retina optimized pie charts

Angular Link
https://github.com/rendro/easy-pie-chart


### Teamcity (https://jwebmp.com/teamcity/viewType.html?buildTypeId=JWebSwingPlugins_BuildEasyPieChart)
### Jira (https://jwebmp/jira/secure/RapidBoard.jspa?rapidView=1&projectKey=JWEB&view=planning.nodetail&epics=visible&selectedEpic=JWEB-298)
### SonarQube (https://jwebmp.com/sonar/dashboard?id=com.jwebmp%3Ajwebmp-dynamic-source-code-viewer&did=1)
### Plugin Source (https://cdnjs.com/libraries/easy-pie-chart)

### Built in collobaration with 
![alt BrowserStack](https://bstacksupport.zendesk.com/attachments/token/ZbwSzMlt8HaSgOBgmGVHtpTNV/?name=Logo-01.svg)
