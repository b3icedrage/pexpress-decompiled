package defpackage;

import kotlin.Function;

/* JADX INFO: renamed from: pV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5942pV0 implements InterfaceC1686Oj0 {
    public final /* synthetic */ NV0 a;

    public C5942pV0(NV0 nv0) {
        this.a = nv0;
    }

    @Override // defpackage.InterfaceC1686Oj0
    public final Function<?> a() {
        return new C2784ak0(1, this.a, NV0.class, "keyboardChangeState", "keyboardChangeState(Z)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C5942pV0) && (obj instanceof InterfaceC1686Oj0)) {
            return a().equals(((InterfaceC1686Oj0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
