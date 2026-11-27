package defpackage;

import defpackage.C1481Lu.a;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3677ex implements Closeable, Flushable {

    @NotNull
    public final C3277d20 d;

    /* JADX INFO: renamed from: ex$a */
    public static final class a extends AbstractC1091Gt1 {

        @NotNull
        public final C3277d20.c e;

        @Nullable
        public final String g;

        @Nullable
        public final String h;

        @NotNull
        public final C3024bo1 i;

        /* JADX INFO: renamed from: ex$a$a, reason: collision with other inner class name */
        public static final class C0349a extends AbstractC1521Mh0 {
            public final /* synthetic */ a e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0349a(UN1 un1, a aVar) {
                super(un1);
                this.e = aVar;
            }

            @Override // defpackage.AbstractC1521Mh0, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.e.e.close();
                super.close();
            }
        }

        public a(@NotNull C3277d20.c snapshot, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.e = snapshot;
            this.g = str;
            this.h = str2;
            this.i = Cm2.e(new C0349a((UN1) snapshot.g.get(1), this));
        }

        @Override // defpackage.AbstractC1091Gt1
        public final long f() {
            String str = this.h;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = C6806tc2.a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // defpackage.AbstractC1091Gt1
        @Nullable
        public final CY0 g() {
            String str = this.g;
            if (str == null) {
                return null;
            }
            Pattern pattern = CY0.d;
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return CY0.a.a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Override // defpackage.AbstractC1091Gt1
        @NotNull
        public final InterfaceC2833av k() {
            return this.i;
        }
    }

    /* JADX INFO: renamed from: ex$b */
    public final class b {

        @NotNull
        public final C3277d20.a a;

        @NotNull
        public final KM1 b;

        @NotNull
        public final a c;
        public boolean d;
        public final /* synthetic */ C3677ex e;

        /* JADX INFO: renamed from: ex$b$a */
        public static final class a extends AbstractC1444Lh0 {
            public final /* synthetic */ C3677ex e;
            public final /* synthetic */ b g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3677ex c3677ex, b bVar, KM1 km1) {
                super(km1);
                this.e = c3677ex;
                this.g = bVar;
            }

            @Override // defpackage.AbstractC1444Lh0, defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                C3677ex c3677ex = this.e;
                b bVar = this.g;
                synchronized (c3677ex) {
                    if (bVar.d) {
                        return;
                    }
                    bVar.d = true;
                    super.close();
                    this.g.a.b();
                }
            }
        }

        public b(@NotNull C3677ex c3677ex, C3277d20.a editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.e = c3677ex;
            this.a = editor;
            KM1 km1D = editor.d(1);
            this.b = km1D;
            this.c = new a(c3677ex, this, km1D);
        }

        public final void a() {
            synchronized (this.e) {
                if (this.d) {
                    return;
                }
                this.d = true;
                C6806tc2.d(this.b);
                try {
                    this.a.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ex$c */
    public static final class c {
        @NotNull
        public static String a(@NotNull C1318Jr0 url) {
            Intrinsics.checkNotNullParameter(url, "url");
            C1802Pw c1802Pw = C1802Pw.h;
            return C1802Pw.a.c(url.i).e("MD5").i();
        }

        public static int b(@NotNull C3024bo1 source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long jL = source.l();
                String strA = source.A(Long.MAX_VALUE);
                if (jL >= 0 && jL <= 2147483647L && strA.length() <= 0) {
                    return (int) jL;
                }
                throw new IOException("expected an int but was \"" + jL + strA + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public static Set c(C2813ao0 c2813ao0) {
            int size = c2813ao0.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if ("Vary".equalsIgnoreCase(c2813ao0.c(i))) {
                    String strF = c2813ao0.f(i);
                    if (treeSet == null) {
                        Intrinsics.checkNotNullParameter(C4881kS1.a, "<this>");
                        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = StringsKt.R(strF, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.d0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? C6702t60.d : treeSet;
        }
    }

    public C3677ex(@NotNull File directory, long j) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        C5208m0 fileSystem = C5208m0.e;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.d = new C3277d20(directory, j, C8049zX1.h);
    }

    public final void c(@NotNull C4543is1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C3277d20 c3277d20 = this.d;
        String key = c.a(request.a);
        synchronized (c3277d20) {
            Intrinsics.checkNotNullParameter(key, "key");
            c3277d20.l();
            c3277d20.c();
            C3277d20.D(key);
            C3277d20.b bVar = c3277d20.l.get(key);
            if (bVar == null) {
                return;
            }
            c3277d20.A(bVar);
            if (c3277d20.j <= c3277d20.e) {
                c3277d20.r = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.d.flush();
    }

    /* JADX INFO: renamed from: ex$d */
    public static final class d {

        @NotNull
        public static final String k;

        @NotNull
        public static final String l;

        @NotNull
        public final C1318Jr0 a;

        @NotNull
        public final C2813ao0 b;

        @NotNull
        public final String c;

        @NotNull
        public final EnumC1298Jk1 d;
        public final int e;

        @NotNull
        public final String f;

        @NotNull
        public final C2813ao0 g;

        @Nullable
        public final C0916En0 h;
        public final long i;
        public final long j;

        static {
            C1903Rd1 c1903Rd1 = C1903Rd1.a;
            C1903Rd1.a.getClass();
            k = "OkHttp-Sent-Millis";
            C1903Rd1.a.getClass();
            l = "OkHttp-Received-Millis";
        }

        public d(@NotNull UN1 rawSource) throws IOException {
            C1318Jr0 c1318Jr0A;
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                C3024bo1 c3024bo1E = Cm2.e(rawSource);
                String strA = c3024bo1E.A(Long.MAX_VALUE);
                Intrinsics.checkNotNullParameter(strA, "<this>");
                try {
                    Intrinsics.checkNotNullParameter(strA, "<this>");
                    C1318Jr0.a aVar = new C1318Jr0.a();
                    aVar.e(null, strA);
                    c1318Jr0A = aVar.a();
                } catch (IllegalArgumentException unused) {
                    c1318Jr0A = null;
                }
                if (c1318Jr0A == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(strA));
                    C1903Rd1 c1903Rd1 = C1903Rd1.a;
                    C1903Rd1.a.getClass();
                    C1903Rd1.i(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.a = c1318Jr0A;
                this.c = c3024bo1E.A(Long.MAX_VALUE);
                C2813ao0.a aVar2 = new C2813ao0.a();
                int iB = c.b(c3024bo1E);
                for (int i = 0; i < iB; i++) {
                    aVar2.b(c3024bo1E.A(Long.MAX_VALUE));
                }
                this.b = aVar2.d();
                ZP1 zp1A = ZP1.a.a(c3024bo1E.A(Long.MAX_VALUE));
                this.d = zp1A.a;
                this.e = zp1A.b;
                this.f = zp1A.c;
                C2813ao0.a aVar3 = new C2813ao0.a();
                int iB2 = c.b(c3024bo1E);
                for (int i2 = 0; i2 < iB2; i2++) {
                    aVar3.b(c3024bo1E.A(Long.MAX_VALUE));
                }
                String str = k;
                String strE = aVar3.e(str);
                String str2 = l;
                String strE2 = aVar3.e(str2);
                aVar3.f(str);
                aVar3.f(str2);
                this.i = strE != null ? Long.parseLong(strE) : 0L;
                this.j = strE2 != null ? Long.parseLong(strE2) : 0L;
                this.g = aVar3.d();
                if (Intrinsics.a(this.a.a, "https")) {
                    String strA2 = c3024bo1E.A(Long.MAX_VALUE);
                    if (strA2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strA2 + '\"');
                    }
                    C3943gC cipherSuite = C3943gC.b.b(c3024bo1E.A(Long.MAX_VALUE));
                    List peerCertificates = a(c3024bo1E);
                    List localCertificates = a(c3024bo1E);
                    ZZ1 tlsVersion = !c3024bo1E.c() ? ZZ1.a.a(c3024bo1E.A(Long.MAX_VALUE)) : ZZ1.SSL_3_0;
                    Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
                    Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
                    Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                    Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
                    this.h = new C0916En0(tlsVersion, cipherSuite, C6806tc2.y(localCertificates), new C0838Dn0(C6806tc2.y(peerCertificates)));
                } else {
                    this.h = null;
                }
                Unit unit = Unit.a;
                rawSource.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C6621sj.b(rawSource, th);
                    throw th2;
                }
            }
        }

        public static List a(C3024bo1 c3024bo1) throws IOException {
            int iB = c.b(c3024bo1);
            if (iB == -1) {
                return C5653o60.d;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iB);
                for (int i = 0; i < iB; i++) {
                    String strA = c3024bo1.A(Long.MAX_VALUE);
                    C1481Lu c1481Lu = new C1481Lu();
                    C1802Pw c1802Pw = C1802Pw.h;
                    C1802Pw c1802PwA = C1802Pw.a.a(strA);
                    if (c1802PwA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c1481Lu.Y0(c1802PwA);
                    arrayList.add(certificateFactory.generateCertificate(c1481Lu.new a()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public static void b(C2814ao1 c2814ao1, List list) throws IOException {
            try {
                c2814ao1.o1(list.size());
                c2814ao1.Y(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    C1802Pw c1802Pw = C1802Pw.h;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    c2814ao1.y0(C1802Pw.a.d(C5417n.b, bytes).b());
                    c2814ao1.Y(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void c(@NotNull C3277d20.a editor) throws Throwable {
            C1318Jr0 c1318Jr0 = this.a;
            C0916En0 c0916En0 = this.h;
            C2813ao0 c2813ao0 = this.g;
            C2813ao0 c2813ao1 = this.b;
            Intrinsics.checkNotNullParameter(editor, "editor");
            C2814ao1 c2814ao1C = Cm2.c(editor.d(0));
            try {
                c2814ao1C.y0(c1318Jr0.i);
                c2814ao1C.Y(10);
                c2814ao1C.y0(this.c);
                c2814ao1C.Y(10);
                c2814ao1C.o1(c2813ao1.size());
                c2814ao1C.Y(10);
                int size = c2813ao1.size();
                for (int i = 0; i < size; i++) {
                    c2814ao1C.y0(c2813ao1.c(i));
                    c2814ao1C.y0(": ");
                    c2814ao1C.y0(c2813ao1.f(i));
                    c2814ao1C.Y(10);
                }
                EnumC1298Jk1 protocol = this.d;
                int i2 = this.e;
                String message = this.f;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(message, "message");
                StringBuilder sb = new StringBuilder();
                if (protocol == EnumC1298Jk1.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(i2);
                sb.append(' ');
                sb.append(message);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                c2814ao1C.y0(string);
                c2814ao1C.Y(10);
                c2814ao1C.o1(c2813ao0.size() + 2);
                c2814ao1C.Y(10);
                int size2 = c2813ao0.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c2814ao1C.y0(c2813ao0.c(i3));
                    c2814ao1C.y0(": ");
                    c2814ao1C.y0(c2813ao0.f(i3));
                    c2814ao1C.Y(10);
                }
                c2814ao1C.y0(k);
                c2814ao1C.y0(": ");
                c2814ao1C.o1(this.i);
                c2814ao1C.Y(10);
                c2814ao1C.y0(l);
                c2814ao1C.y0(": ");
                c2814ao1C.o1(this.j);
                c2814ao1C.Y(10);
                if (Intrinsics.a(c1318Jr0.a, "https")) {
                    c2814ao1C.Y(10);
                    Intrinsics.checkNotNull(c0916En0);
                    c2814ao1C.y0(c0916En0.b.a);
                    c2814ao1C.Y(10);
                    b(c2814ao1C, c0916En0.a());
                    b(c2814ao1C, c0916En0.c);
                    c2814ao1C.y0(c0916En0.a.d);
                    c2814ao1C.Y(10);
                }
                Unit unit = Unit.a;
                c2814ao1C.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C6621sj.b(c2814ao1C, th);
                    throw th2;
                }
            }
        }

        public d(@NotNull C0857Dt1 response) {
            C2813ao0 c2813ao0D;
            Intrinsics.checkNotNullParameter(response, "response");
            C4543is1 c4543is1 = response.d;
            this.a = c4543is1.a;
            Intrinsics.checkNotNullParameter(response, "<this>");
            C0857Dt1 c0857Dt1 = response.l;
            Intrinsics.checkNotNull(c0857Dt1);
            C2813ao0 c2813ao0 = c0857Dt1.d.c;
            C2813ao0 c2813ao1 = response.j;
            Set setC = c.c(c2813ao1);
            if (setC.isEmpty()) {
                c2813ao0D = C6806tc2.b;
            } else {
                C2813ao0.a aVar = new C2813ao0.a();
                int size = c2813ao0.size();
                for (int i = 0; i < size; i++) {
                    String strC = c2813ao0.c(i);
                    if (setC.contains(strC)) {
                        aVar.a(strC, c2813ao0.f(i));
                    }
                }
                c2813ao0D = aVar.d();
            }
            this.b = c2813ao0D;
            this.c = c4543is1.b;
            this.d = response.e;
            this.e = response.h;
            this.f = response.g;
            this.g = c2813ao1;
            this.h = response.i;
            this.i = response.o;
            this.j = response.p;
        }
    }
}
