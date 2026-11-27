package defpackage;

import android.app.Notification;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: nh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5565nh0 {
    public final int a;
    public final int b;
    public final Notification c;

    public C5565nh0(int i, @NonNull Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5565nh0.class != obj.getClass()) {
            return false;
        }
        C5565nh0 c5565nh0 = (C5565nh0) obj;
        if (this.a == c5565nh0.a && this.b == c5565nh0.b) {
            return this.c.equals(c5565nh0.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
