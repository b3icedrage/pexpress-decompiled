package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class PC extends G1 {
    public final /* synthetic */ Method e;
    public final /* synthetic */ Class f;

    public PC(Method method, Class cls) {
        this.e = method;
        this.f = cls;
    }

    @Override // defpackage.G1
    public final Object k() {
        return this.e.invoke(null, this.f, Object.class);
    }

    public final String toString() {
        return this.f.getName();
    }
}
