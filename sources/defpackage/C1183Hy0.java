package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1183Hy0 extends AbstractC7770yA1 {
    @Override // defpackage.AbstractC7770yA1
    @Nullable
    public final C8145zz0 b(@NotNull AbstractC7770yA1.a aVar) {
        String str = aVar.b;
        String strValueOf = String.valueOf(aVar.e);
        String strValueOf2 = String.valueOf(aVar.h);
        Double d = aVar.i;
        String string = d != null ? d.toString() : null;
        if (string == null) {
            string = "";
        }
        return new C8145zz0(str, aVar.c, aVar.d, aVar.g, strValueOf, aVar.f, strValueOf2, string, C0564Aa.z(aVar.j), aVar.k, aVar.l, aVar.m, aVar.p, aVar.q);
    }

    @Override // defpackage.AbstractC7770yA1
    @Nullable
    public final C0640Az0 c(@NotNull AbstractC7770yA1.a aVar) {
        return new C0640Az0(aVar.b, aVar.c, aVar.d, aVar.g, aVar.e, aVar.f, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.p, aVar.q);
    }
}
