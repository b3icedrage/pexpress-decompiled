package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class LY0 implements Function0 {
    public final OY0 d;
    public final AbstractC0673Bk0.c e;
    public final EnumC0804Dc g;

    public LY0(OY0 oy0, AbstractC0673Bk0.c cVar, EnumC0804Dc enumC0804Dc) {
        this.d = oy0;
        this.e = cVar;
        this.g = enumC0804Dc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listI;
        OY0 oy0 = this.d;
        AbstractC6208qk1 abstractC6208qk1A = oy0.a(oy0.a.c);
        if (abstractC6208qk1A != null) {
            listI = oy0.a.a.e.i(abstractC6208qk1A, this.e, this.g);
        } else {
            listI = null;
        }
        return listI == null ? C5653o60.d : listI;
    }
}
