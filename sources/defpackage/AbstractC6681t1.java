package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6681t1 extends AbstractC5308mU implements InterfaceC3714f62 {
    public static final /* synthetic */ IJ0<Object>[] m;

    @NotNull
    public final C2720aS0 i;

    @NotNull
    public final QW j;
    public List<? extends H62> k;

    @NotNull
    public final C6471s1 l;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        m = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(AbstractC6681t1.class), "constructors", "getConstructors()Ljava/util/Collection;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6681t1(@NotNull C2720aS0 storageManager, @NotNull InterfaceC4675jU containingDeclaration, @NotNull InterfaceC2396Xc annotations, @NotNull C5638o21 name, @NotNull QW visibilityImpl) {
        VN1.a sourceElement = VN1.a;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        Intrinsics.checkNotNullParameter(visibilityImpl, "visibilityImpl");
        super(containingDeclaration, annotations, name, sourceElement);
        this.i = storageManager;
        this.j = visibilityImpl;
        storageManager.a(new C5842p1(this, 0));
        this.l = new C6471s1(this);
    }

    @Override // defpackage.InterfaceC5257mD
    @NotNull
    public final List<H62> A() {
        List list = this.k;
        if (list != null) {
            return list;
        }
        Intrinsics.l("declaredTypeParametersImpl");
        throw null;
    }

    @Override // defpackage.GY0
    public final boolean D() {
        return false;
    }

    @Override // defpackage.GY0
    public final boolean M0() {
        return false;
    }

    @Override // defpackage.GY0
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.InterfaceC5257mD
    public final boolean R() {
        return C3089c72.c(((C3269d00) this).n0(), new C6052q1(this, 0), null);
    }

    @NotNull
    public abstract List<H62> U0();

    @Override // defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    /* JADX INFO: renamed from: a */
    public final InterfaceC5044lD U0() {
        return this;
    }

    @Override // defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        return this.j;
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
        c2964bZ.y(builder, this, null);
        QW qw = this.j;
        Intrinsics.checkNotNullExpressionValue(qw, "getVisibility(...)");
        c2964bZ.j0(qw, builder);
        c2964bZ.L(this, builder);
        builder.append(c2964bZ.J("typealias"));
        builder.append(" ");
        c2964bZ.Q(this, builder, true);
        List<H62> listA = A();
        Intrinsics.checkNotNullExpressionValue(listA, "getDeclaredTypeParameters(...)");
        c2964bZ.e0(builder, listA, false);
        c2964bZ.A(this, builder);
        builder.append(" = ");
        builder.append(c2964bZ.Z(((C3269d00) this).n0()));
        return (R) Unit.a;
    }

    @Override // defpackage.InterfaceC5044lD
    @NotNull
    public final InterfaceC6494s62 p() {
        return this.l;
    }

    @Override // defpackage.AbstractC4885kU
    @NotNull
    public final String toString() {
        return "typealias " + getName().e();
    }

    @Override // defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    /* JADX INFO: renamed from: a */
    public final InterfaceC4675jU U0() {
        return this;
    }

    @Override // defpackage.AbstractC5308mU
    /* JADX INFO: renamed from: T0 */
    public final InterfaceC5728oU U0() {
        return this;
    }
}
