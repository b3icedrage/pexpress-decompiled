package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C0841Do0;
import defpackage.C2234Vk;
import defpackage.C2688aH1;
import defpackage.EG1;
import defpackage.H81;
import defpackage.InterfaceC1405Ku0;
import defpackage.N7;
import defpackage.NG1;
import defpackage.OB0;
import io.sentry.ILogger;
import io.sentry.protocol.C4522d;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class AnrV2Integration implements OB0, Closeable {

    @NotNull
    public final Context d;

    @NotNull
    public final io.sentry.transport.c e;

    @Nullable
    public SentryAndroidOptions g;

    public static final class a extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {
        public final long d;
        public final boolean e;
        public final boolean f;

        public a(long j, @NotNull ILogger iLogger, long j2, boolean z, boolean z2) {
            super(j, iLogger);
            this.d = j2;
            this.e = z;
            this.f = z2;
        }

        @Override // io.sentry.hints.a
        @NotNull
        public final Long a() {
            return Long.valueOf(this.d);
        }

        @Override // io.sentry.hints.c
        public final boolean b() {
            return this.e;
        }

        @Override // io.sentry.hints.a
        public final boolean d() {
            return false;
        }

        @Override // io.sentry.hints.f
        public final boolean f(@Nullable io.sentry.protocol.u uVar) {
            return true;
        }

        @Override // io.sentry.hints.a
        public final String g() {
            return this.f ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.f
        public final void h(@NotNull io.sentry.protocol.u uVar) {
        }
    }

    public static final class b implements D.a {

        @NotNull
        public final SentryAndroidOptions a;

        public b(@NotNull SentryAndroidOptions sentryAndroidOptions) {
            this.a = sentryAndroidOptions;
        }

        @Override // io.sentry.android.core.D.a
        @NotNull
        public final String a() {
            return "ANR";
        }

        @Override // io.sentry.android.core.D.a
        public final int b() {
            return 6;
        }

        @Override // io.sentry.android.core.D.a
        @Nullable
        public final Long c() {
            return io.sentry.android.core.cache.a.j(this.a, "last_anr_report", "ANR");
        }

        @Override // io.sentry.android.core.D.a
        public final boolean d() {
            return this.a.isReportHistoricalAnrs();
        }

        /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:65:0x010a  */
        /* JADX WARN: Code duplicated, block: B:67:0x0125  */
        /* JADX WARN: Code duplicated, block: B:68:0x0131  */
        /* JADX WARN: Code duplicated, block: B:70:0x0135  */
        /* JADX WARN: Code duplicated, block: B:72:0x0142  */
        /* JADX WARN: Code duplicated, block: B:87:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:? A[Catch: all -> 0x0027, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x0027, blocks: (B:6:0x0013, B:10:0x0022, B:26:0x004d, B:59:0x00dc, B:58:0x00d9, B:55:0x00d4, B:8:0x0019, B:16:0x002e, B:25:0x004a, B:53:0x00d1, B:52:0x00ce), top: B:86:0x0013, inners: #5, #6 }] */
        @Override // io.sentry.android.core.D.a
        @Nullable
        public final D.b e(@NotNull ApplicationExitInfo applicationExitInfo, boolean z) {
            c cVar;
            c.a aVar;
            c.a aVar2;
            C0841Do0 c0841Do0A;
            EG1 eg1;
            ArrayList arrayList;
            byte[] bArr;
            SentryAndroidOptions sentryAndroidOptions = this.a;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z2 = applicationExitInfo.getImportance() != 100;
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        cVar = new c(c.a.NO_DUMP);
                        if (traceInputStream != null) {
                            traceInputStream.close();
                        }
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr2 = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                            while (true) {
                                int i = traceInputStream.read(bArr2, 0, UserVerificationMethods.USER_VERIFY_ALL);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i);
                                if (traceInputStream != null) {
                                    throw th;
                                }
                                try {
                                    traceInputStream.close();
                                    throw th;
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                    throw th;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            traceInputStream.close();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        io.sentry.android.core.internal.threaddump.a aVar3 = new io.sentry.android.core.internal.threaddump.a();
                                        aVar3.a = line;
                                        arrayList2.add(aVar3);
                                    }
                                    io.sentry.android.core.internal.threaddump.b bVar = new io.sentry.android.core.internal.threaddump.b(arrayList2);
                                    io.sentry.android.core.internal.threaddump.c cVar2 = new io.sentry.android.core.internal.threaddump.c(sentryAndroidOptions, z2);
                                    cVar2.d(bVar);
                                    ArrayList arrayList3 = cVar2.e;
                                    cVar = arrayList3.isEmpty() ? new c(c.a.NO_DUMP) : new c(c.a.DUMP, byteArray, arrayList3, new ArrayList(cVar2.d.values()));
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    try {
                                        bufferedReader.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th4) {
                                sentryAndroidOptions.getLogger().d(NG1.WARNING, "Failed to parse ANR thread dump", th4);
                                cVar = new c(c.a.ERROR, byteArray);
                            }
                        } catch (Throwable th5) {
                            try {
                                byteArrayOutputStream.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    if (traceInputStream != null) {
                        throw th7;
                    }
                    traceInputStream.close();
                    throw th7;
                    aVar = c.a.NO_DUMP;
                    aVar2 = cVar.a;
                    if (aVar2 == aVar) {
                        sentryAndroidOptions.getLogger().a(NG1.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                        return null;
                    }
                    a aVar4 = new a(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
                    c0841Do0A = io.sentry.util.g.a(aVar4);
                    eg1 = new EG1();
                    if (aVar2 == c.a.ERROR) {
                        io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                        mVar.d = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
                        eg1.u = mVar;
                    } else if (aVar2 == c.a.DUMP) {
                        eg1.w = new H81(cVar.c);
                        arrayList = cVar.d;
                        if (arrayList != null) {
                            C4522d c4522d = new C4522d();
                            c4522d.e = new ArrayList(arrayList);
                            eg1.r = c4522d;
                        }
                    }
                    eg1.y = NG1.FATAL;
                    eg1.t = N7.i(timestamp);
                    if (sentryAndroidOptions.isAttachAnrThreadDump()) {
                        c0841Do0A.f = new C2234Vk(bArr, "thread-dump.txt", "text/plain", "event.attachment");
                    }
                    return new D.b(eg1, c0841Do0A, aVar4);
                }
            } catch (Throwable th8) {
                sentryAndroidOptions.getLogger().d(NG1.WARNING, "Failed to read ANR thread dump", th8);
                cVar = new c(c.a.NO_DUMP);
            }
            aVar = c.a.NO_DUMP;
            aVar2 = cVar.a;
            if (aVar2 == aVar) {
                sentryAndroidOptions.getLogger().a(NG1.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return null;
            }
            a aVar5 = new a(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
            c0841Do0A = io.sentry.util.g.a(aVar5);
            eg1 = new EG1();
            if (aVar2 == c.a.ERROR) {
                io.sentry.protocol.m mVar2 = new io.sentry.protocol.m();
                mVar2.d = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
                eg1.u = mVar2;
            } else if (aVar2 == c.a.DUMP) {
                eg1.w = new H81(cVar.c);
                arrayList = cVar.d;
                if (arrayList != null) {
                    C4522d c4522d2 = new C4522d();
                    c4522d2.e = new ArrayList(arrayList);
                    eg1.r = c4522d2;
                }
            }
            eg1.y = NG1.FATAL;
            eg1.t = N7.i(timestamp);
            if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = cVar.b) != null) {
                c0841Do0A.f = new C2234Vk(bArr, "thread-dump.txt", "text/plain", "event.attachment");
            }
            return new D.b(eg1, c0841Do0A, aVar5);
        }
    }

    public AnrV2Integration(@NotNull Context context) {
        io.sentry.transport.c cVar = io.sentry.transport.c.a;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
        this.e = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.g;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // defpackage.OB0
    @SuppressLint({"NewApi"})
    public final void t(@NotNull C2688aH1 c2688aH1) {
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.g = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.g.isAnrEnabled()));
        if (this.g.getCacheDirPath() == null) {
            this.g.getLogger().a(NG1.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.g.isAnrEnabled()) {
            try {
                InterfaceC1405Ku0 executorService = c2688aH1.getExecutorService();
                Context context = this.d;
                SentryAndroidOptions sentryAndroidOptions2 = this.g;
                executorService.submit(new D(context, sentryAndroidOptions2, this.e, new b(sentryAndroidOptions2)));
            } catch (Throwable th) {
                c2688aH1.getLogger().d(NG1.DEBUG, "Failed to start ANR processor.", th);
            }
            c2688aH1.getLogger().a(NG1.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.j.a("AnrV2");
        }
    }

    public static final class c {
        public final a a;
        public final byte[] b;

        @Nullable
        public final ArrayList c;

        @Nullable
        public final ArrayList d;

        public enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        public c(@NotNull a aVar) {
            this.a = aVar;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public c(@NotNull a aVar, byte[] bArr) {
            this.a = aVar;
            this.b = bArr;
            this.c = null;
            this.d = null;
        }

        public c(@NotNull a aVar, byte[] bArr, @Nullable ArrayList arrayList, @Nullable ArrayList arrayList2) {
            this.a = aVar;
            this.b = bArr;
            this.c = arrayList;
            this.d = arrayList2;
        }
    }
}
