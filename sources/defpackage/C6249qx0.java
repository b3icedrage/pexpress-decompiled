package defpackage;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6249qx0 implements InterfaceC1403Kt1 {

    @NotNull
    public final K80 a;

    @NotNull
    public final MI b;

    @NotNull
    public final EM c;

    @NotNull
    public final Y90 d;

    /* JADX INFO: renamed from: qx0$a */
    @InterfaceC3368dU(c = "com.amplitude.core.utilities.InMemoryResponseHandler$handleTimeoutResponse$1", f = "InMemoryResponseHandler.kt", l = {89}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ List<C0612Aq> e;
        public final /* synthetic */ C6249qx0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends C0612Aq> list, C6249qx0 c6249qx0, JM<? super a> jm) {
            super(2, jm);
            this.e = list;
            this.g = c6249qx0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(this.e, this.g, jm);
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
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (IW.b(30000L, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            Iterator<T> it = this.e.iterator();
            while (it.hasNext()) {
                this.g.a.a((C0612Aq) it.next());
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: qx0$b */
    @InterfaceC3368dU(c = "com.amplitude.core.utilities.InMemoryResponseHandler$handleTooManyRequestsResponse$3", f = "InMemoryResponseHandler.kt", l = {79}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ ArrayList e;
        public final /* synthetic */ C6249qx0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList arrayList, C6249qx0 c6249qx0, JM jm) {
            super(2, jm);
            this.e = arrayList;
            this.g = c6249qx0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new b(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (IW.b(30000L, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                this.g.a.a((C0612Aq) it.next());
            }
            return Unit.a;
        }
    }

    public C6249qx0(@NotNull K80 eventPipeline, @NotNull MI configuration, @NotNull EM scope, @NotNull Y90 dispatcher) {
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.a = eventPipeline;
        this.b = configuration;
        this.c = scope;
        this.d = dispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    @Override // defpackage.InterfaceC1403Kt1
    public final void a(@NotNull C1781Pp badRequestResponse, @NotNull Object events, @NotNull String eventsString) {
        Intrinsics.checkNotNullParameter(badRequestResponse, "badRequestResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        List list = (List) events;
        if (list.size() != 1) {
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
                for (Object obj : list) {
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
                        String str = event.b;
                        if (str != null ? badRequestResponse.e.contains(str) : false) {
                            arrayList.add(event);
                        } else {
                            arrayList2.add(event);
                        }
                    }
                    i = i2;
                }
                h(badRequestResponse.a, 400, arrayList);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    this.a.a((C0612Aq) it.next());
                }
                return;
            }
        }
        h(badRequestResponse.a, 400, list);
    }

    @Override // defpackage.InterfaceC1403Kt1
    public final void b(@NotNull C1666Oc1 payloadTooLargeResponse, @NotNull Object events, @NotNull String eventsString) {
        Intrinsics.checkNotNullParameter(payloadTooLargeResponse, "payloadTooLargeResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        List list = (List) events;
        if (list.size() == 1) {
            h(payloadTooLargeResponse.a, 413, list);
            return;
        }
        K80 k80 = this.a;
        k80.j.incrementAndGet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k80.a((C0612Aq) it.next());
        }
    }

    @Override // defpackage.InterfaceC1403Kt1
    public final void c(@NotNull UU1 successResponse, @NotNull Object events, @NotNull String eventsString) {
        Intrinsics.checkNotNullParameter(successResponse, "successResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        h("Event sent success.", HttpPlatformResponse.MAX_MESSAGE_LENGTH, (List) events);
    }

    @Override // defpackage.InterfaceC1403Kt1
    public final void d(@NotNull C4788k02 tooManyRequestsResponse, @NotNull Object events, @NotNull String eventsString) {
        String str;
        Intrinsics.checkNotNullParameter(tooManyRequestsResponse, "tooManyRequestsResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (Object obj : (List) events) {
            int i2 = i + 1;
            if (i < 0) {
                WE.l();
                throw null;
            }
            C0612Aq event = (C0612Aq) obj;
            tooManyRequestsResponse.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            String str2 = event.a;
            if ((str2 != null && CollectionsKt.z(tooManyRequestsResponse.b, str2)) || ((str = event.b) != null && CollectionsKt.z(tooManyRequestsResponse.c, str))) {
                arrayList.add(event);
            } else if (tooManyRequestsResponse.d.contains(Integer.valueOf(i))) {
                arrayList3.add(event);
            } else {
                arrayList2.add(event);
            }
            i = i2;
        }
        h(tooManyRequestsResponse.a, 429, arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.a.a((C0612Aq) it.next());
        }
        C5189lv.k(this.c, this.d, new b(arrayList3, this, null), 2);
    }

    @Override // defpackage.InterfaceC1403Kt1
    public final void e(@NotNull PZ1 timeoutResponse, @NotNull Object events, @NotNull String eventsString) {
        Intrinsics.checkNotNullParameter(timeoutResponse, "timeoutResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        C5189lv.k(this.c, this.d, new a((List) events, this, null), 2);
    }

    @Override // defpackage.InterfaceC1403Kt1
    public final void g(@NotNull C7220vb0 failedResponse, @NotNull Object events, @NotNull String eventsString) {
        Intrinsics.checkNotNullParameter(failedResponse, "failedResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C0612Aq c0612Aq : (List) events) {
            if (c0612Aq.M >= this.b.g) {
                arrayList.add(c0612Aq);
            } else {
                arrayList2.add(c0612Aq);
            }
        }
        h(failedResponse.a, PermissionsActivity.DELAY_TIME_CALLBACK_CALL, arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.a.a((C0612Aq) it.next());
        }
    }

    public final void h(String str, int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0612Aq c0612Aq = (C0612Aq) it.next();
            this.b.getClass();
            InterfaceC1060Gj0<? super C0612Aq, ? super Integer, ? super String, Unit> interfaceC1060Gj0 = c0612Aq.K;
            if (interfaceC1060Gj0 != null) {
                interfaceC1060Gj0.k(c0612Aq, Integer.valueOf(i), str);
            }
        }
    }
}
