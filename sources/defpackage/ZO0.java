package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ZO0 extends AbstractC3062c1 {

    @NotNull
    public final I51<QY0> b;

    public ZO0(@NotNull OQ1 storageManager, @NotNull Function0<? extends QY0> getScope) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        this.b = storageManager.a(new C2690aI0(getScope, 3));
    }

    @Override // defpackage.AbstractC3062c1
    @NotNull
    public final QY0 i() {
        return this.b.invoke();
    }
}
