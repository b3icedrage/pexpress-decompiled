package defpackage;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import io.sentry.android.core.b0;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: kG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4843kG {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    @TargetApi(26)
    public static boolean a(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!C1119Hd.e(resources.getDrawable(i, null))) {
                return true;
            }
            b0.c("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            b0.c("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
