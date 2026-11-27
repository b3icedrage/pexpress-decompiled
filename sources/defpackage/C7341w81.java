package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: w81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7341w81 extends AbstractC3447dq0 {

    @NotNull
    public static final KW1 m = XO0.b(b.d);

    @NotNull
    public final C7131v81 h;

    @NotNull
    public final Set<InterfaceC3657eq0<?>> i;

    @NotNull
    public final CoroutineContext j;

    @NotNull
    public final CoroutineContext k;

    @NotNull
    public final Map<C1006Fr0.a, C6711t81> l;

    /* JADX INFO: renamed from: w81$a */
    @InterfaceC3368dU(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C7341w81.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C7341w81 c7341w81 = C7341w81.this;
            try {
                if (i == 0) {
                    C1795Pt1.b(obj);
                    CoroutineContext.Element elementP = c7341w81.j.p(XF0.a.d);
                    Intrinsics.checkNotNull(elementP);
                    this.d = 1;
                    if (((XF0) elementP).b1(this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                Iterator<Map.Entry<C1006Fr0.a, C6711t81>> it = c7341w81.l.entrySet().iterator();
                while (it.hasNext()) {
                    C6711t81 value = it.next().getValue();
                    value.e.a();
                    ((ThreadPoolExecutor) value.d.a()).shutdown();
                }
                return Unit.a;
            } catch (Throwable th) {
                Iterator<Map.Entry<C1006Fr0.a, C6711t81>> it2 = c7341w81.l.entrySet().iterator();
                while (it2.hasNext()) {
                    C6711t81 value2 = it2.next().getValue();
                    value2.e.a();
                    ((ThreadPoolExecutor) value2.d.a()).shutdown();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w81$b */
    public static final class b extends ML0 implements Function0<C6711t81> {
        public static final b d = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final C6711t81 invoke() {
            return new C6711t81(new C6711t81.a());
        }
    }

    /* JADX INFO: renamed from: w81$c */
    public /* synthetic */ class c extends C2784ak0 implements Function1<C1006Fr0.a, C6711t81> {
        @Override // kotlin.jvm.functions.Function1
        public final C6711t81 invoke(C1006Fr0.a aVar) {
            C1006Fr0.a aVar2 = aVar;
            C7131v81 c7131v81 = ((C7341w81) this.e).h;
            c7131v81.getClass();
            C6711t81.a aVarB = ((C6711t81) C7341w81.m.getValue()).b();
            C5847p20 dispatcher = new C5847p20();
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            aVarB.a = dispatcher;
            c7131v81.a.invoke(aVarB);
            if (aVar2 != null) {
                Long l = aVar2.b;
                if (l != null) {
                    long jLongValue = l.longValue();
                    FS0 fs0 = C1162Hr0.a;
                    if (jLongValue == Long.MAX_VALUE) {
                        jLongValue = 0;
                    }
                    TimeUnit unit = TimeUnit.MILLISECONDS;
                    Intrinsics.checkNotNullParameter(unit, "unit");
                    aVarB.w = C6806tc2.b("timeout", jLongValue, unit);
                }
                Long l2 = aVar2.c;
                if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    FS0 fs1 = C1162Hr0.a;
                    long j = jLongValue2 == Long.MAX_VALUE ? 0L : jLongValue2;
                    TimeUnit unit2 = TimeUnit.MILLISECONDS;
                    Intrinsics.checkNotNullParameter(unit2, "unit");
                    aVarB.x = C6806tc2.b("timeout", j, unit2);
                    long j2 = jLongValue2 != Long.MAX_VALUE ? jLongValue2 : 0L;
                    Intrinsics.checkNotNullParameter(unit2, "unit");
                    aVarB.y = C6806tc2.b("timeout", j2, unit2);
                }
            }
            return new C6711t81(aVarB);
        }
    }

    /* JADX INFO: renamed from: w81$d */
    public static final class d extends ML0 implements Function1<C6711t81, Unit> {
        public static final d d = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C6711t81 c6711t81) {
            C6711t81 it = c6711t81;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.a;
        }
    }

    public C7341w81(@NotNull C7131v81 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.h = config;
        InterfaceC3657eq0[] elements = {C1006Fr0.d, C2994bg2.a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.i = C1526Mj.H(elements);
        c supplier = new c(1, this, C7341w81.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0);
        int i = config.b;
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        d close = d.d;
        Intrinsics.checkNotNullParameter(close, "close");
        Map<C1006Fr0.a, C6711t81> mapSynchronizedMap = Collections.synchronizedMap(new LL0(supplier, close, i));
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        this.l = mapSynchronizedMap;
        CoroutineContext.Element elementP = super.getE().p(XF0.a.d);
        Intrinsics.checkNotNull(elementP);
        CoroutineContext coroutineContextC = CoroutineContext.Element.a.c(new C4002gV1((XF0) elementP), new UN(EN.a.d));
        this.j = coroutineContextC;
        this.k = super.getE().t(coroutineContextC);
        C5189lv.j(C6215qm0.d, super.getE(), ON.g, new a(null));
    }

    @Override // defpackage.AbstractC3447dq0, defpackage.InterfaceC2514Yp0
    @NotNull
    public final Set<InterfaceC3657eq0<?>> b0() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(C6711t81 c6711t81, C4543is1 c4543is1, CoroutineContext coroutineContext, C3241cr0 c3241cr0, LM lm) {
        C7762y81 frame;
        CoroutineContext coroutineContext2;
        C7341w81 c7341w81;
        C4944kk0 c4944kk0;
        Object obj;
        C2097Tq0 c2097Tq0;
        InterfaceC2833av interfaceC2833avK;
        C3241cr0 c3241cr1 = c3241cr0;
        if (lm instanceof C7762y81) {
            frame = (C7762y81) lm;
            int i = frame.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.k = i - Integer.MIN_VALUE;
            } else {
                frame = new C7762y81(this, lm);
            }
        } else {
            frame = new C7762y81(this, lm);
        }
        Object obj2 = frame.i;
        MN mn = MN.d;
        int i2 = frame.k;
        if (i2 == 0) {
            C1795Pt1.b(obj2);
            C4944kk0 c4944kk0A = C6564sT.a(null);
            frame.d = this;
            coroutineContext2 = coroutineContext;
            frame.e = coroutineContext2;
            frame.g = c3241cr1;
            frame.h = c4944kk0A;
            frame.k = 1;
            C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
            c6251qy.r();
            InterfaceC1023Fx interfaceC1023FxA = c6711t81.a(c4543is1);
            FirebasePerfOkHttpClient.enqueue(interfaceC1023FxA, new C6501s81(c3241cr1, c6251qy));
            c6251qy.u(new C3906g20((C3233co1) interfaceC1023FxA, 1));
            Object objQ = c6251qy.q();
            if (objQ == mn) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objQ == mn) {
                return mn;
            }
            c7341w81 = this;
            c4944kk0 = c4944kk0A;
            obj2 = objQ;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4944kk0 c4944kk1 = frame.h;
            C3241cr0 c3241cr2 = frame.g;
            coroutineContext2 = frame.e;
            c7341w81 = frame.d;
            C1795Pt1.b(obj2);
            c4944kk0 = c4944kk1;
            c3241cr1 = c3241cr2;
        }
        CoroutineContext coroutineContext3 = coroutineContext2;
        C0857Dt1 c0857Dt1 = (C0857Dt1) obj2;
        AbstractC1091Gt1 abstractC1091Gt1 = c0857Dt1.k;
        CoroutineContext.Element elementP = coroutineContext3.p(XF0.a.d);
        Intrinsics.checkNotNull(elementP);
        ((XF0) elementP).W(new C7972z81(abstractC1091Gt1));
        if (abstractC1091Gt1 == null || (interfaceC2833avK = abstractC1091Gt1.k()) == null) {
            InterfaceC0942Ew.a.getClass();
            obj = (InterfaceC0942Ew) InterfaceC0942Ew.a.b.getValue();
        } else {
            obj = SN.a(C6215qm0.d, coroutineContext3, false, new E81(interfaceC2833avK, coroutineContext3, c3241cr1, null)).e;
        }
        Object obj3 = obj;
        c7341w81.getClass();
        C0850Dr0 c0850Dr0 = new C0850Dr0(c0857Dt1.h, c0857Dt1.g);
        EnumC1298Jk1 enumC1298Jk1 = c0857Dt1.e;
        Intrinsics.checkNotNullParameter(enumC1298Jk1, "<this>");
        int iOrdinal = enumC1298Jk1.ordinal();
        if (iOrdinal == 0) {
            c2097Tq0 = C2097Tq0.f;
        } else if (iOrdinal == 1) {
            c2097Tq0 = C2097Tq0.e;
        } else if (iOrdinal == 2) {
            c2097Tq0 = C2097Tq0.g;
        } else if (iOrdinal == 3 || iOrdinal == 4) {
            c2097Tq0 = C2097Tq0.d;
        } else {
            if (iOrdinal != 5) {
                throw new C6489s51();
            }
            c2097Tq0 = C2097Tq0.h;
        }
        C2097Tq0 c2097Tq1 = c2097Tq0;
        C2813ao0 c2813ao0 = c0857Dt1.j;
        Intrinsics.checkNotNullParameter(c2813ao0, "<this>");
        return new C5811or0(c0850Dr0, c4944kk0, new I81(c2813ao0), c2097Tq1, obj3, coroutineContext3);
    }

    @Override // defpackage.AbstractC3447dq0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        CoroutineContext.Element elementP = this.j.p(XF0.a.d);
        Intrinsics.c(elementP, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((FG) elementP).X();
    }

    @Override // defpackage.AbstractC3447dq0, defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.k;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // defpackage.InterfaceC2514Yp0
    @Nullable
    public final Object h0(@NotNull C3241cr0 c3241cr0, @NotNull LM lm) {
        C7552x81 c7552x81;
        C3241cr0 c3241cr1;
        C7341w81 c7341w81;
        String string;
        String string2;
        AbstractC5395ms1 abstractC5395ms1;
        AbstractC5395ms1 c5182ls1;
        CY0 cy0A;
        int i = 2;
        boolean z = true;
        if (lm instanceof C7552x81) {
            c7552x81 = (C7552x81) lm;
            int i2 = c7552x81.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c7552x81.i = i2 - Integer.MIN_VALUE;
            } else {
                c7552x81 = new C7552x81(this, lm);
            }
        } else {
            c7552x81 = new C7552x81(this, lm);
        }
        C7552x81 c7552x82 = c7552x81;
        Object obj = c7552x82.g;
        MN mn = MN.d;
        int i3 = c7552x82.i;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            c7552x82.d = this;
            c7552x82.e = c3241cr0;
            c7552x82.i = 1;
            Set<String> set = Gc2.a;
            CoroutineContext.Element elementP = c7552x82.getContext().p(JL0.e);
            Intrinsics.checkNotNull(elementP);
            CoroutineContext coroutineContext = ((JL0) elementP).d;
            if (coroutineContext != mn) {
                c3241cr1 = c3241cr0;
                obj = coroutineContext;
                c7341w81 = this;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                C1795Pt1.b(obj);
                return obj;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C3241cr0 c3241cr2 = c7552x82.e;
        C7341w81 c7341w82 = c7552x82.d;
        C1795Pt1.b(obj);
        c3241cr1 = c3241cr2;
        c7341w81 = c7341w82;
        CoroutineContext callContext = (CoroutineContext) obj;
        C4543is1.a aVar = new C4543is1.a();
        aVar.h(c3241cr1.a.h);
        D81 block = new D81(aVar);
        Set<String> set2 = Gc2.a;
        C3651eo0 requestHeaders = c3241cr1.c;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        AbstractC1112Ha1 content = c3241cr1.d;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(block, "block");
        C5951pY0 block2 = new C5951pY0(i, requestHeaders, content);
        Intrinsics.checkNotNullParameter(block2, "block");
        C3441do0 c3441do0 = new C3441do0();
        block2.invoke(c3441do0);
        Map<String, List<String>> values = c3441do0.a;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(values, "values");
        C4781jz c4781jz = new C4781jz();
        Iterator<Map.Entry<String, List<String>>> it = values.entrySet().iterator();
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, List<String>> next = it.next();
            String key = next.getKey();
            List<String> value = next.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            Iterator<Map.Entry<String, List<String>>> it2 = it;
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(value.get(i4));
            }
            c4781jz.put(key, arrayList);
            z = z2;
            it = it2;
        }
        Fc2 body = new Fc2(block);
        Intrinsics.checkNotNullParameter(body, "body");
        Iterator it3 = c4781jz.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            body.invoke((String) entry.getKey(), (List) entry.getValue());
        }
        List<String> list = C1159Hq0.a;
        if (requestHeaders.get("User-Agent") == null && content.c().get("User-Agent") == null) {
            boolean z3 = C1984Se1.a;
            block.invoke("User-Agent", "Ktor client");
        }
        C4651jM c4651jMB = content.b();
        if ((c4651jMB == null || (string = c4651jMB.toString()) == null) && (string = content.c().get("Content-Type")) == null) {
            string = requestHeaders.get("Content-Type");
        }
        Long lA = content.a();
        if ((lA == null || (string2 = lA.toString()) == null) && (string2 = content.c().get("Content-Length")) == null) {
            string2 = requestHeaders.get("Content-Length");
        }
        if (string != null) {
            block.invoke("Content-Type", string);
        }
        if (string2 != null) {
            block.invoke("Content-Length", string2);
        }
        C1629Nq0 c1629Nq0 = c3241cr1.b;
        if (C3476e.r(c1629Nq0.a)) {
            Intrinsics.checkNotNullParameter(content, "<this>");
            Intrinsics.checkNotNullParameter(callContext, "callContext");
            if (content instanceof AbstractC1112Ha1.a) {
                byte[] bArrD = ((AbstractC1112Ha1.a) content).d();
                Pattern pattern = CY0.d;
                String strValueOf = String.valueOf(content.b());
                Intrinsics.checkNotNullParameter(strValueOf, "<this>");
                try {
                    cy0A = CY0.a.a(strValueOf);
                } catch (IllegalArgumentException unused) {
                    cy0A = null;
                }
                int length = bArrD.length;
                Intrinsics.checkNotNullParameter(bArrD, "<this>");
                C6806tc2.c(bArrD.length, 0, length);
                c5182ls1 = new C5182ls1(cy0A, length, bArrD);
            } else if (content instanceof AbstractC1112Ha1.c) {
                c5182ls1 = new C2721aS1(content.a(), new A81(content));
            } else if (content instanceof AbstractC1112Ha1.d) {
                c5182ls1 = new C2721aS1(content.a(), new C81(callContext, content));
            } else {
                if (!(content instanceof AbstractC1112Ha1.b)) {
                    Intrinsics.checkNotNullParameter(content, "content");
                    throw new C92(BX.b(C2017Sp1.a, content.getClass(), new StringBuilder("Failed to write body: ")));
                }
                byte[] bArr = new byte[0];
                Intrinsics.checkNotNullParameter(bArr, "<this>");
                long j = 0;
                C6806tc2.c(j, j, j);
                c5182ls1 = new C5182ls1(null, 0, bArr);
            }
            abstractC5395ms1 = c5182ls1;
        } else {
            abstractC5395ms1 = null;
        }
        aVar.e(c1629Nq0.a, abstractC5395ms1);
        C4543is1 c4543is1B = aVar.b();
        Map<C1006Fr0.a, C6711t81> map = c7341w81.l;
        C1006Fr0.b bVar = C1006Fr0.d;
        C6711t81 c6711t81 = map.get(c3241cr1.a());
        if (c6711t81 == null) {
            throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
        }
        Intrinsics.checkNotNullParameter(c3241cr1, "<this>");
        c7552x82.d = null;
        c7552x82.e = null;
        c7552x82.i = 3;
        Object objC = c7341w81.c(c6711t81, c4543is1B, callContext, c3241cr1, c7552x82);
        return objC == mn ? mn : objC;
    }
}
