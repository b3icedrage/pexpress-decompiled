package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RE<Element, Collection, Builder> extends Z<Element, Collection, Builder> {

    @NotNull
    public final RJ0<Element> a;

    public RE(RJ0 rj0) {
        this.a = rj0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.RJ0
    public void a(@NotNull C3783fS1 encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iH = h(obj);
        MH1 mh1C = c();
        GH ghC = encoder.C(mh1C);
        Iterator<Element> itG = g(obj);
        for (int i = 0; i < iH; i++) {
            ghC.n(c(), i, this.a, itG.next());
        }
        ghC.b(mh1C);
    }

    @Override // defpackage.Z
    public void j(@NotNull EH decoder, int i, Object obj) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m(i, obj, decoder.r(c(), i, this.a, null));
    }

    public abstract void m(int i, Object obj, Object obj2);
}
