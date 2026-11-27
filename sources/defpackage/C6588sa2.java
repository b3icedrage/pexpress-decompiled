package defpackage;

import io.sentry.instrumentation.file.a;
import io.sentry.instrumentation.file.f;

/* JADX INFO: renamed from: sa2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6588sa2 implements JW1.a, a.InterfaceC0395a {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C6588sa2(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    @Override // JW1.a
    public Object c() {
        return Boolean.valueOf(((C7639xa2) this.d).c.k0((C1778Po) this.e));
    }

    @Override // io.sentry.instrumentation.file.a.InterfaceC0395a
    public Object call() {
        return Integer.valueOf(((f) this.d).d.read((byte[]) this.e));
    }
}
