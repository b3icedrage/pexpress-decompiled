package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.bottomsheet.b;
import defpackage.C6179qd0;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.A;
import io.sentry.android.replay.e;
import io.sentry.android.replay.i;
import io.sentry.android.replay.j;
import io.sentry.android.replay.k;
import io.sentry.android.replay.l;
import io.sentry.cache.m;
import io.sentry.protocol.u;
import io.sentry.util.f;
import io.sentry.util.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: dq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3446dq implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC3446dq(C2052Tb0 c2052Tb0, Intent intent) {
        this.d = 1;
        this.e = intent;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v4 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        File file;
        Throwable th;
        Date dateI;
        C2912bH1.b bVarValueOf;
        String str;
        e eVar;
        Collection linkedList;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq = (ViewOnTouchListenerC3656eq) obj;
                viewOnTouchListenerC3656eq.startAnimation(viewOnTouchListenerC3656eq.d);
                return;
            case 1:
                C2052Tb0.a((Intent) obj);
                return;
            case 2:
                DialogInterface dialogInterface = (DialogInterface) obj;
                Intrinsics.c(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ((b) dialogInterface).f().C(3);
                return;
            case 3:
                AFLogger.AFKeystoreWrapper((AFLoggerBase[]) obj);
                return;
            default:
                ReplayIntegration replayIntegration = (ReplayIntegration) obj;
                C2688aH1 c2688aH1 = replayIntegration.h;
                if (c2688aH1 == null) {
                    Intrinsics.l("options");
                    throw null;
                }
                m mVarFindPersistingScopeObserver = c2688aH1.findPersistingScopeObserver();
                if (mVarFindPersistingScopeObserver != null) {
                    C2688aH1 c2688aH2 = replayIntegration.h;
                    if (c2688aH2 == null) {
                        Intrinsics.l("options");
                        throw null;
                    }
                    String str2 = (String) mVarFindPersistingScopeObserver.d(c2688aH2, "replay.json", String.class);
                    if (str2 != null) {
                        u replayId = new u(str2);
                        if (replayId.equals(u.e)) {
                            replayIntegration.u("");
                            return;
                        }
                        C2688aH1 options = replayIntegration.h;
                        if (options == null) {
                            Intrinsics.l("options");
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(options, "options");
                        Intrinsics.checkNotNullParameter(replayId, "replayId");
                        Intrinsics.checkNotNullParameter(options, "options");
                        Intrinsics.checkNotNullParameter(replayId, "replayId");
                        String cacheDirPath = options.getCacheDirPath();
                        if (cacheDirPath == null || cacheDirPath.length() == 0) {
                            options.getLogger().a(NG1.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                            file = null;
                        } else {
                            String cacheDirPath2 = options.getCacheDirPath();
                            Intrinsics.checkNotNull(cacheDirPath2);
                            file = new File(cacheDirPath2, "replay_" + replayId);
                            file.mkdirs();
                        }
                        File file2 = new File(file, ".ongoing_segment");
                        if (file2.exists()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), Charsets.UTF_8), 8192);
                            try {
                                Iterator it = C0648Bc.h(bufferedReader).iterator();
                                while (it.hasNext()) {
                                    List listSplit$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 2, 2, null);
                                    linkedHashMap.put((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                                }
                                th = null;
                                bufferedReader.close();
                                String str3 = (String) linkedHashMap.get("config.height");
                                Integer intOrNull = str3 != null ? StringsKt.toIntOrNull(str3) : null;
                                String str4 = (String) linkedHashMap.get("config.width");
                                Integer intOrNull2 = str4 != null ? StringsKt.toIntOrNull(str4) : null;
                                String str5 = (String) linkedHashMap.get("config.frame-rate");
                                Integer intOrNull3 = str5 != null ? StringsKt.toIntOrNull(str5) : null;
                                String str6 = (String) linkedHashMap.get("config.bit-rate");
                                Integer intOrNull4 = str6 != null ? StringsKt.toIntOrNull(str6) : null;
                                String str7 = (String) linkedHashMap.get("segment.id");
                                Integer intOrNull5 = str7 != null ? StringsKt.toIntOrNull(str7) : null;
                                try {
                                    String str8 = (String) linkedHashMap.get("segment.timestamp");
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    dateI = N7.j(str8);
                                } catch (Throwable unused) {
                                    dateI = null;
                                }
                                try {
                                    String str9 = (String) linkedHashMap.get("replay.type");
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    bVarValueOf = C2912bH1.b.valueOf(str9);
                                } catch (Throwable unused2) {
                                    bVarValueOf = null;
                                }
                                if (intOrNull == null || intOrNull2 == null || intOrNull3 == null || intOrNull4 == null || intOrNull5 == null) {
                                    str = "options";
                                } else {
                                    Integer num = intOrNull;
                                    str = "options";
                                    if (intOrNull5.intValue() != -1 && dateI != null && bVarValueOf != null) {
                                        io.sentry.android.replay.u uVar = new io.sentry.android.replay.u(intOrNull2.intValue(), num.intValue(), 1.0f, 1.0f, intOrNull3.intValue(), intOrNull4.intValue());
                                        final k kVar = new k(options, replayId);
                                        File fileG = kVar.g();
                                        if (fileG != null) {
                                            fileG.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.h
                                                @Override // java.io.FilenameFilter
                                                public final boolean accept(File file3, String str10) {
                                                    Intrinsics.checkNotNull(str10);
                                                    if (kotlin.text.d.h(str10, ".jpg", false)) {
                                                        File file4 = new File(file3, str10);
                                                        Long lC0 = StringsKt.c0(C6179qd0.f(file4));
                                                        if (lC0 != null) {
                                                            kVar.c(file4, lC0.longValue(), null);
                                                        }
                                                    }
                                                    return false;
                                                }
                                            });
                                        }
                                        ArrayList arrayList = kVar.m;
                                        if (arrayList.isEmpty()) {
                                            options.getLogger().a(NG1.DEBUG, "No frames found for replay: %s, deleting the replay", replayId);
                                            f.a(file);
                                        } else {
                                            if (arrayList.size() > 1) {
                                                C2680aF.n(arrayList, new i());
                                            }
                                            C2912bH1.b bVar = C2912bH1.b.SESSION;
                                            int iIntValue = bVarValueOf == bVar ? intOrNull5.intValue() : 0;
                                            if (bVarValueOf != bVar) {
                                                dateI = N7.i(((l) CollectionsKt.F(arrayList)).b);
                                                Intrinsics.checkNotNull(dateI);
                                            }
                                            Date date = dateI;
                                            long time = (((l) CollectionsKt.L(arrayList)).b - date.getTime()) + ((long) (CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT / intOrNull3.intValue()));
                                            String str10 = (String) linkedHashMap.get("replay.recording");
                                            if (str10 != null) {
                                                C2257Vr1 c2257Vr1 = (C2257Vr1) options.getSerializer().d(new StringReader(str10), C2257Vr1.class);
                                                if ((c2257Vr1 != null ? c2257Vr1.e : null) != null) {
                                                    List<? extends io.sentry.rrweb.b> list = c2257Vr1.e;
                                                    Intrinsics.checkNotNull(list);
                                                    linkedList = new LinkedList(list);
                                                } else {
                                                    linkedList = null;
                                                }
                                                if (linkedList == null) {
                                                    linkedList = C5653o60.d;
                                                }
                                            } else {
                                                linkedList = C5653o60.d;
                                            }
                                            eVar = new e(uVar, kVar, date, iIntValue, time, bVarValueOf, (String) linkedHashMap.get("replay.screen-at-start"), CollectionsKt.Z(linkedList, new j()));
                                        }
                                    }
                                    eVar = null;
                                }
                                options.getLogger().a(NG1.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                                f.a(file);
                                eVar = null;
                                break;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    C6621sj.b(bufferedReader, th2);
                                    throw th3;
                                }
                            }
                        } else {
                            options.getLogger().a(NG1.DEBUG, "No ongoing segment found for replay: %s", replayId);
                            f.a(file);
                            str = "options";
                            eVar = null;
                            th = null;
                        }
                        if (eVar == null) {
                            replayIntegration.u("");
                            return;
                        }
                        C2688aH1 c2688aH3 = replayIntegration.h;
                        if (c2688aH3 == null) {
                            Intrinsics.l(str);
                            throw th;
                        }
                        Object objD = mVarFindPersistingScopeObserver.d(c2688aH3, "breadcrumbs.json", List.class);
                        ?? r21 = objD instanceof List ? (List) objD : th;
                        SD1 sd1 = replayIntegration.i;
                        C2688aH1 c2688aH4 = replayIntegration.h;
                        if (c2688aH4 == null) {
                            Intrinsics.l(str);
                            throw th;
                        }
                        io.sentry.android.replay.u uVar2 = eVar.a;
                        A.b bVarA = A.a.a(sd1, c2688aH4, eVar.e, eVar.c, replayId, eVar.d, uVar2.b, uVar2.a, eVar.f, eVar.b, uVar2.e, uVar2.f, eVar.g, r21, new LinkedList(eVar.h));
                        if (bVarA instanceof A.b.a) {
                            C0841Do0 hint = g.a(new ReplayIntegration.a());
                            A.b.a aVar = (A.b.a) bVarA;
                            SD1 sd2 = replayIntegration.i;
                            Intrinsics.checkNotNull(hint);
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(hint, "hint");
                            if (sd2 != null) {
                                hint.g = aVar.b;
                                Unit unit = Unit.a;
                                sd2.v(aVar.a, hint);
                            }
                        }
                        replayIntegration.u(str2);
                        return;
                    }
                }
                replayIntegration.u("");
                return;
        }
    }

    public /* synthetic */ RunnableC3446dq(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
