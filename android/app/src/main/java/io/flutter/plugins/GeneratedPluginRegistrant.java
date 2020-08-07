package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.razorpay.razorpay_flutter.RazorpayFlutterPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    RazorpayFlutterPlugin.registerWith(registry.registrarFor("com.razorpay.razorpay_flutter.RazorpayFlutterPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
