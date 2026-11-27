package defpackage;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Zc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2553Zc0 implements InterfaceC1403Kt1 {

    @NotNull
    public final C1502Mb a;

    @NotNull
    public final K80 b;

    @NotNull
    public final MI c;

    @NotNull
    public final EM d;

    @NotNull
    public final Y90 e;

    @Nullable
    public final DS0 f;

    @NotNull
    public final AtomicInteger g;
    public long h;

    @NotNull
    public final AtomicBoolean i;
    public int j;
    public final int k;

    /* JADX INFO: renamed from: Zc0$a */
    @InterfaceC3368dU(c = "com.amplitude.core.utilities.FileResponseHandler$handleBadRequestResponse$3", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, JM<? super a> jm) {
            super(2, jm);
            this.e = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C2553Zc0.this.new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C2553Zc0.this.a.c(this.e);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Zc0$b */
    @InterfaceC3368dU(c = "com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$1", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, JM<? super b> jm) {
            super(2, jm);
            this.e = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C2553Zc0.this.new b(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C2553Zc0.this.a.c(this.e);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Zc0$c */
    @InterfaceC3368dU(c = "com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$2", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ String e;
        public final /* synthetic */ JSONArray g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, JSONArray jSONArray, JM<? super c> jm) {
            super(2, jm);
            this.e = str;
            this.g = jSONArray;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C2553Zc0.this.new c(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C1502Mb c1502Mb = C2553Zc0.this.a;
            JSONArray events = this.g;
            String filePath = this.e;
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(events, "events");
            C4144h90 c4144h90 = c1502Mb.c;
            c4144h90.getClass();
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(events, "events");
            File file = new File(filePath);
            if (file.exists()) {
                String name = file.getName();
                String strC = Z0.c(name, "-1.tmp");
                File file2 = c4144h90.a;
                File file3 = new File(file2, strC);
                File file4 = new File(file2, Z0.c(name, "-2.tmp"));
                Intrinsics.checkNotNullParameter(events, "<this>");
                int length = events.length() / 2;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = f.i(0, events.length()).iterator();
                while (((DB0) it).g) {
                    int iB = ((CB0) it).b();
                    if (iB < length) {
                        JSONObject jSONObject = events.getJSONObject(iB);
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "this.getJSONObject(index)");
                        arrayList.add(jSONObject);
                    } else {
                        JSONObject jSONObject2 = events.getJSONObject(iB);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "this.getJSONObject(index)");
                        arrayList2.add(jSONObject2);
                    }
                }
                c4144h90.k(arrayList, file3, true);
                c4144h90.k(arrayList2, file4, true);
                c4144h90.g(filePath);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Zc0$d */
    @InterfaceC3368dU(c = "com.amplitude.core.utilities.FileResponseHandler$handleSuccessResponse$1", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, JM<? super d> jm) {
            super(2, jm);
            this.e = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C2553Zc0.this.new d(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C2553Zc0.this.a.c(this.e);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Zc0$e */
    @InterfaceC3368dU(c = "com.amplitude.core.utilities.FileResponseHandler$triggerBackOff$1", f = "FileResponseHandler.kt", l = {175}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public e(JM<? super e> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C2553Zc0.this.new e(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C2553Zc0 c2553Zc0 = C2553Zc0.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                long j = c2553Zc0.h * ((long) 2);
                this.d = 1;
                if (IW.b(j, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            c2553Zc0.b.k = false;
            DS0 ds0 = c2553Zc0.f;
            if (ds0 != null) {
                ds0.a("Enable sending requests again.");
            }
            return Unit.a;
        }
    }

    public C2553Zc0(@NotNull C1502Mb storage, @NotNull K80 eventPipeline, @NotNull MI configuration, @NotNull EM scope, @NotNull Y90 dispatcher, @Nullable DS0 ds0) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.a = storage;
        this.b = eventPipeline;
        this.c = configuration;
        this.d = scope;
        this.e = dispatcher;
        this.f = ds0;
        this.g = new AtomicInteger(0);
        this.h = configuration.c;
        this.i = new AtomicBoolean(false);
        this.j = configuration.b;
        this.k = 50;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    @Override // defpackage.InterfaceC1403Kt1
    public final void a(@NotNull C1781Pp badRequestResponse, @NotNull Object events, @NotNull String eventsString) throws JSONException {
        C1502Mb c1502Mb = this.a;
        Intrinsics.checkNotNullParameter(badRequestResponse, "badRequestResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        DS0 ds0 = this.f;
        if (ds0 != null) {
            StringBuilder sb = new StringBuilder("Handle response, status: ");
            badRequestResponse.getClass();
            sb.append(BX.d(2));
            sb.append(", error: ");
            sb.append(badRequestResponse.a);
            ds0.a(sb.toString());
        }
        String str = (String) events;
        try {
            ArrayList arrayListZ = C0957Fb.z(new JSONArray(eventsString));
            if (arrayListZ.size() != 1) {
                String lowerCase = badRequestResponse.a.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!StringsKt.C(lowerCase, "invalid api key", false)) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.addAll(badRequestResponse.b);
                    linkedHashSet.addAll(badRequestResponse.c);
                    linkedHashSet.addAll(badRequestResponse.d);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i = 0;
                    for (Object obj : arrayListZ) {
                        int i2 = i + 1;
                        if (i < 0) {
                            WE.l();
                            throw null;
                        }
                        C0612Aq event = (C0612Aq) obj;
                        if (linkedHashSet.contains(Integer.valueOf(i))) {
                            arrayList.add(event);
                        } else {
                            Intrinsics.checkNotNullParameter(event, "event");
                            String str2 = event.b;
                            if (str2 != null ? badRequestResponse.e.contains(str2) : false) {
                                arrayList.add(event);
                            } else {
                                arrayList2.add(event);
                            }
                        }
                        i = i2;
                    }
                    j(400, badRequestResponse.a, arrayList);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        this.b.a((C0612Aq) it.next());
                    }
                    C5189lv.k(this.d, this.e, new a(str, null), 2);
                    i(false);
                    return;
                }
            }
            j(400, badRequestResponse.a, arrayListZ);
            c1502Mb.c(str);
        } catch (JSONException e2) {
            c1502Mb.c(str);
            h(eventsString);
            throw e2;
        }
    }

    @Override // defpackage.InterfaceC1403Kt1
    public final void b(@NotNull C1666Oc1 payloadTooLargeResponse, @NotNull Object events, @NotNull String eventsString) throws JSONException {
        Intrinsics.checkNotNullParameter(payloadTooLargeResponse, "payloadTooLargeResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        DS0 ds0 = this.f;
        if (ds0 != null) {
            StringBuilder sb = new StringBuilder("Handle response, status: ");
            payloadTooLargeResponse.getClass();
            sb.append(BX.d(4));
            sb.append(", error: ");
            sb.append(payloadTooLargeResponse.a);
            ds0.a(sb.toString());
        }
        String str = (String) events;
        try {
            JSONArray jSONArray = new JSONArray(eventsString);
            int length = jSONArray.length();
            Y90 y90 = this.e;
            EM em = this.d;
            if (length != 1) {
                C5189lv.k(em, y90, new c(str, jSONArray, null), 2);
                i(false);
            } else {
                j(413, payloadTooLargeResponse.a, C0957Fb.z(jSONArray));
                C5189lv.k(em, y90, new b(str, null), 2);
            }
        } catch (JSONException e2) {
            this.a.c(str);
            h(eventsString);
            throw e2;
        }
    }

    @Override // defpackage.InterfaceC1403Kt1
    public final void c(@NotNull UU1 successResponse, @NotNull Object events, @NotNull String eventsString) throws JSONException {
        Intrinsics.checkNotNullParameter(successResponse, "successResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        String str = (String) events;
        DS0 ds0 = this.f;
        if (ds0 != null) {
            successResponse.getClass();
            ds0.a("Handle response, status: ".concat(BX.d(1)));
        }
        try {
            j(HttpPlatformResponse.MAX_MESSAGE_LENGTH, "Event sent success.", C0957Fb.z(new JSONArray(eventsString)));
            C5189lv.k(this.d, this.e, new d(str, null), 2);
            AtomicBoolean atomicBoolean = this.i;
            if (atomicBoolean.get()) {
                atomicBoolean.set(false);
                this.g.getAndSet(0);
                MI mi = this.c;
                long j = mi.c;
                this.h = j;
                K80 k80 = this.b;
                k80.f = j;
                int i = mi.b;
                this.j = i;
                k80.g = i;
                k80.k = false;
            }
        } catch (JSONException e2) {
            this.a.c(str);
            h(eventsString);
            throw e2;
        }
    }

    @Override // defpackage.InterfaceC1403Kt1
    public final void d(@NotNull C4788k02 tooManyRequestsResponse, @NotNull Object events, @NotNull String eventsString) {
        Intrinsics.checkNotNullParameter(tooManyRequestsResponse, "tooManyRequestsResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        DS0 ds0 = this.f;
        if (ds0 != null) {
            StringBuilder sb = new StringBuilder("Handle response, status: ");
            tooManyRequestsResponse.getClass();
            sb.append(BX.d(5));
            sb.append(", error: ");
            sb.append(tooManyRequestsResponse.a);
            ds0.a(sb.toString());
        }
        this.a.i((String) events);
        i(true);
    }

    @Override // defpackage.InterfaceC1403Kt1
    public final void e(@NotNull PZ1 timeoutResponse, @NotNull Object events, @NotNull String eventsString) {
        Intrinsics.checkNotNullParameter(timeoutResponse, "timeoutResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        DS0 ds0 = this.f;
        if (ds0 != null) {
            timeoutResponse.getClass();
            ds0.a("Handle response, status: ".concat(BX.d(3)));
        }
        this.a.i((String) events);
        i(true);
    }

    @Override // defpackage.InterfaceC1403Kt1
    public final void g(@NotNull C7220vb0 failedResponse, @NotNull Object events, @NotNull String eventsString) {
        Intrinsics.checkNotNullParameter(failedResponse, "failedResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        DS0 ds0 = this.f;
        if (ds0 != null) {
            StringBuilder sb = new StringBuilder("Handle response, status: ");
            failedResponse.getClass();
            sb.append(BX.d(6));
            sb.append(", error: ");
            sb.append(failedResponse.a);
            ds0.a(sb.toString());
        }
        this.a.i((String) events);
        i(true);
    }

    public final void h(String input) {
        Regex regex = new Regex("\"insert_id\":\"(.{36})\",");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() < 0) {
            throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + input.length());
        }
        N3 seedFunction = new N3(1, regex, input);
        C4288hq1 nextFunction = C4288hq1.m;
        Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        C0907Ek0.a aVar = new C0907Ek0.a(new C0907Ek0(seedFunction, nextFunction));
        while (aVar.hasNext()) {
            this.a.j(((MatchResult) aVar.next()).a().get(1));
        }
    }

    public final void i(boolean z) {
        DS0 ds0 = this.f;
        if (ds0 != null) {
            ds0.a("Back off to retry sending events later.");
        }
        this.i.set(true);
        int iIncrementAndGet = this.g.incrementAndGet();
        MI mi = this.c;
        int i = mi.g;
        K80 k80 = this.b;
        if (iIncrementAndGet > i) {
            k80.k = true;
            if (ds0 != null) {
                ds0.a("Max retries " + mi.g + " exceeded, temporarily stop scheduling new events sending out.");
            }
            C5189lv.k(this.d, this.e, new e(null), 2);
            return;
        }
        long j = this.h * ((long) 2);
        this.h = j;
        k80.f = j;
        if (z) {
            int i2 = this.j * 2;
            int i3 = this.k;
            if (i2 > i3) {
                i2 = i3;
            }
            this.j = i2;
            k80.g = i2;
        }
    }

    public final void j(int i, String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0612Aq c0612Aq = (C0612Aq) it.next();
            this.c.getClass();
            String insertId = c0612Aq.f;
            if (insertId != null) {
                C1502Mb c1502Mb = this.a;
                Intrinsics.checkNotNullParameter(insertId, "insertId");
                InterfaceC1060Gj0 interfaceC1060Gj0 = (InterfaceC1060Gj0) c1502Mb.d.get(insertId);
                if (interfaceC1060Gj0 != null) {
                    interfaceC1060Gj0.k(c0612Aq, Integer.valueOf(i), str);
                    c1502Mb.j(insertId);
                }
            }
        }
    }
}
