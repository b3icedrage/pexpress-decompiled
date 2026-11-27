package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5436n41 implements InterfaceC2540Yy {

    @NotNull
    public final N62 a;

    @Nullable
    public Function0<? extends List<? extends P92>> b;

    @Nullable
    public final C5436n41 c;

    @Nullable
    public final H62 d;

    @NotNull
    public final Object e;

    public C5436n41() {
        throw null;
    }

    public /* synthetic */ C5436n41(N62 n62, BZ bz, H62 h62, int i) {
        this(n62, (i & 2) != 0 ? null : bz, (C5436n41) null, (i & 8) != 0 ? null : h62);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.InterfaceC6494s62
    public final Collection a() {
        List list = (List) this.e.getValue();
        return list == null ? C5653o60.d : list;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final List<H62> b() {
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC6494s62
    @Nullable
    public final InterfaceC5044lD c() {
        return null;
    }

    @Override // defpackage.InterfaceC6494s62
    public final boolean e() {
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5436n41.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C5436n41 c5436n41 = (C5436n41) obj;
        C5436n41 c5436n42 = this.c;
        if (c5436n42 == null) {
            c5436n42 = this;
        }
        C5436n41 c5436n43 = c5436n41.c;
        if (c5436n43 != null) {
            obj = c5436n43;
        }
        return c5436n42 == obj;
    }

    @Override // defpackage.InterfaceC2540Yy
    @NotNull
    public final N62 f() {
        return this.a;
    }

    public final int hashCode() {
        C5436n41 c5436n41 = this.c;
        return c5436n41 != null ? c5436n41.hashCode() : super.hashCode();
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final RK0 t() {
        AbstractC4649jL0 type = this.a.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return C0564Aa.l(type);
    }

    @NotNull
    public final String toString() {
        return "CapturedType(" + this.a + ')';
    }

    public C5436n41(@NotNull N62 projection, @Nullable Function0<? extends List<? extends P92>> function0, @Nullable C5436n41 c5436n41, @Nullable H62 h62) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.a = projection;
        this.b = function0;
        this.c = c5436n41;
        this.d = h62;
        this.e = XO0.a(EnumC4403iP0.d, new AZ(this, 3));
    }
}
