package defpackage;

import com.jivosite.sdk.model.pojo.rate.RateSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0992Fm1 extends OP1<C1774Pm1> implements InterfaceC0836Dm1 {

    @NotNull
    public final EK1 f;

    @NotNull
    public final R42 g;

    @NotNull
    public final C3903g11 h;

    /* JADX INFO: renamed from: Fm1$a */
    public static final class a extends ML0 implements Function1<OP1.a<C1774Pm1>, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C1774Pm1> aVar) {
            OP1.a<C1774Pm1> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C0914Em1 call = new C0914Em1(C0992Fm1.this);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Fm1$b */
    public static final class b extends ML0 implements Function1<OP1.a<C1774Pm1>, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C1774Pm1> aVar) {
            OP1.a<C1774Pm1> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C0992Fm1 c0992Fm1 = C0992Fm1.this;
            C1070Gm1 call = new C1070Gm1(c0992Fm1);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            C1148Hm1 call2 = new C1148Hm1(c0992Fm1);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.d = call2;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Fm1$c */
    public static final class c extends ML0 implements Function1<OP1.a<C1774Pm1>, Unit> {
        public final /* synthetic */ String d;
        public final /* synthetic */ C0992Fm1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0992Fm1 c0992Fm1, String str) {
            super(1);
            this.d = str;
            this.e = c0992Fm1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C1774Pm1> aVar) {
            OP1.a<C1774Pm1> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            String str = this.d;
            C1226Im1 call = new C1226Im1(str);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.b = call;
            updateStateInRepositoryThread.a(C1304Jm1.d);
            C1382Km1 call2 = new C1382Km1(this.e, str);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.d = call2;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Fm1$d */
    public static final class d extends ML0 implements Function1<OP1.a<C1774Pm1>, Unit> {
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C1774Pm1> aVar) {
            OP1.a<C1774Pm1> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C1460Lm1 call = new C1460Lm1(this.d);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Fm1$e */
    public static final class e extends ML0 implements Function1<OP1.a<C1774Pm1>, Unit> {
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C1774Pm1> aVar) {
            OP1.a<C1774Pm1> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C1537Mm1 call = new C1537Mm1(this.d);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Fm1$f */
    public static final class f extends ML0 implements Function1<OP1.a<C1774Pm1>, Unit> {
        public final /* synthetic */ RateSettings d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RateSettings rateSettings) {
            super(1);
            this.d = rateSettings;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C1774Pm1> aVar) {
            OP1.a<C1774Pm1> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C1618Nm1 call = new C1618Nm1(this.d);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0992Fm1(@NotNull InterfaceC5889pD1 schedulers, @NotNull EK1 storage, @NotNull R42 transmitter, @NotNull C3903g11 moshi) {
        super(schedulers, "Rating", new C1774Pm1(0));
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(transmitter, "transmitter");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f = storage;
        this.g = transmitter;
        this.h = moshi;
    }

    @Override // defpackage.InterfaceC0836Dm1
    public final void C() {
        Q(0L, new b());
    }

    @Override // defpackage.InterfaceC0836Dm1
    @NotNull
    public final KP1<C1774Pm1> a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC0836Dm1
    public final void close() {
        Q(0L, new a());
    }

    @Override // defpackage.InterfaceC0836Dm1
    public final void g(@NotNull String rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Q(0L, new e(rate));
    }

    @Override // defpackage.InterfaceC0836Dm1
    public final void i(@Nullable RateSettings rateSettings) {
        Q(0L, new f(rateSettings));
    }

    @Override // defpackage.InterfaceC0836Dm1
    public final void r(@NotNull String comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Q(0L, new d(comment));
    }

    @Override // defpackage.InterfaceC0836Dm1
    public final void y(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Q(0L, new c(this, chatId));
    }
}
