package defpackage;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Oa2<Data> implements I01<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final I01<C5162lm0, Data> a;

    public static class a implements J01<Uri, InputStream> {
        @Override // defpackage.J01
        @NonNull
        public final I01<Uri, InputStream> d(J11 j11) {
            return new Oa2(j11.a(C5162lm0.class, InputStream.class));
        }
    }

    public Oa2(I01<C5162lm0, Data> i01) {
        this.a = i01;
    }

    @Override // defpackage.I01
    public final boolean a(@NonNull Uri uri) {
        return b.contains(uri.getScheme());
    }

    @Override // defpackage.I01
    public final I01.a b(@NonNull Uri uri, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        return this.a.b(new C5162lm0(uri.toString()), i, i2, c4227ha1);
    }
}
