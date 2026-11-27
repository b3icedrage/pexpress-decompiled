package defpackage;

import android.app.Notification;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: g61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3923g61 extends AbstractC5021l61 {
    public CharSequence e;

    @Override // defpackage.AbstractC5021l61
    public final void b(C5234m61 c5234m61) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(c5234m61.b).setBigContentTitle(this.b).bigText(this.e);
        if (this.d) {
            bigTextStyleBigText.setSummaryText(this.c);
        }
    }

    @Override // defpackage.AbstractC5021l61
    @NonNull
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
