package defpackage;

import android.annotation.SuppressLint;
import android.net.TrafficStats;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Wd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2296Wd0 implements InterfaceC2400Xd0 {
    public static final Object m = new Object();
    public final C1198Id0 a;
    public final C1980Sd0 b;
    public final C7019ud1 c;
    public final Bc2 d;
    public final C3980gO0<C3047bw0> e;
    public final C5586nm1 f;
    public final Object g;
    public final ExecutorService h;
    public final LH1 i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C2296Wd0() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C2296Wd0(final C1198Id0 c1198Id0, @NonNull InterfaceC1612Nk1 interfaceC1612Nk1, @NonNull ExecutorService executorService, @NonNull LH1 lh1) {
        c1198Id0.a();
        C1980Sd0 c1980Sd0 = new C1980Sd0(c1198Id0.a, interfaceC1612Nk1);
        C7019ud1 c7019ud1 = new C7019ud1(c1198Id0);
        if (ED.l == null) {
            ED.l = new ED();
        }
        ED ed = ED.l;
        if (Bc2.d == null) {
            Bc2.d = new Bc2(ed);
        }
        Bc2 bc2 = Bc2.d;
        C3980gO0<C3047bw0> c3980gO0 = new C3980gO0<>(new InterfaceC1612Nk1() { // from class: Td0
            @Override // defpackage.InterfaceC1612Nk1
            public final Object get() {
                return new C3047bw0(c1198Id0);
            }
        });
        C5586nm1 c5586nm1 = new C5586nm1();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = c1198Id0;
        this.b = c1980Sd0;
        this.c = c7019ud1;
        this.d = bc2;
        this.e = c3980gO0;
        this.f = c5586nm1;
        this.h = executorService;
        this.i = lh1;
    }

    public final void a() {
        C0996Fo c0996FoC;
        synchronized (m) {
            try {
                C1198Id0 c1198Id0 = this.a;
                c1198Id0.a();
                NO noA = NO.a(c1198Id0.a);
                try {
                    c0996FoC = this.c.c();
                    C7019ud1.a aVar = C7019ud1.a.e;
                    C7019ud1.a aVar2 = c0996FoC.c;
                    if (aVar2 == aVar || aVar2 == C7019ud1.a.d) {
                        String strD = d(c0996FoC);
                        C7019ud1 c7019ud1 = this.c;
                        C0996Fo.a aVarH = c0996FoC.h();
                        aVarH.a = strD;
                        aVarH.b = C7019ud1.a.g;
                        c0996FoC = aVarH.a();
                        c7019ud1.b(c0996FoC);
                    }
                    if (noA != null) {
                        noA.c();
                    }
                } catch (Throwable th) {
                    if (noA != null) {
                        noA.c();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g(c0996FoC);
        this.i.execute(new RunnableC3128cK(this, 1));
    }

    public final C0996Fo b(@NonNull C0996Fo c0996Fo) {
        HttpURLConnection httpURLConnectionC;
        C1700Oo c1700OoF;
        C1198Id0 c1198Id0 = this.a;
        c1198Id0.a();
        String str = c1198Id0.c.a;
        String str2 = c0996Fo.b;
        C1198Id0 c1198Id1 = this.a;
        c1198Id1.a();
        String str3 = c1198Id1.c.g;
        String str4 = c0996Fo.e;
        C1980Sd0 c1980Sd0 = this.b;
        C1010Fs1 c1010Fs1 = c1980Sd0.c;
        if (!c1010Fs1.a()) {
            throw new C2478Yd0("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = C1980Sd0.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new C2478Yd0("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = c1980Sd0.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    C1980Sd0.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    c1010Fs1.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c1700OoF = C1980Sd0.f(httpURLConnectionC);
                        break;
                    }
                    C1980Sd0.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        C1700Oo.a aVarA = AbstractC3690f02.a();
                        aVarA.c = AbstractC3690f02.b.g;
                        c1700OoF = aVarA.a();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new C2478Yd0("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        b0.c("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C1700Oo.a aVarA2 = AbstractC3690f02.a();
                        aVarA2.c = AbstractC3690f02.b.e;
                        c1700OoF = aVarA2.a();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iOrdinal = c1700OoF.c.ordinal();
        if (iOrdinal == 0) {
            Bc2 bc2 = this.d;
            bc2.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bc2.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C0996Fo.a aVarH = c0996Fo.h();
            aVarH.c = c1700OoF.a;
            aVarH.e = Long.valueOf(c1700OoF.b);
            aVarH.f = Long.valueOf(seconds);
            return aVarH.a();
        }
        if (iOrdinal == 1) {
            C0996Fo.a aVarH2 = c0996Fo.h();
            aVarH2.g = "BAD CONFIG";
            aVarH2.b = C7019ud1.a.i;
            return aVarH2.a();
        }
        if (iOrdinal != 2) {
            throw new C2478Yd0("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.j = null;
        }
        C0996Fo.a aVarH3 = c0996Fo.h();
        aVarH3.b = C7019ud1.a.e;
        return aVarH3.a();
    }

    public final void c() {
        C1198Id0 c1198Id0 = this.a;
        c1198Id0.a();
        Preconditions.checkNotEmpty(c1198Id0.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c1198Id0.a();
        Preconditions.checkNotEmpty(c1198Id0.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c1198Id0.a();
        Preconditions.checkNotEmpty(c1198Id0.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c1198Id0.a();
        String str = c1198Id0.c.b;
        Pattern pattern = Bc2.c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c1198Id0.a();
        Preconditions.checkArgument(Bc2.c.matcher(c1198Id0.c.a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: all -> 0x0040, DONT_GENERATE, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x002f, B:11:0x0031, B:15:0x003e, B:19:0x0042, B:20:0x0046, B:28:0x005a, B:12:0x0032, B:13:0x003b), top: B:33:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x002f, B:11:0x0031, B:15:0x003e, B:19:0x0042, B:20:0x0046, B:28:0x005a, B:12:0x0032, B:13:0x003b), top: B:33:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public final String d(C0996Fo c0996Fo) {
        C3047bw0 c3047bw0;
        String string;
        C1198Id0 c1198Id0 = this.a;
        c1198Id0.a();
        if (!c1198Id0.b.equals("CHIME_ANDROID_SDK")) {
            C1198Id0 c1198Id1 = this.a;
            c1198Id1.a();
            if ("[DEFAULT]".equals(c1198Id1.b)) {
                if (c0996Fo.c == C7019ud1.a.d) {
                    c3047bw0 = this.e.get();
                    synchronized (c3047bw0.a) {
                        try {
                            synchronized (c3047bw0.a) {
                                string = c3047bw0.a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = c3047bw0.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return C5586nm1.a();
                }
            }
        } else if (c0996Fo.c == C7019ud1.a.d) {
            c3047bw0 = this.e.get();
            synchronized (c3047bw0.a) {
                synchronized (c3047bw0.a) {
                    string = c3047bw0.a.getString("|S|id", null);
                    if (string != null) {
                        string = c3047bw0.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return C5586nm1.a();
                }
            }
        }
        this.f.getClass();
        return C5586nm1.a();
    }

    public final C0996Fo e(C0996Fo c0996Fo) {
        C7691xo c7691xoE;
        String str = c0996Fo.b;
        String string = null;
        if (str != null && str.length() == 11) {
            C3047bw0 c3047bw0 = this.e.get();
            synchronized (c3047bw0.a) {
                try {
                    String[] strArr = C3047bw0.c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = c3047bw0.a.getString("|T|" + c3047bw0.b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C1980Sd0 c1980Sd0 = this.b;
        C1198Id0 c1198Id0 = this.a;
        c1198Id0.a();
        String str3 = c1198Id0.c.a;
        String str4 = c0996Fo.b;
        C1198Id0 c1198Id1 = this.a;
        c1198Id1.a();
        String str5 = c1198Id1.c.g;
        C1198Id0 c1198Id2 = this.a;
        c1198Id2.a();
        String str6 = c1198Id2.c.b;
        C1010Fs1 c1010Fs1 = c1980Sd0.c;
        if (!c1010Fs1.a()) {
            throw new C2478Yd0("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = C1980Sd0.a("projects/" + str5 + "/installations");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new C2478Yd0("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = c1980Sd0.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C1980Sd0.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    c1010Fs1.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c7691xoE = C1980Sd0.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    C1980Sd0.b(httpURLConnectionC, str6, str3, str5);
                    if (responseCode == 429) {
                        throw new C2478Yd0("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        b0.c("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C7691xo c7691xo = new C7691xo(null, null, null, null, QA0.a.e);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c7691xoE = c7691xo;
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
        int iOrdinal = c7691xoE.e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new C2478Yd0("Firebase Installations Service is unavailable. Please try again later.");
            }
            C0996Fo.a aVarH = c0996Fo.h();
            aVarH.g = "BAD CONFIG";
            aVarH.b = C7019ud1.a.i;
            return aVarH.a();
        }
        String str7 = c7691xoE.b;
        String str8 = c7691xoE.c;
        Bc2 bc2 = this.d;
        bc2.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bc2.a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        C1700Oo c1700Oo = c7691xoE.d;
        String str9 = c1700Oo.a;
        long j = c1700Oo.b;
        C0996Fo.a aVarH2 = c0996Fo.h();
        aVarH2.a = str7;
        aVarH2.b = C7019ud1.a.h;
        aVarH2.c = str9;
        aVarH2.d = str8;
        aVarH2.e = Long.valueOf(j);
        aVarH2.f = Long.valueOf(seconds);
        return aVarH2.a();
    }

    public final void f(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((JP1) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(C0996Fo c0996Fo) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((JP1) it.next()).b(c0996Fo)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2400Xd0
    @NonNull
    public final Task<String> getId() {
        String str;
        c();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C4060gl0 c4060gl0 = new C4060gl0(taskCompletionSource);
        synchronized (this.g) {
            this.l.add(c4060gl0);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.h.execute(new RunnableC2136Ud0(this, 0));
        return task;
    }

    @Override // defpackage.InterfaceC2400Xd0
    @NonNull
    public final Task getToken() {
        c();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C1297Jk0 c1297Jk0 = new C1297Jk0(this.d, taskCompletionSource);
        synchronized (this.g) {
            this.l.add(c1297Jk0);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new RunnableC2214Vd0(this, 0));
        return task;
    }
}
