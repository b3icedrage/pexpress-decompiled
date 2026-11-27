package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: a92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2664a92 extends AbstractC3516e92 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public C2664a92(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.AbstractC3516e92
    public final <T> T a(Class<T> cls) {
        String strA = ZK.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.b.invoke(this.c, cls);
    }
}
