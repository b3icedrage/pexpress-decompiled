package defpackage;

/* JADX INFO: renamed from: cm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3227cm2 implements InterfaceC4276hm2 {
    public static final Object g = new Object();
    public volatile InterfaceC3646em2 d;
    public volatile Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public static C3227cm2 b(InterfaceC3646em2 interfaceC3646em2) {
        if (interfaceC3646em2 instanceof C3227cm2) {
            return (C3227cm2) interfaceC3646em2;
        }
        C3227cm2 c3227cm2 = new C3227cm2();
        c3227cm2.e = g;
        c3227cm2.d = interfaceC3646em2;
        return c3227cm2;
    }

    @Override // defpackage.InterfaceC4276hm2
    public final Object a() {
        Object objA;
        Object obj = this.e;
        Object obj2 = g;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.e;
                if (objA == obj2) {
                    objA = this.d.a();
                    Object obj3 = this.e;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.e = objA;
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
