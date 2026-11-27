package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3967gK {

    @NotNull
    public static final C3967gK e;

    @NotNull
    public static final C3967gK f;
    public final boolean a;
    public final boolean b;

    @Nullable
    public final String[] c;

    @Nullable
    public final String[] d;

    /* JADX INFO: renamed from: gK$a */
    public static final class a {
        public boolean a = true;

        @Nullable
        public String[] b;

        @Nullable
        public String[] c;
        public boolean d;

        @NotNull
        public final C3967gK a() {
            return new C3967gK(this.a, this.d, this.b, this.c);
        }

        @NotNull
        public final void b(@NotNull C3943gC... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C3943gC c3943gC : cipherSuites) {
                arrayList.add(c3943gC.a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        public final void c(@NotNull String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.b = (String[]) cipherSuites.clone();
        }

        @NotNull
        public final void d(@NotNull ZZ1... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (ZZ1 zz1 : tlsVersions) {
                arrayList.add(zz1.d);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        public final void e(@NotNull String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.c = (String[]) tlsVersions.clone();
        }
    }

    static {
        C3943gC c3943gC = C3943gC.r;
        C3943gC c3943gC2 = C3943gC.s;
        C3943gC c3943gC3 = C3943gC.t;
        C3943gC c3943gC4 = C3943gC.l;
        C3943gC c3943gC5 = C3943gC.n;
        C3943gC c3943gC6 = C3943gC.m;
        C3943gC c3943gC7 = C3943gC.o;
        C3943gC c3943gC8 = C3943gC.q;
        C3943gC c3943gC9 = C3943gC.p;
        C3943gC[] c3943gCArr = {c3943gC, c3943gC2, c3943gC3, c3943gC4, c3943gC5, c3943gC6, c3943gC7, c3943gC8, c3943gC9};
        C3943gC[] c3943gCArr2 = {c3943gC, c3943gC2, c3943gC3, c3943gC4, c3943gC5, c3943gC6, c3943gC7, c3943gC8, c3943gC9, C3943gC.j, C3943gC.k, C3943gC.h, C3943gC.i, C3943gC.f, C3943gC.g, C3943gC.e};
        a aVar = new a();
        aVar.b((C3943gC[]) Arrays.copyOf(c3943gCArr, 9));
        ZZ1 zz1 = ZZ1.TLS_1_3;
        ZZ1 zz2 = ZZ1.TLS_1_2;
        aVar.d(zz1, zz2);
        if (!aVar.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar.d = true;
        aVar.a();
        a aVar2 = new a();
        aVar2.b((C3943gC[]) Arrays.copyOf(c3943gCArr2, 16));
        aVar2.d(zz1, zz2);
        if (!aVar2.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar2.d = true;
        e = aVar2.a();
        a aVar3 = new a();
        aVar3.b((C3943gC[]) Arrays.copyOf(c3943gCArr2, 16));
        aVar3.d(zz1, zz2, ZZ1.TLS_1_1, ZZ1.TLS_1_0);
        if (!aVar3.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar3.d = true;
        aVar3.a();
        f = new C3967gK(false, false, null, null);
    }

    public C3967gK(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    @Nullable
    public final List<C3943gC> a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C3943gC.b.b(str));
        }
        return CollectionsKt.e0(arrayList);
    }

    public final boolean b(@NotNull SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            C7948z21 c7948z21 = C7948z21.a;
            Intrinsics.c(c7948z21, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
            if (!C6806tc2.k(strArr, enabledProtocols, c7948z21)) {
                return false;
            }
        }
        String[] strArr2 = this.c;
        return strArr2 == null || C6806tc2.k(strArr2, socket.getEnabledCipherSuites(), C3943gC.c);
    }

    @Nullable
    public final List<ZZ1> c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ZZ1.a.a(str));
        }
        return CollectionsKt.e0(arrayList);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C3967gK)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C3967gK c3967gK = (C3967gK) obj;
        boolean z = c3967gK.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, c3967gK.c) && Arrays.equals(this.d, c3967gK.d) && this.b == c3967gK.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return C4564j.f(sb, this.b, ')');
    }
}
