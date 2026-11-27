package defpackage;

import com.jivosite.sdk.db.SdkDb;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class S8 extends OP1<C3513e9> implements M8 {

    @NotNull
    public final InterfaceC5889pD1 f;

    @NotNull
    public final SdkDb g;

    @NotNull
    public final LinkedHashMap h;

    @NotNull
    public final YY0<String, C7129v8> i;

    @NotNull
    public final W11<Boolean> j;

    public static final class a extends ML0 implements Function1<OP1.a<C3513e9>, Unit> {
        public static final a d = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C3513e9> aVar) {
            OP1.a<C3513e9> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            updateStateInRepositoryThread.getClass();
            Q8 call = Q8.d;
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.b = call;
            updateStateInRepositoryThread.a(R8.d);
            return Unit.a;
        }
    }

    public static final class b extends ML0 implements Function1<OP1.a<C3513e9>, Unit> {
        public final /* synthetic */ String e;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(1);
            this.e = str;
            this.g = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C3513e9> aVar) {
            OP1.a<C3513e9> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            String str = this.g;
            S8 s8 = S8.this;
            String str2 = this.e;
            T8 call = new T8(s8, str2, str);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.b = call;
            U8 call2 = new U8(s8, str2, str);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.c = call2;
            return Unit.a;
        }
    }

    public static final class c extends ML0 implements Function1<OP1.a<C3513e9>, Unit> {
        public final /* synthetic */ String e;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(1);
            this.e = str;
            this.g = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C3513e9> aVar) {
            OP1.a<C3513e9> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            String str = this.g;
            S8 s8 = S8.this;
            String str2 = this.e;
            V8 call = new V8(s8, str2, str);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.b = call;
            W8 call2 = new W8(s8, str2, str);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.c = call2;
            return Unit.a;
        }
    }

    public static final class d extends ML0 implements Function1<OP1.a<C3513e9>, Unit> {
        public final /* synthetic */ String d;
        public final /* synthetic */ S8 e;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(S8 s8, String str, String str2) {
            super(1);
            this.d = str;
            this.e = s8;
            this.g = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C3513e9> aVar) {
            AbstractC3723f9 cVar;
            OP1.a<C3513e9> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            String status = this.d;
            Intrinsics.checkNotNullParameter(status, "status");
            if (status.equals("online")) {
                cVar = AbstractC3723f9.b.a;
            } else {
                cVar = status.equals("offline") ? AbstractC3723f9.a.a : new AbstractC3723f9.c(status);
            }
            S8 s8 = this.e;
            String str = this.g;
            X8 call = new X8(s8, str, cVar);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.b = call;
            Y8 call2 = new Y8(s8, str, cVar);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.c = call2;
            Z8 call3 = new Z8(s8);
            Intrinsics.checkNotNullParameter(call3, "call");
            updateStateInRepositoryThread.d = call3;
            return Unit.a;
        }
    }

    public static final class e extends ML0 implements Function1<OP1.a<C3513e9>, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C3513e9> aVar) {
            OP1.a<C3513e9> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C2661a9 call = new C2661a9(S8.this);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            return Unit.a;
        }
    }

    public static final class f extends ML0 implements Function1<OP1.a<C3513e9>, Unit> {
        public final /* synthetic */ String e;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2) {
            super(1);
            this.e = str;
            this.g = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C3513e9> aVar) {
            OP1.a<C3513e9> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            String str = this.g;
            S8 s8 = S8.this;
            String str2 = this.e;
            C2885b9 call = new C2885b9(s8, str2, str);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.b = call;
            C3094c9 call2 = new C3094c9(s8, str2, str);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.c = call2;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S8(@NotNull InterfaceC5889pD1 schedulers, @NotNull SdkDb db) {
        super(schedulers, "Agent", new C3513e9(0));
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(db, "db");
        this.f = schedulers;
        this.g = db;
        this.h = new LinkedHashMap();
        this.i = new YY0<>();
        this.j = new W11<>(Boolean.FALSE);
        schedulers.c().execute(new Runnable() { // from class: N8
            @Override // java.lang.Runnable
            public final void run() {
                S8 this$0 = this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (XT xt : this$0.g.p().a()) {
                    LinkedHashMap linkedHashMap = this$0.h;
                    String strValueOf = String.valueOf(xt.a);
                    long j = xt.a;
                    linkedHashMap.put(strValueOf, new C7129v8(String.valueOf(j), null, xt.b, xt.c, xt.d, false, 34));
                    this$0.i.b(String.valueOf(j), new C7129v8(String.valueOf(j), null, xt.b, xt.c, xt.d, false, 34));
                }
            }
        });
    }

    public static final void R(S8 s8, C7129v8 c7129v8) {
        s8.h.put(c7129v8.a, c7129v8);
        s8.i.b(c7129v8.a, c7129v8);
    }

    @Override // defpackage.M8
    @NotNull
    public final W11 A() {
        return this.j;
    }

    @Override // defpackage.M8
    public final void H(@NotNull String agentId, @NotNull String title) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(title, "title");
        Q(0L, new f(agentId, title));
    }

    @Override // defpackage.M8
    public final void J() {
        Q(0L, new e());
    }

    @Override // defpackage.M8
    @NotNull
    public final KP1<C3513e9> a() {
        return this.e;
    }

    @Override // defpackage.M8
    @NotNull
    public final W11 f(@NotNull String agentId) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        return this.i.a(agentId, null);
    }

    @Override // defpackage.M8
    public final void k(@NotNull String agentId, @NotNull String photo) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Q(0L, new c(agentId, photo));
    }

    @Override // defpackage.M8
    @Nullable
    public final C7129v8 m(@NotNull String agentId) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        return (C7129v8) this.h.get(agentId);
    }

    @Override // defpackage.M8
    public final void o() {
        Q(0L, a.d);
    }

    @Override // defpackage.M8
    public final void q(@NotNull String agentId, @NotNull String status) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(status, "status");
        Q(0L, new d(this, status, agentId));
    }

    @Override // defpackage.M8
    public final void u(@NotNull String agentId, @NotNull String name) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(name, "name");
        Q(0L, new b(agentId, name));
    }
}
