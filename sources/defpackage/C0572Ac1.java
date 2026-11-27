package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ac1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0572Ac1 extends C1273Jc0 {

    @NotNull
    public final KW1 e;

    @NotNull
    public final Regex f;

    @NotNull
    public final Regex g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0572Ac1(@NotNull Oc2 validator) {
        super(validator);
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.e = XO0.b(new C7530x3(validator, 3));
        this.f = new Regex("[A-Za-z]+");
        this.g = new Regex("[0-9]+");
    }

    @Override // defpackage.C1273Jc0
    @NotNull
    public final EnumC6594sc0 b() {
        if (this.c.length() < ((Number) this.e.getValue()).intValue()) {
            return EnumC6594sc0.h;
        }
        if (this.f.d(this.c)) {
            return !this.g.d(this.c) ? EnumC6594sc0.j : EnumC6594sc0.d;
        }
        return EnumC6594sc0.i;
    }
}
