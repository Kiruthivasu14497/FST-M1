package testRunner;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;

import io.cucumber.junit.platform.engine.Constants;

@Suite // to make the class to test suite
@IncludeEngines("cucumber")  // convert the suite from junit to cucumber
@SelectClasspathResource("Features")  // folder name where the feature files are available
@ConfigurationParameter(
  key = Constants.GLUE_PROPERTY_NAME,
  value = "stepDefenitions")
@ConfigurationParameter(
  key = Constants.FILTER_TAGS_PROPERTY_NAME,
  value = "@activity6")
@ConfigurationParameter(
        key = Constants.PLUGIN_PROPERTY_NAME,
        value = "pretty, html:Reports/HTML_Report.html, junit:Reports/XML_Report.xml, json:Reports/JSON_Report.json"
)
@ConfigurationParameter(
        key = Constants.PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME,
        value = "true"
)

public class testRunner {
	
}