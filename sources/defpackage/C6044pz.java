package defpackage;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6044pz {

    @NotNull
    public static final C6044pz c = new C6044pz(CollectionsKt.h0(new ArrayList()), null);

    @NotNull
    public final Set<b> a;

    @Nullable
    public final G1 b;

    /* JADX INFO: renamed from: pz$a */
    public static final class a {
        @NotNull
        public static String a(@NotNull X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            StringBuilder sb = new StringBuilder("sha256/");
            Intrinsics.checkNotNullParameter(certificate, "<this>");
            C1802Pw c1802Pw = C1802Pw.h;
            byte[] encoded = certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            sb.append(C1802Pw.a.d(C5417n.b, encoded).e("SHA-256").b());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: pz$b */
    public static final class b {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            throw null;
        }
    }

    public C6044pz(@NotNull Set<b> pins, @Nullable G1 g1) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.a = pins;
        this.b = g1;
    }

    public final void a(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        C5653o60 c5653o60 = C5653o60.d;
        Iterator<T> it = this.a.iterator();
        if (!it.hasNext()) {
            c5653o60.getClass();
            return;
        }
        ((b) it.next()).getClass();
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        d.o(null, "**.", false);
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C6044pz)) {
            return false;
        }
        C6044pz c6044pz = (C6044pz) obj;
        return Intrinsics.a(c6044pz.a, this.a) && Intrinsics.a(c6044pz.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        G1 g1 = this.b;
        return iHashCode + (g1 != null ? g1.hashCode() : 0);
    }
}
