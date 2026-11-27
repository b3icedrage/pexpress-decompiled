package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6188qf1 implements MH1, InterfaceC6877tx {

    @NotNull
    public final String a;

    @Nullable
    public final InterfaceC0829Dk0<?> b;
    public final int c;
    public int d;

    @NotNull
    public final String[] e;

    @NotNull
    public final List<Annotation>[] f;

    @NotNull
    public final boolean[] g;

    @NotNull
    public Object h;

    @NotNull
    public final Object i;

    @NotNull
    public final Object j;

    @NotNull
    public final Object k;

    /* JADX INFO: renamed from: qf1$a */
    public static final class a extends ML0 implements Function0<Integer> {
        public a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [fO0, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            C6188qf1 c6188qf1 = C6188qf1.this;
            return Integer.valueOf(C5027l8.n(c6188qf1, (MH1[]) c6188qf1.j.getValue()));
        }
    }

    /* JADX INFO: renamed from: qf1$b */
    public static final class b extends ML0 implements Function0<RJ0<?>[]> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RJ0<?>[] invoke() {
            InterfaceC0829Dk0<?> interfaceC0829Dk0 = C6188qf1.this.b;
            return interfaceC0829Dk0 != null ? interfaceC0829Dk0.b() : C1589Ne.e;
        }
    }

    /* JADX INFO: renamed from: qf1$c */
    public static final class c extends ML0 implements Function1<Integer, CharSequence> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Integer num) {
            int iIntValue = num.intValue();
            StringBuilder sb = new StringBuilder();
            C6188qf1 c6188qf1 = C6188qf1.this;
            sb.append(c6188qf1.e[iIntValue]);
            sb.append(": ");
            sb.append(c6188qf1.i(iIntValue).a());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: qf1$d */
    public static final class d extends ML0 implements Function0<MH1[]> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MH1[] invoke() {
            return LL.f(C6188qf1.this.b != null ? new ArrayList(0) : null);
        }
    }

    public C6188qf1(@NotNull String serialName, @Nullable InterfaceC0829Dk0<?> interfaceC0829Dk0, int i) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.a = serialName;
        this.b = interfaceC0829Dk0;
        this.c = i;
        this.d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = PW0.c();
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
        this.i = XO0.a(enumC4403iP0, new b());
        this.j = XO0.a(enumC4403iP0, new d());
        this.k = XO0.a(enumC4403iP0, new a());
    }

    @Override // defpackage.MH1
    @NotNull
    public final String a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.InterfaceC6877tx
    @NotNull
    public final Set<String> b() {
        return this.h.keySet();
    }

    @Override // defpackage.MH1
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.MH1
    public final int d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.MH1
    public final int e() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [fO0, java.lang.Object] */
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6188qf1) {
            MH1 mh1 = (MH1) obj;
            if (Intrinsics.a(this.a, mh1.a()) && Arrays.equals((MH1[]) this.j.getValue(), (MH1[]) ((C6188qf1) obj).j.getValue())) {
                int iE = mh1.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (Intrinsics.a(i(i2).a(), mh1.i(i2).a()) && Intrinsics.a(i(i2).h(), mh1.i(i2).h())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.MH1
    @NotNull
    public final String f(int i) {
        return this.e[i];
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> g(int i) {
        List<Annotation> list = this.f[i];
        return list == null ? C5653o60.d : list;
    }

    @Override // defpackage.MH1
    @NotNull
    public VH1 h() {
        return RS1.a.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.MH1
    @NotNull
    public MH1 i(int i) {
        return ((RJ0[]) this.i.getValue())[i].c();
    }

    @Override // defpackage.MH1
    public final boolean j(int i) {
        return this.g[i];
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> k() {
        return C5653o60.d;
    }

    public final void l(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = name;
        this.g[i] = false;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    @Override // defpackage.MH1
    public boolean m() {
        return false;
    }

    @NotNull
    public String toString() {
        return CollectionsKt.J(f.i(0, this.c), ", ", C1039Gc0.e(new StringBuilder(), this.a, '('), ")", new c(), 24);
    }
}
