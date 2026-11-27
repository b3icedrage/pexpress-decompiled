package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: b92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2888b92 extends AbstractC3516e92 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public C2888b92(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.AbstractC3516e92
    public final <T> T a(Class<T> cls) {
        String strA = ZK.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.b.invoke(null, cls, Integer.valueOf(this.c));
    }
}
