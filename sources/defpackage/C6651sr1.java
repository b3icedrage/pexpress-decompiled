package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: renamed from: sr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class C6651sr1 {
    public static final Clock j = DefaultClock.getInstance();
    public static final Random k = new Random();
    public final HashMap a;
    public final Context b;
    public final Executor c;
    public final C1198Id0 d;
    public final InterfaceC2400Xd0 e;
    public final C0574Ad0 f;
    public final InterfaceC1612Nk1<InterfaceC5746oa> g;
    public final String h;
    public final HashMap i;

    public C6651sr1() {
        throw null;
    }

    public C6651sr1(Context context, @InterfaceC3246ct Executor executor, C1198Id0 c1198Id0, InterfaceC2400Xd0 interfaceC2400Xd0, C0574Ad0 c0574Ad0, InterfaceC1612Nk1<InterfaceC5746oa> interfaceC1612Nk1) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = executor;
        this.d = c1198Id0;
        this.e = interfaceC2400Xd0;
        this.f = c0574Ad0;
        this.g = interfaceC1612Nk1;
        c1198Id0.a();
        this.h = c1198Id0.c.b;
        Tasks.call(executor, new CallableC4886kU0(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    public final synchronized C7022ue0 a(C1198Id0 c1198Id0, String str, InterfaceC2400Xd0 interfaceC2400Xd0, C0574Ad0 c0574Ad0, Executor executor, C5059lI c5059lI, C5059lI c5059lI2, C5059lI c5059lI3, a aVar, C7161vI c7161vI, b bVar) {
        C0574Ad0 c0574Ad1;
        try {
            if (!this.a.containsKey(str)) {
                if (str.equals("firebase")) {
                    c1198Id0.a();
                    if (c1198Id0.b.equals("[DEFAULT]")) {
                        c0574Ad1 = c0574Ad0;
                    } else {
                        c0574Ad1 = null;
                    }
                } else {
                    c0574Ad1 = null;
                }
                C7022ue0 c7022ue0 = new C7022ue0(interfaceC2400Xd0, c0574Ad1, executor, c5059lI, c5059lI2, c5059lI3, aVar, c7161vI, bVar);
                c5059lI2.b();
                c5059lI3.b();
                c5059lI.b();
                this.a.put(str, c7022ue0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C7022ue0) this.a.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0062  */
    @KeepForSdk
    public final synchronized C7022ue0 b(String str) throws Throwable {
        Throwable th;
        final C7650xd1 c7650xd1;
        try {
            try {
                C5059lI c5059lIC = c(str, "fetch");
                C5059lI c5059lIC2 = c(str, "activate");
                C5059lI c5059lIC3 = c(str, "defaults");
                b bVar = new b(this.b.getSharedPreferences("frc_" + this.h + "_" + str + "_settings", 0));
                C7161vI c7161vI = new C7161vI(this.c, c5059lIC2, c5059lIC3);
                C1198Id0 c1198Id0 = this.d;
                InterfaceC1612Nk1<InterfaceC5746oa> interfaceC1612Nk1 = this.g;
                c1198Id0.a();
                if (c1198Id0.b.equals("[DEFAULT]")) {
                    try {
                        if (str.equals("firebase")) {
                            c7650xd1 = new C7650xd1(interfaceC1612Nk1);
                        } else {
                            c7650xd1 = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    c7650xd1 = null;
                }
                if (c7650xd1 != null) {
                    BiConsumer biConsumer = new BiConsumer() { // from class: rr1
                        @Override // com.google.android.gms.common.util.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            JSONObject jSONObjectOptJSONObject;
                            C7650xd1 c7650xd2 = c7650xd1;
                            String str2 = (String) obj;
                            C5272mI c5272mI = (C5272mI) obj2;
                            InterfaceC5746oa interfaceC5746oa = c7650xd2.a.get();
                            if (interfaceC5746oa == null) {
                                return;
                            }
                            JSONObject jSONObject = c5272mI.e;
                            if (jSONObject.length() < 1) {
                                return;
                            }
                            JSONObject jSONObject2 = c5272mI.b;
                            if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                                if (strOptString.isEmpty()) {
                                    return;
                                }
                                synchronized (c7650xd2.b) {
                                    try {
                                        if (strOptString.equals(c7650xd2.b.get(str2))) {
                                            return;
                                        }
                                        c7650xd2.b.put(str2, strOptString);
                                        Bundle bundle = new Bundle();
                                        bundle.putString("arm_key", str2);
                                        bundle.putString("arm_value", jSONObject2.optString(str2));
                                        bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                        bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                        bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                        interfaceC5746oa.e("fp", "personalization_assignment", bundle);
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("_fpid", strOptString);
                                        interfaceC5746oa.e("fp", "_fpc", bundle2);
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    };
                    synchronized (c7161vI.a) {
                        c7161vI.a.add(biConsumer);
                    }
                }
                return a(this.d, str, this.e, this.f, this.c, c5059lIC, c5059lIC2, c5059lIC3, d(str, c5059lIC, bVar), c7161vI, bVar);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final C5059lI c(String str, String str2) {
        AI ai;
        C5059lI c5059lI;
        String strB = C5807oq.b(C5896pG.a("frc_", this.h, "_", str, "_"), str2, ".json");
        Executor executor = this.c;
        Context context = this.b;
        HashMap map = AI.c;
        synchronized (AI.class) {
            try {
                HashMap map2 = AI.c;
                if (!map2.containsKey(strB)) {
                    map2.put(strB, new AI(context, strB));
                }
                ai = (AI) map2.get(strB);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = C5059lI.d;
        synchronized (C5059lI.class) {
            try {
                String str3 = ai.b;
                HashMap map4 = C5059lI.d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new C5059lI(executor, ai));
                }
                c5059lI = (C5059lI) map4.get(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5059lI;
    }

    public final synchronized a d(String str, C5059lI c5059lI, b bVar) {
        InterfaceC2400Xd0 interfaceC2400Xd0;
        InterfaceC1612Nk1 c5577nk0;
        Executor executor;
        Clock clock;
        Random random;
        String str2;
        C1198Id0 c1198Id0;
        try {
            interfaceC2400Xd0 = this.e;
            C1198Id0 c1198Id1 = this.d;
            c1198Id1.a();
            c5577nk0 = c1198Id1.b.equals("[DEFAULT]") ? this.g : new C5577nk0(1);
            executor = this.c;
            clock = j;
            random = k;
            C1198Id0 c1198Id2 = this.d;
            c1198Id2.a();
            str2 = c1198Id2.c.a;
            c1198Id0 = this.d;
            c1198Id0.a();
        } catch (Throwable th) {
            throw th;
        }
        return new a(interfaceC2400Xd0, c5577nk0, executor, clock, random, c5059lI, new ConfigFetchHttpClient(this.b, c1198Id0.c.b, str2, str, bVar.a.getLong("fetch_timeout_in_seconds", 60L), bVar.a.getLong("fetch_timeout_in_seconds", 60L)), bVar, this.i);
    }
}
