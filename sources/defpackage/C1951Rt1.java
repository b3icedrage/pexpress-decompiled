package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1951Rt1 extends AbstractC3746fG0 {

    @NotNull
    public final C6251qy i;

    public C1951Rt1(@NotNull C6251qy c6251qy) {
        this.i = c6251qy;
    }

    @Override // defpackage.InterfaceC2672aC0
    public final void a(@Nullable Throwable th) {
        C1717Ot1.a aVar = C1717Ot1.e;
        this.i.resumeWith(Unit.a);
    }
}
