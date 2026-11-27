package androidx.lifecycle;

import androidx.annotation.NonNull;
import defpackage.EP0;
import defpackage.FP0;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements k {
    public final EP0 d;
    public final a.C0234a e;

    public ReflectiveGenericLifecycleObserver(EP0 ep0) {
        this.d = ep0;
        a aVar = a.c;
        Class<?> cls = ep0.getClass();
        a.C0234a c0234a = (a.C0234a) aVar.a.get(cls);
        this.e = c0234a == null ? aVar.a(cls, null) : c0234a;
    }

    @Override // androidx.lifecycle.k
    public final void b(@NonNull FP0 fp0, @NonNull g.a aVar) {
        HashMap map = this.e.a;
        List list = (List) map.get(aVar);
        EP0 ep0 = this.d;
        a.C0234a.a(list, fp0, aVar, ep0);
        a.C0234a.a((List) map.get(g.a.ON_ANY), fp0, aVar, ep0);
    }
}
