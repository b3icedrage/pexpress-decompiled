package defpackage;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: Bq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0691Bq0 implements I01<C5162lm0, InputStream> {
    public static final Z91<Integer> b = Z91.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final G01<C5162lm0, C5162lm0> a;

    /* JADX INFO: renamed from: Bq0$a */
    public static class a implements J01<C5162lm0, InputStream> {
        public final G01<C5162lm0, C5162lm0> a = new G01<>();

        @Override // defpackage.J01
        @NonNull
        public final I01<C5162lm0, InputStream> d(J11 j11) {
            return new C0691Bq0(this.a);
        }
    }

    public C0691Bq0(G01<C5162lm0, C5162lm0> g01) {
        this.a = g01;
    }

    @Override // defpackage.I01
    public final /* bridge */ /* synthetic */ boolean a(@NonNull C5162lm0 c5162lm0) {
        return true;
    }

    @Override // defpackage.I01
    public final I01.a<InputStream> b(@NonNull C5162lm0 c5162lm0, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        C5162lm0 c5162lm1 = c5162lm0;
        G01<C5162lm0, C5162lm0> g01 = this.a;
        if (g01 != null) {
            G01.a aVarA = G01.a.a(c5162lm1);
            F01 f01 = g01.a;
            Object objA = f01.a(aVarA);
            ArrayDeque arrayDeque = G01.a.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(aVarA);
            }
            C5162lm0 c5162lm2 = (C5162lm0) objA;
            if (c5162lm2 == null) {
                f01.d(G01.a.a(c5162lm1), c5162lm1);
            } else {
                c5162lm1 = c5162lm2;
            }
        }
        return new I01.a<>(c5162lm1, new C1396Kr0(c5162lm1, ((Integer) c4227ha1.c(b)).intValue()));
    }
}
