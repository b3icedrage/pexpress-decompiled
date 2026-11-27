package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Cl2 {

    @NotNull
    public final C7242vg2.a a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;

    @Nullable
    public volatile Long f;
    public volatile int g;

    @Nullable
    public Long h;

    @Nullable
    public Long i;
    public int j;
    public int k;

    @NotNull
    public final LinkedHashMap<Integer, Integer> l;

    @NotNull
    public final ArrayList<Long> m;

    @NotNull
    public b n;

    public static final class a {

        @Nullable
        public final Long a;
        public final int b;

        @Nullable
        public final Bl2 c;
        public final int d;
        public final boolean e;

        public a(@Nullable Long l, int i, @Nullable Bl2 bl2, int i2, boolean z) {
            this.a = l;
            this.b = i;
            this.c = bl2;
            this.d = i2;
            this.e = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && this.b == aVar.b && Intrinsics.a(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            Long l = this.a;
            int iA = EF0.a(this.b, (l == null ? 0 : l.hashCode()) * 31, 31);
            Bl2 bl2 = this.c;
            return Boolean.hashCode(this.e) + EF0.a(this.d, (iA + (bl2 != null ? bl2.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CloseDecision(lifetimeMs=");
            sb.append(this.a);
            sb.append(", remoteClosesSinceReport=");
            sb.append(this.b);
            sb.append(", summary=");
            sb.append(this.c);
            sb.append(", loopStreak=");
            sb.append(this.d);
            sb.append(", log=");
            return C2983be.b(sb, this.e, ")");
        }
    }

    public static final class b {
        public final long a;

        @Nullable
        public final Integer b;

        @Nullable
        public final String c;

        @Nullable
        public final Long d;

        public b(long j, @Nullable Integer num, @Nullable String str, @Nullable Long l) {
            this.a = j;
            this.b = num;
            this.c = str;
            this.d = l;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.a(this.b, bVar.b) && Intrinsics.a(this.c, bVar.c) && Intrinsics.a(this.d, bVar.d);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.a) * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.d;
            return iHashCode3 + (l != null ? l.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "LastClose(at=" + this.a + ", code=" + this.b + ", reason=" + this.c + ", lifetime=" + this.d + ")";
        }
    }

    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return BG.a((Integer) ((Map.Entry) t2).getValue(), (Integer) ((Map.Entry) t).getValue());
        }
    }

    public Cl2(int i) {
        C7242vg2.a now = C7242vg2.a.m;
        Intrinsics.checkNotNullParameter(now, "now");
        this.a = now;
        this.b = 1800000L;
        this.c = 5000L;
        this.d = 3;
        this.e = 30;
        this.l = new LinkedHashMap<>();
        this.m = new ArrayList<>();
        this.n = new b(0L, null, null, null);
    }

    public static Long c(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (Long) list.get(f.c((((list.size() * i) + 99) / 100) - 1, list.size() - 1));
    }

    public final Bl2 a(long j) {
        Long l = this.h;
        if (l == null || j - l.longValue() < this.b) {
            return null;
        }
        Bl2 bl2D = d("flush");
        this.h = Long.valueOf(j);
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.l.clear();
        this.m.clear();
        return bl2D;
    }

    public final boolean b() {
        if (this.g < this.d) {
            return false;
        }
        Long l = this.f;
        if (l != null) {
            return ((Number) this.a.invoke()).longValue() - l.longValue() < this.c;
        }
        return true;
    }

    public final Bl2 d(String str) {
        List listY = CollectionsKt.Y(this.m);
        b bVar = this.n;
        Integer num = bVar.b;
        int i = this.j;
        int i2 = this.k;
        Set<Map.Entry<Integer, Integer>> setEntrySet = this.l.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        String strJ = CollectionsKt.J(CollectionsKt.Z(setEntrySet, new c()), ",", null, null, new C4405iQ(1), 30);
        Long lC = c(50, listY);
        Long lC2 = c(90, listY);
        Long l = (Long) CollectionsKt.N(listY);
        long j = this.n.a;
        Long l2 = this.i;
        return new Bl2(num, bVar.c, bVar.d, i, i2, strJ, lC, lC2, l, j - (l2 != null ? l2.longValue() : j), this.k >= this.d, str);
    }
}
