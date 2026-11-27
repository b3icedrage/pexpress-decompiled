package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.pexpress.tool.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: h61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4133h61 {

    @Deprecated
    public final ArrayList<String> A;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public AbstractC5021l61 l;
    public int m;
    public int n;
    public boolean o;
    public String p;
    public boolean q;
    public String s;
    public Bundle t;
    public String w;
    public final boolean y;
    public Notification z;
    public final ArrayList<C3503e61> b = new ArrayList<>();

    @NonNull
    public final ArrayList<C7440wd1> c = new ArrayList<>();
    public final ArrayList<C3503e61> d = new ArrayList<>();
    public boolean k = true;
    public boolean r = false;
    public int u = 0;
    public int v = 0;
    public int x = 0;

    /* JADX INFO: renamed from: h61$a */
    public static class a {
        public static AudioAttributes a(AudioAttributes.Builder builder) {
            return builder.build();
        }

        public static AudioAttributes.Builder b() {
            return new AudioAttributes.Builder();
        }

        public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
            return builder.setContentType(i);
        }

        public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
            return builder.setLegacyStreamType(i);
        }

        public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
            return builder.setUsage(i);
        }
    }

    public C4133h61(@NonNull Context context, @NonNull String str) {
        Notification notification = new Notification();
        this.z = notification;
        this.a = context;
        this.w = str;
        notification.when = System.currentTimeMillis();
        this.z.audioStreamType = -1;
        this.j = 0;
        this.A = new ArrayList<>();
        this.y = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    @NonNull
    public final void a(int i, String str, PendingIntent pendingIntent) {
        this.b.add(new C3503e61(i != 0 ? IconCompat.b(null, "", i) : null, str, pendingIntent, new Bundle(), null, null));
    }

    @NonNull
    public final Notification b() {
        Notification notificationBuild;
        Bundle bundle;
        C5234m61 c5234m61 = new C5234m61(this);
        C4133h61 c4133h61 = c5234m61.c;
        AbstractC5021l61 abstractC5021l61 = c4133h61.l;
        if (abstractC5021l61 != null) {
            abstractC5021l61.b(c5234m61);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = c5234m61.b;
        if (i >= 26) {
            notificationBuild = builder.build();
        } else {
            Notification notificationBuild2 = builder.build();
            int i2 = c5234m61.e;
            if (i2 != 0) {
                if (C5234m61.a.f(notificationBuild2) != null && (notificationBuild2.flags & UserVerificationMethods.USER_VERIFY_NONE) != 0 && i2 == 2) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
                if (C5234m61.a.f(notificationBuild2) != null && (notificationBuild2.flags & UserVerificationMethods.USER_VERIFY_NONE) == 0 && i2 == 1) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
            }
            notificationBuild = notificationBuild2;
        }
        if (abstractC5021l61 != null) {
            c4133h61.l.getClass();
        }
        if (abstractC5021l61 != null && (bundle = notificationBuild.extras) != null) {
            abstractC5021l61.a(bundle);
        }
        return notificationBuild;
    }

    @NonNull
    public final void d(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    @NonNull
    public final void e(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    @NonNull
    public final void f(int i) {
        Notification notification = this.z;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void g(int i, boolean z) {
        if (z) {
            Notification notification = this.z;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.z;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    @NonNull
    public final void h(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    @NonNull
    public final void i(int i, boolean z, int i2) {
        this.m = i;
        this.n = i2;
        this.o = z;
    }

    @NonNull
    public final void j(Uri uri) {
        Notification notification = this.z;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder builderE = a.e(a.c(a.b(), 4), 5);
        this.z.audioAttributes = a.a(builderE);
    }

    @NonNull
    public final void k(AbstractC5021l61 abstractC5021l61) {
        if (this.l != abstractC5021l61) {
            this.l = abstractC5021l61;
            if (abstractC5021l61 == null || abstractC5021l61.a == this) {
                return;
            }
            abstractC5021l61.a = this;
            k(abstractC5021l61);
        }
    }
}
