package defpackage;

import androidx.annotation.NonNull;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: fZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3803fZ0 {
    public final Runnable a;
    public final CopyOnWriteArrayList<InterfaceC5324mZ0> b = new CopyOnWriteArrayList<>();
    public final HashMap c = new HashMap();

    /* JADX INFO: renamed from: fZ0$a */
    public static class a {
        public final g a;
        public k b;

        public a(@NonNull g gVar, @NonNull k kVar) {
            this.a = gVar;
            this.b = kVar;
            gVar.a(kVar);
        }
    }

    public C3803fZ0(@NonNull Runnable runnable) {
        this.a = runnable;
    }

    public final void a(@NonNull InterfaceC5324mZ0 interfaceC5324mZ0) {
        this.b.remove(interfaceC5324mZ0);
        a aVar = (a) this.c.remove(interfaceC5324mZ0);
        if (aVar != null) {
            aVar.a.c(aVar.b);
            aVar.b = null;
        }
        this.a.run();
    }
}
