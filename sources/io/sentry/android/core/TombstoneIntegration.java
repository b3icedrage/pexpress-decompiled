package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.C0841Do0;
import defpackage.C2234Vk;
import defpackage.C2688aH1;
import defpackage.C3537eG1;
import defpackage.CG1;
import defpackage.DG1;
import defpackage.EG1;
import defpackage.H81;
import defpackage.InterfaceC1405Ku0;
import defpackage.MG1;
import defpackage.N7;
import defpackage.NG1;
import defpackage.OB0;
import io.sentry.ILogger;
import io.sentry.protocol.C4522d;
import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class TombstoneIntegration implements OB0, Closeable {

    @NotNull
    public final Context d;

    @NotNull
    public final io.sentry.transport.c e;

    @Nullable
    public SentryAndroidOptions g;

    public static final class a extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.j {
        public final long d;
        public final boolean e;

        public a(long j, @NotNull ILogger iLogger, long j2, boolean z) {
            super(j, iLogger);
            this.d = j2;
            this.e = z;
        }

        @Override // io.sentry.hints.j
        @NotNull
        public final Long a() {
            return Long.valueOf(this.d);
        }

        @Override // io.sentry.hints.c
        public final boolean b() {
            return this.e;
        }

        @Override // io.sentry.hints.f
        public final boolean f(@Nullable io.sentry.protocol.u uVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public final void h(@NotNull io.sentry.protocol.u uVar) {
        }
    }

    public static class b implements D.a {

        @NotNull
        public final SentryAndroidOptions a;

        @NotNull
        public final T b;

        @NotNull
        public final Context c;

        public b(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
            this.a = sentryAndroidOptions;
            this.b = new T(sentryAndroidOptions);
            this.c = context;
        }

        @Override // io.sentry.android.core.D.a
        @NotNull
        public final String a() {
            return "Tombstone";
        }

        @Override // io.sentry.android.core.D.a
        public final int b() {
            return 5;
        }

        @Override // io.sentry.android.core.D.a
        @Nullable
        public final Long c() {
            return io.sentry.android.core.cache.a.j(this.a, "last_tombstone_report", "Tombstone");
        }

        @Override // io.sentry.android.core.D.a
        public final boolean d() {
            return this.a.isReportHistoricalTombstones();
        }

        @Override // io.sentry.android.core.D.a
        @Nullable
        public final D.b e(@NotNull ApplicationExitInfo applicationExitInfo, boolean z) {
            SentryAndroidOptions sentryAndroidOptions = this.a;
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                if (traceInputStream == null) {
                    sentryAndroidOptions.getLogger().a(NG1.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                    return null;
                }
                io.sentry.android.core.internal.tombstone.b bVar = new io.sentry.android.core.internal.tombstone.b(traceInputStream, sentryAndroidOptions.getInAppIncludes(), sentryAndroidOptions.getInAppExcludes(), this.c.getApplicationInfo().nativeLibraryDir);
                try {
                    EG1 eg1C = bVar.c();
                    bVar.close();
                    long timestamp = applicationExitInfo.getTimestamp();
                    eg1C.t = N7.i(timestamp);
                    a aVar = new a(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z);
                    C0841Do0 c0841Do0A = io.sentry.util.g.a(aVar);
                    try {
                        EG1 eg1F = f(timestamp, eg1C, c0841Do0A);
                        if (eg1F != null) {
                            eg1C = eg1F;
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().a(NG1.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th.getMessage());
                    }
                    return new D.b(eg1C, c0841Do0A, aVar);
                } catch (Throwable th2) {
                    try {
                        bVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                sentryAndroidOptions.getLogger().a(NG1.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th4.getMessage());
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0187  */
        /* JADX WARN: Code duplicated, block: B:249:0x01aa A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final EG1 f(long j, EG1 eg1, C0841Do0 c0841Do0) {
            EG1 eg2;
            boolean z;
            File[] fileArr;
            String name;
            T.c cVar;
            T.c cVarA;
            int i;
            int i2;
            String string;
            T.d dVar;
            String str;
            T t = this.b;
            boolean z2 = t.c;
            ArrayList arrayList = t.b;
            SentryAndroidOptions sentryAndroidOptions = t.a;
            int i3 = 0;
            if (z2) {
                eg2 = null;
            } else {
                boolean z3 = true;
                t.c = true;
                String outboxPath = sentryAndroidOptions.getOutboxPath();
                if (outboxPath == null) {
                    sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
                } else {
                    File[] fileArrListFiles = new File(outboxPath).listFiles();
                    if (fileArrListFiles == null) {
                        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
                    } else if (fileArrListFiles.length == 0) {
                        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "No envelope files found in outbox.", new Object[0]);
                    } else {
                        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(fileArrListFiles.length));
                        int length = fileArrListFiles.length;
                        int i4 = 0;
                        while (i4 < length) {
                            File file = fileArrListFiles[i4];
                            if (!file.isFile() || (name = file.getName()) == null || name.startsWith("session") || name.startsWith("previous_session") || name.startsWith("startup_crash")) {
                                z = z3;
                                fileArr = fileArrListFiles;
                            } else {
                                try {
                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                                    int i5 = i3;
                                    do {
                                        try {
                                            i = bufferedInputStream.read();
                                            cVar = null;
                                            i2 = -1;
                                            if (i == -1) {
                                                if (i5 > 0) {
                                                    break;
                                                }
                                                i5 = -1;
                                                break;
                                            }
                                            i5++;
                                        } catch (Throwable th) {
                                            th = th;
                                            z = z3;
                                            fileArr = fileArrListFiles;
                                            cVar = null;
                                        }
                                    } while (i != 10);
                                    if (i5 < 0) {
                                        try {
                                            bufferedInputStream.close();
                                            z = z3;
                                            fileArr = fileArrListFiles;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z = z3;
                                            fileArr = fileArrListFiles;
                                            sentryAndroidOptions.getLogger().c(NG1.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                        }
                                    } else {
                                        boolean z4 = z3;
                                        fileArr = fileArrListFiles;
                                        long j2 = i5;
                                        while (true) {
                                            if (j2 < 209715200) {
                                                try {
                                                    StringBuilder sb = new StringBuilder();
                                                    z = z4;
                                                    while (true) {
                                                        try {
                                                            int i6 = bufferedInputStream.read();
                                                            if (i6 == i2) {
                                                                if (sb.length() <= 0) {
                                                                    string = null;
                                                                    break;
                                                                }
                                                                string = sb.toString();
                                                                break;
                                                            }
                                                            if (i6 == 10) {
                                                                string = sb.toString();
                                                                break;
                                                            }
                                                            sb.append((char) i6);
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            Throwable th4 = th;
                                                            try {
                                                                bufferedInputStream.close();
                                                            } catch (Throwable th5) {
                                                                th4.addSuppressed(th5);
                                                            }
                                                            throw th4;
                                                        }
                                                    }
                                                    if (string != null && !string.isEmpty()) {
                                                        long length2 = j2 + ((long) (string.length() + 1));
                                                        T.b bVarB = t.b(string);
                                                        if (bVarB != null) {
                                                            int i7 = bVarB.b;
                                                            if ("event".equals(bVarB.a)) {
                                                                cVarA = t.a(bufferedInputStream, i7, file);
                                                                if (cVarA != null) {
                                                                    try {
                                                                        bufferedInputStream.close();
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        sentryAndroidOptions.getLogger().c(NG1.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                                                        cVarA = cVar;
                                                                        if (cVarA != null) {
                                                                            arrayList.add(cVarA);
                                                                            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(cVarA.b));
                                                                        }
                                                                        i4++;
                                                                        fileArrListFiles = fileArr;
                                                                        z3 = z;
                                                                        i3 = 0;
                                                                    }
                                                                }
                                                                if (cVarA != null) {
                                                                    arrayList.add(cVarA);
                                                                    sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(cVarA.b));
                                                                }
                                                            } else {
                                                                T.c(bufferedInputStream, i7);
                                                            }
                                                            long j3 = length2 + ((long) i7);
                                                            int i8 = bufferedInputStream.read();
                                                            if (i8 != -1) {
                                                                j2 = j3 + 1;
                                                                if (i8 == 10) {
                                                                    i2 = -1;
                                                                    z4 = z;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    z = z4;
                                                }
                                            } else {
                                                z = z4;
                                            }
                                            bufferedInputStream.close();
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    z = z3;
                                    fileArr = fileArrListFiles;
                                    cVar = null;
                                }
                                cVarA = cVar;
                                if (cVarA != null) {
                                    arrayList.add(cVarA);
                                    sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(cVarA.b));
                                }
                            }
                            i4++;
                            fileArrListFiles = fileArr;
                            z3 = z;
                            i3 = 0;
                        }
                        eg2 = null;
                        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(arrayList.size()));
                    }
                }
                eg2 = null;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    T.c cVar2 = (T.c) it.next();
                    long jAbs = Math.abs(j - cVar2.b);
                    if (jAbs <= 5000) {
                        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Matched native event by timestamp (diff: %d ms)", Long.valueOf(jAbs));
                        arrayList.remove(cVar2);
                        File file2 = cVar2.a;
                        try {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                            try {
                                C3537eG1 c3537eG1A = sentryAndroidOptions.getEnvelopeReader().a(bufferedInputStream2);
                                if (c3537eG1A != null) {
                                    Iterator it2 = c3537eG1A.b.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            CG1 cg1 = (CG1) it2.next();
                                            if (MG1.Event.equals(cg1.a.i)) {
                                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(cg1.f()), StandardCharsets.UTF_8));
                                                try {
                                                    EG1 eg3 = (EG1) sentryAndroidOptions.getSerializer().d(bufferedReader, EG1.class);
                                                    if (eg3 != null && "native".equals(eg3.l)) {
                                                        T.d dVar2 = new T.d(eg3, file2, c3537eG1A);
                                                        bufferedReader.close();
                                                        bufferedInputStream2.close();
                                                        dVar = dVar2;
                                                        break;
                                                    }
                                                    bufferedReader.close();
                                                } catch (Throwable th9) {
                                                    try {
                                                        bufferedReader.close();
                                                        throw th9;
                                                    } catch (Throwable th10) {
                                                        th9.addSuppressed(th10);
                                                        throw th9;
                                                    }
                                                }
                                                try {
                                                    bufferedInputStream2.close();
                                                    throw th;
                                                } catch (Throwable th11) {
                                                    th.addSuppressed(th11);
                                                    throw th;
                                                }
                                            }
                                        }
                                    }
                                }
                                bufferedInputStream2.close();
                            } catch (Throwable th12) {
                                bufferedInputStream2.close();
                                throw th12;
                            }
                        } catch (Throwable th13) {
                            sentryAndroidOptions.getLogger().c(NG1.DEBUG, th13, "Error loading envelope file: %s", file2.getAbsolutePath());
                        }
                    }
                }
                dVar = eg2;
                break;
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.a;
            if (dVar == 0) {
                sentryAndroidOptions2.getLogger().a(NG1.DEBUG, "No matching native event found for tombstone.", new Object[0]);
                return eg2;
            }
            ILogger logger = sentryAndroidOptions2.getLogger();
            NG1 ng1 = NG1.DEBUG;
            File file3 = dVar.b;
            logger.a(ng1, "Found matching native event for tombstone, removing from outbox: %s", file3.getName());
            try {
                if (!file3.delete()) {
                    sentryAndroidOptions.getLogger().a(NG1.WARNING, "Failed to delete native event file: %s", file3.getAbsolutePath());
                    return eg2;
                }
                sentryAndroidOptions.getLogger().a(ng1, "Deleted native event file from outbox: %s", file3.getName());
                ArrayList arrayListC = eg1.c();
                C4522d c4522d = eg1.r;
                ArrayList arrayListD = eg1.d();
                EG1 eg4 = dVar.a;
                if (arrayListC != null && !arrayListC.isEmpty() && c4522d != null && arrayListD != null) {
                    io.sentry.protocol.l lVar = ((io.sentry.protocol.s) arrayListC.get(0)).j;
                    if (lVar != null) {
                        lVar.d = io.sentry.android.core.internal.tombstone.a.TOMBSTONE_MERGED.getValue();
                    }
                    io.sentry.protocol.m mVar = eg4.u;
                    if (mVar == null || (str = mVar.e) == null || str.isEmpty()) {
                        eg4.u = eg1.u;
                    }
                    eg4.x = new H81(arrayListC);
                    eg4.r = c4522d;
                    eg4.w = new H81(arrayListD);
                }
                for (CG1 cg2 : dVar.c.b) {
                    try {
                        DG1 dg1 = cg2.a;
                        String str2 = dg1.g;
                        if (dg1.i == MG1.Attachment && str2 != null) {
                            byte[] bArrF = cg2.f();
                            DG1 dg2 = cg2.a;
                            try {
                                c0841Do0.b.add(new C2234Vk(bArrF, str2, dg2.d, dg2.l));
                            } catch (Throwable th14) {
                                th = th14;
                                sentryAndroidOptions2.getLogger().a(NG1.DEBUG, "Failed to process envelope item: %s", th.getMessage());
                            }
                        }
                    } catch (Throwable th15) {
                        th = th15;
                    }
                }
                return eg4;
            } catch (Throwable th16) {
                sentryAndroidOptions.getLogger().c(NG1.ERROR, th16, "Error deleting native event file: %s", file3.getAbsolutePath());
            }
        }
    }

    public TombstoneIntegration(@NotNull Context context) {
        io.sentry.transport.c cVar = io.sentry.transport.c.a;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
        this.e = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.g;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.g = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.g.isTombstoneEnabled()));
        if (this.g.isTombstoneEnabled()) {
            if (this.g.getCacheDirPath() == null) {
                this.g.getLogger().a(NG1.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                InterfaceC1405Ku0 executorService = c2688aH1.getExecutorService();
                Context context = this.d;
                SentryAndroidOptions sentryAndroidOptions2 = this.g;
                executorService.submit(new D(context, sentryAndroidOptions2, this.e, new b(context, sentryAndroidOptions2)));
            } catch (Throwable th) {
                c2688aH1.getLogger().d(NG1.DEBUG, "Failed to start tombstone processor.", th);
            }
            c2688aH1.getLogger().a(NG1.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            io.sentry.util.j.a("Tombstone");
        }
    }
}
