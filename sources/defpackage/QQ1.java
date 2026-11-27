package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class QQ1 extends JK<Boolean> {
    @Override // defpackage.JK
    public final boolean b(@NotNull Bk2 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.e;
    }

    @Override // defpackage.JK
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
