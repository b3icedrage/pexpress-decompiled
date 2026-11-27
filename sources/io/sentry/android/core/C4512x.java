package io.sentry.android.core;

import defpackage.InterfaceC4761js0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.sentry.android.core.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4512x implements io.sentry.transport.f {

    @NotNull
    public final SentryAndroidOptions a;

    /* JADX INFO: renamed from: io.sentry.android.core.x$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InterfaceC4761js0.a.values().length];
            a = iArr;
            try {
                iArr[InterfaceC4761js0.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InterfaceC4761js0.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[InterfaceC4761js0.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4512x(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    @Override // io.sentry.transport.f
    public final boolean isConnected() {
        int i = a.a[this.a.getConnectionStatusProvider().J0().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
