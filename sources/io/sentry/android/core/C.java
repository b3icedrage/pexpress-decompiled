package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.android.gms.common.Scopes;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C1445Lh1;
import defpackage.C1522Mh1;
import defpackage.C2688aH1;
import defpackage.C3561eO1;
import defpackage.C5491nL;
import defpackage.C6740tH1;
import defpackage.EG1;
import defpackage.FG1;
import defpackage.H81;
import defpackage.InterfaceC1155Hp;
import defpackage.NG1;
import defpackage.QF1;
import io.sentry.ILogger;
import io.sentry.protocol.C4519a;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.C4522d;
import io.sentry.protocol.C4523e;
import io.sentry.protocol.DebugImage;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements InterfaceC1155Hp {

    @NotNull
    public final Context d;

    @NotNull
    public final SentryAndroidOptions e;

    @NotNull
    public final E g;

    @NotNull
    public final FG1 h;

    @Nullable
    public final io.sentry.cache.m i;

    @NotNull
    public final List<b> j = Collections.singletonList(new a());

    public final class a implements b {
        public a() {
        }

        @Override // io.sentry.android.core.C.b
        public final boolean a(@NotNull io.sentry.hints.c cVar) {
            return cVar instanceof io.sentry.hints.a;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0272  */
        /* JADX WARN: Code duplicated, block: B:103:0x0297  */
        /* JADX WARN: Code duplicated, block: B:104:0x02a0  */
        /* JADX WARN: Code duplicated, block: B:107:0x02a9  */
        /* JADX WARN: Code duplicated, block: B:113:0x02d1  */
        /* JADX WARN: Code duplicated, block: B:115:0x02dd  */
        /* JADX WARN: Code duplicated, block: B:119:0x02f2  */
        /* JADX WARN: Code duplicated, block: B:123:0x0380  */
        /* JADX WARN: Code duplicated, block: B:124:0x0382  */
        /* JADX WARN: Code duplicated, block: B:127:0x0395  */
        /* JADX WARN: Code duplicated, block: B:129:0x03f7  */
        /* JADX WARN: Code duplicated, block: B:131:0x0407  */
        /* JADX WARN: Code duplicated, block: B:138:0x042f  */
        /* JADX WARN: Code duplicated, block: B:143:0x043b  */
        /* JADX WARN: Code duplicated, block: B:145:0x0445  */
        /* JADX WARN: Code duplicated, block: B:178:0x04b9 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:179:0x04bb  */
        /* JADX WARN: Code duplicated, block: B:183:0x04d1  */
        /* JADX WARN: Code duplicated, block: B:186:0x04dd  */
        /* JADX WARN: Code duplicated, block: B:217:0x0305 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:220:0x02b3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:223:0x02e2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:235:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:61:0x0108  */
        /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:94:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:97:0x0219  */
        /* JADX WARN: Code duplicated, block: B:99:0x0232  */
        /* JADX WARN: Instruction removed from duplicated block: B:127:0x0395, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:143:0x043b, please report this as an issue */
        @Override // io.sentry.android.core.C.b
        public final void b(@NotNull EG1 eg1, @NotNull io.sentry.hints.c cVar, @NotNull io.sentry.hints.c cVar2) {
            boolean z;
            SentryAndroidOptions sentryAndroidOptions;
            C4521c c4521c;
            boolean z2;
            C4519a c4519aD;
            ArrayList arrayListC;
            List<io.sentry.protocol.y> list;
            String cacheDirPath;
            long time;
            int i;
            io.sentry.android.core.anr.d dVar;
            NG1 ng1;
            ArrayList arrayList;
            boolean z3;
            io.sentry.android.core.anr.a aVar;
            ArrayList arrayList2;
            int i2;
            io.sentry.protocol.profiling.a aVar2;
            ArrayList arrayList3;
            HashMap map;
            ArrayList arrayList4;
            HashMap map2;
            Iterator it;
            C4521c c4521c2;
            C1445Lh1 c1445Lh1;
            io.sentry.protocol.u uVar;
            StackTraceElement[] stackTraceElementArr;
            StackTraceElement[] stackTraceElementArr2;
            ArrayList<Integer> arrayList5;
            int length;
            int i3;
            StringBuilder sb;
            String string;
            Integer numValueOf;
            StackTraceElement stackTraceElement;
            String string2;
            Integer numValueOf2;
            io.sentry.protocol.y yVar;
            Integer numValueOf3;
            File file;
            EG1 eg2 = eg1;
            int i4 = 0;
            boolean zEquals = cVar2 instanceof io.sentry.hints.a ? "anr_background".equals(((io.sentry.hints.a) cVar2).g()) : false;
            C c = C.this;
            boolean zIsAnrProfilingEnabled = c.e.isAnrProfilingEnabled();
            C4521c c4521c3 = eg2.e;
            SentryAndroidOptions sentryAndroidOptions2 = c.e;
            if (!zIsAnrProfilingEnabled || zEquals || (cacheDirPath = sentryAndroidOptions2.getCacheDirPath()) == null) {
                z = zEquals;
                c4521c = c4521c3;
                sentryAndroidOptions = sentryAndroidOptions2;
            } else {
                File file2 = new File(cacheDirPath);
                if (cVar instanceof io.sentry.hints.a) {
                    Long lA = ((io.sentry.hints.a) cVar).a();
                    try {
                        try {
                            if (lA != null) {
                                time = lA.longValue();
                            } else {
                                if (((Date) eg2.t.clone()) != null) {
                                    time = ((Date) eg2.t.clone()).getTime();
                                } else {
                                    z = zEquals;
                                }
                                c4521c = c4521c3;
                                sentryAndroidOptions = sentryAndroidOptions2;
                            }
                            if (file.exists()) {
                                i = -1;
                                sentryAndroidOptions2.getLogger().a(NG1.DEBUG, "Reading ANR profile", new Object[0]);
                                io.sentry.android.core.anr.e eVar = new io.sentry.android.core.anr.e(sentryAndroidOptions2, file);
                                try {
                                    dVar = new io.sentry.android.core.anr.d(eVar.d.f());
                                    try {
                                        eVar.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            ILogger logger = sentryAndroidOptions2.getLogger();
                                            ng1 = NG1.INFO;
                                            logger.d(ng1, "Could not retrieve ANR profile", th);
                                            if (!io.sentry.android.core.anr.f.a(file2)) {
                                                sentryAndroidOptions2.getLogger().a(ng1, "Could not delete ANR profile file", new Object[0]);
                                            }
                                        } catch (Throwable th2) {
                                            if (!io.sentry.android.core.anr.f.a(file2)) {
                                                sentryAndroidOptions2.getLogger().a(NG1.INFO, "Could not delete ANR profile file", new Object[0]);
                                            }
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        eVar.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } else {
                                i = -1;
                                sentryAndroidOptions2.getLogger().a(NG1.DEBUG, "No ANR profile file found", new Object[0]);
                                dVar = null;
                            }
                            if (!io.sentry.android.core.anr.f.a(file2)) {
                                sentryAndroidOptions2.getLogger().a(NG1.INFO, "Could not delete ANR profile file", new Object[0]);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            dVar = null;
                            ILogger logger2 = sentryAndroidOptions2.getLogger();
                            ng1 = NG1.INFO;
                            logger2.d(ng1, "Could not retrieve ANR profile", th);
                            if (!io.sentry.android.core.anr.f.a(file2)) {
                                sentryAndroidOptions2.getLogger().a(ng1, "Could not delete ANR profile file", new Object[0]);
                            }
                            if (dVar != null) {
                                sentryAndroidOptions2.getLogger().a(NG1.INFO, "ANR profile found", new Object[0]);
                                if (time >= dVar.b) {
                                    eg2 = eg2;
                                    z = zEquals;
                                    c4521c = c4521c3;
                                    sentryAndroidOptions = sentryAndroidOptions2;
                                    sentryAndroidOptions.getLogger().a(NG1.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                } else {
                                    eg2 = eg2;
                                    z = zEquals;
                                    c4521c = c4521c3;
                                    sentryAndroidOptions = sentryAndroidOptions2;
                                    sentryAndroidOptions.getLogger().a(NG1.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                }
                                if (eg2.A == null) {
                                    if (sentryAndroidOptions.isEnableAnrFingerprinting()) {
                                        eg2.g(Arrays.asList("{{ default }}", z ? "background-anr" : "foreground-anr"));
                                    } else {
                                        eg2.g(Arrays.asList("{{ default }}", z ? "background-anr" : "foreground-anr"));
                                    }
                                }
                                z2 = !z;
                                c4519aD = c4521c.d();
                                if (c4519aD == null) {
                                    c4519aD = new C4519a();
                                    c4521c.o(c4519aD);
                                }
                                if (c4519aD.o == null) {
                                    c4519aD.o = Boolean.valueOf(z2);
                                }
                            }
                            z = zEquals;
                            c4521c = c4521c3;
                            sentryAndroidOptions = sentryAndroidOptions2;
                            if (eg2.A == null) {
                                if (sentryAndroidOptions.isEnableAnrFingerprinting()) {
                                    eg2.g(Arrays.asList("{{ default }}", z ? "background-anr" : "foreground-anr"));
                                } else {
                                    eg2.g(Arrays.asList("{{ default }}", z ? "background-anr" : "foreground-anr"));
                                }
                            }
                            z2 = !z;
                            c4519aD = c4521c.d();
                            if (c4519aD == null) {
                                c4519aD = new C4519a();
                                c4521c.o(c4519aD);
                            }
                            if (c4519aD.o == null) {
                                c4519aD.o = Boolean.valueOf(z2);
                            }
                        }
                        io.sentry.android.core.anr.f.b(file2);
                        file = new File(file2, "anr_profile_old");
                    } catch (Throwable th6) {
                        th = th6;
                        i = -1;
                    }
                    if (dVar != null) {
                        z = zEquals;
                    } else {
                        sentryAndroidOptions2.getLogger().a(NG1.INFO, "ANR profile found", new Object[0]);
                        if (time >= dVar.b || time > dVar.c) {
                            eg2 = eg2;
                            z = zEquals;
                            c4521c = c4521c3;
                            sentryAndroidOptions = sentryAndroidOptions2;
                            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                        } else {
                            ArrayList<io.sentry.android.core.anr.g> arrayList6 = dVar.a;
                            ArrayList arrayList7 = io.sentry.android.core.anr.c.a;
                            if (arrayList6.isEmpty()) {
                                arrayList = arrayList6;
                                z3 = zEquals;
                            } else {
                                HashMap map3 = new HashMap();
                                for (io.sentry.android.core.anr.g gVar : arrayList6) {
                                    StackTraceElement[] stackTraceElementArr3 = gVar.d;
                                    if (stackTraceElementArr3.length >= 2) {
                                        int length2 = stackTraceElementArr3.length - 1;
                                        int i5 = i4;
                                        while (length2 >= 0) {
                                            StackTraceElement[] stackTraceElementArr4 = gVar.d;
                                            String className = stackTraceElementArr4[length2].getClassName();
                                            Iterator it2 = io.sentry.android.core.anr.c.a.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    arrayList2 = arrayList6;
                                                    i5++;
                                                    break;
                                                } else {
                                                    arrayList2 = arrayList6;
                                                    if (className.startsWith((String) it2.next())) {
                                                        break;
                                                    } else {
                                                        arrayList6 = arrayList2;
                                                    }
                                                }
                                            }
                                            float length3 = i5 / (stackTraceElementArr4.length - length2);
                                            io.sentry.android.core.anr.c.a aVar3 = new io.sentry.android.core.anr.c.a(stackTraceElementArr4, length2, stackTraceElementArr4.length - 1);
                                            io.sentry.android.core.anr.a aVar4 = (io.sentry.android.core.anr.a) map3.get(aVar3);
                                            if (aVar4 == null) {
                                                i2 = length2;
                                                map3.put(aVar3, new io.sentry.android.core.anr.a(stackTraceElementArr4, i2, stackTraceElementArr4.length - 1, gVar.e, length3));
                                            } else {
                                                i2 = length2;
                                                long j = aVar4.g;
                                                long j2 = gVar.e;
                                                aVar4.g = Math.min(j, j2);
                                                aVar4.h = Math.max(aVar4.h, j2);
                                                aVar4.f++;
                                            }
                                            map3 = map3;
                                            i5 = i5;
                                            i4 = 0;
                                            arrayList6 = arrayList2;
                                            length2 = i2 - 1;
                                            zEquals = zEquals;
                                        }
                                    }
                                }
                                arrayList = arrayList6;
                                z3 = zEquals;
                                HashMap map4 = map3;
                                if (!map4.isEmpty()) {
                                    aVar = (io.sentry.android.core.anr.a) Collections.max(map4.values(), new io.sentry.android.core.anr.b());
                                }
                                if (aVar == null) {
                                    z = z3;
                                } else {
                                    aVar2 = new io.sentry.protocol.profiling.a();
                                    arrayList3 = new ArrayList();
                                    map = new HashMap();
                                    arrayList4 = new ArrayList();
                                    map2 = new HashMap();
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        io.sentry.android.core.anr.g gVar2 = (io.sentry.android.core.anr.g) it.next();
                                        boolean z4 = z3;
                                        stackTraceElementArr2 = gVar2.d;
                                        SentryAndroidOptions sentryAndroidOptions3 = sentryAndroidOptions2;
                                        arrayList5 = new ArrayList();
                                        Iterator it3 = it;
                                        length = stackTraceElementArr2.length;
                                        i3 = 0;
                                        while (i3 < length) {
                                            stackTraceElement = stackTraceElementArr2[i3];
                                            int i6 = i3;
                                            StringBuilder sb2 = new StringBuilder();
                                            int i7 = length;
                                            sb2.append(stackTraceElement.getClassName());
                                            sb2.append("#");
                                            C4521c c4521c4 = c4521c3;
                                            sb2.append(stackTraceElement.getMethodName());
                                            sb2.append("#");
                                            sb2.append(stackTraceElement.getFileName());
                                            sb2.append("#");
                                            sb2.append(stackTraceElement.getLineNumber());
                                            string2 = sb2.toString();
                                            numValueOf2 = (Integer) map.get(string2);
                                            if (numValueOf2 == null) {
                                                numValueOf2 = Integer.valueOf(arrayList3.size());
                                                yVar = new io.sentry.protocol.y();
                                                yVar.h = stackTraceElement.getFileName();
                                                yVar.i = stackTraceElement.getMethodName();
                                                yVar.j = stackTraceElement.getClassName();
                                                if (stackTraceElement.getLineNumber() > 0) {
                                                    numValueOf3 = Integer.valueOf(stackTraceElement.getLineNumber());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                yVar.k = numValueOf3;
                                                if (stackTraceElement.isNativeMethod()) {
                                                    yVar.q = Boolean.TRUE;
                                                }
                                                arrayList3.add(yVar);
                                                map.put(string2, numValueOf2);
                                            }
                                            arrayList5.add(numValueOf2);
                                            i3 = i6 + 1;
                                            length = i7;
                                            c4521c3 = c4521c4;
                                        }
                                        C4521c c4521c5 = c4521c3;
                                        sb = new StringBuilder();
                                        for (Integer num : arrayList5) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(num);
                                        }
                                        string = sb.toString();
                                        numValueOf = (Integer) map2.get(string);
                                        if (numValueOf == null) {
                                            numValueOf = Integer.valueOf(arrayList4.size());
                                            arrayList4.add(new ArrayList(arrayList5));
                                            map2.put(string, numValueOf);
                                        }
                                        io.sentry.protocol.profiling.b bVar = new io.sentry.protocol.profiling.b();
                                        bVar.d = gVar2.e / 1000.0d;
                                        bVar.e = numValueOf.intValue();
                                        bVar.g = "0";
                                        aVar2.d.add(bVar);
                                        z3 = z4;
                                        sentryAndroidOptions2 = sentryAndroidOptions3;
                                        it = it3;
                                        c4521c3 = c4521c5;
                                    }
                                    z = z3;
                                    c4521c2 = c4521c3;
                                    sentryAndroidOptions = sentryAndroidOptions2;
                                    aVar2.g = arrayList3;
                                    aVar2.e = arrayList4;
                                    io.sentry.protocol.profiling.c cVar3 = new io.sentry.protocol.profiling.c();
                                    cVar3.d = "main";
                                    cVar3.e = 5;
                                    aVar2.h = Collections.singletonMap("0", cVar3);
                                    c1445Lh1 = new C1445Lh1(new io.sentry.protocol.u(), new io.sentry.protocol.u(), null, new HashMap(0), Double.valueOf(time / 1000.0d), "java", c.e);
                                    c1445Lh1.q = aVar2;
                                    if (io.sentry.protocol.u.e.equals(QF1.e().m(c1445Lh1))) {
                                        uVar = null;
                                    } else {
                                        uVar = c1445Lh1.e;
                                    }
                                    stackTraceElementArr = (StackTraceElement[]) Arrays.copyOfRange(aVar.c, aVar.d, aVar.e + 1);
                                    if (stackTraceElementArr.length > 0) {
                                        StackTraceElement stackTraceElement2 = stackTraceElementArr[0];
                                        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(stackTraceElement2.getClassName() + "." + stackTraceElement2.getMethodName());
                                        applicationNotResponding.setStackTrace(stackTraceElementArr);
                                        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
                                        lVar.d = "ANR";
                                        io.sentry.exception.a aVar5 = new io.sentry.exception.a(lVar, applicationNotResponding, null, false);
                                        FG1 fg1 = c.h;
                                        fg1.getClass();
                                        AtomicInteger atomicInteger = new AtomicInteger(i);
                                        HashSet hashSet = new HashSet();
                                        ArrayDeque arrayDeque = new ArrayDeque();
                                        fg1.a(aVar5, atomicInteger, hashSet, arrayDeque, null);
                                        eg2 = eg1;
                                        eg2.x = new H81(new ArrayList(arrayDeque));
                                        if (uVar != null) {
                                            c4521c = c4521c2;
                                            c4521c.l(Scopes.PROFILE, new C1522Mh1(uVar));
                                        }
                                    } else {
                                        eg2 = eg1;
                                    }
                                    c4521c = c4521c2;
                                }
                            }
                            aVar = null;
                            if (aVar == null) {
                                z = z3;
                            } else {
                                aVar2 = new io.sentry.protocol.profiling.a();
                                arrayList3 = new ArrayList();
                                map = new HashMap();
                                arrayList4 = new ArrayList();
                                map2 = new HashMap();
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    io.sentry.android.core.anr.g gVar3 = (io.sentry.android.core.anr.g) it.next();
                                    boolean z5 = z3;
                                    stackTraceElementArr2 = gVar3.d;
                                    SentryAndroidOptions sentryAndroidOptions4 = sentryAndroidOptions2;
                                    arrayList5 = new ArrayList();
                                    Iterator it4 = it;
                                    length = stackTraceElementArr2.length;
                                    i3 = 0;
                                    while (i3 < length) {
                                        stackTraceElement = stackTraceElementArr2[i3];
                                        int i8 = i3;
                                        StringBuilder sb3 = new StringBuilder();
                                        int i9 = length;
                                        sb3.append(stackTraceElement.getClassName());
                                        sb3.append("#");
                                        C4521c c4521c6 = c4521c3;
                                        sb3.append(stackTraceElement.getMethodName());
                                        sb3.append("#");
                                        sb3.append(stackTraceElement.getFileName());
                                        sb3.append("#");
                                        sb3.append(stackTraceElement.getLineNumber());
                                        string2 = sb3.toString();
                                        numValueOf2 = (Integer) map.get(string2);
                                        if (numValueOf2 == null) {
                                            numValueOf2 = Integer.valueOf(arrayList3.size());
                                            yVar = new io.sentry.protocol.y();
                                            yVar.h = stackTraceElement.getFileName();
                                            yVar.i = stackTraceElement.getMethodName();
                                            yVar.j = stackTraceElement.getClassName();
                                            if (stackTraceElement.getLineNumber() > 0) {
                                                numValueOf3 = Integer.valueOf(stackTraceElement.getLineNumber());
                                            } else {
                                                numValueOf3 = null;
                                            }
                                            yVar.k = numValueOf3;
                                            if (stackTraceElement.isNativeMethod()) {
                                                yVar.q = Boolean.TRUE;
                                            }
                                            arrayList3.add(yVar);
                                            map.put(string2, numValueOf2);
                                        }
                                        arrayList5.add(numValueOf2);
                                        i3 = i8 + 1;
                                        length = i9;
                                        c4521c3 = c4521c6;
                                    }
                                    C4521c c4521c7 = c4521c3;
                                    sb = new StringBuilder();
                                    while (r4.hasNext()) {
                                        if (sb.length() > 0) {
                                            sb.append(",");
                                        }
                                        sb.append(num);
                                    }
                                    string = sb.toString();
                                    numValueOf = (Integer) map2.get(string);
                                    if (numValueOf == null) {
                                        numValueOf = Integer.valueOf(arrayList4.size());
                                        arrayList4.add(new ArrayList(arrayList5));
                                        map2.put(string, numValueOf);
                                    }
                                    io.sentry.protocol.profiling.b bVar2 = new io.sentry.protocol.profiling.b();
                                    bVar2.d = gVar3.e / 1000.0d;
                                    bVar2.e = numValueOf.intValue();
                                    bVar2.g = "0";
                                    aVar2.d.add(bVar2);
                                    z3 = z5;
                                    sentryAndroidOptions2 = sentryAndroidOptions4;
                                    it = it4;
                                    c4521c3 = c4521c7;
                                }
                                z = z3;
                                c4521c2 = c4521c3;
                                sentryAndroidOptions = sentryAndroidOptions2;
                                aVar2.g = arrayList3;
                                aVar2.e = arrayList4;
                                io.sentry.protocol.profiling.c cVar4 = new io.sentry.protocol.profiling.c();
                                cVar4.d = "main";
                                cVar4.e = 5;
                                aVar2.h = Collections.singletonMap("0", cVar4);
                                c1445Lh1 = new C1445Lh1(new io.sentry.protocol.u(), new io.sentry.protocol.u(), null, new HashMap(0), Double.valueOf(time / 1000.0d), "java", c.e);
                                c1445Lh1.q = aVar2;
                                if (io.sentry.protocol.u.e.equals(QF1.e().m(c1445Lh1))) {
                                    uVar = null;
                                } else {
                                    uVar = c1445Lh1.e;
                                }
                                stackTraceElementArr = (StackTraceElement[]) Arrays.copyOfRange(aVar.c, aVar.d, aVar.e + 1);
                                if (stackTraceElementArr.length > 0) {
                                    StackTraceElement stackTraceElement3 = stackTraceElementArr[0];
                                    ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(stackTraceElement3.getClassName() + "." + stackTraceElement3.getMethodName());
                                    applicationNotResponding2.setStackTrace(stackTraceElementArr);
                                    io.sentry.protocol.l lVar2 = new io.sentry.protocol.l();
                                    lVar2.d = "ANR";
                                    io.sentry.exception.a aVar6 = new io.sentry.exception.a(lVar2, applicationNotResponding2, null, false);
                                    FG1 fg2 = c.h;
                                    fg2.getClass();
                                    AtomicInteger atomicInteger2 = new AtomicInteger(i);
                                    HashSet hashSet2 = new HashSet();
                                    ArrayDeque arrayDeque2 = new ArrayDeque();
                                    fg2.a(aVar6, atomicInteger2, hashSet2, arrayDeque2, null);
                                    eg2 = eg1;
                                    eg2.x = new H81(new ArrayList(arrayDeque2));
                                    if (uVar != null) {
                                        c4521c = c4521c2;
                                        c4521c.l(Scopes.PROFILE, new C1522Mh1(uVar));
                                    }
                                } else {
                                    eg2 = eg1;
                                }
                                c4521c = c4521c2;
                            }
                        }
                    }
                    c4521c = c4521c3;
                    sentryAndroidOptions = sentryAndroidOptions2;
                } else {
                    z = zEquals;
                    c4521c = c4521c3;
                    sentryAndroidOptions = sentryAndroidOptions2;
                }
            }
            if (eg2.A == null) {
                if (sentryAndroidOptions.isEnableAnrFingerprinting() || (arrayListC = eg2.c()) == null || arrayListC.isEmpty()) {
                    eg2.g(Arrays.asList("{{ default }}", z ? "background-anr" : "foreground-anr"));
                } else {
                    Iterator it5 = arrayListC.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            io.sentry.protocol.z zVar = ((io.sentry.protocol.s) it5.next()).i;
                            if (zVar != null && (list = zVar.d) != null && !list.isEmpty()) {
                                Iterator<io.sentry.protocol.y> it6 = list.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        io.sentry.protocol.y next = it6.next();
                                        Boolean bool = next.o;
                                        if (bool == null || !bool.booleanValue()) {
                                            String str = next.j;
                                            if (str != null) {
                                                Iterator it7 = io.sentry.android.core.anr.c.a.iterator();
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        if (str.startsWith((String) it7.next())) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        eg2.g(Arrays.asList("{{ default }}", z ? "background-anr" : "foreground-anr"));
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            eg2.g(Arrays.asList("system-frames-only-anr", z ? "background-anr" : "foreground-anr"));
                        }
                    }
                }
            }
            z2 = !z;
            c4519aD = c4521c.d();
            if (c4519aD == null) {
                c4519aD = new C4519a();
                c4521c.o(c4519aD);
            }
            if (c4519aD.o == null) {
                c4519aD.o = Boolean.valueOf(z2);
            }
        }

        @Override // io.sentry.android.core.C.b
        public final void c(@NotNull EG1 eg1, @NotNull io.sentry.hints.c cVar, @NotNull io.sentry.hints.c cVar2) {
            io.sentry.protocol.A a;
            ArrayList arrayList;
            boolean zEquals = cVar2 instanceof io.sentry.hints.a ? "anr_background".equals(((io.sentry.hints.a) cVar2).g()) : false;
            C c = C.this;
            c.getClass();
            if (eg1.l == null) {
                eg1.l = "java";
            }
            if (eg1.c() != null) {
                return;
            }
            io.sentry.protocol.l lVar = new io.sentry.protocol.l();
            if (cVar.b()) {
                lVar.d = "AppExitInfo";
            } else {
                lVar.d = "HistoricalAppExitInfo";
            }
            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(zEquals ? "Background ANR" : "ANR", Thread.currentThread());
            ArrayList arrayListD = eg1.d();
            if (arrayListD == null) {
                a = null;
                break;
            }
            Iterator it = arrayListD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    a = null;
                    break;
                }
                a = (io.sentry.protocol.A) it.next();
                String str = a.g;
                if (str != null && str.equals("main")) {
                    break;
                }
            }
            if (a == null) {
                a = new io.sentry.protocol.A();
                a.m = new io.sentry.protocol.z();
            }
            c.h.getClass();
            io.sentry.protocol.z zVar = a.m;
            if (zVar == null) {
                arrayList = new ArrayList(0);
            } else {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(FG1.b(applicationNotResponding, lVar, a.d, zVar.d, true));
                arrayList = arrayList2;
            }
            eg1.x = new H81(arrayList);
        }
    }

    public interface b {
        boolean a(@NotNull io.sentry.hints.c cVar);

        void b(@NotNull EG1 eg1, @NotNull io.sentry.hints.c cVar, @NotNull io.sentry.hints.c cVar2);

        void c(@NotNull EG1 eg1, @NotNull io.sentry.hints.c cVar, @NotNull io.sentry.hints.c cVar2);
    }

    public C(@NotNull Context context, @NotNull E e, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
        this.e = sentryAndroidOptions;
        this.g = e;
        this.i = sentryAndroidOptions.findPersistingScopeObserver();
        this.h = new FG1(new C6740tH1(sentryAndroidOptions));
    }

    @Nullable
    public final <T> T a(@NotNull C2688aH1 c2688aH1, @NotNull String str, @NotNull Class<T> cls) {
        io.sentry.cache.m mVar = this.i;
        if (mVar == null) {
            return null;
        }
        return (T) mVar.d(c2688aH1, str, cls);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0394  */
    @Override // defpackage.N80
    @Nullable
    public final EG1 f(@NotNull EG1 eg1, @NotNull C0841Do0 c0841Do0) {
        b next;
        io.sentry.hints.c cVar;
        b bVar;
        File[] fileArr;
        String strA;
        String str;
        DisplayMetrics displayMetrics;
        String strA2;
        Object objB = c0841Do0.b("sentry:typeCheckHint");
        boolean z = objB instanceof io.sentry.hints.c;
        SentryAndroidOptions sentryAndroidOptions = this.e;
        if (!z) {
            sentryAndroidOptions.getLogger().a(NG1.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return eg1;
        }
        io.sentry.hints.c cVar2 = (io.sentry.hints.c) objB;
        Iterator<b> it = this.j.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.a((io.sentry.hints.c) objB));
        if (next != null) {
            next.c(eg1, cVar2, (io.sentry.hints.c) objB);
        }
        C4521c c4521c = eg1.e;
        io.sentry.protocol.n nVarG = c4521c.g();
        Context context = this.d;
        c4521c.t(J.c(context, sentryAndroidOptions).g);
        if (nVarG != null) {
            String str2 = nVarG.d;
            c4521c.l((str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT), nVarG);
        }
        C4523e c4523eE = c4521c.e();
        String str3 = "Error getting installationId.";
        E e = this.g;
        if (c4523eE == null) {
            C4523e c4523e = new C4523e();
            c4523e.e = Build.MANUFACTURER;
            c4523e.g = Build.BRAND;
            c4523e.h = F.a(sentryAndroidOptions.getLogger());
            c4523e.i = Build.MODEL;
            c4523e.j = Build.ID;
            c4523e.k = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo memoryInfoB = F.b(context, sentryAndroidOptions.getLogger());
            if (memoryInfoB != null) {
                c4523e.q = Long.valueOf(memoryInfoB.totalMem);
            }
            c4523e.p = e.a();
            ILogger logger = sentryAndroidOptions.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th) {
                logger.d(NG1.ERROR, "Error getting DisplayMetrics.", th);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                c4523e.y = Integer.valueOf(displayMetrics.widthPixels);
                c4523e.z = Integer.valueOf(displayMetrics.heightPixels);
                c4523e.A = Float.valueOf(displayMetrics.density);
                c4523e.B = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (c4523e.E == null) {
                try {
                    strA2 = N.a(context);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting installationId.", th2);
                    strA2 = null;
                }
                c4523e.E = strA2;
            }
            ArrayList arrayListA = io.sentry.android.core.internal.util.h.c.a();
            if (!arrayListA.isEmpty()) {
                c4523e.J = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                c4523e.I = Integer.valueOf(arrayListA.size());
            }
            c4521c.q(c4523e);
        }
        if (!cVar2.b()) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return eg1;
        }
        if (eg1.h == null) {
            eg1.h = (io.sentry.protocol.o) a(sentryAndroidOptions, "request.json", io.sentry.protocol.o.class);
        }
        if (eg1.m == null) {
            eg1.m = (io.sentry.protocol.F) a(sentryAndroidOptions, "user.json", io.sentry.protocol.F.class);
        }
        Map map = (Map) a(sentryAndroidOptions, "tags.json", Map.class);
        if (map != null) {
            if (eg1.i == null) {
                eg1.i = new HashMap(new HashMap(map));
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    if (!eg1.i.containsKey(entry.getKey())) {
                        eg1.b((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        List list = (List) a(sentryAndroidOptions, "breadcrumbs.json", List.class);
        if (list != null) {
            List<C0702Bu> list2 = eg1.q;
            if (list2 == null) {
                eg1.q = new ArrayList(list);
            } else {
                list2.addAll(list);
            }
        }
        Map map2 = (Map) a(sentryAndroidOptions, "extras.json", Map.class);
        if (map2 != null) {
            if (eg1.s == null) {
                eg1.s = new HashMap(new HashMap(map2));
            } else {
                Iterator it2 = map2.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    Iterator it3 = it2;
                    if (!eg1.s.containsKey(entry2.getKey())) {
                        eg1.s.put((String) entry2.getKey(), entry2.getValue());
                    }
                    it2 = it3;
                }
            }
        }
        C4521c c4521c2 = (C4521c) a(sentryAndroidOptions, "contexts.json", C4521c.class);
        if (c4521c2 != null) {
            Iterator<Map.Entry<String, Object>> it4 = new C4521c(c4521c2).d.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry<String, Object> next2 = it4.next();
                Object value = next2.getValue();
                Iterator<Map.Entry<String, Object>> it5 = it4;
                Object obj = objB;
                if ((!"trace".equals(next2.getKey()) || !(value instanceof C3561eO1)) && !c4521c.a(next2.getKey())) {
                    c4521c.l(next2.getKey(), value);
                }
                it4 = it5;
                objB = obj;
            }
        }
        Object obj2 = objB;
        String str4 = (String) a(sentryAndroidOptions, "transaction.json", String.class);
        if (eg1.z == null) {
            eg1.z = str4;
        }
        List<String> list3 = (List) a(sentryAndroidOptions, "fingerprint.json", List.class);
        if (eg1.A == null) {
            eg1.g(list3);
        }
        NG1 ng1 = (NG1) a(sentryAndroidOptions, "level.json", NG1.class);
        if (eg1.y == null) {
            eg1.y = ng1;
        }
        C3561eO1 c3561eO1 = (C3561eO1) a(sentryAndroidOptions, "trace.json", C3561eO1.class);
        if (c4521c.j() == null && c3561eO1 != null) {
            c4521c.x(c3561eO1);
        }
        String str5 = (String) a(sentryAndroidOptions, "replay.json", String.class);
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            cVar = cVar2;
            bVar = next;
        } else {
            cVar = cVar2;
            bVar = next;
            if (!new File(cacheDirPath, C5491nL.c("replay_", str5)).exists()) {
                String str6 = (String) io.sentry.cache.c.c(sentryAndroidOptions, ".options-cache", "replay-error-sample-rate.json", String.class);
                if (str6 != null) {
                    try {
                        if (Double.parseDouble(str6) < io.sentry.util.v.a().c()) {
                            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", eg1.d);
                        } else {
                            File[] fileArrListFiles = new File(cacheDirPath).listFiles();
                            if (fileArrListFiles != null) {
                                int length = fileArrListFiles.length;
                                long jLastModified = Long.MIN_VALUE;
                                int i = 0;
                                String strSubstring = null;
                                while (i < length) {
                                    File file = fileArrListFiles[i];
                                    if (file.isDirectory()) {
                                        fileArr = fileArrListFiles;
                                        if (file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= ((Date) eg1.t.clone()).getTime()) {
                                            jLastModified = file.lastModified();
                                            strSubstring = file.getName().substring(7);
                                        }
                                    } else {
                                        fileArr = fileArrListFiles;
                                    }
                                    i++;
                                    fileArrListFiles = fileArr;
                                }
                                str5 = strSubstring;
                            } else {
                                str5 = null;
                            }
                            if (str5 != null) {
                                Charset charset = io.sentry.cache.m.c;
                                io.sentry.cache.c.d(sentryAndroidOptions, str5, ".scope-cache", "replay.json");
                                c4521c.l("replay_id", str5);
                            }
                        }
                    } catch (Throwable th3) {
                        sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error parsing replay sample rate.", th3);
                    }
                }
            } else if (str5 != null) {
                Charset charset2 = io.sentry.cache.m.c;
                io.sentry.cache.c.d(sentryAndroidOptions, str5, ".scope-cache", "replay.json");
                c4521c.l("replay_id", str5);
            }
        }
        if (eg1.j == null) {
            eg1.j = (String) io.sentry.cache.c.c(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (eg1.k == null) {
            String environment = (String) io.sentry.cache.c.c(sentryAndroidOptions, ".options-cache", "environment.json", String.class);
            if (environment == null) {
                environment = sentryAndroidOptions.getEnvironment();
            }
            eg1.k = environment;
        }
        if (eg1.p == null) {
            eg1.p = (String) io.sentry.cache.c.c(sentryAndroidOptions, ".options-cache", "dist.json", String.class);
        }
        if (eg1.p == null && (str = (String) io.sentry.cache.c.c(sentryAndroidOptions, ".options-cache", "release.json", String.class)) != null) {
            try {
                eg1.p = str.substring(str.indexOf(43) + 1);
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().a(NG1.WARNING, "Failed to parse release from scope cache: %s", str);
            }
        }
        C4522d c4522d = eg1.r;
        if (c4522d == null) {
            c4522d = new C4522d();
        }
        if (c4522d.e == null) {
            c4522d.e = new ArrayList(new ArrayList());
        }
        List<DebugImage> list4 = c4522d.e;
        if (list4 != null) {
            String str7 = (String) io.sentry.cache.c.c(sentryAndroidOptions, ".options-cache", "proguard-uuid.json", String.class);
            if (str7 != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str7);
                list4.add(debugImage);
            }
            eg1.r = c4522d;
        } else {
            str3 = "Error getting installationId.";
        }
        if (eg1.g == null) {
            eg1.g = (io.sentry.protocol.r) io.sentry.cache.c.c(sentryAndroidOptions, ".options-cache", "sdk-version.json", io.sentry.protocol.r.class);
        }
        C4519a c4519aD = c4521c.d();
        if (c4519aD == null) {
            c4519aD = new C4519a();
        }
        C4519a c4519a = c4519aD;
        c4519a.i = F.c.a(context);
        PackageInfo packageInfoC = F.c(context, e);
        if (packageInfoC != null) {
            c4519a.d = packageInfoC.packageName;
        }
        String str8 = eg1.j;
        if (str8 == null) {
            str8 = (String) io.sentry.cache.c.c(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (str8 != null) {
            try {
                String strSubstring2 = str8.substring(str8.indexOf(64) + 1, str8.indexOf(43));
                String strSubstring3 = str8.substring(str8.indexOf(43) + 1);
                c4519a.j = strSubstring2;
                c4519a.k = strSubstring3;
            } catch (Throwable unused2) {
                sentryAndroidOptions.getLogger().a(NG1.WARNING, "Failed to parse release from scope cache: %s", str8);
            }
        }
        try {
            F.b bVar2 = J.c(context, sentryAndroidOptions).f;
            if (bVar2 != null) {
                c4519a.p = Boolean.valueOf(bVar2.a);
                String[] strArr = bVar2.b;
                if (strArr != null) {
                    c4519a.q = Arrays.asList(strArr);
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting split apks info.", th4);
        }
        c4521c.o(c4519a);
        Map map3 = (Map) io.sentry.cache.c.c(sentryAndroidOptions, ".options-cache", "tags.json", Map.class);
        if (map3 != null) {
            if (eg1.i == null) {
                eg1.i = new HashMap(new HashMap(map3));
            } else {
                for (Map.Entry entry3 : map3.entrySet()) {
                    if (!eg1.i.containsKey(entry3.getKey())) {
                        eg1.b((String) entry3.getKey(), (String) entry3.getValue());
                    }
                }
            }
        }
        io.sentry.protocol.F f = eg1.m;
        if (f == null) {
            f = new io.sentry.protocol.F();
            eg1.m = f;
        }
        io.sentry.protocol.F f2 = f;
        if (f2.e == null) {
            try {
                strA = N.a(context);
            } catch (Throwable th5) {
                sentryAndroidOptions.getLogger().d(NG1.ERROR, str3, th5);
                strA = null;
            }
            f2.e = strA;
        }
        if (f2.h == null && sentryAndroidOptions.isSendDefaultPii()) {
            f2.h = "{{auto}}";
        }
        try {
            F.a aVar = J.c(context, sentryAndroidOptions).e;
            if (aVar != null) {
                HashMap map4 = new HashMap();
                map4.put("isSideLoaded", String.valueOf(aVar.a));
                String str9 = aVar.b;
                if (str9 != null) {
                    map4.put("installerStore", str9);
                }
                for (Map.Entry entry4 : map4.entrySet()) {
                    eg1.b((String) entry4.getKey(), (String) entry4.getValue());
                }
            }
        } catch (Throwable th6) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting side loaded info.", th6);
        }
        if (bVar != null) {
            bVar.b(eg1, cVar, (io.sentry.hints.c) obj2);
        }
        return eg1;
    }

    @Override // defpackage.N80
    @NotNull
    public final io.sentry.protocol.B g(@NotNull io.sentry.protocol.B b2, @NotNull C0841Do0 c0841Do0) {
        return b2;
    }
}
