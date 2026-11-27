package defpackage;

import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class P1 extends O1 {

    @NotNull
    public final AbstractC5328ma1 b;

    @NotNull
    public final C0648Bc c;

    @NotNull
    public final C3314dC d;

    @NotNull
    public final Sa2 e;

    @NotNull
    public final InterfaceC3207ch2 f;

    @InterfaceC3368dU(c = "com.impl.core.backend.access.AccessTokenInterceptorImpl$onGetResponse$1", f = "AccessTokenInterceptorImpl.kt", l = {57}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ P1 g;

        /* JADX INFO: renamed from: P1$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.core.backend.access.AccessTokenInterceptorImpl$onGetResponse$1$1", f = "AccessTokenInterceptorImpl.kt", l = {}, m = "invokeSuspend")
        public static final class C0113a extends AW1 implements Function1<JM<? super String>, Object> {
            public final /* synthetic */ String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0113a(String str, JM<? super C0113a> jm) {
                super(1, jm);
                this.d = str;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new C0113a(this.d, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super String> jm) {
                return ((C0113a) create(jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return this.d;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, P1 p1, JM<? super a> jm) {
            super(2, jm);
            this.e = str;
            this.g = p1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, this.g, jm);
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
                String str = this.e;
                if (str.length() > 0) {
                    C3314dC c3314dC = this.g.d;
                    C0113a c0113a = new C0113a(str, null);
                    this.d = 1;
                    if (c3314dC.m(c0113a, this) == mn) {
                        return mn;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(@NotNull AbstractC5328ma1 originProvider, @NotNull C4923kf appDataRepository, @NotNull C0648Bc responseCookiesInterceptor, @NotNull C3314dC ciSessionProvider, @NotNull Sa2 userAgentProvideBase, @NotNull InterfaceC3207ch2 requestIdProvider) {
        super(originProvider);
        Intrinsics.checkNotNullParameter(originProvider, "originProvider");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(responseCookiesInterceptor, "responseCookiesInterceptor");
        Intrinsics.checkNotNullParameter(ciSessionProvider, "ciSessionProvider");
        Intrinsics.checkNotNullParameter(userAgentProvideBase, "userAgentProvideBase");
        Intrinsics.checkNotNullParameter(requestIdProvider, "requestIdProvider");
        this.b = originProvider;
        this.c = responseCookiesInterceptor;
        this.d = ciSessionProvider;
        this.e = userAgentProvideBase;
        this.f = requestIdProvider;
    }

    @Override // defpackage.O1
    public final void b(@NotNull C4543is1.a aVar, @NotNull C5593no1 chain) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(chain, "chain");
        aVar.a("User-Agent", (String) this.e.b.getValue());
        aVar.a("Accept", "application/json, text/javascript, */*; q=0.01");
        aVar.a("X-Requested-With", "XMLHttpRequest");
        aVar.a("X-Request-Id", this.f.a());
        C4543is1 c4543is1 = chain.e;
        if (!StringsKt.C(c4543is1.a.i, "/en/register", false) && !StringsKt.C(c4543is1.a.i, "/en/login", false)) {
            aVar.a("Origin", this.b.a());
        } else {
            aVar.a("Origin", c4543is1.a.i);
            aVar.a("Referer", c4543is1.a.i);
        }
    }

    @Override // defpackage.O1
    public final void c(@NotNull C0857Dt1 r) {
        String string;
        Intrinsics.checkNotNullParameter(r, "<this>");
        this.c.getClass();
        Intrinsics.checkNotNullParameter(r, "r");
        Intrinsics.checkNotNullParameter("ci_session", "cookieName");
        Intrinsics.checkNotNullParameter(r, "r");
        List<String> listH = r.j.h("Set-Cookie");
        Iterator it = (listH.isEmpty() ? C6702t60.d : CollectionsKt.h0(listH)).iterator();
        while (true) {
            string = "";
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = StringsKt__StringsKt.split$default(str, new String[]{"; "}, false, 0, 6, null).iterator();
            while (it2.hasNext()) {
                List listSplit$default = StringsKt__StringsKt.split$default((String) it2.next(), new String[]{"="}, false, 0, 6, null);
                linkedHashMap.put(listSplit$default.get(0), listSplit$default.size() < 2 ? "" : (String) listSplit$default.get(1));
            }
            String str2 = (String) linkedHashMap.get("ci_session");
            if (str2 != null && str2.length() != 0) {
                string = URLDecoder.decode(str2, Charsets.UTF_8.name()).toString();
                break;
            }
        }
        C5189lv.k(C3286d41.a, null, new a(string, this, null), 3);
    }
}
