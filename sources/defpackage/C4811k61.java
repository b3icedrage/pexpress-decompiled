package defpackage;

import android.app.Notification;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: k61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4811k61 extends AbstractC5021l61 {
    public final ArrayList<CharSequence> e = new ArrayList<>();

    @Override // defpackage.AbstractC5021l61
    public final void b(C5234m61 c5234m61) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(c5234m61.b).setBigContentTitle(this.b);
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        Iterator<CharSequence> it = this.e.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    @Override // defpackage.AbstractC5021l61
    @NonNull
    public final String c() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }
}
