package io.sentry.cache;

import defpackage.C0841Do0;
import defpackage.C2432Xo;
import defpackage.C2688aH1;
import defpackage.C2909bG1;
import defpackage.C3537eG1;
import defpackage.CG1;
import defpackage.CI1;
import defpackage.DG1;
import defpackage.InterfaceC1560Mu0;
import defpackage.MG1;
import defpackage.N7;
import defpackage.NG1;
import io.sentry.ILogger;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.o;
import io.sentry.util.C4527a;
import io.sentry.util.p;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class e extends b implements f {
    public static final /* synthetic */ int n = 0;
    public final CountDownLatch j;

    @NotNull
    public final WeakHashMap k;

    @NotNull
    public final C4527a l;

    @NotNull
    public final C4527a m;

    public e(@NotNull C2688aH1 c2688aH1, @NotNull String str, int i) {
        super(c2688aH1, str, i);
        this.k = new WeakHashMap();
        this.l = new C4527a();
        this.m = new C4527a();
        this.j = new CountDownLatch(1);
    }

    public boolean W(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0) {
        return f(c3537eG1, c0841Do0);
    }

    public void X(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0) {
        f(c3537eG1, c0841Do0);
    }

    @Override // io.sentry.cache.f
    public final void Y0(@NotNull C3537eG1 c3537eG1) {
        p.b(c3537eG1, "Envelope is required.");
        File fileD = d(c3537eG1);
        boolean zDelete = fileD.delete();
        C2688aH1 c2688aH1 = this.d;
        if (zDelete) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Discarding envelope from cache: %s", fileD.getAbsolutePath());
        } else {
            c2688aH1.getLogger().a(NG1.DEBUG, "Envelope was not cached or could not be deleted: %s", fileD.getAbsolutePath());
        }
    }

    @NotNull
    public final File[] c() {
        File file = this.g;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new d());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.d.getLogger().a(NG1.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    @NotNull
    public final File d(@NotNull C3537eG1 c3537eG1) {
        String str;
        C4527a.C0404a c0404aA = this.l.a();
        WeakHashMap weakHashMap = this.k;
        try {
            if (weakHashMap.containsKey(c3537eG1)) {
                str = (String) weakHashMap.get(c3537eG1);
            } else {
                String strConcat = C2432Xo.h().concat(".envelope");
                weakHashMap.put(c3537eG1, strConcat);
                str = strConcat;
            }
            File file = new File(this.g.getAbsolutePath(), str);
            c0404aA.close();
            return file;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(@NotNull File file, @NotNull File file2) {
        C4527a.C0404a c0404aA = this.m.a();
        try {
            if (!file.exists()) {
                c0404aA.close();
                return;
            }
            boolean zExists = file2.exists();
            C2688aH1 c2688aH1 = this.d;
            if (zExists) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    c2688aH1.getLogger().a(NG1.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            c2688aH1.getLogger().a(NG1.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    c2688aH1.getLogger().a(NG1.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th) {
                c2688aH1.getLogger().d(NG1.ERROR, "Error moving current session to previous session.", th);
            }
            c0404aA.close();
        } catch (Throwable th2) {
            try {
                c0404aA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0055 A[PHI: r4 r5 r9
      0x0055: PHI (r4v11 java.io.File[]) = 
      (r4v10 java.io.File[])
      (r4v10 java.io.File[])
      (r4v10 java.io.File[])
      (r4v10 java.io.File[])
      (r4v10 java.io.File[])
      (r4v10 java.io.File[])
      (r4v14 java.io.File[])
     binds: [B:10:0x0047, B:12:0x0053, B:25:0x008b, B:32:0x009f, B:35:0x00a4, B:37:0x00aa, B:279:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r5v19 aH1) = (r5v18 aH1), (r5v18 aH1), (r5v18 aH1), (r5v18 aH1), (r5v18 aH1), (r5v18 aH1), (r5v23 aH1) binds: [B:10:0x0047, B:12:0x0053, B:25:0x008b, B:32:0x009f, B:35:0x00a4, B:37:0x00aa, B:279:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r9v11 io.sentry.util.l<Mu0>) = 
      (r9v10 io.sentry.util.l<Mu0>)
      (r9v10 io.sentry.util.l<Mu0>)
      (r9v10 io.sentry.util.l<Mu0>)
      (r9v10 io.sentry.util.l<Mu0>)
      (r9v10 io.sentry.util.l<Mu0>)
      (r9v10 io.sentry.util.l<Mu0>)
      (r9v14 io.sentry.util.l<Mu0>)
     binds: [B:10:0x0047, B:12:0x0053, B:25:0x008b, B:32:0x009f, B:35:0x00a4, B:37:0x00aa, B:279:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:196:0x045e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0) {
        Date dateI;
        Date dateI2;
        boolean z;
        boolean z2;
        File[] fileArr;
        C2688aH1 c2688aH1;
        CI1 ci1B;
        Boolean bool;
        String str;
        CG1 cg1D;
        CI1 ci1B2;
        p.b(c3537eG1, "Envelope is required.");
        File[] fileArrC = c();
        int length = fileArrC.length;
        C2688aH1 c2688aH2 = this.d;
        int i = 0;
        io.sentry.util.l<InterfaceC1560Mu0> lVar = this.e;
        int i2 = this.h;
        if (length >= i2) {
            c2688aH2.getLogger().a(NG1.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i3 = (length - i2) + 1;
            if (fileArrC.length > 1) {
                Arrays.sort(fileArrC, new a());
            }
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArrC, i3, length);
            int i4 = 0;
            while (i4 < i3) {
                File file = fileArrC[i4];
                C3537eG1 c3537eG1A = a(file);
                if (c3537eG1A != null) {
                    List list = c3537eG1A.b;
                    if (list.iterator().hasNext()) {
                        c2688aH2.getClientReportRecorder().b(io.sentry.clientreport.e.CACHE_OVERFLOW, c3537eG1A);
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                ci1B = null;
                                break;
                            }
                            CG1 cg1 = (CG1) it.next();
                            if ((cg1 == null ? i : cg1.a.i.equals(MG1.Session)) != 0) {
                                ci1B = b(cg1);
                                break;
                            }
                        }
                        if (ci1B != null) {
                            boolean zEquals = ci1B.k.equals(CI1.b.Ok);
                            String str2 = ci1B.i;
                            if (((zEquals && str2 != null) ? 1 : i) == 0 || (bool = ci1B.j) == null || !bool.booleanValue()) {
                                fileArr = fileArrC;
                                c2688aH1 = c2688aH2;
                                lVar = lVar;
                            } else {
                                int length2 = fileArr2.length;
                                int i5 = i;
                                while (true) {
                                    if (i5 < length2) {
                                        File file2 = fileArr2[i5];
                                        fileArr = fileArrC;
                                        C3537eG1 c3537eG1A2 = a(file2);
                                        c2688aH1 = c2688aH2;
                                        if (c3537eG1A2 != null) {
                                            List list2 = c3537eG1A2.b;
                                            if (list2.iterator().hasNext()) {
                                                Iterator it2 = list2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        it2 = it2;
                                                        CG1 cg2 = (CG1) it2.next();
                                                        if ((cg2 == null ? false : cg2.a.i.equals(MG1.Session)) && (ci1B2 = b(cg2)) != null) {
                                                            boolean zEquals2 = ci1B2.k.equals(CI1.b.Ok);
                                                            String str3 = ci1B2.i;
                                                            if (zEquals2 && str3 != null) {
                                                                Boolean bool2 = ci1B2.j;
                                                                if (bool2 != null && bool2.booleanValue()) {
                                                                    c2688aH1.getLogger().a(NG1.ERROR, "Session %s has 2 times the init flag.", str2);
                                                                    lVar = lVar;
                                                                } else if (str2 == null || !str2.equals(str3)) {
                                                                    str2 = str2;
                                                                    lVar = lVar;
                                                                } else {
                                                                    ci1B2.j = Boolean.TRUE;
                                                                    try {
                                                                        cg1D = CG1.d(lVar.a(), ci1B2);
                                                                        try {
                                                                            it2.remove();
                                                                            str = str2;
                                                                        } catch (IOException e) {
                                                                            e = e;
                                                                            str = str2;
                                                                            c2688aH1.getLogger().c(NG1.ERROR, e, "Failed to create new envelope item for the session %s", str);
                                                                            cg1D = cg1D;
                                                                        }
                                                                    } catch (IOException e2) {
                                                                        e = e2;
                                                                        cg1D = null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        list2 = list2;
                                                        length2 = length2;
                                                        str = str2;
                                                        cg1D = null;
                                                    }
                                                    if (cg1D != null) {
                                                        ArrayList arrayList = new ArrayList();
                                                        Iterator it3 = list2.iterator();
                                                        while (it3.hasNext()) {
                                                            arrayList.add((CG1) it3.next());
                                                        }
                                                        arrayList.add(cg1D);
                                                        C3537eG1 c3537eG2 = new C3537eG1(c3537eG1A2.a, arrayList);
                                                        long jLastModified = file2.lastModified();
                                                        if (!file2.delete()) {
                                                            c2688aH1.getLogger().a(NG1.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                                                        }
                                                        try {
                                                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                            try {
                                                                lVar.a().a(c3537eG2, fileOutputStream);
                                                                file2.setLastModified(jLastModified);
                                                                fileOutputStream.close();
                                                            } catch (Throwable th) {
                                                                try {
                                                                    fileOutputStream.close();
                                                                } catch (Throwable th2) {
                                                                    th.addSuppressed(th2);
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th3) {
                                                            c2688aH1.getLogger().d(NG1.ERROR, "Failed to serialize the new envelope to the disk.", th3);
                                                        }
                                                    }
                                                }
                                            } else {
                                                length2 = length2;
                                                str = str2;
                                                lVar = lVar;
                                            }
                                        } else {
                                            length2 = length2;
                                            str = str2;
                                            lVar = lVar;
                                        }
                                        i5++;
                                        fileArrC = fileArr;
                                        c2688aH2 = c2688aH1;
                                        length2 = length2;
                                        str2 = str;
                                        lVar = lVar;
                                    } else {
                                        fileArr = fileArrC;
                                        c2688aH1 = c2688aH2;
                                        lVar = lVar;
                                    }
                                }
                            }
                        } else {
                            fileArr = fileArrC;
                            c2688aH1 = c2688aH2;
                            lVar = lVar;
                        }
                    } else {
                        fileArr = fileArrC;
                        c2688aH1 = c2688aH2;
                        lVar = lVar;
                    }
                } else {
                    fileArr = fileArrC;
                    c2688aH1 = c2688aH2;
                    lVar = lVar;
                }
                if (!file.delete()) {
                    c2688aH1.getLogger().a(NG1.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
                i4++;
                fileArrC = fileArr;
                c2688aH2 = c2688aH1;
                lVar = lVar;
                i = 0;
            }
        }
        C2688aH1 c2688aH3 = c2688aH2;
        io.sentry.util.l<InterfaceC1560Mu0> lVar2 = lVar;
        File file3 = this.g;
        File file4 = new File(file3.getAbsolutePath(), "session.json");
        File file5 = new File(file3.getAbsolutePath(), "previous_session.json");
        if (io.sentry.util.g.b(c0841Do0, io.sentry.hints.m.class) && !file4.delete()) {
            c2688aH3.getLogger().a(NG1.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        boolean zIsInstance = io.sentry.hints.a.class.isInstance(c0841Do0.b("sentry:typeCheckHint"));
        Charset charset = b.i;
        if (zIsInstance || io.sentry.hints.j.class.isInstance(c0841Do0.b("sentry:typeCheckHint"))) {
            Object objB = c0841Do0.b("sentry:typeCheckHint");
            File file6 = new File(file3.getAbsolutePath(), "previous_session.json");
            if (file6.exists()) {
                ILogger logger = c2688aH3.getLogger();
                NG1 ng1 = NG1.WARNING;
                logger.a(ng1, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file6), charset));
                    try {
                        CI1 ci1 = (CI1) lVar2.a().d(bufferedReader, CI1.class);
                        if (ci1 != null) {
                            if (objB instanceof io.sentry.hints.a) {
                                io.sentry.hints.a aVar = (io.sentry.hints.a) objB;
                                Long lA = aVar.a();
                                if (lA != null) {
                                    dateI2 = N7.i(lA.longValue());
                                    Date dateC = ci1.c();
                                    if (dateC == null || dateI2.before(dateC)) {
                                        c2688aH3.getLogger().a(ng1, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                    }
                                } else {
                                    dateI2 = null;
                                }
                                ci1.d(CI1.b.Abnormal, null, true, aVar.g());
                                dateI = dateI2;
                                ci1.b(dateI);
                                i(file6, ci1);
                            } else {
                                if (objB instanceof io.sentry.hints.j) {
                                    dateI = N7.i(((io.sentry.hints.j) objB).a().longValue());
                                    Date dateC2 = ci1.c();
                                    if (dateC2 == null || dateI.before(dateC2)) {
                                        c2688aH3.getLogger().a(ng1, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                                    } else {
                                        ci1.d(CI1.b.Crashed, null, true, null);
                                    }
                                } else {
                                    dateI = null;
                                }
                                ci1.b(dateI);
                                i(file6, ci1);
                            }
                        }
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        try {
                            bufferedReader.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    c2688aH3.getLogger().d(NG1.ERROR, "Error processing previous session.", th6);
                }
            } else {
                c2688aH3.getLogger().a(NG1.DEBUG, "No previous session file to end.", new Object[0]);
            }
        }
        if (o.class.isInstance(c0841Do0.b("sentry:typeCheckHint"))) {
            e(file4, file5);
            List list3 = c3537eG1.b;
            if (list3.iterator().hasNext()) {
                CG1 cg3 = (CG1) list3.iterator().next();
                boolean zEquals3 = MG1.Session.equals(cg3.a.i);
                DG1 dg1 = cg3.a;
                if (zEquals3) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(cg3.f()), charset));
                        try {
                            CI1 ci2 = (CI1) lVar2.a().d(bufferedReader2, CI1.class);
                            if (ci2 == null) {
                                c2688aH3.getLogger().a(NG1.ERROR, "Item of type %s returned null by the parser.", dg1.i);
                            } else {
                                i(file4, ci2);
                            }
                            bufferedReader2.close();
                        } catch (Throwable th7) {
                            try {
                                bufferedReader2.close();
                                throw th7;
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                                throw th7;
                            }
                        }
                    } catch (Throwable th9) {
                        c2688aH3.getLogger().d(NG1.ERROR, "Item failed to process.", th9);
                    }
                } else {
                    c2688aH3.getLogger().a(NG1.INFO, "Current envelope has a different envelope type %s", dg1.i);
                }
            } else {
                c2688aH3.getLogger().a(NG1.INFO, "Current envelope %s is empty", file4.getAbsolutePath());
            }
            if (new File(c2688aH3.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                z = false;
            } else {
                File file7 = new File(c2688aH3.getCacheDirPath(), "last_crash");
                if (file7.exists()) {
                    z = false;
                    c2688aH3.getLogger().a(NG1.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file7.delete()) {
                        c2688aH3.getLogger().a(NG1.ERROR, "Failed to delete the crash marker file. %s.", file7.getAbsolutePath());
                    }
                } else {
                    z = false;
                }
            }
            C2909bG1.c.a();
            this.j.countDown();
        } else {
            z = false;
        }
        File fileD = d(c3537eG1);
        if (fileD.exists()) {
            c2688aH3.getLogger().a(NG1.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileD.getAbsolutePath());
            return true;
        }
        ILogger logger2 = c2688aH3.getLogger();
        NG1 ng2 = NG1.DEBUG;
        logger2.a(ng2, "Adding Envelope to offline storage: %s", fileD.getAbsolutePath());
        if (fileD.exists()) {
            c2688aH3.getLogger().a(ng2, "Overwriting envelope to offline storage: %s", fileD.getAbsolutePath());
            if (!fileD.delete()) {
                c2688aH3.getLogger().a(NG1.ERROR, "Failed to delete: %s", fileD.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileD);
            try {
                lVar2.a().a(c3537eG1, fileOutputStream2);
                fileOutputStream2.close();
                z2 = true;
                if (UncaughtExceptionHandlerIntegration.a.class.isInstance(c0841Do0.b("sentry:typeCheckHint"))) {
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(new File(c2688aH3.getCacheDirPath(), "last_crash"));
                        try {
                            fileOutputStream3.write(N7.q(N7.h()).getBytes(charset));
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                        } catch (Throwable th10) {
                            try {
                                fileOutputStream3.close();
                                throw th10;
                            } catch (Throwable th11) {
                                th10.addSuppressed(th11);
                                throw th10;
                            }
                        }
                    } catch (Throwable th12) {
                        c2688aH3.getLogger().d(NG1.ERROR, "Error writing the crash marker file to the disk", th12);
                    }
                }
                return z2;
            } catch (Throwable th13) {
                try {
                    fileOutputStream2.close();
                    throw th13;
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                    throw th13;
                }
            }
        } catch (Throwable th15) {
            c2688aH3.getLogger().c(NG1.ERROR, th15, "Error writing Envelope %s to offline storage", fileD.getAbsolutePath());
            z2 = z;
        }
    }

    public final boolean h() {
        C2688aH1 c2688aH1 = this.d;
        try {
            return this.j.await(c2688aH1.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            c2688aH1.getLogger().a(NG1.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void i(@NotNull File file, @NotNull CI1 ci1) {
        String str = ci1.i;
        C2688aH1 c2688aH1 = this.d;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, b.i));
                try {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Overwriting session to offline storage: %s", str);
                    this.e.a().b(ci1, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
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
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            c2688aH1.getLogger().c(NG1.ERROR, th5, "Error writing Session to offline storage: %s", str);
        }
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<C3537eG1> iterator() {
        C2688aH1 c2688aH1 = this.d;
        File[] fileArrC = c();
        ArrayList arrayList = new ArrayList(fileArrC.length);
        for (File file : fileArrC) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.e.a().e(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                c2688aH1.getLogger().d(NG1.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
            }
        }
        return arrayList.iterator();
    }
}
