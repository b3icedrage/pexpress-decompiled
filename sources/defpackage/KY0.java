package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class KY0 implements Function0 {
    public final OY0 d;
    public final boolean e;
    public final C3637ek1 g;

    public KY0(OY0 oy0, boolean z, C3637ek1 c3637ek1) {
        this.d = oy0;
        this.e = z;
        this.g = c3637ek1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listE0;
        OY0 oy0 = this.d;
        AbstractC6208qk1 abstractC6208qk1A = oy0.a(oy0.a.c);
        if (abstractC6208qk1A != null) {
            boolean z = this.e;
            C3637ek1 c3637ek1 = this.g;
            C6582sZ c6582sZ = oy0.a;
            listE0 = z ? CollectionsKt.e0(c6582sZ.a.e.b(abstractC6208qk1A, c3637ek1)) : CollectionsKt.e0(c6582sZ.a.e.g(abstractC6208qk1A, c3637ek1));
        } else {
            listE0 = null;
        }
        return listE0 == null ? C5653o60.d : listE0;
    }
}
