package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class O1 implements UB0 {

    @NotNull
    public final AbstractC5328ma1 a;

    public O1(@NotNull AbstractC5328ma1 originProvider) {
        Intrinsics.checkNotNullParameter(originProvider, "originProvider");
        this.a = originProvider;
    }

    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4543is1.a aVarB = chain.e.b();
        b(aVarB, chain);
        C4543is1 c4543is1B = aVarB.b();
        c4543is1B.toString();
        C0857Dt1 c0857Dt1B = chain.b(c4543is1B);
        c(c0857Dt1B);
        c0857Dt1B.toString();
        return c0857Dt1B;
    }

    public void b(@NotNull C4543is1.a aVar, @NotNull C5593no1 chain) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(chain, "chain");
        aVar.a("Origin", this.a.a());
    }

    public void c(@NotNull C0857Dt1 c0857Dt1) {
        Intrinsics.checkNotNullParameter(c0857Dt1, "<this>");
    }
}
