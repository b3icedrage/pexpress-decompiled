package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Pw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1804Pw1 {

    @NotNull
    public final C1489Lw1 a;

    @NotNull
    public final C1882Qw1 b;

    @NotNull
    public final C1648Nw1 c;

    @NotNull
    public final GP1 d;

    public C1804Pw1(@NotNull C1489Lw1 commonPart, @NotNull C1882Qw1 optionsPart, @NotNull C1648Nw1 investmentPart) {
        Intrinsics.checkNotNullParameter(commonPart, "commonPart");
        Intrinsics.checkNotNullParameter(optionsPart, "optionsPart");
        Intrinsics.checkNotNullParameter(investmentPart, "investmentPart");
        this.a = commonPart;
        this.b = optionsPart;
        this.c = investmentPart;
        this.d = C1589Ne.i(Boolean.FALSE);
    }

    @NotNull
    public final InterfaceC6396rf0 a(@NotNull FP1 realFlow, @NotNull GP1 tutorialFlow) {
        Intrinsics.checkNotNullParameter(realFlow, "realFlow");
        Intrinsics.checkNotNullParameter(tutorialFlow, "tutorialFlow");
        return C4466ii.m(b(realFlow, tutorialFlow));
    }

    @NotNull
    public final C5561ng0 b(@NotNull InterfaceC6396rf0 realFlow, @NotNull InterfaceC6396rf0 tutorialFlow) {
        Intrinsics.checkNotNullParameter(realFlow, "realFlow");
        Intrinsics.checkNotNullParameter(tutorialFlow, "tutorialFlow");
        return C4466ii.k(this.d, realFlow, tutorialFlow, new C1726Ow1(4, null));
    }
}
