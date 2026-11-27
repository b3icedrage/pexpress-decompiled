package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OH1 implements MH1, InterfaceC6877tx {

    @NotNull
    public final String a;

    @NotNull
    public final VH1 b;
    public final int c;

    @NotNull
    public final C5653o60 d;

    @NotNull
    public final HashSet e;

    @NotNull
    public final String[] f;

    @NotNull
    public final MH1[] g;

    @NotNull
    public final List<Annotation>[] h;

    @NotNull
    public final boolean[] i;

    @NotNull
    public final Map<String, Integer> j;

    @NotNull
    public final MH1[] k;

    @NotNull
    public final KW1 l;

    public static final class a extends ML0 implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            OH1 oh1 = OH1.this;
            return Integer.valueOf(C5027l8.n(oh1, oh1.k));
        }
    }

    public static final class b extends ML0 implements Function1<Integer, CharSequence> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Integer num) {
            int iIntValue = num.intValue();
            StringBuilder sb = new StringBuilder();
            OH1 oh1 = OH1.this;
            sb.append(oh1.f[iIntValue]);
            sb.append(": ");
            sb.append(oh1.g[iIntValue].a());
            return sb.toString();
        }
    }

    public OH1(@NotNull String serialName, @NotNull VH1 kind, int i, @NotNull List<? extends MH1> typeParameters, @NotNull YC builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.a = serialName;
        this.b = kind;
        this.c = i;
        this.d = builder.b;
        ArrayList arrayList = builder.c;
        this.e = CollectionsKt.d0(arrayList);
        int i2 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = LL.f(builder.e);
        this.h = (List[]) builder.f.toArray(new List[0]);
        ArrayList arrayList2 = builder.g;
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.i = zArr;
        String[] strArr = this.f;
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        C1336Jx0 c1336Jx0 = new C1336Jx0(new C1449Lj(strArr, 0));
        ArrayList arrayList3 = new ArrayList(XE.m(c1336Jx0, 10));
        Iterator it2 = c1336Jx0.iterator();
        while (true) {
            C1414Kx0 c1414Kx0 = (C1414Kx0) it2;
            if (!c1414Kx0.d.hasNext()) {
                this.j = PW0.j(arrayList3);
                this.k = LL.f(typeParameters);
                this.l = XO0.b(new a());
                return;
            }
            IndexedValue indexedValue = (IndexedValue) c1414Kx0.next();
            arrayList3.add(new Pair(indexedValue.b, Integer.valueOf(indexedValue.a)));
        }
    }

    @Override // defpackage.MH1
    @NotNull
    public final String a() {
        return this.a;
    }

    @Override // defpackage.InterfaceC6877tx
    @NotNull
    public final Set<String> b() {
        return this.e;
    }

    @Override // defpackage.MH1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.MH1
    public final int d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.MH1
    public final int e() {
        return this.c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OH1) {
            MH1 mh1 = (MH1) obj;
            if (Intrinsics.a(this.a, mh1.a()) && Arrays.equals(this.k, ((OH1) obj).k)) {
                int iE = mh1.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        MH1[] mh1Arr = this.g;
                        if (Intrinsics.a(mh1Arr[i2].a(), mh1.i(i2).a()) && Intrinsics.a(mh1Arr[i2].h(), mh1.i(i2).h())) {
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
        return this.f[i];
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> g(int i) {
        return this.h[i];
    }

    @Override // defpackage.MH1
    @NotNull
    public final VH1 h() {
        return this.b;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.MH1
    @NotNull
    public final MH1 i(int i) {
        return this.g[i];
    }

    @Override // defpackage.MH1
    public final boolean j(int i) {
        return this.i[i];
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> k() {
        return this.d;
    }

    @Override // defpackage.MH1
    public final boolean m() {
        return false;
    }

    @NotNull
    public final String toString() {
        return CollectionsKt.J(f.i(0, this.c), ", ", C1039Gc0.e(new StringBuilder(), this.a, '('), ")", new b(), 24);
    }
}
