package defpackage;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5475nF1 implements InterfaceC5931pR1, InterfaceC5721oR1 {

    @NotNull
    public AbstractC5422n1 d;

    @Override // defpackage.InterfaceC5721oR1
    public final void a(int i) {
        this.d.a(i);
    }

    @Override // defpackage.InterfaceC5721oR1
    public final int b(@NotNull InterfaceC2441Xr betResult, double d) {
        Intrinsics.checkNotNullParameter(betResult, "betResult");
        Objects.toString(betResult);
        return this.d.b(betResult, d);
    }

    @Override // defpackage.InterfaceC5931pR1
    public final void c(@NotNull AbstractC5422n1 newCalculator) {
        Intrinsics.checkNotNullParameter(newCalculator, "newCalculator");
        C2017Sp1.a.b(newCalculator.getClass()).f();
        this.d = newCalculator;
    }
}
