package defpackage;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class Na2 implements I01<URL, InputStream> {
    public final I01<C5162lm0, InputStream> a;

    public static class a implements J01<URL, InputStream> {
        @Override // defpackage.J01
        @NonNull
        public final I01<URL, InputStream> d(J11 j11) {
            return new Na2(j11.a(C5162lm0.class, InputStream.class));
        }
    }

    public Na2(I01<C5162lm0, InputStream> i01) {
        this.a = i01;
    }

    @Override // defpackage.I01
    public final /* bridge */ /* synthetic */ boolean a(@NonNull URL url) {
        return true;
    }

    @Override // defpackage.I01
    public final I01.a<InputStream> b(@NonNull URL url, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        return this.a.b(new C5162lm0(url), i, i2, c4227ha1);
    }
}
