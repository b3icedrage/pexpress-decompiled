package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class WJ0 implements TJ0 {
    public static final /* synthetic */ IJ0<Object>[] e;

    @NotNull
    public final AbstractC4649jL0 a;

    @Nullable
    public final C1939Rp1.a<Type> b;

    @NotNull
    public final C1939Rp1.a c;

    @NotNull
    public final C1939Rp1.a d;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        e = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(WJ0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(WJ0.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public WJ0(@NotNull AbstractC4649jL0 type, @Nullable Function0<? extends Type> function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
        C1939Rp1.a<Type> aVar = function0 instanceof C1939Rp1.a ? (C1939Rp1.a) function0 : null;
        this.b = aVar == null ? function0 != null ? C1939Rp1.a(null, function0) : null : aVar;
        this.c = C1939Rp1.a(null, new GZ(this, 2));
        this.d = C1939Rp1.a(null, new UJ0(this, function0));
    }

    @Override // defpackage.SJ0
    public final boolean a() {
        return this.a.W0();
    }

    @Override // defpackage.TJ0
    @Nullable
    public final Type b() {
        C1939Rp1.a<Type> aVar = this.b;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public final InterfaceC4853kJ0 c(AbstractC4649jL0 abstractC4649jL0) {
        AbstractC4649jL0 type;
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        if (interfaceC5044lDC instanceof FC) {
            Class<?> clsK = C7437wc2.k((FC) interfaceC5044lDC);
            if (clsK != null) {
                if (!clsK.isArray()) {
                    if (C3089c72.e(abstractC4649jL0)) {
                        return new C3545eJ0(clsK);
                    }
                    List<RI0<? extends Object>> list = C4753jp1.a;
                    Intrinsics.checkNotNullParameter(clsK, "<this>");
                    Class<? extends Object> cls = C4753jp1.b.get(clsK);
                    if (cls != null) {
                        clsK = cls;
                    }
                    return new C3545eJ0(clsK);
                }
                N62 n62 = (N62) CollectionsKt.W(abstractC4649jL0.T0());
                if (n62 == null || (type = n62.getType()) == null) {
                    return new C3545eJ0(clsK);
                }
                InterfaceC4853kJ0 interfaceC4853kJ0C = c(type);
                if (interfaceC4853kJ0C != null) {
                    Class clsG = C7279vr.g(C1874Qu.m(interfaceC4853kJ0C));
                    Intrinsics.checkNotNullParameter(clsG, "<this>");
                    return new C3545eJ0(Array.newInstance((Class<?>) clsG, 0).getClass());
                }
                throw new C3761fL0("Cannot determine classifier for array element type: " + this);
            }
        } else {
            if (interfaceC5044lDC instanceof H62) {
                return new YJ0(null, (H62) interfaceC5044lDC);
            }
            if (interfaceC5044lDC instanceof InterfaceC3714f62) {
                Intrinsics.checkNotNullParameter("An operation is not implemented: Type alias classifiers are not yet supported", "message");
                throw new H51("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof WJ0)) {
            return false;
        }
        WJ0 wj0 = (WJ0) obj;
        return Intrinsics.a(this.a, wj0.a) && Intrinsics.a(g(), wj0.g()) && Intrinsics.a(f(), wj0.f());
    }

    @Override // defpackage.SJ0
    @NotNull
    public final List<KTypeProjection> f() {
        IJ0<Object> ij0 = e[1];
        Object objInvoke = this.d.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // defpackage.SJ0
    @Nullable
    public final InterfaceC4853kJ0 g() {
        IJ0<Object> ij0 = e[0];
        return (InterfaceC4853kJ0) this.c.invoke();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        InterfaceC4853kJ0 interfaceC4853kJ0G = g();
        return f().hashCode() + ((iHashCode + (interfaceC4853kJ0G != null ? interfaceC4853kJ0G.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        C2964bZ c2964bZ = C2593Zp1.a;
        return C2593Zp1.d(this.a);
    }
}
