package io.sentry.android.replay.util;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C1952Ru;
import defpackage.C6489s51;
import defpackage.InterfaceC4346i70;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/sentry/android/replay/util/j$a;", "", "<init>", "(Ljava/lang/String;I)V", "SOC_MODEL", "SOC_MANUFACTURER", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        SOC_MODEL,
        SOC_MANUFACTURER;

        private static final /* synthetic */ InterfaceC4346i70 $ENTRIES = C1952Ru.i(values());

        @NotNull
        public static InterfaceC4346i70<a> getEntries() {
            return $ENTRIES;
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SOC_MODEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SOC_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static String a(a key) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter("", "defaultValue");
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i = b.a[key.ordinal()];
        if (i == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i != 2) {
                throw new C6489s51();
            }
            str = Build.SOC_MANUFACTURER;
        }
        Intrinsics.checkNotNull(str);
        return str;
    }
}
