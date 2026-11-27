package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C6489s51;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class p {

    @NotNull
    public volatile q a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public final boolean a(@NotNull q newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        switch (a.a[this.a.ordinal()]) {
            case 1:
                return newState == q.STARTED || newState == q.CLOSED;
            case 2:
                return newState == q.PAUSED || newState == q.STOPPED || newState == q.CLOSED;
            case 3:
                return newState == q.PAUSED || newState == q.STOPPED || newState == q.CLOSED;
            case 4:
                return newState == q.RESUMED || newState == q.STOPPED || newState == q.CLOSED;
            case 5:
                return newState == q.STARTED || newState == q.CLOSED;
            case 6:
                return false;
            default:
                throw new C6489s51();
        }
    }
}
