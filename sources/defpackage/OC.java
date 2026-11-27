package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class OC extends G1 {
    public final /* synthetic */ Method e;
    public final /* synthetic */ Class f;
    public final /* synthetic */ int g;

    public OC(Method method, Class cls, int i) {
        this.e = method;
        this.f = cls;
        this.g = i;
    }

    @Override // defpackage.G1
    public final Object k() {
        return this.e.invoke(null, this.f, Integer.valueOf(this.g));
    }

    public final String toString() {
        return this.f.getName();
    }
}
