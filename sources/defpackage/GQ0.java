package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class GQ0 implements FQ0 {
    @Override // defpackage.FQ0
    public final void a(Object obj, long j, Object obj2) {
        C4614j92.e eVar = C4614j92.c;
        VB0.c cVarL = (VB0.c) eVar.h(j, obj);
        VB0.c cVar = (VB0.c) eVar.h(j, obj2);
        int size = cVarL.size();
        int size2 = cVar.size();
        if (size > 0 && size2 > 0) {
            if (!cVarL.v()) {
                cVarL = cVarL.l(size2 + size);
            }
            cVarL.addAll(cVar);
        }
        if (size > 0) {
            cVar = cVarL;
        }
        C4614j92.o(obj, j, cVar);
    }

    @Override // defpackage.FQ0
    public final VB0.c b(long j, Object obj) {
        VB0.c cVar = (VB0.c) C4614j92.c.h(j, obj);
        if (cVar.v()) {
            return cVar;
        }
        int size = cVar.size();
        VB0.c cVarL = cVar.l(size == 0 ? 10 : size * 2);
        C4614j92.o(obj, j, cVarL);
        return cVarL;
    }

    @Override // defpackage.FQ0
    public final void c(long j, Object obj) {
        ((VB0.c) C4614j92.c.h(j, obj)).k();
    }
}
