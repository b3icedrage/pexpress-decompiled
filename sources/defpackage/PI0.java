package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PI0<R> implements JI0<R>, ZJ0 {

    @NotNull
    public final C1939Rp1.a<ArrayList<GJ0>> d;

    @NotNull
    public final C1939Rp1.a<WJ0> e;

    @NotNull
    public final C1939Rp1.a<Object[]> g;

    @NotNull
    public final Object h;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return BG.a(((GJ0) t).getName(), ((GJ0) t2).getName());
        }
    }

    public PI0() {
        Intrinsics.checkNotNullExpressionValue(C1939Rp1.a(null, new KI0(this)), "lazySoft(...)");
        C1939Rp1.a<ArrayList<GJ0>> aVarA = C1939Rp1.a(null, new LI0(this, 0));
        Intrinsics.checkNotNullExpressionValue(aVarA, "lazySoft(...)");
        this.d = aVarA;
        C1939Rp1.a<WJ0> aVarA2 = C1939Rp1.a(null, new MI0(this, 0));
        Intrinsics.checkNotNullExpressionValue(aVarA2, "lazySoft(...)");
        this.e = aVarA2;
        Intrinsics.checkNotNullExpressionValue(C1939Rp1.a(null, new YY(this, 2)), "lazySoft(...)");
        C1939Rp1.a<Object[]> aVarA3 = C1939Rp1.a(null, new RZ(this, 1));
        Intrinsics.checkNotNullExpressionValue(aVarA3, "lazySoft(...)");
        this.g = aVarA3;
        this.h = XO0.a(EnumC4403iP0.d, new NI0(this));
    }

    public static Object h(SJ0 sj0) {
        Class clsG = C7279vr.g(C1874Qu.n(sj0));
        if (clsG.isArray()) {
            Object objNewInstance = Array.newInstance(clsG.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new C3761fL0("Cannot instantiate the default empty array of type " + clsG.getSimpleName() + ", because it is not an array type");
    }

    @Override // defpackage.JI0
    public final R a(@NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return (R) i().a(args);
        } catch (IllegalAccessException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new C3256cw0(cause);
        }
    }

    @Override // defpackage.JI0
    @NotNull
    public final List<GJ0> b() {
        ArrayList<GJ0> arrayListInvoke = this.d.invoke();
        Intrinsics.checkNotNullExpressionValue(arrayListInvoke, "invoke(...)");
        return arrayListInvoke;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [fO0, java.lang.Object] */
    @Override // defpackage.JI0
    public final Object d(@NotNull C5863p60 args) throws C3256cw0 {
        boolean z;
        Object objH;
        Intrinsics.checkNotNullParameter(args, "args");
        boolean z2 = false;
        if (s()) {
            List<GJ0> listB = b();
            ArrayList arrayList = new ArrayList(XE.m(listB, 10));
            for (GJ0 gj0 : listB) {
                if (gj0.m()) {
                    objH = null;
                } else {
                    if (!gj0.e()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + gj0);
                    }
                    objH = h(gj0.getType());
                }
                arrayList.add(objH);
            }
            InterfaceC2355Wx<?> interfaceC2355WxM = m();
            if (interfaceC2355WxM == null) {
                throw new C3761fL0("This callable does not support a default call: " + o());
            }
            try {
                return interfaceC2355WxM.a(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                throw new C3256cw0(cause);
            }
        }
        Intrinsics.checkNotNullParameter(args, "args");
        List<GJ0> listB2 = b();
        if (listB2.isEmpty()) {
            try {
                return i().a(z() ? new JM[]{null} : new JM[0]);
            } catch (IllegalAccessException cause2) {
                Intrinsics.checkNotNullParameter(cause2, "cause");
                throw new C3256cw0(cause2);
            }
        }
        int size = (z() ? 1 : 0) + listB2.size();
        Object[] objArr = (Object[]) this.g.invoke().clone();
        if (z()) {
            objArr[listB2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.h.getValue()).booleanValue();
        int i = 0;
        for (GJ0 gj1 : listB2) {
            int iR = zBooleanValue ? r(gj1) : 1;
            if (gj1.m()) {
                if (zBooleanValue) {
                    int i2 = i + iR;
                    for (int i3 = i; i3 < i2; i3++) {
                        int i4 = (i3 / 32) + size;
                        Object obj = objArr[i4];
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i4] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i3 % 32)));
                    }
                    z = true;
                } else {
                    z = true;
                    int i5 = (i / 32) + size;
                    Object obj2 = objArr[i5];
                    Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArr[i5] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i % 32)));
                }
                z2 = z;
            } else if (!gj1.e()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + gj1);
            }
            if (gj1.h() == GJ0.a.g) {
                i += iR;
            }
        }
        if (!z2) {
            try {
                InterfaceC2355Wx<?> interfaceC2355WxI = i();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                return interfaceC2355WxI.a(objArrCopyOf);
            } catch (IllegalAccessException cause3) {
                Intrinsics.checkNotNullParameter(cause3, "cause");
                throw new C3256cw0(cause3);
            }
        }
        InterfaceC2355Wx<?> interfaceC2355WxM2 = m();
        if (interfaceC2355WxM2 == null) {
            throw new C3761fL0("This callable does not support a default call: " + o());
        }
        try {
            return interfaceC2355WxM2.a(objArr);
        } catch (IllegalAccessException cause4) {
            Intrinsics.checkNotNullParameter(cause4, "cause");
            throw new C3256cw0(cause4);
        }
    }

    @NotNull
    public abstract InterfaceC2355Wx<?> i();

    @NotNull
    public abstract AbstractC5906pJ0 j();

    @Nullable
    public abstract InterfaceC2355Wx<?> m();

    @Override // defpackage.JI0
    @NotNull
    public final SJ0 n() {
        WJ0 wj0Invoke = this.e.invoke();
        Intrinsics.checkNotNullExpressionValue(wj0Invoke, "invoke(...)");
        return wj0Invoke;
    }

    @NotNull
    public abstract InterfaceC1490Lx o();

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    public final int r(GJ0 gj0) {
        if (!((Boolean) this.h.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!C7437wc2.h(gj0.getType())) {
            return 1;
        }
        ArrayList arrayListO = N7.o(V62.a(gj0.getType().a));
        Intrinsics.checkNotNull(arrayListO);
        return arrayListO.size();
    }

    public final boolean s() {
        return Intrinsics.a(getName(), "<init>") && j().h().isAnnotation();
    }

    public abstract boolean t();
}
