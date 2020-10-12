

package com.mapbox.services.android.navigation.ui.v5;

import androidx.annotation.Nullable;
import com.mapbox.api.directions.v5.models.DirectionsRoute;

// Generated by com.google.auto.value.processor.AutoValueProcessor
 final class AutoValue_NavigationLauncherOptions extends NavigationLauncherOptions {

  private final DirectionsRoute directionsRoute;
  private final String directionsProfile;
  private final Integer lightThemeResId;
  private final Integer darkThemeResId;
  private final boolean shouldSimulateRoute;
  private final boolean waynameChipEnabled;
  private final boolean enableOffRouteDetection;
  private final boolean snapToRoute;

  private AutoValue_NavigationLauncherOptions(
      DirectionsRoute directionsRoute,
      @Nullable String directionsProfile,
      @Nullable Integer lightThemeResId,
      @Nullable Integer darkThemeResId,
      boolean shouldSimulateRoute,
      boolean waynameChipEnabled,
      boolean enableOffRouteDetection,
      boolean snapToRoute) {
    this.directionsRoute = directionsRoute;
    this.directionsProfile = directionsProfile;
    this.lightThemeResId = lightThemeResId;
    this.darkThemeResId = darkThemeResId;
    this.shouldSimulateRoute = shouldSimulateRoute;
    this.waynameChipEnabled = waynameChipEnabled;
    this.enableOffRouteDetection = enableOffRouteDetection;
    this.snapToRoute = snapToRoute;
  }

  @Override
  public DirectionsRoute directionsRoute() {
    return directionsRoute;
  }

  @Nullable
  @Override
  public String directionsProfile() {
    return directionsProfile;
  }

  @Nullable
  @Override
  public Integer lightThemeResId() {
    return lightThemeResId;
  }

  @Nullable
  @Override
  public Integer darkThemeResId() {
    return darkThemeResId;
  }

  @Override
  public boolean shouldSimulateRoute() {
    return shouldSimulateRoute;
  }

  @Override
  public boolean waynameChipEnabled() {
    return waynameChipEnabled;
  }

  @Override
  public boolean enableOffRouteDetection() {
    return enableOffRouteDetection;
  }

  @Override
  public boolean snapToRoute() {
    return snapToRoute;
  }

  @Override
  public String toString() {
    return "NavigationLauncherOptions{"
         + "directionsRoute=" + directionsRoute + ", "
         + "directionsProfile=" + directionsProfile + ", "
         + "lightThemeResId=" + lightThemeResId + ", "
         + "darkThemeResId=" + darkThemeResId + ", "
         + "shouldSimulateRoute=" + shouldSimulateRoute + ", "
         + "waynameChipEnabled=" + waynameChipEnabled + ", "
         + "enableOffRouteDetection=" + enableOffRouteDetection + ", "
         + "snapToRoute=" + snapToRoute
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NavigationLauncherOptions) {
      NavigationLauncherOptions that = (NavigationLauncherOptions) o;
      return (this.directionsRoute.equals(that.directionsRoute()))
           && ((this.directionsProfile == null) ? (that.directionsProfile() == null) : this.directionsProfile.equals(that.directionsProfile()))
           && ((this.lightThemeResId == null) ? (that.lightThemeResId() == null) : this.lightThemeResId.equals(that.lightThemeResId()))
           && ((this.darkThemeResId == null) ? (that.darkThemeResId() == null) : this.darkThemeResId.equals(that.darkThemeResId()))
           && (this.shouldSimulateRoute == that.shouldSimulateRoute())
           && (this.waynameChipEnabled == that.waynameChipEnabled())
           && (this.enableOffRouteDetection == that.enableOffRouteDetection())
           && (this.snapToRoute == that.snapToRoute());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= directionsRoute.hashCode();
    h$ *= 1000003;
    h$ ^= (directionsProfile == null) ? 0 : directionsProfile.hashCode();
    h$ *= 1000003;
    h$ ^= (lightThemeResId == null) ? 0 : lightThemeResId.hashCode();
    h$ *= 1000003;
    h$ ^= (darkThemeResId == null) ? 0 : darkThemeResId.hashCode();
    h$ *= 1000003;
    h$ ^= shouldSimulateRoute ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= waynameChipEnabled ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= enableOffRouteDetection ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= snapToRoute ? 1231 : 1237;
    return h$;
  }

  static final class Builder extends NavigationLauncherOptions.Builder {
    private DirectionsRoute directionsRoute;
    private String directionsProfile;
    private Integer lightThemeResId;
    private Integer darkThemeResId;
    private Boolean shouldSimulateRoute;
    private Boolean waynameChipEnabled;
    private Boolean enableOffRouteDetection;
    private Boolean snapToRoute;
    Builder() {
    }
    @Override
    public NavigationLauncherOptions.Builder directionsRoute(DirectionsRoute directionsRoute) {
      if (directionsRoute == null) {
        throw new NullPointerException("Null directionsRoute");
      }
      this.directionsRoute = directionsRoute;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder directionsProfile(@Nullable String directionsProfile) {
      this.directionsProfile = directionsProfile;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder lightThemeResId(@Nullable Integer lightThemeResId) {
      this.lightThemeResId = lightThemeResId;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder darkThemeResId(@Nullable Integer darkThemeResId) {
      this.darkThemeResId = darkThemeResId;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder shouldSimulateRoute(boolean shouldSimulateRoute) {
      this.shouldSimulateRoute = shouldSimulateRoute;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder waynameChipEnabled(boolean waynameChipEnabled) {
      this.waynameChipEnabled = waynameChipEnabled;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder enableOffRouteDetection(boolean enableOffRouteDetection) {
      this.enableOffRouteDetection = enableOffRouteDetection;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder snapToRoute(boolean snapToRoute) {
      this.snapToRoute = snapToRoute;
      return this;
    }
    @Override
    public NavigationLauncherOptions build() {
      String missing = "";
      if (this.directionsRoute == null) {
        missing += " directionsRoute";
      }
      if (this.shouldSimulateRoute == null) {
        missing += " shouldSimulateRoute";
      }
      if (this.waynameChipEnabled == null) {
        missing += " waynameChipEnabled";
      }
      if (this.enableOffRouteDetection == null) {
        missing += " enableOffRouteDetection";
      }
      if (this.snapToRoute == null) {
        missing += " snapToRoute";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_NavigationLauncherOptions(
          this.directionsRoute,
          this.directionsProfile,
          this.lightThemeResId,
          this.darkThemeResId,
          this.shouldSimulateRoute,
          this.waynameChipEnabled,
          this.enableOffRouteDetection,
          this.snapToRoute);
    }
  }

}