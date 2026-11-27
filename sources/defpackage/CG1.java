package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.exception.b;
import io.sentry.protocol.B;
import io.sentry.protocol.profiling.a;
import io.sentry.util.f;
import io.sentry.util.p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class CG1 {
    public static final Charset d = Charset.forName("UTF-8");
    public final DG1 a;

    @Nullable
    public final Callable<byte[]> b;

    @Nullable
    public byte[] c;

    public static class a {

        @Nullable
        public byte[] a;

        @Nullable
        public final Callable<byte[]> b;

        public a(@Nullable Callable<byte[]> callable) {
            this.b = callable;
        }

        @NotNull
        public final byte[] a() {
            Callable<byte[]> callable;
            if (this.a == null && (callable = this.b) != null) {
                this.a = callable.call();
            }
            byte[] bArr = this.a;
            return bArr != null ? bArr : new byte[0];
        }
    }

    public CG1(@NotNull DG1 dg1, byte[] bArr) {
        this.a = dg1;
        this.c = bArr;
        this.b = null;
    }

    public static void a(long j, long j2, @NotNull String str) throws b {
        if (j > j2) {
            throw new b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    @NotNull
    public static CG1 b(@NotNull final InterfaceC1560Mu0 interfaceC1560Mu0, @NotNull final io.sentry.clientreport.b bVar) {
        p.b(interfaceC1560Mu0, "ISerializer is required.");
        a aVar = new a(new Callable() { // from class: uG1
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                InterfaceC1560Mu0 interfaceC1560Mu1 = interfaceC1560Mu0;
                io.sentry.clientreport.b bVar2 = bVar;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, CG1.d));
                    try {
                        interfaceC1560Mu1.b(bVar2, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        });
        return new CG1(new DG1(MG1.resolve(bVar), new CallableC7157vG1(aVar, 0), "application/json", null, null), new CallableC4418iU0(aVar, 1));
    }

    @NotNull
    public static CG1 c(@NotNull final C1445Lh1 c1445Lh1, @NotNull final InterfaceC1560Mu0 interfaceC1560Mu0, @NotNull final InterfaceC6869tu0 interfaceC6869tu0) {
        final File file = c1445Lh1.o;
        final a aVar = new a(new Callable() { // from class: zG1
            @Override // java.util.concurrent.Callable
            public final Object call() throws b {
                InterfaceC1560Mu0 interfaceC1560Mu1 = interfaceC1560Mu0;
                File file2 = file;
                C1445Lh1 c1445Lh2 = c1445Lh1;
                if (file2 != null) {
                    if (!file2.exists()) {
                        throw new b(C1039Gc0.d("Dropping profile chunk, because the file '", file2.getName(), "' doesn't exists"));
                    }
                    if ("java".equals(c1445Lh2.j)) {
                        C2871b51 c2871b51 = C2871b51.a;
                        InterfaceC6869tu0 interfaceC6869tu1 = interfaceC6869tu0;
                        if (c2871b51.equals(interfaceC6869tu1)) {
                            throw new b("No ProfileConverter available, dropping chunk.");
                        }
                        try {
                            file2.getAbsolutePath();
                            ((C2871b51) interfaceC6869tu1).getClass();
                            c1445Lh2.q = new a();
                        } catch (Exception e) {
                            throw new b("Profile conversion failed", e);
                        }
                    } else {
                        try {
                            String str = new String(io.sentry.vendor.a.a(f.b(file2.getPath(), 52428800L)), "US-ASCII");
                            if (str.isEmpty()) {
                                throw new b("Profiling trace file is empty");
                            }
                            c1445Lh2.p = str;
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                }
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, CG1.d));
                            try {
                                interfaceC1560Mu1.b(c1445Lh2, bufferedWriter);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                if (file2 != null) {
                                    file2.delete();
                                }
                                return byteArray;
                            } catch (Throwable th) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        if (file2 != null) {
                            file2.delete();
                        }
                        throw th5;
                    }
                } catch (IOException e3) {
                    throw new b("Failed to serialize profile chunk\n" + e3.getMessage());
                }
            }
        });
        return new CG1(new DG1(MG1.ProfileChunk, (Callable<Integer>) new Callable() { // from class: AG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", file != null ? file.getName() : null, (String) null, c1445Lh1.j, (Integer) null), new CallableC4284hp0(aVar, 1));
    }

    @NotNull
    public static CG1 d(@NotNull final InterfaceC1560Mu0 interfaceC1560Mu0, @NotNull final CI1 ci1) {
        p.b(interfaceC1560Mu0, "ISerializer is required.");
        p.b(ci1, "Session is required.");
        final a aVar = new a(new Callable() { // from class: BG1
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                InterfaceC1560Mu0 interfaceC1560Mu1 = interfaceC1560Mu0;
                CI1 ci2 = ci1;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, CG1.d));
                    try {
                        interfaceC1560Mu1.b(ci2, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        });
        return new CG1(new DG1(MG1.Session, new Callable() { // from class: hG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null, null), (Callable<byte[]>) new Callable() { // from class: iG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static byte[] j(@NotNull LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | UserVerificationMethods.USER_VERIFY_PATTERN));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nullable
    public final io.sentry.clientreport.b e(@NotNull InterfaceC1560Mu0 interfaceC1560Mu0) throws IOException {
        DG1 dg1 = this.a;
        if (dg1 == null || dg1.i != MG1.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) interfaceC1560Mu0.d(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NotNull
    public final byte[] f() {
        Callable<byte[]> callable;
        if (this.c == null && (callable = this.b) != null) {
            this.c = callable.call();
        }
        return this.c;
    }

    @Nullable
    public final RG1 g(@NotNull InterfaceC1560Mu0 interfaceC1560Mu0) throws IOException {
        DG1 dg1 = this.a;
        if (dg1 == null || dg1.i != MG1.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), d));
        try {
            RG1 rg1 = (RG1) interfaceC1560Mu0.d(bufferedReader, RG1.class);
            bufferedReader.close();
            return rg1;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nullable
    public final VG1 h(@NotNull InterfaceC1560Mu0 interfaceC1560Mu0) throws IOException {
        DG1 dg1 = this.a;
        if (dg1 == null || dg1.i != MG1.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), d));
        try {
            VG1 vg1 = (VG1) interfaceC1560Mu0.d(bufferedReader, VG1.class);
            bufferedReader.close();
            return vg1;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nullable
    public final B i(@NotNull InterfaceC1560Mu0 interfaceC1560Mu0) throws IOException {
        DG1 dg1 = this.a;
        if (dg1 == null || dg1.i != MG1.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), d));
        try {
            B b = (B) interfaceC1560Mu0.d(bufferedReader, B.class);
            bufferedReader.close();
            return b;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public CG1(@NotNull DG1 dg1, @Nullable Callable<byte[]> callable) {
        this.a = dg1;
        this.b = callable;
        this.c = null;
    }
}
