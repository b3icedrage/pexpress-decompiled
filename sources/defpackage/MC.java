package defpackage;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final class MC extends G1 {
    public final /* synthetic */ Constructor e;
    public final /* synthetic */ Class f;

    public MC(Constructor constructor, Class cls) {
        this.e = constructor;
        this.f = cls;
    }

    @Override // defpackage.G1
    public final Object k() {
        return this.e.newInstance(null);
    }

    public final String toString() {
        return this.f.getName();
    }
}
