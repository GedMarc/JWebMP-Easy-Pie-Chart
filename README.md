# JWebSwing-Easy-Pie-Chart

Easy Pie Chart Implementation for JWebSwing

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

AtmosphereResource async = GuiceContext.getInstance(AtmosphereResource.class);
AjaxResponse response = new AjaxResponse();
response.addComponent(epc);
async.write(response.toString());
```

# Easy Pie Chart

Lightweight plugin to render simple, animated and retina optimized pie charts

Angular Link
https://github.com/rendro/easy-pie-chart