package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: f61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3713f61 extends AbstractC5021l61 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    /* JADX INFO: renamed from: f61$a */
    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* JADX INFO: renamed from: f61$b */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
            bigPictureStyle.showBigPictureWhenCollapsed(z);
        }
    }

    @Override // defpackage.AbstractC5021l61
    public final void b(C5234m61 c5234m61) {
        Bitmap bitmapA;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(c5234m61.b).setBigContentTitle(this.b);
        IconCompat iconCompat = this.e;
        Context context = c5234m61.a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                b.a(bigContentTitle, IconCompat.a.f(iconCompat, context));
            } else {
                int iC = iconCompat.a;
                if (iC == -1) {
                    iC = IconCompat.a.c(iconCompat.b);
                }
                if (iC == 1) {
                    IconCompat iconCompat2 = this.e;
                    int i = iconCompat2.a;
                    if (i == -1) {
                        Object obj = iconCompat2.b;
                        bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmapA = (Bitmap) iconCompat2.b;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        bitmapA = IconCompat.a((Bitmap) iconCompat2.b, true);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmapA);
                }
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                a.a(bigContentTitle, IconCompat.a.f(iconCompat3, context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            b.c(bigContentTitle, false);
            b.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.AbstractC5021l61
    @NonNull
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
