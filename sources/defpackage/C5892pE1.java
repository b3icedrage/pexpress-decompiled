package defpackage;

import com.jivosite.sdk.socket.JivoWebSocketService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5892pE1 {

    @NotNull
    public final C6102qE1 a;

    @NotNull
    public final InterfaceC5889pD1 b;

    @NotNull
    public final EK1 c;

    @NotNull
    public final InterfaceC5049lE1 d;

    @NotNull
    public final JivoWebSocketService e;

    @NotNull
    public final InterfaceC3389da2 f;

    @NotNull
    public final InterfaceC0836Dm1 g;

    public C5892pE1(@NotNull C6102qE1 sdkContext, @NotNull InterfaceC5889pD1 schedulers, @NotNull EK1 storage, @NotNull InterfaceC5049lE1 sdkApi, @NotNull JivoWebSocketService jivoWebSocketService, @NotNull InterfaceC3389da2 uploadRepository, @NotNull InterfaceC0836Dm1 ratingRepository) {
        Intrinsics.checkNotNullParameter(sdkContext, "sdkContext");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(sdkApi, "sdkApi");
        Intrinsics.checkNotNullParameter(jivoWebSocketService, "jivoWebSocketService");
        Intrinsics.checkNotNullParameter(uploadRepository, "uploadRepository");
        Intrinsics.checkNotNullParameter(ratingRepository, "ratingRepository");
        this.a = sdkContext;
        this.b = schedulers;
        this.c = storage;
        this.d = sdkApi;
        this.e = jivoWebSocketService;
        this.f = uploadRepository;
        this.g = ratingRepository;
    }

    public final void a() {
        final String strE = this.c.e();
        if (StringsKt.I(strE)) {
            strE = this.a.b;
        }
        if (StringsKt.I(strE)) {
            return;
        }
        this.b.b().execute(new Runnable() { // from class: mE1
            @Override // java.lang.Runnable
            public final void run() {
                C5892pE1 this$0 = this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String widgetId = strE;
                Intrinsics.checkNotNullParameter(widgetId, "$widgetId");
                InterfaceC5889pD1 schedulers = this$0.b;
                Intrinsics.checkNotNullParameter(schedulers, "schedulers");
                C5472nE1 supplier = new C5472nE1(this$0, widgetId);
                Intrinsics.checkNotNullParameter(supplier, "supplier");
                C5682oE1 handler = new C5682oE1(this$0);
                Intrinsics.checkNotNullParameter(handler, "handler");
                C0957Fb.s(new Z31(supplier, handler, schedulers).a, new E90(this$0, 1));
            }
        });
    }
}
