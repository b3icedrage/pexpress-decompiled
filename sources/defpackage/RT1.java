package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class RT1 implements QT1 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final C1699On1 b;

    public RT1() {
        GP1 gp1I = C1589Ne.i(TT1.d);
        this.a = gp1I;
        this.b = C4466ii.f(gp1I);
    }

    @Override // defpackage.QT1
    @NotNull
    public final C1699On1 a() {
        return this.b;
    }

    @Override // defpackage.QT1
    @Nullable
    public final Unit b(@NotNull TT1 tt1) {
        this.a.setValue(tt1);
        Unit unit = Unit.a;
        MN mn = MN.d;
        return unit;
    }
}
