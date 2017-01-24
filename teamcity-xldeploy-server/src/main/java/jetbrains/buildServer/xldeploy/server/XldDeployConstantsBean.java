package jetbrains.buildServer.xldeploy.server;

import jetbrains.buildServer.xldeploy.common.XldDeployConstants;
import org.jetbrains.annotations.NotNull;

public class XldDeployConstantsBean
{

  public String getXldDeployHost()
  {
    return XldDeployConstants.SETTINGS_XLDDEPLOY_HOST;
  }

  public String getXldDeployPort()
  {
    return XldDeployConstants.SETTINGS_XLDDEPLOY_PORT;
  }

  @NotNull
  public String getXldDeployUsername()
  {
    return XldDeployConstants.SETTINGS_XLDDEPLOY_USERNAME;
  }

  @NotNull
  public String getXldDeployPassword()
  {
    return XldDeployConstants.SETTINGS_XLDDEPLOY_PASSWORD;
  }

  @NotNull
  public String getXldDeployApplicationName()
  {
    return XldDeployConstants.SETTINGS_XLDDEPLOY_APPLICATION_NAME;
  }

  @NotNull
  public String getXldDeployVersionName()
  {
    return XldDeployConstants.SETTINGS_XLDDEPLOY_VERSION_NAME;
  }

  @NotNull
  public String getXldDeployEnvironmentId()
  {
    return XldDeployConstants.SETTINGS_XLDDEPLOY_ENVIRONMENT_ID;
  }

}
