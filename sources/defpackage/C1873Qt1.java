package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1873Qt1<T> extends AbstractC3746fG0 {

    @NotNull
    public final C3956gG0.a i;

    public C1873Qt1(@NotNull C3956gG0.a aVar) {
        this.i = aVar;
    }

    @Override // defpackage.InterfaceC2672aC0
    public final void a(@Nullable Throwable th) {
        Object objS = l().S();
        boolean z = objS instanceof OG;
        C3956gG0.a aVar = this.i;
        if (z) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            aVar.resumeWith(C1795Pt1.a(((OG) objS).a));
        } else {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            aVar.resumeWith(C3787fU.o(objS));
        }
    }
}
