package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class UZ implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object g;

    public /* synthetic */ UZ(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return C5907pJ1.d(((SZ.b) this.e).a.keySet(), ((SZ) this.g).o());
            default:
                C6582sZ c6582sZ = ((C7334w62) this.e).a;
                return c6582sZ.a.e.c((C4267hk1) this.g, c6582sZ.b);
        }
    }
}
