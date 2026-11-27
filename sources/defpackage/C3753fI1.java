package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3753fI1 {

    @NotNull
    public static final InterfaceC3124cI1<? extends Object> a;

    @NotNull
    public static final InterfaceC3124cI1<Object> b;

    @NotNull
    public static final InterfaceC2551Zb1<? extends Object> c;

    @NotNull
    public static final InterfaceC2551Zb1<Object> d;

    /* JADX INFO: renamed from: fI1$a */
    public static final class a extends ML0 implements Function2<RI0<Object>, List<? extends SJ0>, RJ0<? extends Object>> {
        public static final a d = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final RJ0<? extends Object> invoke(RI0<Object> ri0, List<? extends SJ0> list) {
            RI0<Object> clazz = ri0;
            List<? extends SJ0> types = list;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            ArrayList arrayListU = C1589Ne.u(C4383iI1.a, types, true);
            Intrinsics.checkNotNull(arrayListU);
            return C1589Ne.q(clazz, arrayListU, new C3543eI1(types));
        }
    }

    /* JADX INFO: renamed from: fI1$b */
    public static final class b extends ML0 implements Function2<RI0<Object>, List<? extends SJ0>, RJ0<Object>> {
        public static final b d = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final RJ0<Object> invoke(RI0<Object> ri0, List<? extends SJ0> list) {
            RI0<Object> clazz = ri0;
            List<? extends SJ0> types = list;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            ArrayList arrayListU = C1589Ne.u(C4383iI1.a, types, true);
            Intrinsics.checkNotNull(arrayListU);
            RJ0 rj0Q = C1589Ne.q(clazz, arrayListU, new C3963gI1(types));
            if (rj0Q != null) {
                return C1173Hv.c(rj0Q);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: fI1$c */
    public static final class c extends ML0 implements Function1<RI0<?>, RJ0<? extends Object>> {
        public static final c d = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final RJ0<? extends Object> invoke(RI0<?> ri0) {
            RI0<?> it = ri0;
            Intrinsics.checkNotNullParameter(it, "it");
            return C1589Ne.t(it);
        }
    }

    /* JADX INFO: renamed from: fI1$d */
    public static final class d extends ML0 implements Function1<RI0<?>, RJ0<Object>> {
        public static final d d = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final RJ0<Object> invoke(RI0<?> ri0) {
            RI0<?> it = ri0;
            Intrinsics.checkNotNullParameter(it, "it");
            RJ0 rj0T = C1589Ne.t(it);
            if (rj0T != null) {
                return C1173Hv.c(rj0T);
            }
            return null;
        }
    }

    static {
        boolean z = C0789Cx.a;
        c factory = c.d;
        Intrinsics.checkNotNullParameter(factory, "factory");
        boolean z2 = C0789Cx.a;
        a = z2 ? new C2898bD<>(factory) : new TH<>(factory);
        d factory2 = d.d;
        Intrinsics.checkNotNullParameter(factory2, "factory");
        b = z2 ? new C2898bD<>(factory2) : new TH<>(factory2);
        a factory3 = a.d;
        Intrinsics.checkNotNullParameter(factory3, "factory");
        c = z2 ? new C3317dD<>(factory3) : new VH<>(factory3);
        b factory4 = b.d;
        Intrinsics.checkNotNullParameter(factory4, "factory");
        d = z2 ? new C3317dD<>(factory4) : new VH<>(factory4);
    }
}
