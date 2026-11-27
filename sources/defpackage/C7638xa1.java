package defpackage;

import io.sentry.ILogger;
import io.sentry.hints.i;
import io.sentry.hints.k;
import io.sentry.hints.l;
import io.sentry.hints.q;
import io.sentry.protocol.B;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.r;
import io.sentry.util.n;
import io.sentry.util.p;
import io.sentry.util.u;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7638xa1 extends S10 {
    public static final Charset i = Charset.forName("UTF-8");

    @NotNull
    public final SD1 e;

    @NotNull
    public final InterfaceC0697Bs0 f;

    @NotNull
    public final InterfaceC1560Mu0 g;

    @NotNull
    public final ILogger h;

    public C7638xa1(@NotNull SD1 sd1, @NotNull InterfaceC0697Bs0 interfaceC0697Bs0, @NotNull InterfaceC1560Mu0 interfaceC1560Mu0, @NotNull ILogger iLogger, long j, int i2) {
        super(sd1, iLogger, j, i2);
        p.b(sd1, "Scopes are required.");
        this.e = sd1;
        p.b(interfaceC0697Bs0, "Envelope reader is required.");
        this.f = interfaceC0697Bs0;
        p.b(interfaceC1560Mu0, "Serializer is required.");
        this.g = interfaceC1560Mu0;
        p.b(iLogger, "Logger is required.");
        this.h = iLogger;
    }

    public static /* synthetic */ void c(C7638xa1 c7638xa1, File file, l lVar) {
        ILogger iLogger = c7638xa1.h;
        if (lVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            iLogger.a(NG1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            iLogger.c(NG1.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // defpackage.S10
    public final boolean a(@Nullable String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // defpackage.S10
    public final void b(@NotNull File file, @NotNull C0841Do0 c0841Do0) {
        boolean zA = a(file.getName());
        ILogger iLogger = this.h;
        try {
            if (!zA) {
                iLogger.a(NG1.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    C3537eG1 c3537eG1A = this.f.a(bufferedInputStream);
                    if (c3537eG1A == null) {
                        iLogger.a(NG1.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        e(c3537eG1A, c0841Do0);
                        iLogger.a(NG1.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object objB = c0841Do0.b("sentry:typeCheckHint");
                    if (!l.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) || objB == null) {
                        n.a(l.class, objB, iLogger);
                    } else {
                        c(this, file, (l) objB);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                iLogger.d(NG1.ERROR, "Error processing envelope.", e);
                Object objB2 = c0841Do0.b("sentry:typeCheckHint");
                if (!l.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) || objB2 == null) {
                    n.a(l.class, objB2, iLogger);
                } else {
                    c(this, file, (l) objB2);
                }
            }
        } catch (Throwable th3) {
            Object objB3 = c0841Do0.b("sentry:typeCheckHint");
            if (!l.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) || objB3 == null) {
                n.a(l.class, objB3, iLogger);
            } else {
                c(this, file, (l) objB3);
            }
            throw th3;
        }
    }

    @NotNull
    public final L02 d(@Nullable H02 h02) {
        String str;
        ILogger iLogger = this.h;
        if (h02 != null && (str = h02.k) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (u.c(dValueOf, false)) {
                    String str2 = h02.l;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (u.c(dValueOf2, false)) {
                            return new L02(Boolean.TRUE, dValueOf, dValueOf2, Boolean.FALSE, null);
                        }
                    }
                    return u.a(new L02(Boolean.TRUE, dValueOf));
                }
                iLogger.a(NG1.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                iLogger.a(NG1.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new L02(Boolean.TRUE, null);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0242  */
    /* JADX WARN: Code duplicated, block: B:112:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x0271 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void e(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0) {
        int size;
        Iterator it;
        int i2;
        Object objB;
        C3537eG1 c3537eG2 = c3537eG1;
        NG1 ng1 = NG1.DEBUG;
        List list = c3537eG2.b;
        int i3 = 0;
        if (list != null) {
            size = list.size();
        } else {
            Iterator it2 = list.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                it2.next();
                i4++;
            }
            size = i4;
        }
        Object[] objArr = {Integer.valueOf(size)};
        ILogger iLogger = this.h;
        iLogger.a(ng1, "Processing Envelope with %d item(s)", objArr);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            CG1 cg1 = (CG1) it3.next();
            int i5 = i3 + 1;
            DG1 dg1 = cg1.a;
            if (dg1 == null) {
                iLogger.a(NG1.ERROR, "Item %d has no header", Integer.valueOf(i5));
                it = it3;
                i2 = i5;
            } else {
                boolean zEquals = MG1.Event.equals(dg1.i);
                C3747fG1 c3747fG1 = c3537eG2.a;
                DG1 dg2 = cg1.a;
                InterfaceC1560Mu0 interfaceC1560Mu0 = this.g;
                Charset charset = i;
                it = it3;
                SD1 sd1 = this.e;
                if (zEquals) {
                    try {
                        i2 = i5;
                        try {
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(cg1.f()), charset));
                                try {
                                    EG1 eg1 = (EG1) interfaceC1560Mu0.d(bufferedReader, EG1.class);
                                    if (eg1 == null) {
                                        iLogger.a(NG1.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i2), dg2.i);
                                    } else {
                                        r rVar = eg1.g;
                                        if (rVar != null) {
                                            String str = rVar.d;
                                            if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
                                                c0841Do0.d(Boolean.TRUE, "sentry:isFromHybridSdk");
                                            }
                                        }
                                        io.sentry.protocol.u uVar = c3747fG1.d;
                                        if (uVar == null || uVar.equals(eg1.d)) {
                                            sd1.w(eg1, c0841Do0);
                                            iLogger.a(NG1.DEBUG, "Item %d is being captured.", Integer.valueOf(i2));
                                            if (!f(c0841Do0)) {
                                                iLogger.a(NG1.WARNING, "Timed out waiting for event id submission: %s", eg1.d);
                                                bufferedReader.close();
                                                return;
                                            }
                                        } else {
                                            iLogger.a(NG1.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i2), c3747fG1.d, eg1.d);
                                            bufferedReader.close();
                                        }
                                    }
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                iLogger.d(NG1.ERROR, "Item failed to process.", th);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            iLogger.d(NG1.ERROR, "Item failed to process.", th);
                            objB = c0841Do0.b("sentry:typeCheckHint");
                            if (!(objB instanceof q)) {
                            }
                            Object objB2 = c0841Do0.b("sentry:typeCheckHint");
                            if (!k.class.isInstance(c0841Do0.b("sentry:typeCheckHint"))) {
                            }
                            c3537eG2 = c3537eG1;
                            it3 = it;
                            i3 = i2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        i2 = i5;
                    }
                    objB = c0841Do0.b("sentry:typeCheckHint");
                    if (!(objB instanceof q) && !((q) objB).f()) {
                        iLogger.a(NG1.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i2));
                        return;
                    }
                    Object objB3 = c0841Do0.b("sentry:typeCheckHint");
                    if (!k.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) && objB3 != null) {
                        ((k) objB3).reset();
                    }
                } else {
                    i2 = i5;
                    if (MG1.Transaction.equals(dg2.i)) {
                        try {
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(cg1.f()), charset));
                                try {
                                    B b = (B) interfaceC1560Mu0.d(bufferedReader2, B.class);
                                    if (b == null) {
                                        iLogger.a(NG1.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i2), dg2.i);
                                    } else {
                                        io.sentry.protocol.u uVar2 = c3747fG1.d;
                                        if (uVar2 == null || uVar2.equals(b.d)) {
                                            H02 h02 = c3747fG1.g;
                                            C4521c c4521c = b.e;
                                            if (c4521c.j() != null) {
                                                c4521c.j().a(d(h02));
                                            }
                                            sd1.x(b, h02, c0841Do0, null);
                                            iLogger.a(NG1.DEBUG, "Item %d is being captured.", Integer.valueOf(i2));
                                            if (!f(c0841Do0)) {
                                                iLogger.a(NG1.WARNING, "Timed out waiting for event id submission: %s", b.d);
                                                bufferedReader2.close();
                                                return;
                                            }
                                        } else {
                                            iLogger.a(NG1.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i2), c3747fG1.d, b.d);
                                            bufferedReader2.close();
                                        }
                                    }
                                    bufferedReader2.close();
                                } catch (Throwable th6) {
                                    try {
                                        bufferedReader2.close();
                                        throw th6;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                        throw th6;
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                iLogger.d(NG1.ERROR, "Item failed to process.", th);
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    } else {
                        sd1.k(new C3537eG1(c3747fG1.d, c3747fG1.e, cg1), c0841Do0);
                        NG1 ng2 = NG1.DEBUG;
                        MG1 mg1 = dg2.i;
                        iLogger.a(ng2, "%s item %d is being captured.", mg1.getItemType(), Integer.valueOf(i2));
                        if (!f(c0841Do0)) {
                            iLogger.a(NG1.WARNING, "Timed out waiting for item type submission: %s", mg1.getItemType());
                            return;
                        }
                    }
                    objB = c0841Do0.b("sentry:typeCheckHint");
                    if (!(objB instanceof q)) {
                    }
                    Object objB4 = c0841Do0.b("sentry:typeCheckHint");
                    if (!k.class.isInstance(c0841Do0.b("sentry:typeCheckHint"))) {
                    }
                }
            }
            c3537eG2 = c3537eG1;
            it3 = it;
            i3 = i2;
        }
    }

    public final boolean f(@NotNull C0841Do0 c0841Do0) {
        Object objB = c0841Do0.b("sentry:typeCheckHint");
        if (objB instanceof i) {
            return ((i) objB).e();
        }
        n.a(i.class, objB, this.h);
        return true;
    }
}
