package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6958uK0<K, V, R> implements RJ0<R> {

    @NotNull
    public final RJ0<K> a;

    @NotNull
    public final RJ0<V> b;

    public AbstractC6958uK0(RJ0 rj0, RJ0 rj1) {
        this.a = rj0;
        this.b = rj1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.RJ0
    public final void a(@NotNull C3783fS1 encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        GH ghC = encoder.c(c());
        ghC.n(c(), 0, this.a, e(obj));
        ghC.n(c(), 1, this.b, f(obj));
        ghC.b(c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.RJ0
    public final R d(@NotNull InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        MH1 mh1C = c();
        EH ehC = decoder.c(mh1C);
        Object obj = C4019gb.d;
        Object objR = obj;
        Object objR2 = objR;
        while (true) {
            int iH = ehC.h(c());
            if (iH == -1) {
                if (objR == obj) {
                    throw new ZH1("Element 'key' is missing");
                }
                if (objR2 == obj) {
                    throw new ZH1("Element 'value' is missing");
                }
                R r = (R) g(objR, objR2);
                ehC.b(mh1C);
                return r;
            }
            if (iH == 0) {
                objR = ehC.r(c(), 0, this.a, null);
            } else {
                if (iH != 1) {
                    throw new ZH1(EK.e(iH, "Invalid index: "));
                }
                objR2 = ehC.r(c(), 1, this.b, null);
            }
        }
    }

    public abstract K e(R r);

    public abstract V f(R r);

    public abstract R g(K k, V v);
}
