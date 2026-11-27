package defpackage;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class UD0 implements InterfaceC1987Sf1 {
    public static final /* synthetic */ IJ0<Object>[] f;

    @NotNull
    public final C1758Ph0 a;

    @NotNull
    public final VN1 b;

    @NotNull
    public final I51 c;

    @Nullable
    public final RD0 d;
    public final boolean e;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        f = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(UD0.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public UD0(@NotNull LO0 c, @Nullable QD0 qd0, @NotNull C1758Ph0 fqName) {
        VN1 NO_SOURCE;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.a = fqName;
        if (qd0 != null) {
            NO_SOURCE = c.a.j.a(qd0);
        } else {
            NO_SOURCE = VN1.a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        }
        this.b = NO_SOURCE;
        C2720aS0 c2720aS0 = c.a.a;
        TD0 td0 = new TD0(c, this);
        c2720aS0.getClass();
        this.c = new C2720aS0.h(c2720aS0, td0);
        this.d = qd0 != null ? (RD0) CollectionsKt.G(qd0.f()) : null;
        this.e = false;
    }

    @Override // defpackage.InterfaceC1987Sf1
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final C1758Ph0 c() {
        return this.a;
    }

    @Override // defpackage.InterfaceC1583Nc
    public final AbstractC4649jL0 getType() {
        return (AbstractC5706oM1) Nm2.f(this.c, f[0]);
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final VN1 i() {
        return this.b;
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public Map<C5638o21, CK<?>> j() {
        return PW0.c();
    }
}
