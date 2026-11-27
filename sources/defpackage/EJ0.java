package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.functions.Function0;
import kotlin.text.d;

/* JADX INFO: loaded from: classes3.dex */
public final class EJ0 implements Function0 {
    public final FJ0.a d;
    public final FJ0 e;

    public EJ0(FJ0.a aVar, FJ0 fj0) {
        this.d = aVar;
        this.e = fj0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        UK0 uk0;
        FJ0.a aVar = this.d;
        aVar.getClass();
        IJ0<Object> ij0 = FJ0.a.g[0];
        C1627Np1 c1627Np1 = (C1627Np1) aVar.c.invoke();
        if (c1627Np1 == null || (uk0 = c1627Np1.b) == null) {
            str = null;
        } else if (uk0.a == UK0.a.MULTIFILE_CLASS_PART) {
            str = uk0.f;
        } else {
            str = null;
        }
        if (str == null || str.length() <= 0) {
            return null;
        }
        return this.e.e.getClassLoader().loadClass(d.l(str, '/', JwtParser.SEPARATOR_CHAR));
    }
}
