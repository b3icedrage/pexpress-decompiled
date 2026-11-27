package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: i61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4343i61 extends AbstractC5021l61 {

    /* JADX INFO: renamed from: i61$a */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }
    }

    @Override // defpackage.AbstractC5021l61
    public final void a(@NonNull Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", 0);
        bundle.putBoolean("android.callIsVideo", false);
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", null);
        bundle.putParcelable("android.declineIntent", null);
        bundle.putParcelable("android.hangUpIntent", null);
    }

    @Override // defpackage.AbstractC5021l61
    public final void b(C5234m61 c5234m61) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (Log.isLoggable("NotifCompat", 3)) {
                String.valueOf(0);
            }
        } else {
            Notification.Builder builder = c5234m61.b;
            builder.setContentTitle(null);
            Bundle bundle = this.a.t;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.a.t.getCharSequence("android.text");
            builder.setContentText(charSequence != null ? charSequence : null);
            a.b(builder, "call");
        }
    }

    @Override // defpackage.AbstractC5021l61
    @NonNull
    public final String c() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }
}
