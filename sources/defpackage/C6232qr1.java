package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.android.core.b0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: qr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6232qr1 {

    @NotNull
    public final C3595ea a;

    @NotNull
    public final C5515nT b;

    public C6232qr1(@NotNull C3595ea amplitude, @NotNull C5515nT databaseStorage) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(databaseStorage, "databaseStorage");
        this.a = amplitude;
        this.b = databaseStorage;
    }

    public static long a(JSONObject jSONObject) throws JSONException {
        long j = jSONObject.getLong("$rowId");
        jSONObject.put("event_id", j);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("library");
        if (jSONObjectOptJSONObject != null) {
            jSONObject.put("library", jSONObjectOptJSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME) + '/' + jSONObjectOptJSONObject.getString("version"));
        }
        Object objOpt = jSONObject.opt("timestamp");
        if (objOpt != null) {
            jSONObject.put(C1575Mz0.TIME, objOpt);
        }
        Object objOpt2 = jSONObject.opt("uuid");
        if (objOpt2 != null) {
            jSONObject.put("insert_id", objOpt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("api_properties");
        if (jSONObjectOptJSONObject2 != null) {
            Object objOpt3 = jSONObjectOptJSONObject2.opt("androidADID");
            if (objOpt3 != null) {
                Intrinsics.checkNotNullExpressionValue(objOpt3, "opt(\"androidADID\")");
                jSONObject.put("adid", objOpt3);
            }
            Object objOpt4 = jSONObjectOptJSONObject2.opt("android_app_set_id");
            if (objOpt4 != null) {
                Intrinsics.checkNotNullExpressionValue(objOpt4, "opt(\"android_app_set_id\")");
                jSONObject.put("android_app_set_id", objOpt4);
            }
            Object objOpt5 = jSONObjectOptJSONObject2.opt("productId");
            if (objOpt5 != null) {
                Intrinsics.checkNotNullExpressionValue(objOpt5, "opt(\"productId\")");
                jSONObject.put("productId", objOpt5);
            }
            Object objOpt6 = jSONObjectOptJSONObject2.opt("quantity");
            if (objOpt6 != null) {
                Intrinsics.checkNotNullExpressionValue(objOpt6, "opt(\"quantity\")");
                jSONObject.put("quantity", objOpt6);
            }
            Object objOpt7 = jSONObjectOptJSONObject2.opt("price");
            if (objOpt7 != null) {
                Intrinsics.checkNotNullExpressionValue(objOpt7, "opt(\"price\")");
                jSONObject.put("price", objOpt7);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("location");
            if (jSONObjectOptJSONObject3 != null) {
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject3, "optJSONObject(\"location\")");
                Object objOpt8 = jSONObjectOptJSONObject3.opt("lat");
                if (objOpt8 != null) {
                    Intrinsics.checkNotNullExpressionValue(objOpt8, "opt(\"lat\")");
                    jSONObject.put("location_lat", objOpt8);
                }
                Object objOpt9 = jSONObjectOptJSONObject3.opt("lng");
                if (objOpt9 != null) {
                    Intrinsics.checkNotNullExpressionValue(objOpt9, "opt(\"lng\")");
                    jSONObject.put("location_lng", objOpt9);
                }
            }
        }
        Object objOpt10 = jSONObject.opt("$productId");
        if (objOpt10 != null) {
            jSONObject.put("productId", objOpt10);
        }
        Object objOpt11 = jSONObject.opt("$quantity");
        if (objOpt11 != null) {
            jSONObject.put("quantity", objOpt11);
        }
        Object objOpt12 = jSONObject.opt("$price");
        if (objOpt12 != null) {
            jSONObject.put("price", objOpt12);
        }
        Object objOpt13 = jSONObject.opt("$revenueType");
        if (objOpt13 != null) {
            jSONObject.put("revenueType", objOpt13);
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa A[PHI: r4
      0x00fa: PHI (r4v5 qr1) = (r4v3 qr1), (r4v6 qr1) binds: [B:49:0x00de, B:57:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119 A[PHI: r2
      0x0119: PHI (r2v19 qr1) = (r2v17 qr1), (r2v21 qr1) binds: [B:63:0x0116, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (r2.e(r0) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        if (r10.d(r0) == r1) goto L67;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.LM r10) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6232qr1.b(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(JSONObject jSONObject, LQ1 lq1, Function1 function1, LM lm) {
        C4540ir1 c4540ir1;
        long j;
        if (lm instanceof C4540ir1) {
            c4540ir1 = (C4540ir1) lm;
            int i = c4540ir1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4540ir1.i = i - Integer.MIN_VALUE;
            } else {
                c4540ir1 = new C4540ir1(this, lm);
            }
        } else {
            c4540ir1 = new C4540ir1(this, lm);
        }
        Object obj = c4540ir1.g;
        Object obj2 = MN.d;
        int i2 = c4540ir1.i;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                long jA = a(jSONObject);
                C0612Aq c0612AqY = C0957Fb.y(jSONObject);
                c4540ir1.d = function1;
                c4540ir1.e = jA;
                c4540ir1.i = 1;
                if (lq1.e(c0612AqY, c4540ir1) == obj2) {
                    return obj2;
                }
                j = jA;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = c4540ir1.e;
                function1 = c4540ir1.d;
                C1795Pt1.b(obj);
            }
            function1.invoke(new Long(j));
        } catch (Exception e) {
            String message = "event migration failed: " + e.getMessage();
            Intrinsics.checkNotNullParameter(message, "message");
            if (DS0.a.e.compareTo(DS0.a.h) <= 0) {
                b0.c("Amplitude", message);
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(LM lm) {
        C4759jr1 c4759jr1;
        AbstractList abstractListQ;
        C6232qr1 c6232qr1;
        Iterator it;
        if (lm instanceof C4759jr1) {
            c4759jr1 = (C4759jr1) lm;
            int i = c4759jr1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4759jr1.i = i - Integer.MIN_VALUE;
            } else {
                c4759jr1 = new C4759jr1(this, lm);
            }
        } else {
            c4759jr1 = new C4759jr1(this, lm);
        }
        Object obj = c4759jr1.g;
        MN mn = MN.d;
        int i2 = c4759jr1.i;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                C5515nT c5515nT = this.b;
                synchronized (c5515nT) {
                    abstractListQ = c5515nT.q("events");
                }
                c6232qr1 = this;
                it = abstractListQ.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c4759jr1.e;
                c6232qr1 = c4759jr1.d;
                C1795Pt1.b(obj);
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                LQ1 lq1G = c6232qr1.a.g();
                C4969kr1 c4969kr1 = new C4969kr1(1, c6232qr1.b, C5515nT.class, "removeEvent", "removeEvent(J)V", 0);
                c4759jr1.d = c6232qr1;
                c4759jr1.e = it;
                c4759jr1.i = 1;
                if (c6232qr1.c(jSONObject, lq1G, c4969kr1, c4759jr1) == mn) {
                    return mn;
                }
            }
        } catch (Exception e) {
            String message = "events migration failed: " + e.getMessage();
            Intrinsics.checkNotNullParameter(message, "message");
            if (DS0.a.e.compareTo(DS0.a.h) <= 0) {
                b0.c("Amplitude", message);
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(LM lm) {
        C5179lr1 c5179lr1;
        AbstractList abstractListQ;
        C6232qr1 c6232qr1;
        Iterator it;
        if (lm instanceof C5179lr1) {
            c5179lr1 = (C5179lr1) lm;
            int i = c5179lr1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5179lr1.i = i - Integer.MIN_VALUE;
            } else {
                c5179lr1 = new C5179lr1(this, lm);
            }
        } else {
            c5179lr1 = new C5179lr1(this, lm);
        }
        Object obj = c5179lr1.g;
        MN mn = MN.d;
        int i2 = c5179lr1.i;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                C5515nT c5515nT = this.b;
                synchronized (c5515nT) {
                    abstractListQ = c5515nT.q("identifys");
                }
                c6232qr1 = this;
                it = abstractListQ.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c5179lr1.e;
                c6232qr1 = c5179lr1.d;
                C1795Pt1.b(obj);
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                LQ1 lq1G = c6232qr1.a.g();
                C5392mr1 c5392mr1 = new C5392mr1(1, c6232qr1.b, C5515nT.class, "removeIdentify", "removeIdentify(J)V", 0);
                c5179lr1.d = c6232qr1;
                c5179lr1.e = it;
                c5179lr1.i = 1;
                if (c6232qr1.c(jSONObject, lq1G, c5392mr1, c5179lr1) == mn) {
                    return mn;
                }
            }
        } catch (Exception e) {
            String message = "identifies migration failed: " + e.getMessage();
            Intrinsics.checkNotNullParameter(message, "message");
            if (DS0.a.e.compareTo(DS0.a.h) <= 0) {
                b0.c("Amplitude", message);
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(LM lm) {
        C5602nr1 c5602nr1;
        List listQ;
        C6232qr1 c6232qr1;
        Iterator it;
        if (lm instanceof C5602nr1) {
            c5602nr1 = (C5602nr1) lm;
            int i = c5602nr1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5602nr1.i = i - Integer.MIN_VALUE;
            } else {
                c5602nr1 = new C5602nr1(this, lm);
            }
        } else {
            c5602nr1 = new C5602nr1(this, lm);
        }
        Object obj = c5602nr1.g;
        MN mn = MN.d;
        int i2 = c5602nr1.i;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                C5515nT c5515nT = this.b;
                synchronized (c5515nT) {
                    listQ = c5515nT.h < 4 ? C5653o60.d : c5515nT.q("identify_interceptor");
                }
                c6232qr1 = this;
                it = listQ.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c5602nr1.e;
                c6232qr1 = c5602nr1.d;
                C1795Pt1.b(obj);
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                LQ1 lq1E = c6232qr1.a.e();
                C5812or1 c5812or1 = new C5812or1(1, c6232qr1.b, C5515nT.class, "removeInterceptedIdentify", "removeInterceptedIdentify(J)V", 0, 0);
                c5602nr1.d = c6232qr1;
                c5602nr1.e = it;
                c5602nr1.i = 1;
                if (c6232qr1.c(jSONObject, lq1E, c5812or1, c5602nr1) == mn) {
                    return mn;
                }
            }
        } catch (Exception e) {
            String message = "intercepted identifies migration failed: " + e.getMessage();
            Intrinsics.checkNotNullParameter(message, "message");
            if (DS0.a.e.compareTo(DS0.a.h) <= 0) {
                b0.c("Amplitude", message);
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00fe A[DONT_INVERT, PHI: r2 r3 r6
      0x00fe: PHI (r2v9 java.lang.Long) = (r2v7 java.lang.Long), (r2v7 java.lang.Long), (r2v12 java.lang.Long) binds: [B:48:0x00d6, B:49:0x00d8, B:53:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r3v9 java.lang.Long) = (r3v6 java.lang.Long), (r3v6 java.lang.Long), (r3v11 java.lang.Long) binds: [B:48:0x00d6, B:49:0x00d8, B:53:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r6v7 qr1) = (r6v4 qr1), (r6v4 qr1), (r6v8 qr1) binds: [B:48:0x00d6, B:49:0x00d8, B:53:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object g(LM lm) {
        C6022pr1 c6022pr1;
        Long lC0;
        Long lG;
        Long lG2;
        C6232qr1 c6232qr1;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        C6232qr1 c6232qr2;
        LQ1 lq1G;
        String string;
        C6232qr1 c6232qr3;
        C5515nT c5515nT = this.b;
        C3595ea c3595ea = this.a;
        if (lm instanceof C6022pr1) {
            c6022pr1 = (C6022pr1) lm;
            int i = c6022pr1.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6022pr1.l = i - Integer.MIN_VALUE;
            } else {
                c6022pr1 = new C6022pr1(this, lm);
            }
        } else {
            c6022pr1 = new C6022pr1(this, lm);
        }
        Object obj = c6022pr1.j;
        MN mn = MN.d;
        int i2 = c6022pr1.l;
        LQ1.a aVar = LQ1.a.LAST_EVENT_ID;
        LQ1.a aVar2 = LQ1.a.LAST_EVENT_TIME;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    lG2 = c6022pr1.i;
                    l4 = c6022pr1.h;
                    l3 = c6022pr1.g;
                    l2 = c6022pr1.e;
                    c6232qr2 = c6022pr1.d;
                    C1795Pt1.b(obj);
                } else {
                    if (i2 == 2) {
                        lG2 = c6022pr1.g;
                        l = c6022pr1.e;
                        c6232qr1 = c6022pr1.d;
                        C1795Pt1.b(obj);
                        c6232qr1.b.u("last_event_time");
                        if (l == null && lG2 != null) {
                            lq1G = c6232qr1.a.g();
                            string = lG2.toString();
                            c6022pr1.d = c6232qr1;
                            c6022pr1.e = null;
                            c6022pr1.g = null;
                            c6022pr1.h = null;
                            c6022pr1.i = null;
                            c6022pr1.l = 3;
                            if (lq1G.h(aVar, string) != mn) {
                                c6232qr3 = c6232qr1;
                            }
                            return mn;
                        }
                        return Unit.a;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6232qr3 = c6022pr1.d;
                    C1795Pt1.b(obj);
                }
                c6232qr3.b.u("last_event_id");
                return Unit.a;
            }
            C1795Pt1.b(obj);
            LQ1 lq1G2 = c3595ea.g();
            LQ1.a aVar3 = LQ1.a.PREVIOUS_SESSION_ID;
            String strF = lq1G2.f(aVar3);
            Long lC1 = strF != null ? StringsKt.c0(strF) : null;
            String strF2 = c3595ea.g().f(aVar2);
            lC0 = strF2 != null ? StringsKt.c0(strF2) : null;
            String strF3 = c3595ea.g().f(aVar);
            Long lC2 = strF3 != null ? StringsKt.c0(strF3) : null;
            Long lG3 = c5515nT.g("previous_session_id");
            lG = c5515nT.g("last_event_time");
            lG2 = c5515nT.g("last_event_id");
            if (lC1 != null || lG3 == null) {
                c6232qr1 = this;
                l = lC2;
                if (lC0 == null || lG == null) {
                    if (l == null) {
                        lq1G = c6232qr1.a.g();
                        string = lG2.toString();
                        c6022pr1.d = c6232qr1;
                        c6022pr1.e = null;
                        c6022pr1.g = null;
                        c6022pr1.h = null;
                        c6022pr1.i = null;
                        c6022pr1.l = 3;
                        if (lq1G.h(aVar, string) != mn) {
                            c6232qr3 = c6232qr1;
                            c6232qr3.b.u("last_event_id");
                        }
                    }
                    return Unit.a;
                }
                LQ1 lq1G3 = c6232qr1.a.g();
                String string2 = lG.toString();
                c6022pr1.d = c6232qr1;
                c6022pr1.e = l;
                c6022pr1.g = lG2;
                c6022pr1.h = null;
                c6022pr1.i = null;
                c6022pr1.l = 2;
                if (lq1G3.h(aVar2, string2) != mn) {
                    c6232qr1.b.u("last_event_time");
                    if (l == null) {
                        lq1G = c6232qr1.a.g();
                        string = lG2.toString();
                        c6022pr1.d = c6232qr1;
                        c6022pr1.e = null;
                        c6022pr1.g = null;
                        c6022pr1.h = null;
                        c6022pr1.i = null;
                        c6022pr1.l = 3;
                        if (lq1G.h(aVar, string) != mn) {
                            c6232qr3 = c6232qr1;
                            c6232qr3.b.u("last_event_id");
                        }
                    }
                    return Unit.a;
                }
            } else {
                LQ1 lq1G4 = c3595ea.g();
                String string3 = lG3.toString();
                c6022pr1.d = this;
                c6022pr1.e = lC0;
                c6022pr1.g = lC2;
                c6022pr1.h = lG;
                c6022pr1.i = lG2;
                c6022pr1.l = 1;
                if (lq1G4.h(aVar3, string3) != mn) {
                    l2 = lC0;
                    l3 = lC2;
                    l4 = lG;
                    c6232qr2 = this;
                }
            }
            return mn;
            c6232qr2.b.u("previous_session_id");
            lG = l4;
            l = l3;
            c6232qr1 = c6232qr2;
            lC0 = l2;
            if (lC0 == null) {
                if (l == null) {
                    lq1G = c6232qr1.a.g();
                    string = lG2.toString();
                    c6022pr1.d = c6232qr1;
                    c6022pr1.e = null;
                    c6022pr1.g = null;
                    c6022pr1.h = null;
                    c6022pr1.i = null;
                    c6022pr1.l = 3;
                    if (lq1G.h(aVar, string) != mn) {
                        c6232qr3 = c6232qr1;
                        c6232qr3.b.u("last_event_id");
                    }
                    return mn;
                }
            } else if (l == null) {
                lq1G = c6232qr1.a.g();
                string = lG2.toString();
                c6022pr1.d = c6232qr1;
                c6022pr1.e = null;
                c6022pr1.g = null;
                c6022pr1.h = null;
                c6022pr1.i = null;
                c6022pr1.l = 3;
                if (lq1G.h(aVar, string) != mn) {
                    c6232qr3 = c6232qr1;
                    c6232qr3.b.u("last_event_id");
                }
                return mn;
            }
        } catch (Exception e) {
            String message = "session data migration failed: " + e.getMessage();
            Intrinsics.checkNotNullParameter(message, "message");
            if (DS0.a.e.compareTo(DS0.a.h) <= 0) {
                b0.c("Amplitude", message);
            }
        }
        return Unit.a;
    }
}
