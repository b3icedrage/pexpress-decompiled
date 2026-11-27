package com.base.feature.analytics.reporters;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import defpackage.AW1;
import defpackage.AbstractC3947gD0;
import defpackage.AbstractC5267mG0;
import defpackage.C1510Md1;
import defpackage.C1589Ne;
import defpackage.C1795Pt1;
import defpackage.C2658a80;
import defpackage.C3476e;
import defpackage.C3595ea;
import defpackage.C3784fT;
import defpackage.C3959gH0;
import defpackage.C4466ii;
import defpackage.C4693ja;
import defpackage.C4923kf;
import defpackage.C5189lv;
import defpackage.C6266r20;
import defpackage.C6508sA0;
import defpackage.C7530x3;
import defpackage.C7713xv0;
import defpackage.C7766y91;
import defpackage.C7923yv0;
import defpackage.EM;
import defpackage.EnumC5028l80;
import defpackage.EnumC5113la;
import defpackage.EnumC5326ma;
import defpackage.EnumC6919u8;
import defpackage.F80;
import defpackage.GP1;
import defpackage.H91;
import defpackage.InterfaceC1446Li;
import defpackage.InterfaceC2570Zi;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC5482nI;
import defpackage.InterfaceC6168qa1;
import defpackage.JM;
import defpackage.KN;
import defpackage.KW1;
import defpackage.LM;
import defpackage.LN;
import defpackage.MG0;
import defpackage.MN;
import defpackage.P80;
import defpackage.QV0;
import defpackage.TG0;
import defpackage.VE;
import defpackage.XO0;
import defpackage.ZT1;
import io.sentry.android.core.b0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ReporterBase implements ReporterApi {

    @NotNull
    public final InterfaceC6168qa1 a;

    @NotNull
    public final InterfaceC5482nI b;

    @NotNull
    public final InterfaceC1446Li c;

    @NotNull
    public final AbstractC3947gD0 d;

    @NotNull
    public final ZT1 e;

    @NotNull
    public final C4923kf f;

    @NotNull
    public final InterfaceC2570Zi g;

    @NotNull
    public final Context h;

    @Nullable
    public C4693ja i;

    @NotNull
    public final EM j;

    @NotNull
    public final GP1 k;

    @NotNull
    public final KW1 l;

    @NotNull
    public final GP1 m;

    @NotNull
    public final Gson n;

    @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$1", f = "ReporterBase.kt", l = {85}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ReporterBase.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (ReporterBase.o(ReporterBase.this, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$appendProperty$1", f = "ReporterBase.kt", l = {362}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ EnumC5113la g;
        public final /* synthetic */ Object h;

        @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$appendProperty$1$1", f = "ReporterBase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
            public /* synthetic */ boolean d;

            public a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(2, jm);
                aVar.d = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return Boolean.valueOf(this.d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC5113la enumC5113la, Object obj, JM<? super b> jm) {
            super(2, jm);
            this.g = enumC5113la;
            this.h = obj;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ReporterBase.this.new b(this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            ReporterBase reporterBase = ReporterBase.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                GP1 gp1 = reporterBase.k;
                a aVar = new a(2, null);
                this.d = 1;
                if (C4466ii.p(gp1, aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            reporterBase.getClass();
            EnumC5113la enumC5113la = this.g;
            if (enumC5113la.e) {
                enumC5113la.toString();
                Object obj2 = this.h;
                Objects.toString(obj2);
                C4693ja c4693ja = reporterBase.i;
                if (c4693ja != null) {
                    C7923yv0 c7923yv0 = new C7923yv0();
                    String value = obj2.toString();
                    String property = enumC5113la.d;
                    Intrinsics.checkNotNullParameter(property, "property");
                    Intrinsics.checkNotNullParameter(value, "value");
                    c7923yv0.a(property, 2, value);
                    C3595ea.i(c4693ja, c7923yv0);
                }
            }
            C4693ja c4693ja2 = reporterBase.i;
            if (c4693ja2 != null) {
                c4693ja2.h();
            }
            C4693ja c4693ja3 = reporterBase.i;
            if (c4693ja3 != null) {
                c4693ja3.c();
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$appsFlyerSendEvent$1", f = "ReporterBase.kt", l = {401}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ EnumC5028l80 g;
        public final /* synthetic */ P80 h;
        public final /* synthetic */ String i;

        @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$appsFlyerSendEvent$1$1", f = "ReporterBase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
            public /* synthetic */ boolean d;

            public a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(2, jm);
                aVar.d = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return Boolean.valueOf(this.d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC5028l80 enumC5028l80, P80 p80, String str, JM<? super c> jm) {
            super(2, jm);
            this.g = enumC5028l80;
            this.h = p80;
            this.i = str;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ReporterBase.this.new c(this.g, this.h, this.i, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            ReporterBase reporterBase = ReporterBase.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                GP1 gp1 = reporterBase.m;
                a aVar = new a(2, null);
                this.d = 1;
                if (C4466ii.p(gp1, aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            reporterBase.p(this.g, this.h, this.i);
            return Unit.a;
        }
    }

    public static final class d implements AppsFlyerRequestListener {
        public final /* synthetic */ String b;

        public d(String str) {
            this.b = str;
        }

        @Override // com.appsflyer.share.attribution.AppsFlyerRequestListener
        public final void onError(int i, String errorDesc) {
            Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
            StringBuilder sb = new StringBuilder("Event ");
            String str = this.b;
            sb.append(str);
            sb.append(" failed: code=");
            sb.append(i);
            sb.append(", ");
            sb.append(errorDesc);
            b0.e("ANALYTICS_APPSFLYER", sb.toString());
            ReporterBase.this.g.b(EnumC6919u8.EVENT, Integer.valueOf(i), errorDesc, str);
        }

        @Override // com.appsflyer.share.attribution.AppsFlyerRequestListener
        public final void onSuccess() {
            ReporterBase.this.g.a(EnumC6919u8.EVENT);
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$sendEventJson$1", f = "ReporterBase.kt", l = {233}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ String g;
        public final /* synthetic */ JsonElement h;

        @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$sendEventJson$1$1", f = "ReporterBase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
            public /* synthetic */ boolean d;

            public a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(2, jm);
                aVar.d = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return Boolean.valueOf(this.d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, JsonElement jsonElement, JM<? super e> jm) {
            super(2, jm);
            this.g = str;
            this.h = jsonElement;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ReporterBase.this.new e(this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            ReporterBase reporterBase = ReporterBase.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                GP1 gp1 = reporterBase.k;
                a aVar = new a(2, null);
                this.d = 1;
                if (C4466ii.p(gp1, aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            JsonElement jsonElement = this.h;
            if (jsonElement != null) {
                reporterBase.getClass();
                jsonElement.toString();
            }
            C4693ja c4693ja = reporterBase.i;
            if (c4693ja != null) {
                c4693ja.l(this.g, (Map) new Gson().c(jsonElement, new TypeToken<Map<String, ? extends Object>>() { // from class: com.base.feature.analytics.reporters.ReporterBase$sendEventAmplitude$$inlined$typeTokenOf$1
                }), (F80) reporterBase.l.getValue());
            }
            C4693ja c4693ja2 = reporterBase.i;
            if (c4693ja2 != null) {
                c4693ja2.h();
            }
            C4693ja c4693ja3 = reporterBase.i;
            if (c4693ja3 != null) {
                c4693ja3.c();
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$setProperty$1", f = "ReporterBase.kt", l = {337}, m = "invokeSuspend")
    public static final class f extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ EnumC5113la g;
        public final /* synthetic */ Object h;

        @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$setProperty$1$1", f = "ReporterBase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
            public /* synthetic */ boolean d;

            public a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(2, jm);
                aVar.d = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return Boolean.valueOf(this.d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumC5113la enumC5113la, Object obj, JM<? super f> jm) {
            super(2, jm);
            this.g = enumC5113la;
            this.h = obj;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ReporterBase.this.new f(this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((f) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            ReporterBase reporterBase = ReporterBase.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                GP1 gp1 = reporterBase.k;
                a aVar = new a(2, null);
                this.d = 1;
                if (C4466ii.p(gp1, aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            reporterBase.getClass();
            EnumC5113la enumC5113la = this.g;
            String str = enumC5113la.d;
            Object value = this.h;
            Objects.toString(value);
            C4693ja c4693ja = reporterBase.i;
            if (c4693ja != null) {
                C7923yv0 c7923yv0 = new C7923yv0();
                String property = enumC5113la.d;
                Intrinsics.checkNotNullParameter(property, "property");
                Intrinsics.checkNotNullParameter(value, "value");
                c7923yv0.a(property, 1, value);
                C3595ea.i(c4693ja, c7923yv0);
            }
            C4693ja c4693ja2 = reporterBase.i;
            if (c4693ja2 != null) {
                c4693ja2.h();
            }
            C4693ja c4693ja3 = reporterBase.i;
            if (c4693ja3 != null) {
                c4693ja3.c();
            }
            return Unit.a;
        }
    }

    public ReporterBase(@NotNull InterfaceC6168qa1 ourAnalyticsReporter, @NotNull InterfaceC5482nI configEventsProvider, @NotNull InterfaceC1446Li applicationVersionProvider, @NotNull AbstractC3947gD0 isAmplitudeInitializedUseCaseApi, @NotNull ZT1 subIdProviderApi, @NotNull C4923kf appDataRepository, @NotNull InterfaceC2570Zi appsFlyerHealth, @NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(ourAnalyticsReporter, "ourAnalyticsReporter");
        Intrinsics.checkNotNullParameter(configEventsProvider, "configEventsProvider");
        Intrinsics.checkNotNullParameter(applicationVersionProvider, "applicationVersionProvider");
        Intrinsics.checkNotNullParameter(isAmplitudeInitializedUseCaseApi, "isAmplitudeInitializedUseCaseApi");
        Intrinsics.checkNotNullParameter(subIdProviderApi, "subIdProviderApi");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(appsFlyerHealth, "appsFlyerHealth");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.a = ourAnalyticsReporter;
        this.b = configEventsProvider;
        this.c = applicationVersionProvider;
        this.d = isAmplitudeInitializedUseCaseApi;
        this.e = subIdProviderApi;
        this.f = appDataRepository;
        this.g = appsFlyerHealth;
        this.h = appContext;
        EM emA = LN.a(C6266r20.a);
        this.j = emA;
        Boolean bool = Boolean.FALSE;
        this.k = C1589Ne.i(bool);
        C5189lv.k(emA, QV0.a.s1(), new a(null), 2);
        this.l = XO0.b(new C7530x3(this, 4));
        this.m = C1589Ne.i(bool);
        this.n = new Gson();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r6.z(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(com.base.feature.analytics.reporters.ReporterBase r6, defpackage.LM r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C3245cs1
            if (r0 == 0) goto L13
            r0 = r7
            cs1 r0 = (defpackage.C3245cs1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            cs1 r0 = new cs1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L7b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.base.feature.analytics.reporters.ReporterBase r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L4a
        L38:
            defpackage.C1795Pt1.b(r7)
            kf r7 = r6.f
            GP1 r7 = r7.k
            r0.d = r6
            r0.h = r4
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r0)
            if (r7 != r1) goto L4a
            goto L7a
        L4a:
            uG r7 = (defpackage.C6945uG) r7
            if (r7 == 0) goto L5c
            long r4 = r7.a
            java.lang.String r7 = java.lang.String.valueOf(r4)
            ja r2 = r6.i
            if (r2 == 0) goto L67
            r2.k(r7)
            goto L67
        L5c:
            java.lang.String r7 = "ANALYTICS_AMPLITUDE"
            java.lang.String r2 = "Unexpected loss of user data"
            int r7 = android.util.Log.d(r7, r2)
            defpackage.C3686f.f(r7)
        L67:
            ja r6 = r6.i
            if (r6 == 0) goto L7e
            xW r6 = r6.n
            if (r6 == 0) goto L7e
            r7 = 0
            r0.d = r7
            r0.h = r3
            java.lang.Object r6 = r6.z(r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L7e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.base.feature.analytics.reporters.ReporterBase.n(com.base.feature.analytics.reporters.ReporterBase, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:
    
        if (r8 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(com.base.feature.analytics.reporters.ReporterBase r7, defpackage.LM r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.base.feature.analytics.reporters.ReporterBase.o(com.base.feature.analytics.reporters.ReporterBase, LM):java.lang.Object");
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    @Nullable
    public final Unit a(@NotNull H91 h91, @NotNull LM lm) {
        String str = C7766y91.a().getUser().getTags().get(h91.d);
        if (str == null || StringsKt.I(str)) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = StringsKt.toIntOrNull(str);
        Unit unitC = c(h91, new Integer((intOrNull != null ? intOrNull.intValue() : 0) + 1), false);
        return unitC == MN.d ? unitC : Unit.a;
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    public final void b(@NotNull EnumC5113la event, @NotNull Object value, @NotNull List<? extends EnumC5326ma> toPlatforms) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(toPlatforms, "toPlatforms");
        if (toPlatforms.contains(EnumC5326ma.g)) {
            q(event, value);
        }
        if (toPlatforms.contains(EnumC5326ma.e)) {
            C5189lv.k(this.j, null, new f(event, value, null), 3);
        }
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    @Nullable
    public final Unit c(@NotNull H91 h91, @NotNull Object obj, boolean z) {
        Map<String, String> tags = C7766y91.a().getUser().getTags();
        if (z && tags.containsKey(h91.d)) {
            return Unit.a;
        }
        String str = h91.d;
        Objects.toString(obj);
        C7766y91.a().getUser().addTag(h91.d, obj.toString());
        return Unit.a;
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    public final void d(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        GP1 gp1 = this.m;
        gp1.getClass();
        gp1.m(null, boolValueOf);
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    public final void e(@NotNull EnumC5113la event, @NotNull Object value, @NotNull List<? extends EnumC5326ma> toPlatforms) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(toPlatforms, "toPlatforms");
        if (toPlatforms.contains(EnumC5326ma.g)) {
            q(event, value);
        }
        if (toPlatforms.contains(EnumC5326ma.e)) {
            C5189lv.k(this.j, null, new b(event, value, null), 3);
        }
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    @Nullable
    public final Unit f(@NotNull EnumC5028l80 enumC5028l80, @Nullable P80 p80) {
        ReporterApi.a.b(this, enumC5028l80, p80, VE.c(EnumC5326ma.e), 8);
        return Unit.a;
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    public final void g(@NotNull EnumC5028l80 event, @Nullable P80 p80, @Nullable String str) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (((Boolean) this.m.getValue()).booleanValue()) {
            p(event, p80, str);
        } else {
            C5189lv.k(C3784fT.a, null, new c(event, p80, str, null), 3);
        }
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    public final void h(@NotNull EnumC5028l80 event, @Nullable P80 p80, @NotNull List<? extends EnumC5326ma> toPlatforms, @Nullable Boolean bool) {
        JsonElement jsonElementL;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(toPlatforms, "toPlatforms");
        if (p80 != null) {
            jsonElementL = new Gson().l(p80);
            Intrinsics.checkNotNullExpressionValue(jsonElementL, "toJsonTree(...)");
        } else {
            jsonElementL = null;
        }
        m(event, jsonElementL, toPlatforms, bool);
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    @Nullable
    public final Unit i(@NotNull H91 h91, @NotNull LM lm) {
        Unit unitC = c(h91, new Long(System.currentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)), true);
        return unitC == MN.d ? unitC : Unit.a;
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    public final void j(@NotNull String name, @NotNull String json, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(json, "json");
        JsonObject jsonObject = (JsonObject) C3476e.i(this.n, json, JsonObject.class);
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        jsonObject.d.put("is_mixpanel", new JsonPrimitive(Boolean.valueOf(z)));
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        C2658a80.b bVar = C2658a80.Companion;
        AbstractC5267mG0.a aVar = AbstractC5267mG0.d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(string, "string");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) aVar.c(TG0.a, string);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.a.g(new C2658a80(name, jsonElement));
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    @Nullable
    public final Unit k(@NotNull EnumC5028l80 enumC5028l80, @Nullable C1510Md1 c1510Md1) {
        ReporterApi.a.b(this, enumC5028l80, c1510Md1, VE.c(EnumC5326ma.e), 8);
        return Unit.a;
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    public final void l(@NotNull EnumC5028l80 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String name = event.b();
        JsonObject jsonObject = new JsonObject();
        jsonObject.d.put("is_mixpanel", new JsonPrimitive(Boolean.FALSE));
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        event.toString();
        C2658a80.b bVar = C2658a80.Companion;
        AbstractC5267mG0.a aVar = AbstractC5267mG0.d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(string, "string");
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) aVar.c(TG0.a, string);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.a.g(new C2658a80(name, jsonElement));
    }

    @Override // com.api.feature.analytics.reporters.ReporterApi
    public final void m(@NotNull EnumC5028l80 event, @Nullable JsonElement jsonElement, @NotNull List<? extends EnumC5326ma> toPlatforms, @Nullable Boolean bool) {
        String string;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(toPlatforms, "toPlatforms");
        String strB = event.b();
        boolean zContains = toPlatforms.contains(EnumC5326ma.g);
        boolean zContains2 = toPlatforms.contains(EnumC5326ma.d);
        if (zContains) {
            if (jsonElement == null || (string = jsonElement.toString()) == null) {
                string = "{}";
            }
            if (bool != null) {
                zContains2 = bool.booleanValue();
            }
            j(strB, string, zContains2);
        }
        if (toPlatforms.contains(EnumC5326ma.e)) {
            C5189lv.k(this.j, null, new e(strB, jsonElement, null), 3);
        }
    }

    public final void p(EnumC5028l80 enumC5028l80, P80 p80, String str) {
        JsonElement jsonElementL;
        Gson gson = new Gson();
        if (p80 != null) {
            jsonElementL = new Gson().l(p80);
            Intrinsics.checkNotNullExpressionValue(jsonElementL, "toJsonTree(...)");
        } else {
            jsonElementL = null;
        }
        Map<String, Object> map = (Map) gson.c(jsonElementL, new TypeToken<Map<String, ? extends Object>>() { // from class: com.base.feature.analytics.reporters.ReporterBase$sendAppsFlyerEvent$$inlined$typeTokenOf$1
        });
        if (str == null) {
            str = enumC5028l80.b();
        }
        AppsFlyerLib.getInstance().logEvent(this.h, str, map, new d(str));
        enumC5028l80.b();
        Objects.toString(map);
    }

    public final void q(EnumC5113la enumC5113la, Object obj) {
        C7713xv0 c7713xv0;
        Objects.toString(enumC5113la);
        Objects.toString(obj);
        if (obj instanceof Number) {
            C7713xv0.b bVar = C7713xv0.Companion;
            String name = enumC5113la.d;
            Number number = (Number) obj;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            C6508sA0 c6508sA0 = MG0.a;
            c7713xv0 = new C7713xv0(name, number == null ? JsonNull.INSTANCE : new C3959gH0(false, number));
        } else if (obj instanceof String) {
            C7713xv0.b bVar2 = C7713xv0.Companion;
            String name2 = enumC5113la.d;
            String str = (String) obj;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(name2, "name");
            C6508sA0 c6508sA1 = MG0.a;
            c7713xv0 = new C7713xv0(name2, str == null ? JsonNull.INSTANCE : new C3959gH0(true, str));
        } else if (obj instanceof Boolean) {
            C7713xv0.b bVar3 = C7713xv0.Companion;
            String name3 = enumC5113la.d;
            Boolean bool = (Boolean) obj;
            bVar3.getClass();
            Intrinsics.checkNotNullParameter(name3, "name");
            C6508sA0 c6508sA2 = MG0.a;
            c7713xv0 = new C7713xv0(name3, bool == null ? JsonNull.INSTANCE : new C3959gH0(false, bool));
        } else {
            c7713xv0 = null;
        }
        if (c7713xv0 != null) {
            this.a.h(c7713xv0);
        }
    }
}
