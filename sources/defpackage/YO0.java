package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class YO0 extends AbstractC4885kU implements InterfaceC5752ob1 {
    public static final /* synthetic */ IJ0<Object>[] l;

    @NotNull
    public final T01 g;

    @NotNull
    public final C1758Ph0 h;

    @NotNull
    public final I51 i;

    @NotNull
    public final I51 j;

    @NotNull
    public final ZO0 k;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        l = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(YO0.class), "fragments", "getFragments()Ljava/util/List;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(YO0.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YO0(@NotNull T01 module, @NotNull C1758Ph0 fqName, @NotNull C2720aS0 storageManager) {
        super(InterfaceC2396Xc.a.a, fqName.g());
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.g = module;
        this.h = fqName;
        C3478e00 c3478e00 = new C3478e00(this, 3);
        storageManager.getClass();
        this.i = new C2720aS0.h(storageManager, c3478e00);
        this.j = new C2720aS0.h(storageManager, new TI0(this, 3));
        this.k = new ZO0(storageManager, new UI0(this, 1));
    }

    @Override // defpackage.InterfaceC5752ob1
    public final T01 B0() {
        return this.g;
    }

    @Override // defpackage.InterfaceC5752ob1
    @NotNull
    public final List<InterfaceC2392Xa1> O() {
        return (List) Nm2.f(this.i, l[0]);
    }

    @Override // defpackage.InterfaceC5752ob1
    @NotNull
    public final C1758Ph0 c() {
        return this.h;
    }

    @Override // defpackage.InterfaceC4675jU
    public final InterfaceC4675jU e() {
        C1758Ph0 c1758Ph0 = this.h;
        if (c1758Ph0.d()) {
            return null;
        }
        C1758Ph0 c1758Ph0E = c1758Ph0.e();
        Intrinsics.checkNotNullExpressionValue(c1758Ph0E, "parent(...)");
        return this.g.A0(c1758Ph0E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(@NotNull InterfaceC5518nU<R, D> visitor, D d) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        StringBuilder builder = (StringBuilder) d;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        C2964bZ c2964bZ = C2964bZ.this;
        c2964bZ.getClass();
        c2964bZ.U(this.h, "package", builder);
        if (c2964bZ.d.n()) {
            builder.append(" in context of ");
            c2964bZ.Q(this.g, builder, false);
        }
        return (R) Unit.a;
    }

    public final boolean equals(@Nullable Object obj) {
        InterfaceC5752ob1 interfaceC5752ob1 = obj instanceof InterfaceC5752ob1 ? (InterfaceC5752ob1) obj : null;
        if (interfaceC5752ob1 == null) {
            return false;
        }
        if (Intrinsics.a(this.h, interfaceC5752ob1.c())) {
            return Intrinsics.a(this.g, interfaceC5752ob1.B0());
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC5752ob1
    public final boolean isEmpty() {
        return ((Boolean) Nm2.f(this.j, l[1])).booleanValue();
    }

    @Override // defpackage.InterfaceC5752ob1
    @NotNull
    public final QY0 v() {
        return this.k;
    }
}
