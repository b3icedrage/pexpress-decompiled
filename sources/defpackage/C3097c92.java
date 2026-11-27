package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: c92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3097c92 extends AbstractC3516e92 {
    public final /* synthetic */ Method b;

    public C3097c92(Method method) {
        this.b = method;
    }

    @Override // defpackage.AbstractC3516e92
    public final <T> T a(Class<T> cls) {
        String strA = ZK.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.b.invoke(null, cls, Object.class);
    }
}
