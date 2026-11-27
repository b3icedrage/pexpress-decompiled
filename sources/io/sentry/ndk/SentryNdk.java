package io.sentry.ndk;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryNdk {
    private static volatile boolean nativeLibrariesLoaded;

    private SentryNdk() {
    }

    public static void close() {
        loadNativeLibraries();
        shutdown();
    }

    public static void init(@NotNull NdkOptions ndkOptions) {
        loadNativeLibraries();
        int iInitSentryNative = initSentryNative(ndkOptions);
        if (iInitSentryNative > 0) {
            throw new IllegalStateException("A sentry-native internal init error occurred, please check the logs for more details.");
        }
        if (iInitSentryNative < 0) {
            throw new IllegalStateException("A sentry-native setup failure occurred");
        }
    }

    private static native int initSentryNative(@NotNull NdkOptions ndkOptions);

    public static synchronized void loadNativeLibraries() {
        if (!nativeLibrariesLoaded) {
            System.loadLibrary("log");
            System.loadLibrary("sentry");
            System.loadLibrary("sentry-android");
            nativeLibrariesLoaded = true;
        }
    }

    private static native void shutdown();
}
