package defpackage;

import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: id2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4450id2 {
    public static final Map<VelocityTracker, C4708jd2> a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: id2$a */
    public static class a {
        public static float a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        public static float b(VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        public static boolean c(VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }
    }
}
