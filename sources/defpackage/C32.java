package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class C32<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ D32 d;

    public C32(D32 d32) {
        this.d = d32;
    }

    @Override // defpackage.InterfaceC6606sf0
    public final Object a(Object obj, JM jm) throws Throwable {
        int iIntValue = ((Number) obj).intValue();
        D32 d32 = this.d;
        EnumC3495e41 enumC3495e41 = (EnumC3495e41) d32.a.r.getValue();
        if (enumC3495e41 == null || C7652xe.g(enumC3495e41)) {
            return Unit.a;
        }
        Object objP = C5189lv.p(C6266r20.a, new B32(d32, iIntValue, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }
}
