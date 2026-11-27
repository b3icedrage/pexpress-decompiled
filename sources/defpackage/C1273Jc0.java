package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Jc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1273Jc0 {

    @NotNull
    public final Oc2 a;
    public boolean b;

    @NotNull
    public String c;
    public boolean d;

    public C1273Jc0(@NotNull Oc2 validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.a = validator;
        this.b = true;
        this.c = "";
    }

    @NotNull
    public final AbstractC0961Fc0 a() {
        return this.a.b(this.c) ? Jc2.a : new L51(b());
    }

    @NotNull
    public EnumC6594sc0 b() {
        return EnumC6594sc0.d;
    }

    @NotNull
    public AbstractC0961Fc0 c() {
        return (this.b || this.c.length() <= 0 || this.a.b(this.c) || this.d) ? Jc2.a : new L51(b());
    }
}
