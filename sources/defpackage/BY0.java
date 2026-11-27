package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class BY0 implements I01<Uri, InputStream> {
    public final Context a;

    public static class a implements J01<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Uri, InputStream> d(J11 j11) {
            return new BY0(this.a);
        }
    }

    public BY0(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.I01
    public final boolean a(@NonNull Uri uri) {
        Uri uri2 = uri;
        return Nm2.g(uri2) && uri2.getPathSegments().contains("video");
    }

    @Override // defpackage.I01
    public final I01.a<InputStream> b(@NonNull Uri uri, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        Long l;
        Uri uri2 = uri;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c4227ha1.c(C7020ud2.d)) == null || l.longValue() != -1) {
            return null;
        }
        M71 m71 = new M71(uri2);
        Context context = this.a;
        return new I01.a<>(m71, VY1.d(context, uri2, new VY1.b(context.getContentResolver())));
    }
}
