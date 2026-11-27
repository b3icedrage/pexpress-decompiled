package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ha2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4228ha2 extends OP1<C3179ca2> implements InterfaceC3389da2 {

    @NotNull
    public final C6102qE1 f;

    @NotNull
    public final InterfaceC5889pD1 g;

    @NotNull
    public final InterfaceC4430iY0 h;

    @NotNull
    public final EK1 i;

    @NotNull
    public final W11<Boolean> j;

    /* JADX INFO: renamed from: ha2$a */
    public static final class a extends ML0 implements Function1<OP1.a<C3179ca2>, Unit> {
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C3179ca2> aVar) {
            OP1.a<C3179ca2> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C4018ga2 call = new C4018ga2(this.d);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4228ha2(@NotNull C6102qE1 sdkContext, @NotNull InterfaceC5889pD1 schedulers, @NotNull InterfaceC4430iY0 api, @NotNull EK1 storage) {
        super(schedulers, "UploadFilesState", new C3179ca2(0));
        Intrinsics.checkNotNullParameter(sdkContext, "sdkContext");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f = sdkContext;
        this.g = schedulers;
        this.h = api;
        this.i = storage;
        this.j = new W11<>(Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC3389da2
    @NotNull
    public final W11 I() {
        return this.j;
    }

    @Override // defpackage.InterfaceC3389da2
    public final void K(@NotNull C1351Kc0 file, @NotNull TF0 successfulUnloading) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(successfulUnloading, "successfulUnloading");
        Q(0L, new C4696ja2(file, 0L));
        EK1 ek1 = this.i;
        long j = Long.parseLong(ek1.d());
        String strE = ek1.e();
        if (StringsKt.I(strE)) {
            strE = this.f.b;
        }
        String str = strE;
        InterfaceC5889pD1 interfaceC5889pD1 = this.g;
        AbstractC7841yY0.a aVar = new AbstractC7841yY0.a(interfaceC5889pD1);
        C3598ea2 call = new C3598ea2(this, file, j, str);
        Intrinsics.checkNotNullParameter(call, "call");
        aVar.b = call;
        C7113v4 call2 = new C7113v4(file, 5);
        Intrinsics.checkNotNullParameter(call2, "call");
        aVar.c = call2;
        C3808fa2 call3 = new C3808fa2(this);
        Intrinsics.checkNotNullParameter(call3, "call");
        aVar.d = call3;
        EY0<C3457dt1<String>> ey0 = new C7631xY0(aVar, interfaceC5889pD1).a;
        Intrinsics.c(ey0, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.jivosite.sdk.network.resource.Resource<kotlin.String>>");
        C0957Fb.s(ey0, new C5329ma2(this, file, successfulUnloading));
    }

    @Override // defpackage.InterfaceC3389da2
    @NotNull
    public final KP1<C3179ca2> a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC3389da2
    public final void c(@NotNull String contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Q(0L, new a(contentUri));
    }

    @Override // defpackage.InterfaceC3389da2
    public final void w(boolean z) {
        this.j.k(Boolean.valueOf(z));
    }
}
