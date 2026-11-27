package defpackage;

import androidx.work.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Bk2 {

    @NotNull
    public final String a;

    @NotNull
    public EnumC3638ek2 b;

    @NotNull
    public final String c;

    @Nullable
    public String d;

    @NotNull
    public b e;

    @NotNull
    public final b f;
    public long g;
    public final long h;
    public final long i;

    @NotNull
    public VK j;
    public final int k;

    @NotNull
    public final EnumC1544Mp l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;

    @NotNull
    public final EnumC7428wa1 r;
    public final int s;
    public final int t;

    public static final class a {

        @NotNull
        public String a;

        @NotNull
        public EnumC3638ek2 b;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue(AS0.d("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public Bk2(@NotNull String id, @NotNull EnumC3638ek2 state, @NotNull String workerClassName, @Nullable String str, @NotNull b input, @NotNull b output, long j, long j2, long j3, @NotNull VK constraints, int i, @NotNull EnumC1544Mp backoffPolicy, long j4, long j5, long j6, long j7, boolean z, @NotNull EnumC7428wa1 outOfQuotaPolicy, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.a = id;
        this.b = state;
        this.c = workerClassName;
        this.d = str;
        this.e = input;
        this.f = output;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = constraints;
        this.k = i;
        this.l = backoffPolicy;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = outOfQuotaPolicy;
        this.s = i2;
        this.t = i3;
    }

    public final long a() {
        int i;
        if (this.b == EnumC3638ek2.d && (i = this.k) > 0) {
            EnumC1544Mp enumC1544Mp = EnumC1544Mp.e;
            long j = this.m;
            long jScalb = this.l == enumC1544Mp ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            long j2 = this.n;
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        int i2 = this.s;
        long j3 = this.n;
        if (i2 == 0) {
            j3 += this.g;
        }
        long j4 = this.i;
        long j5 = this.h;
        if (j4 != j5) {
            return j3 + j5 + (i2 == 0 ? ((long) (-1)) * j4 : 0L);
        }
        return j3 + (i2 != 0 ? j5 : 0L);
    }

    public final boolean b() {
        return !Intrinsics.a(VK.i, this.j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bk2)) {
            return false;
        }
        Bk2 bk2 = (Bk2) obj;
        return Intrinsics.a(this.a, bk2.a) && this.b == bk2.b && Intrinsics.a(this.c, bk2.c) && Intrinsics.a(this.d, bk2.d) && Intrinsics.a(this.e, bk2.e) && Intrinsics.a(this.f, bk2.f) && this.g == bk2.g && this.h == bk2.h && this.i == bk2.i && Intrinsics.a(this.j, bk2.j) && this.k == bk2.k && this.l == bk2.l && this.m == bk2.m && this.n == bk2.n && this.o == bk2.o && this.p == bk2.p && this.q == bk2.q && this.r == bk2.r && this.s == bk2.s && this.t == bk2.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    public final int hashCode() {
        int iB = C1039Gc0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iA = C5491nL.a(C5491nL.a(C5491nL.a(C5491nL.a((this.l.hashCode() + EF0.a(this.k, (this.j.hashCode() + C5491nL.a(C5491nL.a(C5491nL.a((this.f.hashCode() + ((this.e.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        boolean z = this.q;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return Integer.hashCode(this.t) + EF0.a(this.s, (this.r.hashCode() + ((iA + r2) * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Bk2(String str, EnumC3638ek2 enumC3638ek2, String str2, String str3, b bVar, b bVar2, long j, long j2, long j3, VK vk, int i, EnumC1544Mp enumC1544Mp, long j4, long j5, long j6, long j7, boolean z, EnumC7428wa1 enumC7428wa1, int i2, int i3, int i4) {
        b bVar3;
        b bVar4;
        EnumC3638ek2 enumC3638ek3 = (i3 & 2) != 0 ? EnumC3638ek2.d : enumC3638ek2;
        String str4 = (i3 & 8) != 0 ? null : str3;
        if ((i3 & 16) != 0) {
            b EMPTY = b.c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            bVar3 = EMPTY;
        } else {
            bVar3 = bVar;
        }
        if ((i3 & 32) != 0) {
            b EMPTY2 = b.c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            bVar4 = EMPTY2;
        } else {
            bVar4 = bVar2;
        }
        this(str, enumC3638ek3, str2, str4, bVar3, bVar4, (i3 & 64) != 0 ? 0L : j, (i3 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0L : j2, (i3 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 0L : j3, (i3 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? VK.i : vk, (i3 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0 : i, (i3 & 2048) != 0 ? EnumC1544Mp.d : enumC1544Mp, (i3 & 4096) != 0 ? 30000L : j4, (i3 & 8192) != 0 ? 0L : j5, (i3 & 16384) != 0 ? 0L : j6, (32768 & i3) != 0 ? -1L : j7, (65536 & i3) != 0 ? false : z, (131072 & i3) != 0 ? EnumC7428wa1.d : enumC7428wa1, (i3 & 262144) != 0 ? 0 : i2, 0);
    }
}
