package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ U(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return new C4400iO0((V) this.e);
            case 1:
                ((KB0) this.e).getClass();
                throw null;
            default:
                return new CJ0.a((CJ0) this.e);
        }
    }
}
