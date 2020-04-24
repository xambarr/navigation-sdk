

package com.mapbox.services.android.navigation.v5.navigation;

import androidx.annotation.Nullable;
import com.mapbox.services.android.navigation.v5.navigation.notification.NavigationNotification;

// Generated by com.google.auto.value.processor.AutoValueProcessor
 final class AutoValue_MapboxNavigationOptions extends MapboxNavigationOptions {

  private final double maxTurnCompletionOffset;
  private final double maneuverZoneRadius;
  private final double maximumDistanceOffRoute;
  private final double deadReckoningTimeInterval;
  private final double maxManipulatedCourseAngle;
  private final double userLocationSnapDistance;
  private final int secondsBeforeReroute;
  private final boolean defaultMilestonesEnabled;
  private final boolean snapToRoute;
  private final boolean enableOffRouteDetection;
  private final boolean enableFasterRouteDetection;
  private final boolean manuallyEndNavigationUponCompletion;
  private final double metersRemainingTillArrival;
  private final boolean isFromNavigationUi;
  private final double minimumDistanceBeforeRerouting;
  private final boolean isDebugLoggingEnabled;
  private final NavigationNotification navigationNotification;
  private final int roundingIncrement;
  private final int timeFormatType;
  private final int locationAcceptableAccuracyInMetersThreshold;

  private AutoValue_MapboxNavigationOptions(
      double maxTurnCompletionOffset,
      double maneuverZoneRadius,
      double maximumDistanceOffRoute,
      double deadReckoningTimeInterval,
      double maxManipulatedCourseAngle,
      double userLocationSnapDistance,
      int secondsBeforeReroute,
      boolean defaultMilestonesEnabled,
      boolean snapToRoute,
      boolean enableOffRouteDetection,
      boolean enableFasterRouteDetection,
      boolean manuallyEndNavigationUponCompletion,
      double metersRemainingTillArrival,
      boolean isFromNavigationUi,
      double minimumDistanceBeforeRerouting,
      boolean isDebugLoggingEnabled,
      @Nullable NavigationNotification navigationNotification,
      int roundingIncrement,
      int timeFormatType,
      int locationAcceptableAccuracyInMetersThreshold) {
    this.maxTurnCompletionOffset = maxTurnCompletionOffset;
    this.maneuverZoneRadius = maneuverZoneRadius;
    this.maximumDistanceOffRoute = maximumDistanceOffRoute;
    this.deadReckoningTimeInterval = deadReckoningTimeInterval;
    this.maxManipulatedCourseAngle = maxManipulatedCourseAngle;
    this.userLocationSnapDistance = userLocationSnapDistance;
    this.secondsBeforeReroute = secondsBeforeReroute;
    this.defaultMilestonesEnabled = defaultMilestonesEnabled;
    this.snapToRoute = snapToRoute;
    this.enableOffRouteDetection = enableOffRouteDetection;
    this.enableFasterRouteDetection = enableFasterRouteDetection;
    this.manuallyEndNavigationUponCompletion = manuallyEndNavigationUponCompletion;
    this.metersRemainingTillArrival = metersRemainingTillArrival;
    this.isFromNavigationUi = isFromNavigationUi;
    this.minimumDistanceBeforeRerouting = minimumDistanceBeforeRerouting;
    this.isDebugLoggingEnabled = isDebugLoggingEnabled;
    this.navigationNotification = navigationNotification;
    this.roundingIncrement = roundingIncrement;
    this.timeFormatType = timeFormatType;
    this.locationAcceptableAccuracyInMetersThreshold = locationAcceptableAccuracyInMetersThreshold;
  }

  @Override
  public double maxTurnCompletionOffset() {
    return maxTurnCompletionOffset;
  }

  @Override
  public double maneuverZoneRadius() {
    return maneuverZoneRadius;
  }

  @Override
  public double maximumDistanceOffRoute() {
    return maximumDistanceOffRoute;
  }

  @Override
  public double deadReckoningTimeInterval() {
    return deadReckoningTimeInterval;
  }

  @Override
  public double maxManipulatedCourseAngle() {
    return maxManipulatedCourseAngle;
  }

  @Override
  public double userLocationSnapDistance() {
    return userLocationSnapDistance;
  }

  @Override
  public int secondsBeforeReroute() {
    return secondsBeforeReroute;
  }

  @Override
  public boolean defaultMilestonesEnabled() {
    return defaultMilestonesEnabled;
  }

  @Override
  public boolean snapToRoute() {
    return snapToRoute;
  }

  @Override
  public boolean enableOffRouteDetection() {
    return enableOffRouteDetection;
  }

  @Override
  public boolean enableFasterRouteDetection() {
    return enableFasterRouteDetection;
  }

  @Override
  public boolean manuallyEndNavigationUponCompletion() {
    return manuallyEndNavigationUponCompletion;
  }

  @Override
  public double metersRemainingTillArrival() {
    return metersRemainingTillArrival;
  }

  @Override
  public boolean isFromNavigationUi() {
    return isFromNavigationUi;
  }

  @Override
  public double minimumDistanceBeforeRerouting() {
    return minimumDistanceBeforeRerouting;
  }

  @Override
  public boolean isDebugLoggingEnabled() {
    return isDebugLoggingEnabled;
  }

  @Nullable
  @Override
  public NavigationNotification navigationNotification() {
    return navigationNotification;
  }

  @NavigationConstants.RoundingIncrement
  @Override
  public int roundingIncrement() {
    return roundingIncrement;
  }

  @NavigationTimeFormat.Type
  @Override
  public int timeFormatType() {
    return timeFormatType;
  }

  @Override
  public int locationAcceptableAccuracyInMetersThreshold() {
    return locationAcceptableAccuracyInMetersThreshold;
  }

  @Override
  public String toString() {
    return "MapboxNavigationOptions{"
         + "maxTurnCompletionOffset=" + maxTurnCompletionOffset + ", "
         + "maneuverZoneRadius=" + maneuverZoneRadius + ", "
         + "maximumDistanceOffRoute=" + maximumDistanceOffRoute + ", "
         + "deadReckoningTimeInterval=" + deadReckoningTimeInterval + ", "
         + "maxManipulatedCourseAngle=" + maxManipulatedCourseAngle + ", "
         + "userLocationSnapDistance=" + userLocationSnapDistance + ", "
         + "secondsBeforeReroute=" + secondsBeforeReroute + ", "
         + "defaultMilestonesEnabled=" + defaultMilestonesEnabled + ", "
         + "snapToRoute=" + snapToRoute + ", "
         + "enableOffRouteDetection=" + enableOffRouteDetection + ", "
         + "enableFasterRouteDetection=" + enableFasterRouteDetection + ", "
         + "manuallyEndNavigationUponCompletion=" + manuallyEndNavigationUponCompletion + ", "
         + "metersRemainingTillArrival=" + metersRemainingTillArrival + ", "
         + "isFromNavigationUi=" + isFromNavigationUi + ", "
         + "minimumDistanceBeforeRerouting=" + minimumDistanceBeforeRerouting + ", "
         + "isDebugLoggingEnabled=" + isDebugLoggingEnabled + ", "
         + "navigationNotification=" + navigationNotification + ", "
         + "roundingIncrement=" + roundingIncrement + ", "
         + "timeFormatType=" + timeFormatType + ", "
         + "locationAcceptableAccuracyInMetersThreshold=" + locationAcceptableAccuracyInMetersThreshold
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapboxNavigationOptions) {
      MapboxNavigationOptions that = (MapboxNavigationOptions) o;
      return (Double.doubleToLongBits(this.maxTurnCompletionOffset) == Double.doubleToLongBits(that.maxTurnCompletionOffset()))
           && (Double.doubleToLongBits(this.maneuverZoneRadius) == Double.doubleToLongBits(that.maneuverZoneRadius()))
           && (Double.doubleToLongBits(this.maximumDistanceOffRoute) == Double.doubleToLongBits(that.maximumDistanceOffRoute()))
           && (Double.doubleToLongBits(this.deadReckoningTimeInterval) == Double.doubleToLongBits(that.deadReckoningTimeInterval()))
           && (Double.doubleToLongBits(this.maxManipulatedCourseAngle) == Double.doubleToLongBits(that.maxManipulatedCourseAngle()))
           && (Double.doubleToLongBits(this.userLocationSnapDistance) == Double.doubleToLongBits(that.userLocationSnapDistance()))
           && (this.secondsBeforeReroute == that.secondsBeforeReroute())
           && (this.defaultMilestonesEnabled == that.defaultMilestonesEnabled())
           && (this.snapToRoute == that.snapToRoute())
           && (this.enableOffRouteDetection == that.enableOffRouteDetection())
           && (this.enableFasterRouteDetection == that.enableFasterRouteDetection())
           && (this.manuallyEndNavigationUponCompletion == that.manuallyEndNavigationUponCompletion())
           && (Double.doubleToLongBits(this.metersRemainingTillArrival) == Double.doubleToLongBits(that.metersRemainingTillArrival()))
           && (this.isFromNavigationUi == that.isFromNavigationUi())
           && (Double.doubleToLongBits(this.minimumDistanceBeforeRerouting) == Double.doubleToLongBits(that.minimumDistanceBeforeRerouting()))
           && (this.isDebugLoggingEnabled == that.isDebugLoggingEnabled())
           && ((this.navigationNotification == null) ? (that.navigationNotification() == null) : this.navigationNotification.equals(that.navigationNotification()))
           && (this.roundingIncrement == that.roundingIncrement())
           && (this.timeFormatType == that.timeFormatType())
           && (this.locationAcceptableAccuracyInMetersThreshold == that.locationAcceptableAccuracyInMetersThreshold());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(maxTurnCompletionOffset) >>> 32) ^ Double.doubleToLongBits(maxTurnCompletionOffset));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(maneuverZoneRadius) >>> 32) ^ Double.doubleToLongBits(maneuverZoneRadius));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(maximumDistanceOffRoute) >>> 32) ^ Double.doubleToLongBits(maximumDistanceOffRoute));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(deadReckoningTimeInterval) >>> 32) ^ Double.doubleToLongBits(deadReckoningTimeInterval));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(maxManipulatedCourseAngle) >>> 32) ^ Double.doubleToLongBits(maxManipulatedCourseAngle));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(userLocationSnapDistance) >>> 32) ^ Double.doubleToLongBits(userLocationSnapDistance));
    h$ *= 1000003;
    h$ ^= secondsBeforeReroute;
    h$ *= 1000003;
    h$ ^= defaultMilestonesEnabled ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= snapToRoute ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= enableOffRouteDetection ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= enableFasterRouteDetection ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= manuallyEndNavigationUponCompletion ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(metersRemainingTillArrival) >>> 32) ^ Double.doubleToLongBits(metersRemainingTillArrival));
    h$ *= 1000003;
    h$ ^= isFromNavigationUi ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(minimumDistanceBeforeRerouting) >>> 32) ^ Double.doubleToLongBits(minimumDistanceBeforeRerouting));
    h$ *= 1000003;
    h$ ^= isDebugLoggingEnabled ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (navigationNotification == null) ? 0 : navigationNotification.hashCode();
    h$ *= 1000003;
    h$ ^= roundingIncrement;
    h$ *= 1000003;
    h$ ^= timeFormatType;
    h$ *= 1000003;
    h$ ^= locationAcceptableAccuracyInMetersThreshold;
    return h$;
  }

  @Override
  public MapboxNavigationOptions.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MapboxNavigationOptions.Builder {
    private Double maxTurnCompletionOffset;
    private Double maneuverZoneRadius;
    private Double maximumDistanceOffRoute;
    private Double deadReckoningTimeInterval;
    private Double maxManipulatedCourseAngle;
    private Double userLocationSnapDistance;
    private Integer secondsBeforeReroute;
    private Boolean defaultMilestonesEnabled;
    private Boolean snapToRoute;
    private Boolean enableOffRouteDetection;
    private Boolean enableFasterRouteDetection;
    private Boolean manuallyEndNavigationUponCompletion;
    private Double metersRemainingTillArrival;
    private Boolean isFromNavigationUi;
    private Double minimumDistanceBeforeRerouting;
    private Boolean isDebugLoggingEnabled;
    private NavigationNotification navigationNotification;
    private Integer roundingIncrement;
    private Integer timeFormatType;
    private Integer locationAcceptableAccuracyInMetersThreshold;
    Builder() {
    }
    private Builder(MapboxNavigationOptions source) {
      this.maxTurnCompletionOffset = source.maxTurnCompletionOffset();
      this.maneuverZoneRadius = source.maneuverZoneRadius();
      this.maximumDistanceOffRoute = source.maximumDistanceOffRoute();
      this.deadReckoningTimeInterval = source.deadReckoningTimeInterval();
      this.maxManipulatedCourseAngle = source.maxManipulatedCourseAngle();
      this.userLocationSnapDistance = source.userLocationSnapDistance();
      this.secondsBeforeReroute = source.secondsBeforeReroute();
      this.defaultMilestonesEnabled = source.defaultMilestonesEnabled();
      this.snapToRoute = source.snapToRoute();
      this.enableOffRouteDetection = source.enableOffRouteDetection();
      this.enableFasterRouteDetection = source.enableFasterRouteDetection();
      this.manuallyEndNavigationUponCompletion = source.manuallyEndNavigationUponCompletion();
      this.metersRemainingTillArrival = source.metersRemainingTillArrival();
      this.isFromNavigationUi = source.isFromNavigationUi();
      this.minimumDistanceBeforeRerouting = source.minimumDistanceBeforeRerouting();
      this.isDebugLoggingEnabled = source.isDebugLoggingEnabled();
      this.navigationNotification = source.navigationNotification();
      this.roundingIncrement = source.roundingIncrement();
      this.timeFormatType = source.timeFormatType();
      this.locationAcceptableAccuracyInMetersThreshold = source.locationAcceptableAccuracyInMetersThreshold();
    }
    @Override
    public MapboxNavigationOptions.Builder maxTurnCompletionOffset(double maxTurnCompletionOffset) {
      this.maxTurnCompletionOffset = maxTurnCompletionOffset;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder maneuverZoneRadius(double maneuverZoneRadius) {
      this.maneuverZoneRadius = maneuverZoneRadius;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder maximumDistanceOffRoute(double maximumDistanceOffRoute) {
      this.maximumDistanceOffRoute = maximumDistanceOffRoute;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder deadReckoningTimeInterval(double deadReckoningTimeInterval) {
      this.deadReckoningTimeInterval = deadReckoningTimeInterval;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder maxManipulatedCourseAngle(double maxManipulatedCourseAngle) {
      this.maxManipulatedCourseAngle = maxManipulatedCourseAngle;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder userLocationSnapDistance(double userLocationSnapDistance) {
      this.userLocationSnapDistance = userLocationSnapDistance;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder secondsBeforeReroute(int secondsBeforeReroute) {
      this.secondsBeforeReroute = secondsBeforeReroute;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder defaultMilestonesEnabled(boolean defaultMilestonesEnabled) {
      this.defaultMilestonesEnabled = defaultMilestonesEnabled;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder snapToRoute(boolean snapToRoute) {
      this.snapToRoute = snapToRoute;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder enableOffRouteDetection(boolean enableOffRouteDetection) {
      this.enableOffRouteDetection = enableOffRouteDetection;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder enableFasterRouteDetection(boolean enableFasterRouteDetection) {
      this.enableFasterRouteDetection = enableFasterRouteDetection;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder manuallyEndNavigationUponCompletion(boolean manuallyEndNavigationUponCompletion) {
      this.manuallyEndNavigationUponCompletion = manuallyEndNavigationUponCompletion;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder metersRemainingTillArrival(double metersRemainingTillArrival) {
      this.metersRemainingTillArrival = metersRemainingTillArrival;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder isFromNavigationUi(boolean isFromNavigationUi) {
      this.isFromNavigationUi = isFromNavigationUi;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder minimumDistanceBeforeRerouting(double minimumDistanceBeforeRerouting) {
      this.minimumDistanceBeforeRerouting = minimumDistanceBeforeRerouting;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder isDebugLoggingEnabled(boolean isDebugLoggingEnabled) {
      this.isDebugLoggingEnabled = isDebugLoggingEnabled;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder navigationNotification(@Nullable NavigationNotification navigationNotification) {
      this.navigationNotification = navigationNotification;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder roundingIncrement(int roundingIncrement) {
      this.roundingIncrement = roundingIncrement;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder timeFormatType(int timeFormatType) {
      this.timeFormatType = timeFormatType;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder locationAcceptableAccuracyInMetersThreshold(int locationAcceptableAccuracyInMetersThreshold) {
      this.locationAcceptableAccuracyInMetersThreshold = locationAcceptableAccuracyInMetersThreshold;
      return this;
    }
    @Override
    public MapboxNavigationOptions build() {
      String missing = "";
      if (this.maxTurnCompletionOffset == null) {
        missing += " maxTurnCompletionOffset";
      }
      if (this.maneuverZoneRadius == null) {
        missing += " maneuverZoneRadius";
      }
      if (this.maximumDistanceOffRoute == null) {
        missing += " maximumDistanceOffRoute";
      }
      if (this.deadReckoningTimeInterval == null) {
        missing += " deadReckoningTimeInterval";
      }
      if (this.maxManipulatedCourseAngle == null) {
        missing += " maxManipulatedCourseAngle";
      }
      if (this.userLocationSnapDistance == null) {
        missing += " userLocationSnapDistance";
      }
      if (this.secondsBeforeReroute == null) {
        missing += " secondsBeforeReroute";
      }
      if (this.defaultMilestonesEnabled == null) {
        missing += " defaultMilestonesEnabled";
      }
      if (this.snapToRoute == null) {
        missing += " snapToRoute";
      }
      if (this.enableOffRouteDetection == null) {
        missing += " enableOffRouteDetection";
      }
      if (this.enableFasterRouteDetection == null) {
        missing += " enableFasterRouteDetection";
      }
      if (this.manuallyEndNavigationUponCompletion == null) {
        missing += " manuallyEndNavigationUponCompletion";
      }
      if (this.metersRemainingTillArrival == null) {
        missing += " metersRemainingTillArrival";
      }
      if (this.isFromNavigationUi == null) {
        missing += " isFromNavigationUi";
      }
      if (this.minimumDistanceBeforeRerouting == null) {
        missing += " minimumDistanceBeforeRerouting";
      }
      if (this.isDebugLoggingEnabled == null) {
        missing += " isDebugLoggingEnabled";
      }
      if (this.roundingIncrement == null) {
        missing += " roundingIncrement";
      }
      if (this.timeFormatType == null) {
        missing += " timeFormatType";
      }
      if (this.locationAcceptableAccuracyInMetersThreshold == null) {
        missing += " locationAcceptableAccuracyInMetersThreshold";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapboxNavigationOptions(
          this.maxTurnCompletionOffset,
          this.maneuverZoneRadius,
          this.maximumDistanceOffRoute,
          this.deadReckoningTimeInterval,
          this.maxManipulatedCourseAngle,
          this.userLocationSnapDistance,
          this.secondsBeforeReroute,
          this.defaultMilestonesEnabled,
          this.snapToRoute,
          this.enableOffRouteDetection,
          this.enableFasterRouteDetection,
          this.manuallyEndNavigationUponCompletion,
          this.metersRemainingTillArrival,
          this.isFromNavigationUi,
          this.minimumDistanceBeforeRerouting,
          this.isDebugLoggingEnabled,
          this.navigationNotification,
          this.roundingIncrement,
          this.timeFormatType,
          this.locationAcceptableAccuracyInMetersThreshold);
    }
  }

}