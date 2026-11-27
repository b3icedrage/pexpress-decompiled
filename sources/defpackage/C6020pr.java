package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6020pr extends JK<Boolean> {
    @Override // defpackage.JK
    public final boolean b(@NotNull Bk2 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.d;
    }

    @Override // defpackage.JK
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
