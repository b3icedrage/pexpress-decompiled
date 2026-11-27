package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class NC extends G1 {
    public final /* synthetic */ Method e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Class g;

    public NC(Method method, Object obj, Class cls) {
        this.e = method;
        this.f = obj;
        this.g = cls;
    }

    @Override // defpackage.G1
    public final Object k() {
        return this.e.invoke(this.f, this.g);
    }

    public final String toString() {
        return this.g.getName();
    }
}
