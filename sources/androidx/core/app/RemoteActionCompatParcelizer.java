package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.AbstractC5971pd2;
import defpackage.InterfaceC6390rd2;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC5971pd2 abstractC5971pd2) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC6390rd2 interfaceC6390rd2L = remoteActionCompat.a;
        if (abstractC5971pd2.h(1)) {
            interfaceC6390rd2L = abstractC5971pd2.l();
        }
        remoteActionCompat.a = (IconCompat) interfaceC6390rd2L;
        CharSequence charSequenceG = remoteActionCompat.b;
        if (abstractC5971pd2.h(2)) {
            charSequenceG = abstractC5971pd2.g();
        }
        remoteActionCompat.b = charSequenceG;
        CharSequence charSequenceG2 = remoteActionCompat.c;
        if (abstractC5971pd2.h(3)) {
            charSequenceG2 = abstractC5971pd2.g();
        }
        remoteActionCompat.c = charSequenceG2;
        Parcelable parcelableJ = remoteActionCompat.d;
        if (abstractC5971pd2.h(4)) {
            parcelableJ = abstractC5971pd2.j();
        }
        remoteActionCompat.d = (PendingIntent) parcelableJ;
        boolean zE = remoteActionCompat.e;
        if (abstractC5971pd2.h(5)) {
            zE = abstractC5971pd2.e();
        }
        remoteActionCompat.e = zE;
        boolean zE2 = remoteActionCompat.f;
        if (abstractC5971pd2.h(6)) {
            zE2 = abstractC5971pd2.e();
        }
        remoteActionCompat.f = zE2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC5971pd2 abstractC5971pd2) {
        abstractC5971pd2.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        abstractC5971pd2.m(1);
        abstractC5971pd2.t(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        abstractC5971pd2.m(2);
        abstractC5971pd2.p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        abstractC5971pd2.m(3);
        abstractC5971pd2.p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC5971pd2.m(4);
        abstractC5971pd2.r(pendingIntent);
        boolean z = remoteActionCompat.e;
        abstractC5971pd2.m(5);
        abstractC5971pd2.n(z);
        boolean z2 = remoteActionCompat.f;
        abstractC5971pd2.m(6);
        abstractC5971pd2.n(z2);
    }
}
