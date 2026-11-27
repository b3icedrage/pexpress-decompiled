package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OB implements NB {
    public boolean a;

    @Override // defpackage.NB
    @NotNull
    public final AbstractC0961Fc0 a(@Nullable Boolean bool) {
        return Intrinsics.a(bool, Boolean.TRUE) ? Jc2.a : new L51(0);
    }

    @Override // defpackage.NB
    @NotNull
    public final AbstractC0961Fc0 b(boolean z) {
        int i = 0;
        if (!z && !this.a) {
            return new L51(i);
        }
        this.a = false;
        return Jc2.a;
    }
}
