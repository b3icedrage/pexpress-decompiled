package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class F91 implements InterfaceC1869Qs0 {

    @NotNull
    public final Set<InterfaceC1959Rw0> a;

    public F91(@NotNull Set<InterfaceC1959Rw0> inAppMessageActionExecutors) {
        Intrinsics.checkNotNullParameter(inAppMessageActionExecutors, "inAppMessageActionExecutors");
        this.a = inAppMessageActionExecutors;
    }

    @Override // defpackage.InterfaceC1869Qs0
    public final void onClick(@NotNull InterfaceC1791Ps0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1959Rw0) it.next()).a(event);
        }
    }
}
